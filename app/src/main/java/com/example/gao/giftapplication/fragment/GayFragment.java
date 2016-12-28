package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.GayAdapter;
import com.example.gao.giftapplication.bean.Gay;
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
public class GayFragment extends Fragment {
    @BindView(R.id.girlfriendFragment)
    LRecyclerView mGirlfriendFragment;
    private List<Gay.DataBean.ItemsBean> mItemsBeen;
    private GayAdapter mAdapter;

    public GayFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl_friend, container, false);
        ButterKnife.bind(this, view);
        putDataIntoRL();
        return view;

    }

    private void putDataIntoRL() {
        HttpUtils.get(Content.GAY, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {
                mItemsBeen = new ArrayList<Gay.DataBean.ItemsBean>();
                Gson gson = new Gson();
                Gay gay = gson.fromJson(response, Gay.class);
                mItemsBeen = gay.getData().getItems();
                mAdapter = new GayAdapter(getContext(),R.layout.item,mItemsBeen);
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
