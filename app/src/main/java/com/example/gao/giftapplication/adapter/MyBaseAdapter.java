package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.activity.GirlFriendActivity;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.GirlFriend;
import com.example.gao.giftapplication.utils.ToastUtils;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;


public class MyBaseAdapter extends CommonAdapter<GirlFriend.DataBean.ItemsBean> {


    public MyBaseAdapter(Context context, int layoutId, List<GirlFriend.DataBean.ItemsBean> datas) {
        super(context, layoutId, datas);
    }

    @Override
    protected void convert(ViewHolder holder, final GirlFriend.DataBean.ItemsBean itemsBean, int position) {

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
        holder.getView(R.id.cover_image_url).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.show(MyApp.getContext(),"你好", Toast.LENGTH_LONG);
                Intent i = new Intent(mContext,GirlFriendActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",itemsBean.getTitle());
                bundle.putString("cover_image_url",itemsBean.getCover_webp_url());
                bundle.putString("content_url",itemsBean.getContent_url());
                i.putExtras(bundle);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                mContext.startActivity(i);
            }
        });




    }


}
