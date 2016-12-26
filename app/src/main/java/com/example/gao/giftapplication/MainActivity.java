package com.example.gao.giftapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.gao.giftapplication.view.CategoryFragment;
import com.example.gao.giftapplication.view.GiftFragment;
import com.example.gao.giftapplication.view.HomeFragment;
import com.example.gao.giftapplication.view.ProfileFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.navigation_bar)
    RadioGroup mNavigationBar;
    private CategoryFragment cf;
    private GiftFragment gf;
    private HomeFragment hf;
    private ProfileFragment pf;
    private long mExitTime; //退出时间

    private static final int CF = 0;
    private static final int GF = 1;
    private static final int HF = 2;
    private static final int PF = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        showFragment(HF);
        mNavigationBar.check(R.id.home);
        init();

    }

    private void init() {
        mNavigationBar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.home:
                        showFragment(HF);
                        break;
                    case R.id.gift:
                        showFragment(GF);
                        break;
                    case R.id.category:
                        showFragment(CF);
                        break;
                    case R.id.profile:
                        showFragment(PF);
                        break;
                }
            }
        });
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //按下的如果是BACK，同时没有重复
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                mExitTime = System.currentTimeMillis();
            } else {
//                SysApplication.getInstance().exit();
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    public void showFragment(int index) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        hideFragment(ft);
        switch (index) {
            case HF:
                if (hf == null) {
                    hf = new HomeFragment();
                    ft.add(R.id.frameList, hf);
                } else {
                    ft.show(hf);
                }
                break;
            case GF:
                if (gf == null) {
                    gf = new GiftFragment();
                    ft.add(R.id.frameList, gf);
                } else {
                    ft.show(gf);
                }
                break;
            case CF:
                if (cf == null) {
                    cf = new CategoryFragment();
                    ft.add(R.id.frameList, cf);
                } else {
                    ft.show(cf);
                }
                break;
            case PF:
                if (pf == null) {
                    pf = new ProfileFragment();
                    ft.add(R.id.frameList, pf);
                } else {
                    ft.show(pf);
                }
                break;
        }
        ft.commit();
    }

    public void hideFragment(FragmentTransaction ft) {
        if (hf != null) {
            ft.hide(hf);
        }
        if (gf != null) {
            ft.hide(gf);
        }
        if (cf != null) {
            ft.hide(cf);
        }
        if (pf != null) {
            ft.hide(pf);
        }
    }


}
