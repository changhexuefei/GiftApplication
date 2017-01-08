package com.example.gao.giftapplication.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.bean.HotWords;
import com.example.gao.giftapplication.content.Content;
import com.example.gao.giftapplication.http.HttpUtils;
import com.example.gao.giftapplication.http.response.JsonResponseHandler;
import com.example.gao.giftapplication.utils.ToastUtils;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;

public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.hot_words)
    LinearLayout mHotWords;
    @BindView(R.id.search_estate_bar)
    EditText mSearchEstateBar;
    private List<String> mHot_words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search);

        ButterKnife.bind(this);
        getHotWords();

        getEditTextFocus();

    }

    private void getEditTextFocus() {
        mSearchEstateBar.setFocusable(true);
        mSearchEstateBar.setFocusableInTouchMode(true);
        mSearchEstateBar.requestFocus();
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(mSearchEstateBar, InputMethodManager.RESULT_SHOWN);
        inputManager.toggleSoftInput(InputMethodManager.SHOW_FORCED,InputMethodManager.HIDE_IMPLICIT_ONLY);
    }

    private void getHotWords() {
        HttpUtils.get(Content.SEARCH, new JsonResponseHandler() {
            @Override
            public void onError(Call call, Exception e, int id) {

            }

            @Override
            public void onSuccess(String response, int id) {
                mHot_words = new ArrayList<String>();
                Gson gson = new Gson();
                HotWords hotWords = gson.fromJson(response, HotWords.class);
                mHot_words = hotWords.getData().getHot_words();

                Log.d("2222", mHot_words + "");
                ToastUtils.show(SearchActivity.this, mHot_words.size() + "", Toast.LENGTH_SHORT);

                initAutoLL();

            }

        });


    }

    //    绘制自动换行的线性布局
    private void initAutoLL() {
//        每一行的布局，初始化第一行布局
        LinearLayout rowLL = new LinearLayout(this);
        LinearLayout.LayoutParams rowLP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        float rowMargin = dipToPx(10);
        rowLP.setMargins(0, (int) rowMargin, 0, 0);
        rowLL.setLayoutParams(rowLP);
        boolean isNewLayout = false;
        final float maxWidth = getScreenWidth() - dipToPx(30);
//        剩下的宽度
        float elseWidth = maxWidth;
        LinearLayout.LayoutParams textViewLP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        textViewLP.setMargins((int) dipToPx(8), 0, 0, 0);
        for (int i = 0; i < mHot_words.size(); i++) {

//            若当前为新起的一行，先添加旧的那行
//            然后重新创建布局对象，设置参数，将isNewLayout判断重置为false
            if (isNewLayout) {
                mHotWords.addView(rowLL);
                rowLL = new LinearLayout(this);
                rowLL.setLayoutParams(rowLP);
                isNewLayout = false;
            }
//            计算是否需要换行
            final TextView textView = (TextView) this.getLayoutInflater().inflate(R.layout.item_textview, null);

            if (i <= 2) {
                textView.setTextColor(Color.parseColor("#fa0303"));

            } else {
                textView.setTextColor(Color.parseColor("#302d2d"));
            }

            textView.setText(mHot_words.get(i));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSearchEstateBar.setText(textView.getText());
                }
            });
            textView.measure(0, 0);
//            若是一整行都放不下这个文本框，添加旧的那行，新起一行添加这个文本框
            if (maxWidth < textView.getMeasuredWidth()) {
                mHotWords.addView(rowLL);
                rowLL = new LinearLayout(this);
                rowLL.setLayoutParams(rowLP);
                rowLL.addView(textView);
                isNewLayout = true;
                continue;
            }
//            若是剩下的宽度小于文本框的宽度（放不下了）
//            添加旧的那行，新起一行，但是i要-1，因为当前的文本框还未添加
            if (elseWidth < textView.getMeasuredWidth()) {
                isNewLayout = true;
                i--;
//                重置剩余宽度
                elseWidth = maxWidth;
                continue;
            } else {
//                剩余宽度减去文本框的宽度+间隔=新的剩余宽度
                elseWidth -= textView.getMeasuredWidth() + dipToPx(8);
                if (rowLL.getChildCount() == 0) {
                    rowLL.addView(textView);
                } else {
                    textView.setLayoutParams(textViewLP);
                    rowLL.addView(textView);
                }
            }
        }
//        添加最后一行，但要防止重复添加
        mHotWords.removeView(rowLL);
        mHotWords.addView(rowLL);
    }


    //    dp转px
    private float dipToPx(int dipValue) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dipValue,
                this.getResources().getDisplayMetrics());
    }

    //  获得屏幕宽度
    private float getScreenWidth() {
        return this.getResources().getDisplayMetrics().widthPixels;
    }


}
