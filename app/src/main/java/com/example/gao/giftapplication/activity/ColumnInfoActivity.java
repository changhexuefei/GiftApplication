package com.example.gao.giftapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ColumnInfoActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.column_image_url)
    ImageView mColumnImageUrl;
    @BindView(R.id.column_title)
    TextView mColumnTitle;
    @BindView(R.id.column_description)
    TextView mColumnDescription;
    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.spread)
    ImageView mSpread;
    @BindView(R.id.shrink_up)
    ImageView mShrinkUp;
    @BindView(R.id.show_more)
    RelativeLayout mShowMore;

    private static final int VIDEO_CONTENT_DESC_MAX_LINE = 2;// 默认展示最大行数2行
    private static final int SHOW_CONTENT_NONE_STATE = 0;// 扩充
    private static final int SHRINK_UP_STATE = 1;// 收起状态
    private static final int SPREAD_STATE = 2;// 展开状态
    private static int mState = SHRINK_UP_STATE;//默认收起状态


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_column_info);
        ButterKnife.bind(this);
        getBundleData();

    }

    public void getBundleData() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mColumnTitle.setText(bundle.getString("column_title"));
            mColumnDescription.setText(bundle.getString("column_description"));
            Glide.with(this).load(bundle.getString("cover_image_url")).into(mColumnImageUrl);
            //得到TextView中有多少行文字，如果超过3行显示“显示更多”字样，否则，不显示该字样
            mColumnDescription.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    Log.e("aaaaa", "行数" + mColumnDescription.getLineCount());
                    mColumnDescription.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    if (mColumnDescription.getLineCount() >= 3) {
                        mColumnDescription.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        mShowMore.setVisibility(View.VISIBLE);
                        mShowMore.setOnClickListener(ColumnInfoActivity.this);
                    } else {
                        mShowMore.setVisibility(View.GONE);
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        if (mState == SPREAD_STATE) {
            mColumnDescription.setMaxLines(VIDEO_CONTENT_DESC_MAX_LINE);
            mColumnDescription.requestLayout();
            mTv.setText("展开更多");
            mShrinkUp.setVisibility(View.GONE);
            mSpread.setVisibility(View.VISIBLE);
            mState = SHRINK_UP_STATE;
        } else if (mState == SHRINK_UP_STATE) {
            mColumnDescription.setMaxLines(Integer.MAX_VALUE);
            mColumnDescription.requestLayout();
            mTv.setText("收起");
            mShowMore.setVisibility(View.VISIBLE);
            mShrinkUp.setVisibility(View.VISIBLE);
            mSpread.setVisibility(View.GONE);
            mState = SPREAD_STATE;
        }
    }
}
