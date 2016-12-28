package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Wonderful;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

/**
 * Created by gao on 2016/12/28.
 */

public class WonderfulAdapter extends CommonAdapter<Wonderful.DataBean.ItemsBean> {
    public WonderfulAdapter(Context context, int layoutId, List<Wonderful.DataBean.ItemsBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, Wonderful.DataBean.ItemsBean itemsBean, int position) {
        holder.setText(R.id.nickname, itemsBean.getAuthor().getNickname())
                .setText(R.id.introduction, itemsBean.getAuthor().getIntroduction())
                .setText(R.id.title, itemsBean.getTitle())
                .setText(R.id.content_introduction, itemsBean.getIntroduction())
                .setText(R.id.likes_count, String.valueOf(itemsBean.getLikes_count()));
        if (itemsBean.getColumn() != null && !itemsBean.getColumn().equals("")) {
            holder.setText(R.id.column_title, itemsBean.getColumn().getTitle());
        } else {
            holder.getView(R.id.column_title).setVisibility(View.GONE);
            holder.getView(R.id.tv).setVisibility(View.GONE);

        }
        Glide.with(MyApp.getContext()).load(itemsBean.getCover_image_url())
                .into((ImageView) holder.getView(R.id.cover_image_url));
        Glide.with(MyApp.getContext()).load(itemsBean.getAuthor().getAvatar_url())
                .into((ImageView) holder.getView(R.id.author_icon));
    }

}
