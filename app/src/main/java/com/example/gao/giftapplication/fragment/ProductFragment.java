package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.CategoriesNameAdapter;
import com.example.gao.giftapplication.adapter.ProduceIconAdapter;
import com.example.gao.giftapplication.bean.Produce;
import com.example.gao.giftapplication.content.Content;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * 单品页面
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {

    private List<Produce.DataBean.CategoriesBean> mCategoriesBeen;
    private List<Produce.DataBean.CategoriesBean.SubcategoriesBean> mSubcategoriesBeen;
    private ProduceIconAdapter mProduceIconAdapter;
    private CategoriesNameAdapter mCategoriesNameAdapter;
    @BindView(R.id.title)
    ListView mTitle;

    @BindView(R.id.content)
    GridView mContent;

    public ProductFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_product, container, false);
        ButterKnife.bind(this, view);
        putDataToListView();


        return view;
    }



    private void putDataToListView() {

        mCategoriesNameAdapter = new CategoriesNameAdapter(getActivity());
        HttpUtils.get(Content.PRODUCTNAME, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {

                mCategoriesBeen = new ArrayList<>();
                Gson gson = new Gson();
                final Produce produce = gson.fromJson(response, Produce.class);
                mCategoriesBeen = produce.getData().getCategories();
                try {
                    JSONObject object = new JSONObject(response);
                    JSONObject data = object.getJSONObject("data");
                    JSONArray categories = data.getJSONArray("categories");
                    mSubcategoriesBeen=new ArrayList<Produce.DataBean.CategoriesBean.SubcategoriesBean>();
                    for (int i = 0; i <categories.length() ; i++) {
                        JSONObject jsonObject = categories.getJSONObject(i);
                        JSONArray subcategories = jsonObject.getJSONArray("subcategories");
                        for (int j = 0; j <subcategories.length(); j++) {
                            JSONObject jsonObject1 = subcategories.getJSONObject(j);
                           Produce.DataBean.CategoriesBean.SubcategoriesBean bean = new Produce.DataBean.CategoriesBean.SubcategoriesBean();
                            bean.setName(jsonObject1.getString("name"));
                            bean.setIcon_url(jsonObject1.getString("icon_url"));
                            mSubcategoriesBeen.add(bean);
                        }
                    }
                    putDataToGridView(mSubcategoriesBeen);
                } catch (JSONException e) {
                    e.printStackTrace();
                }



                mCategoriesNameAdapter.setCategoriesBeen(mCategoriesBeen);
                mTitle.setVerticalScrollBarEnabled(false);
                mTitle.setFastScrollEnabled(false);
                mTitle.setAdapter(mCategoriesNameAdapter);
                mTitle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                });



            }
        });
    }


    private void putDataToGridView(List<Produce.DataBean.CategoriesBean.SubcategoriesBean> categoriesBeen) {

        mContent.setVerticalScrollBarEnabled(false);
        mContent.setFastScrollEnabled(false);
        mProduceIconAdapter = new ProduceIconAdapter(getActivity());
        mProduceIconAdapter.setSubcategoriesBeen(categoriesBeen);
        mContent.setAdapter(mProduceIconAdapter);
        mContent.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });

    }




}
