package com.example.gao.giftapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gao.giftapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GirlFriendFragment extends Fragment {


    private View mView;

    public GirlFriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_girl_friend, container, false);
        return mView;
    }

}
