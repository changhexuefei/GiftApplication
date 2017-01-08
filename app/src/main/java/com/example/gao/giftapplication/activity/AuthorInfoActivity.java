package com.example.gao.giftapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class AuthorInfoActivity extends AppCompatActivity {

    @BindView(R.id.fuzzy_icon)
    ImageView mFuzzyIcon;
    @BindView(R.id.author_icon)
    CircleImageView mAuthorIcon;
    @BindView(R.id.author_nickname)
    TextView mAuthorNickname;
    @BindView(R.id.author_introduction)
    TextView mAuthorIntroduction;
    @BindView(R.id.go_back)
    ImageView mGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_author_info);

        ButterKnife.bind(this);
        getData();

    }

    public void getData() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mAuthorNickname.setText(extras.getString("nick_name"));
            mAuthorIntroduction.setText(extras.getString("author_introduction"));
            Glide.with(this).load(extras.getString("author_avatar_url"))
                    .bitmapTransform(new BlurTransformation(this, 10))
                    .into(mFuzzyIcon);
            Glide.with(this).load(extras.getString("author_avatar_url")).into(mAuthorIcon);

        }

    }

    @OnClick(R.id.go_back)
    public void onClick() {
        finish();
    }
}
