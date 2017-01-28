package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.CategoryAdapter;
import com.example.gao.giftapplication.bean.Category;
import com.example.gao.giftapplication.content.Content;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.google.gson.Gson;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * 攻略页面
 * A simple {@link Fragment} subclass.
 */
public class StrategyFragment extends Fragment {
    @BindView(R.id.strategy)
    StickyGridHeadersGridView mStrategy;
    private List<Category.DataBean.ChannelGroupsBean> mCategoryList;
    private List<Category.DataBean.ChannelGroupsBean.ChannelsBean> mChannelsBeen;
    private CategoryAdapter mAdapter;


    public StrategyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_strategy, container, false);
        initView();
        putDataToGridView(Content.CATEGORY);
        ButterKnife.bind(this, view);
        return view;
    }

    private void putDataToGridView(String category) {
        HttpUtils.get(category, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {
                mCategoryList = new ArrayList<>();
                Gson gson = new Gson();
                Category category = gson.fromJson(response, Category.class);
                mCategoryList = category.getData().getChannel_groups();

                mAdapter.setCategories(mCategoryList);
                mStrategy.setAdapter(mAdapter);

                try {
                    JSONObject object = new JSONObject(response);
                    JSONObject data = object.getJSONObject("data");
                    JSONArray channel_groups = data.getJSONArray("channel_groups");
                    mChannelsBeen = new ArrayList<>();
                    for (int i = 0; i < channel_groups.length(); i++) {
                        JSONObject jsonObject = channel_groups.getJSONObject(i);
                        JSONArray channels = jsonObject.getJSONArray("channels");
                        for (int j = 0; j <channels.length() ; j++) {
                            JSONObject jsonObject1 = channels.getJSONObject(j);
                            Category.DataBean.ChannelGroupsBean.ChannelsBean channelsBean =
                                    new Category.DataBean.ChannelGroupsBean.ChannelsBean();
                            channelsBean.setCover_image_url(jsonObject1.getString("cover_image_url"));
                            mChannelsBeen.add(channelsBean);
                        }
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }


    private void initView() {
        mCategoryList = new ArrayList<>();

        mAdapter = new CategoryAdapter(getContext(),mChannelsBeen);

    }

}
