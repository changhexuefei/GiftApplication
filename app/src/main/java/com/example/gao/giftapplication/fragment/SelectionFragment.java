package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.adapter.SelectionAdapter;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Banners;
import com.example.gao.giftapplication.bean.Selection;
import com.example.gao.giftapplication.content.Content;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.example.gao.giftapplication.model.GlideImageLoader;
import com.example.gao.giftapplication.utils.LogUtils;
import com.example.gao.giftapplication.utils.ToastUtils;
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

import static com.example.gao.giftapplication.R.id.five;
import static com.example.gao.giftapplication.R.id.four;
import static com.example.gao.giftapplication.R.id.one;
import static com.example.gao.giftapplication.R.id.six;
import static com.example.gao.giftapplication.R.id.there;
import static com.example.gao.giftapplication.R.id.two;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectionFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.selection_LR)
    LRecyclerView mSelectionLR;


    private SelectionAdapter mAdapter;
    private List<String> mStrings;
    private List<Selection.DataBean.ItemsBean> mItemsBeen;
    private int mPosition;
    private LRecyclerViewAdapter adapter;
    private Banner mBanner;
    private View mInflate;
    private TextView mOne;
    private TextView mTwo;
    private TextView mThere;
    private TextView mFour;
    private TextView mFive;
    private TextView mSix;


    public SelectionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_selection, container, false);
        ButterKnife.bind(this, view);
        getImageList();
        putDataIntoRL(Content.SELECTION);
        initHeaderView();
        return view;
    }

    private void initHeaderView() {
        mInflate = View.inflate(getContext(), R.layout.other, null);
        mBanner = (Banner) mInflate.findViewById(R.id.banner);
        mOne = (TextView) mInflate.findViewById(one);

        mTwo = (TextView) mInflate.findViewById(two);

        mThere = (TextView) mInflate.findViewById(there);
        mFour = (TextView) mInflate.findViewById(four);
        mFive = (TextView) mInflate.findViewById(five);
        mSix = (TextView) mInflate.findViewById(six);
        mOne.setOnClickListener(this);
        mTwo.setOnClickListener(this);
        mThere.setOnClickListener(this);
        mFour.setOnClickListener(this);
        mFive.setOnClickListener(this);
        mSix.setOnClickListener(this);

    }

    private void putDataIntoRL(String selection) {

        HttpUtils.get(selection, new JsonResponseHandler() {
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
                mAdapter = new SelectionAdapter(MyApp.getContext(), R.layout.item, mItemsBeen);

                final LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
                mSelectionLR.setLayoutManager(manager);
                mSelectionLR.setHasFixedSize(true);
                mSelectionLR.setItemAnimator(new DefaultItemAnimator());
                adapter = new LRecyclerViewAdapter(mAdapter);
//                adapter.setRefreshHeader(new ArrowRefreshHeader(MyApp.getContext()));

//                mSelectionLR.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
//                mSelectionLR.setArrowImageView(R.drawable.iconfont_downgrey);
//                mSelectionLR.setOnRefreshListener(new OnRefreshListener() {
//                    @Override
//                    public void onRefresh() {
////                        mSelectionLR.setRefreshing(true);
//                        mAdapter.notifyDataSetChanged();
//                    }
//                });
//                mSelectionLR.addOnScrollListener(new RecyclerView.OnScrollListener() {
//                    @Override
//                    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                        super.onScrolled(recyclerView, dx, dy);
//                        mPosition = manager.findLastVisibleItemPosition();
//
//                    }
//
//                    @Override
//                    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
//                        super.onScrollStateChanged(recyclerView, newState);
//                        if (newState == RecyclerView.SCROLL_STATE_IDLE && mAdapter.getItemCount() ==mPosition+1 ){
//                            putDataIntoRL(Content.SELECTION);
//
//                        }
//                    }
//                });
                mSelectionLR.setAdapter(adapter);

                adapter.addHeaderView(mInflate);
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

                List<Banners.DataBean.BannersBean> mBeanList = banners.getData().getBanners();

                mStrings = new ArrayList<String>();
                for (int i = 0; i < mBeanList.size(); i++) {
                    String image_url = mBeanList.get(i).getImage_url();

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


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case one:
                ToastUtils.showShort(getContext(),mOne.getText().toString());
                break;
            case two:
                ToastUtils.showShort(getContext(),mTwo.getText().toString());
                break;
            case there:
                ToastUtils.showShort(getContext(),mThere.getText().toString());
                break;
            case four:
                ToastUtils.showShort(getContext(),mFour.getText().toString());
                break;
            case five:
                ToastUtils.showShort(getContext(),mFive.getText().toString());
                break;
            case six:
                ToastUtils.showShort(getContext(),mSix.getText().toString());
                break;

        }
    }
}
