package com.example.gao.giftapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.GirlFriend;

import java.util.List;


public class MyBaseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<GirlFriend.DataBean.ItemsBean> mGirlFriends;

    public void setGirlFriends(List<GirlFriend.DataBean.ItemsBean> girlFriends) {
        mGirlFriends = girlFriends;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item, null);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.WRAP_CONTENT));
        return new ItemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder) {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            Glide.with(MyApp.getContext()).load(mGirlFriends.get(position)
                    .getAuthor().getAvatar_url()).into(itemViewHolder.iv_author_icon);
            Glide.with(MyApp.getContext()).load(mGirlFriends.get(position).getCover_image_url()).into(itemViewHolder.cover_image_url);
            itemViewHolder.tv_nickname.setText(mGirlFriends.get(position).getAuthor().getNickname());
            itemViewHolder.tv_introduction.setText(mGirlFriends.get(position).getAuthor().getIntroduction());
            itemViewHolder.tv_column_title.setText(mGirlFriends.get(position).getColumn().getTitle());
            itemViewHolder.tv_content_introduction.setText(mGirlFriends.get(position).getIntroduction());
            itemViewHolder.tv_title.setText(mGirlFriends.get(position).getTitle());
            itemViewHolder.tv_likes_count.setText(String.valueOf(mGirlFriends.get(position).getLikes_count()));
        }


    }

    @Override
    public int getItemCount() {
        return mGirlFriends.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_author_icon, cover_image_url;
        TextView tv_nickname, tv_introduction, tv_title,
                tv_content_introduction, tv_column_title, tv_likes_count;

        public ItemViewHolder(View itemView) {
            super(itemView);
            iv_author_icon = (ImageView) itemView.findViewById(R.id.author_icon);
            cover_image_url = (ImageView) itemView.findViewById(R.id.cover_image_url);
            tv_nickname = (TextView) itemView.findViewById(R.id.nickname);
            tv_introduction = (TextView) itemView.findViewById(R.id.introduction);
            tv_title = (TextView) itemView.findViewById(R.id.title);
            tv_content_introduction = (TextView) itemView.findViewById(R.id.content_introduction);
            tv_column_title = (TextView) itemView.findViewById(R.id.column_title);
            tv_likes_count = (TextView) itemView.findViewById(R.id.likes_count);
        }
    }


}
