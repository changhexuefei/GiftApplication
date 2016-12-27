package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.CrossBorder;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;



public class CrossBorderAdapter extends CommonAdapter<CrossBorder.DataBean.ItemsBean> {


    public CrossBorderAdapter(Context context, int layoutId, List<CrossBorder.DataBean.ItemsBean> datas) {
        super(context, layoutId, datas);

    }

    @Override
    protected void convert(ViewHolder holder, CrossBorder.DataBean.ItemsBean itemsBean, int position) {

        holder.setText(R.id.nickname, itemsBean.getAuthor().getNickname())
                .setText(R.id.introduction, itemsBean.getAuthor().getIntroduction())
                .setText(R.id.title, itemsBean.getTitle())
                .setText(R.id.content_introduction, itemsBean.getIntroduction())
                .setText(R.id.column_title, itemsBean.getColumn().getTitle())
                .setText(R.id.likes_count, String.valueOf(itemsBean.getLikes_count()));
        Glide.with(MyApp.getContext()).load(itemsBean.getCover_image_url())
                .into((ImageView) holder.getView(R.id.cover_image_url));
        Glide.with(MyApp.getContext()).load(itemsBean.getAuthor().getAvatar_url())
                .into((ImageView) holder.getView(R.id.author_icon));
    }
}
