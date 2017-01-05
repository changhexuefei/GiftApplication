package com.example.gao.giftapplication.view;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.fragment.ArtStyleFragment;
import com.example.gao.giftapplication.fragment.BabyFragment;
import com.example.gao.giftapplication.fragment.BoyFriendFragment;
import com.example.gao.giftapplication.fragment.ColleagueFragment;
import com.example.gao.giftapplication.fragment.CreativeLifeStyleFragment;
import com.example.gao.giftapplication.fragment.CrossBorderShoppingFragment;
import com.example.gao.giftapplication.fragment.DesignFragment;
import com.example.gao.giftapplication.fragment.GayFragment;
import com.example.gao.giftapplication.fragment.GirlFriendFragment;
import com.example.gao.giftapplication.fragment.HoneyFriendsFragment;
import com.example.gao.giftapplication.fragment.MOEFragment;
import com.example.gao.giftapplication.fragment.ParentsFragment;
import com.example.gao.giftapplication.fragment.ScienceFragment;
import com.example.gao.giftapplication.fragment.SelectionFragment;
import com.example.gao.giftapplication.fragment.WonderfulFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    /**
     * PagerSlidingTabStrip的实例
     */
    private PagerSlidingTabStrip tabs;
    //
//    /**
//     * 获取当前屏幕的密度
//     */
    private DisplayMetrics dm;
    //
//    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private final String[] mTitles = {"精选", "送女票", "海淘"
            , "创意生活", "科技范", "送爸妈", "送基友", "送闺蜜", "送同事", "送宝贝", "设计感", "文艺风"
            , "奇葩搞怪", "萌萌达"
    };
    private MyPagerAdapter mAdapter;
    private GirlFriendFragment gff;
    private ArtStyleFragment asf;
    private BabyFragment bf;
    private BoyFriendFragment bff;
    private ColleagueFragment cf;
    private CreativeLifeStyleFragment clsf;
    private CrossBorderShoppingFragment cbsf;
    private DesignFragment df;
    private GayFragment gf;
    private HoneyFriendsFragment hff;
    private MOEFragment moef;
    private ParentsFragment pf;
    private ScienceFragment sf;
    private SelectionFragment sef;
    private WonderfulFragment wf;

    public HomeFragment() {
        // Required empty public constructor
    }

    //
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        setOverflowShowingAlways();
        dm = getResources().getDisplayMetrics();
        ViewPager pager = (ViewPager) view.findViewById(R.id.sort_fragment);
        tabs = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
        pager.setOffscreenPageLimit(0);//设置ViewPager的缓存界面数,默认缓存为2
        pager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        pager.setCurrentItem(0);
        tabs.setViewPager(pager);
        setTabsValue();
        return view;
    }

    //
    private void setTabsValue() {

        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        // 设置Tab的分割线是透明的
        tabs.setDividerColor(Color.TRANSPARENT);
        //设置Tab底部线的颜色是透明的
        tabs.setUnderlineColor(Color.TRANSPARENT);
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
//        tabs.setTextColor(Color.parseColor("#ffffff"));
        // 取消点击Tab时的背景色
        tabs.setTabBackground(0);
//
//
//
    }

    public class MyPagerAdapter extends FragmentStatePagerAdapter {


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            SpannableStringBuilder ssb = new SpannableStringBuilder(" "
                    + mTitles[position]); // space added before text for
            ForegroundColorSpan fcs = new ForegroundColorSpan(Color.GREEN);//字体颜色设置为绿色
            ssb.setSpan(fcs, 1, ssb.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);//设置字体颜色
            return ssb;
        }


        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    if (sef == null) {
                        sef = new SelectionFragment();
                    }
                    return sef;

                case 1:
                    if (gff == null) {
                        gff = new GirlFriendFragment();
                    }
                    return gff;
                case 2:
                    if (cbsf == null) {
                        cbsf = new CrossBorderShoppingFragment();
                    }
                    return cbsf;
                case 3:
                    if (clsf == null) {
                        clsf = new CreativeLifeStyleFragment();
                    }
                    return clsf;
                case 4:
                    if (sf == null) {
                        sf = new ScienceFragment();
                    }
                    return sf;

                case 5:
                    if (pf == null) {
                        pf = new ParentsFragment();
                    }
                    return pf;
                case 6:
                    if (gf == null) {
                        gf = new GayFragment();
                    }
                    return gf;
                case 7:
                    if (hff == null) {
                        hff = new HoneyFriendsFragment();
                    }
                    return hff;
                case 8:
                    if (cf == null) {
                        cf = new ColleagueFragment();
                    }
                    return cf;
                case 9:
                    if (bf == null) {
                        bf = new BabyFragment();
                    }
                    return bf;
                case 10:
                    if (df == null) {
                        df = new DesignFragment();
                    }
                    return df;
                case 11:
                    if (asf == null) {
                        asf = new ArtStyleFragment();
                    }
                    return asf;
                case 12:
                    if (wf == null) {
                        wf = new WonderfulFragment();
                    }
                    return wf;

                case 13:
                    if (moef == null) {
                        moef = new MOEFragment();
                    }
                    return moef;
            }
            return null;
        }

    }

}
