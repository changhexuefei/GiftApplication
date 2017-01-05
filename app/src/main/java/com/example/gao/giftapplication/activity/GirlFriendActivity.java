package com.example.gao.giftapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GirlFriendActivity extends AppCompatActivity {

    @BindView(R.id.icon)
    ImageView mGirlIcon;
    @BindView(R.id.web_view)
    WebView mGirlWebView;
    @BindView(R.id.title)
    TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girl_friend);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            putDataToWebView(bundle);
        }
    }

    private void putDataToWebView(Bundle bundle) {
        mTitle.setText(bundle.getString("title"));
        Glide.with(this).load(bundle.getString("cover_image_url")).into(mGirlIcon);
        mGirlWebView.loadUrl(bundle.getString("content_url"));
    }


}
