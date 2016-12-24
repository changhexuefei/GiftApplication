package com.example.gao.giftapplication.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
//    private ScalableTabIndicator mScalableTabIndicator;
    private ViewPager mPager;
    private ViewPagerAdapter mAdapter;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
//        mScalableTabIndicator = view.findViewById(R.id.tabindicator);
        return view;
    }

    private class ViewPagerAdapter extends FragmentStatePagerAdapter {

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public Fragment getItem(int num) {

            Bundle bundle = new Bundle();
            bundle.putInt("position", num);
//            SimpleFragment fg=new SimpleFragment();
//            fg.setArguments(bundle);
//            return fg;
            return null;
        }

        @Override
        public int getCount() {
            // 增加indicator时需要在这里更改个数
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return " " + position;
        }

    }



}
