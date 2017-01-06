package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.activity.AuthorInfoActivity;
import com.example.gao.giftapplication.activity.CommunalActivity;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Gay;
import com.example.gao.giftapplication.utils.ToastUtils;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by gao on 2016/12/28.
 */

public class GayAdapter extends CommonAdapter<Gay.DataBean.ItemsBean> {
    public GayAdapter(Context context, int layoutId, List<Gay.DataBean.ItemsBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, final Gay.DataBean.ItemsBean itemsBean, int position) {

        holder.setText(R.id.nickname, itemsBean.getAuthor().getNickname())
                .setText(R.id.introduction, itemsBean.getAuthor().getIntroduction())
                .setText(R.id.title, itemsBean.getTitle())
                .setText(R.id.content_introduction, itemsBean.getIntroduction())
                .setText(R.id.likes_count, String.valueOf(itemsBean.getLikes_count()));
        if (itemsBean.getColumn() != null && !itemsBean.getColumn().equals("")) {
            holder.setText(R.id.column_title, itemsBean.getColumn().getTitle());
        }else {
            holder.getView(R.id.column_title).setVisibility(View.GONE);
            holder.getView(R.id.tv).setVisibility(View.GONE);

        }
        Glide.with(MyApp.getContext()).load(itemsBean.getCover_image_url())
                .into((ImageView) holder.getView(R.id.cover_image_url));
        Glide.with(MyApp.getContext()).load(itemsBean.getAuthor().getAvatar_url())
                .into((ImageView) holder.getView(R.id.author_icon));

        holder.getView(R.id.cover_image_url).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.show(MyApp.getContext(), "你好", Toast.LENGTH_LONG);
                jumpToPage(itemsBean);
            }
        });
        holder.getView(R.id.title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.show(MyApp.getContext(), "标题", Toast.LENGTH_LONG);
                jumpToPage(itemsBean);
            }
        });
        holder.getView(R.id.content_introduction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.show(MyApp.getContext(), "内容", Toast.LENGTH_LONG);
                jumpToPage(itemsBean);

            }
        });
        holder.getView(R.id.author_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.show(mContext, "头像", Toast.LENGTH_LONG);
                getAuthorInfo(itemsBean);

            }
        });

    }

    private void getAuthorInfo(Gay.DataBean.ItemsBean itemsBean) {
        Intent i = new Intent(mContext, AuthorInfoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("nick_name", itemsBean.getAuthor().getNickname());
        bundle.putString("author_avatar_url", itemsBean.getAuthor().getAvatar_url());
        bundle.putString("author_introduction", itemsBean.getAuthor().getIntroduction());
        i.putExtras(bundle);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        mContext.startActivity(i);
    }

    private void jumpToPage(Gay.DataBean.ItemsBean itemsBean) {
        Intent i = new Intent(mContext, CommunalActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("title", itemsBean.getTitle());
        bundle.putString("cover_image_url", itemsBean.getCover_image_url());
        bundle.putString("content_url", itemsBean.getContent_url());
        i.putExtras(bundle);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        mContext.startActivity(i);
    }
}
