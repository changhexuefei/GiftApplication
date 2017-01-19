package com.example.gao.giftapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;

import java.util.Timer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CommunalActivity extends AppCompatActivity {


    @BindView(R.id.return_icon)
    ImageView mReturnIcon;
    @BindView(R.id.see)
    TextView mSee;
    @BindView(R.id.icon)
    ImageView mIcon;
    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.web_view)
    WebView mWebView;

    private long timeout = 5000;
    private Handler mHandler = new Handler();

    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_communal);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            putDataToWebView(bundle);
        }
    }

    private void putDataToWebView(Bundle bundle) {
        mTitle.setText(bundle.getString("title"));
        Glide.with(this).load(bundle.getString("cover_image_url")).into(mIcon);
        WebSettings webSettings = mWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setAllowFileAccess(true);

        mWebView.loadUrl(bundle.getString("content_url"));
    }


    @OnClick({R.id.return_icon, R.id.see})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.return_icon:
                finish();
                break;
            case R.id.see:
                break;
        }
    }
}
