package com.example.gao.giftapplication.view;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.InputType;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.activity.SearchActivity;
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
import com.example.gao.giftapplication.model.PagerSlidingTabStrip;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    @BindView(R.id.search_estate_bar)
    EditText mSearchEstateBar;
    @BindView(R.id.to_other)
    ImageView mToOther;

    @BindView(R.id.title_one)
    LinearLayout mTitleOne;
    @BindView(R.id.unfold)
    ImageView mUnfold;
    @BindView(R.id.upfold)
    ImageView mUpfold;
    @BindView(R.id.channel)
    TextView mChannel;



    /**
     * PagerSlidingTabStrip的实例
     */
    private PagerSlidingTabStrip tabs;

    /**
     * 获取当前屏幕的密度
     */
    private DisplayMetrics dm;

    private final String[] mTitles = {"精选", "送女票", "海淘"
            , "创意生活", "科技范", "送爸妈", "送基友", "送闺蜜", "送同事", "送宝贝", "设计感", "文艺风"
            , "奇葩搞怪", "萌萌达"
    };

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
    private ViewPager mPager;
    private PopupWindow mPopupWindow;


    public HomeFragment() {
        // Required empty public constructor
    }

    //
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dm = getResources().getDisplayMetrics();
        mPager = (ViewPager) view.findViewById(R.id.sort_fragment);
        tabs = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
        mPager.setOffscreenPageLimit(0);//设置ViewPager的缓存界面数,默认缓存为2
        mPager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        mPager.setCurrentItem(0);
        tabs.setViewPager(mPager);
        setTabsValue();

        ButterKnife.bind(this, view);
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
        tabs.setIndicatorHeight((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, dm));
        // 设置Tab标题文字的大小
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 12, dm));
        // 设置Tab Indicator的颜色

        tabs.setIndicatorColor(Color.parseColor("#CC0000"));
        //设置文字选中时的颜色
        tabs.setSelectedTextColor(Color.parseColor("#CC0000"));
        // 取消点击Tab时的背景色
        tabs.setTabBackground(0);
//        tabs.setScrollOffset(10);

//
    }


    @OnClick({R.id.search_estate_bar, R.id.to_other, R.id.unfold, R.id.upfold})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.search_estate_bar:
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(mSearchEstateBar.getWindowToken(), 0);
                mSearchEstateBar.setInputType(InputType.TYPE_NULL);
                Intent intent = new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);

                break;
            case R.id.to_other:
                break;
            case R.id.unfold:
                showPopupWindow();

                break;
            case R.id.upfold:
                packUpPopupWindow();
                break;


        }
    }

    private void packUpPopupWindow() {
        tabs.setVisibility(View.VISIBLE);
        mUnfold.setVisibility(View.VISIBLE);
        mUpfold.setVisibility(View.GONE);
        mChannel.setVisibility(View.GONE);
        mPopupWindow.dismiss();


    }


    private void showPopupWindow() {
        tabs.setVisibility(View.INVISIBLE);
        mUnfold.setVisibility(View.GONE);
        mUpfold.setVisibility(View.VISIBLE);
        mChannel.setVisibility(View.VISIBLE);
        View popupView = View.inflate(getActivity(), R.layout.item_pop, null);
        mPopupWindow = new PopupWindow(popupView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, true);
        mPopupWindow.setTouchable(true);
        mPopupWindow.setOutsideTouchable(true);
        mPopupWindow.showAsDropDown(tabs);
        GridView gv = (GridView) popupView.findViewById(R.id.item_pop_gv);

        mPopupWindow.setBackgroundDrawable(getResources().getDrawable(android.R.color.white));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.item_pop_text, mTitles);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mPager.setCurrentItem(position);
                packUpPopupWindow();
            }
        });

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
