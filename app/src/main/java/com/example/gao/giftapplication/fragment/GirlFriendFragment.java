package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.MyBaseAdapter;
import com.example.gao.giftapplication.bean.GirlFriend;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.example.gao.giftapplication.utils.JsonUtils;
import com.example.gao.giftapplication.utils.LogUtils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * A simple {@link Fragment} subclass.
 */
public class GirlFriendFragment extends Fragment {

    private String url = "http://api.liwushuo.com/v2/channels/10/items_v2?gender=1&generation=1&order_by=now&limit=20&offset=0";
    private List<GirlFriend.DataBean.ItemsBean> mItemsBeen;
    private MyBaseAdapter mMyBaseAdapter;

    @BindView(R.id.girlfriendFragment)
    LRecyclerView mGirlfriendFragment;
    private View mView;

    public GirlFriendFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_girl_friend, container, false);
        ButterKnife.bind(this, mView);
        mMyBaseAdapter = new MyBaseAdapter();

        HttpUtils.get(url, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {
            }

            @Override
            public void onSuccess(String response, int id) {
                LogUtils.e(response);
                Log.d("response", response);
                if (JsonUtils.isSuccess(response)) {

                    mItemsBeen = new ArrayList<GirlFriend.DataBean.ItemsBean>();
                    Gson gson = new Gson();
                    GirlFriend girlFriend = gson.fromJson(response, GirlFriend.class);
                    Log.d("33333", girlFriend + "");
                    mItemsBeen = girlFriend.getData().getItems();

                    mMyBaseAdapter.setGirlFriends(mItemsBeen);
                    final LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                    mGirlfriendFragment.setLayoutManager(manager);
                    mGirlfriendFragment.setHasFixedSize(true);
                    mGirlfriendFragment.setItemAnimator(new DefaultItemAnimator());
                    LRecyclerViewAdapter adapter = new LRecyclerViewAdapter(mMyBaseAdapter);
                    mGirlfriendFragment.setAdapter(adapter);

                } else {


                }

            }
        });
        return mView;
    }

}
