package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.CreativeLifeStyleAdapter;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.CreativeLifeStyle;
import com.example.gao.giftapplication.content.Content;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
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
public class CreativeLifeStyleFragment extends Fragment {
    @BindView(R.id.girlfriendFragment)
    LRecyclerView mGirlfriendFragment;
    private List<CreativeLifeStyle.DataBean.ItemsBean> mItemsBeen;
    private CreativeLifeStyleAdapter mAdapter;
    public CreativeLifeStyleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl_friend, container, false);
        getData();
        ButterKnife.bind(this, view);
        return view;
    }

    private void getData() {
        HttpUtils.get(Content.CREATIVELIFESTYLE, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {

                mItemsBeen = new ArrayList<CreativeLifeStyle.DataBean.ItemsBean>();
                Gson gson = new Gson();
                CreativeLifeStyle creativeLifeStyle = gson.fromJson(response, CreativeLifeStyle.class);
                mItemsBeen = creativeLifeStyle.getData().getItems();
                mAdapter = new CreativeLifeStyleAdapter(MyApp.getContext(),R.layout.item,mItemsBeen);
                final LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                mGirlfriendFragment.setLayoutManager(manager);
                mGirlfriendFragment.setHasFixedSize(true);
                mGirlfriendFragment.setItemAnimator(new DefaultItemAnimator());
                LRecyclerViewAdapter adapter = new LRecyclerViewAdapter(mAdapter);
                mGirlfriendFragment.setAdapter(adapter);
            }
        });

    }

}
