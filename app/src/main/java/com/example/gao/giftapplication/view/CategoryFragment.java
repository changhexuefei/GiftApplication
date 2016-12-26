package com.example.gao.giftapplication.view;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.fragment.ProductFragment;
import com.example.gao.giftapplication.fragment.StrategyFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    private StrategyFragment sf ;
    private ProductFragment pf ;
    private PagerSlidingTabStrip tabs;

    private DisplayMetrics dm;
    private final String[] categoryTitles = {"攻略", "单品"};


    public CategoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View mView = inflater.inflate(R.layout.fragment_category, container, false);
        dm = getResources().getDisplayMetrics();
        ViewPager pager = (ViewPager) mView.findViewById(R.id.category_viewpager);
        tabs = (PagerSlidingTabStrip) mView.findViewById(R.id.category_tabs);
        pager.setOffscreenPageLimit(0);//设置ViewPager的缓存界面数,默认缓存为2
        pager.setAdapter(new MyCategoryAdapter(getChildFragmentManager()));
        pager.setCurrentItem(0);
        tabs.setViewPager(pager);
        setTabsValue();
        return mView;
    }

    private void setTabsValue() {

        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        //设置Tab底部线的颜色是透明的
        tabs.setUnderlineColor(Color.TRANSPARENT);
        // 设置Tab的分割线是透明的
        tabs.setDividerColor(Color.TRANSPARENT);
        // 设置Tab底部线的高度
        tabs.setUnderlineHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, dm));
        // 设置Tab Indicator的高度
        tabs.setIndicatorHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 3, dm));
        // 设置Tab标题文字的大小
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 12, dm));
        // 设置Tab Indicator的颜色
        tabs.setIndicatorColor(Color.parseColor("#d83737"));//#d83737   #d83737(绿)
        // 设置选中Tab文字的颜色 (这是我自定义的一个方法)
//        tabs.setSelectedTextColor(Color.parseColor("#ffffff"));

        // 取消点击Tab时的背景色
        tabs.setTabBackground(0);
    }


    public class MyCategoryAdapter extends FragmentPagerAdapter{

        public MyCategoryAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    if(sf == null){
                        sf = new StrategyFragment();
                    }
                    return sf;
                case 1:
                    if(pf == null){
                        pf = new ProductFragment();
                    }
                    return pf;
            }

            return null;
        }

        @Override
        public int getCount() {
            return categoryTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return categoryTitles[position];
        }
    }

}
