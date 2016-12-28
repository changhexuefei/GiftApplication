package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.SelectionAdapter;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Banners;
import com.example.gao.giftapplication.bean.Selection;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.example.gao.giftapplication.model.GlideImageLoader;
import com.example.gao.giftapplication.utils.LogUtils;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectionFragment extends Fragment {
    @BindView(R.id.selection_LR)
    LRecyclerView mSelectionLR;

    @BindView(R.id.banner)
    Banner mBanner;
    private SelectionAdapter mAdapter;
    private List<String> mStrings;
    private List<Selection.DataBean.ItemsBean> mItemsBeen;

    public SelectionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        ButterKnife.bind(this, view);
        getImageList();
        putDataIntoRL();
        return view;
    }

    private void putDataIntoRL() {
        String url = "http://api.liwushuo.com/v2/channels/100/items_v2?ad=2&gender=1&generation=1&limit=20&offset=0";
        HttpUtils.get(url, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {
                LogUtils.d("111111:" + response);

                mItemsBeen = new ArrayList<Selection.DataBean.ItemsBean>();
                Gson gson = new Gson();
                Selection selection = gson.fromJson(response, Selection.class);
                LogUtils.d("22222:" + selection);
                mItemsBeen = selection.getData().getItems();
                mAdapter = new SelectionAdapter(MyApp.getContext(),R.layout.item,mItemsBeen);

                final LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                mSelectionLR.setLayoutManager(manager);
                mSelectionLR.setHasFixedSize(true);
                mSelectionLR.setItemAnimator(new DefaultItemAnimator());
                LRecyclerViewAdapter adapter = new LRecyclerViewAdapter(mAdapter);
                mSelectionLR.setAdapter(adapter);
            }
        });


    }

    public List<String> getImageList() {
        String url = "http://api.liwushuo.com/v2/banners";
        HttpUtils.get(url, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {

                Gson gson = new Gson();
                Banners banners = gson.fromJson(response, Banners.class);
                List<Banners.DataBean.BannersBean> beanList = banners.getData().getBanners();

                mStrings = new ArrayList<String>();
                for (int i = 0; i < beanList.size(); i++) {
                    String image_url = beanList.get(i).getImage_url();

                    mStrings.add(image_url);
                }
                putBanners(mStrings);
            }
        });
        return mStrings;
    }

    private void putBanners(List<String> strings) {
        //设置banner样式
        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
        mBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        mBanner.setImages(strings);
        //设置banner动画效果
        mBanner.setBannerAnimation(Transformer.DepthPage);
        //设置标题集合（当banner样式有显示title时）
//        mBanner.setBannerTitles(Arrays.asList(titles));
        //设置自动轮播，默认为true
        mBanner.isAutoPlay(true);
        //设置轮播时间
        mBanner.setDelayTime(3000);
        //设置指示器位置（当banner模式中有指示器时）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        mBanner.start();
    }
}
