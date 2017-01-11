package com.example.gao.giftapplication.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.activity.CountryCode;
import com.example.gao.giftapplication.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    @BindView(R.id.country_code)
    TextView mCountryCode;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.country_code)
    public void onClick() {
        ToastUtils.show(getContext(),"代码", Toast.LENGTH_SHORT);
        Intent intent = new Intent(getActivity(),CountryCode.class);


        startActivity(intent);
    }
}
