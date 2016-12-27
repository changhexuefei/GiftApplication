package com.example.gao.giftapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Selection;

import java.util.List;

public class SelectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Selection.DataBean.ItemsBean> itemsBean;

    public void setItemsBeen(List<Selection.DataBean.ItemsBean> itemsBeen) {
        this.itemsBean = itemsBeen;
        notifyDataSetChanged();
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
            ItemViewHolder vh = (ItemViewHolder) holder;
            vh.tv_nickname.setText(itemsBean.get(position).getAuthor().getNickname());
            vh.tv_introduction.setText(itemsBean.get(position).getAuthor().getIntroduction());
            vh.tv_title.setText(itemsBean.get(position).getTitle());
            vh.tv_content_introduction.setText(itemsBean.get(position).getIntroduction());
            if (itemsBean.get(position).getColumn() != null && !itemsBean.get(position).getColumn().equals("")) {
                vh.tv_column_title.setText(itemsBean.get(position).getColumn().getTitle());
                vh.tv.setVisibility(View.VISIBLE);
            } else {
                vh.tv_column_title.setVisibility(View.GONE);
                vh.tv.setVisibility(View.GONE);
            }
            vh.tv_likes_count.setText(String.valueOf(itemsBean.get(position).getLikes_count()));

            Glide.with(MyApp.getContext()).load(itemsBean.get(position).getAuthor().getAvatar_url())
                    .into(vh.iv_author_icon);
            Glide.with(MyApp.getContext()).load(itemsBean.get(position).getCover_image_url())
                    .into(vh.cover_image_url);
        }

    }

    @Override
    public int getItemCount() {
        return itemsBean.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_author_icon, cover_image_url;
        TextView tv_nickname, tv_introduction, tv_title,
                tv_content_introduction, tv_column_title, tv_likes_count,tv;

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
            tv= (TextView) itemView.findViewById(R.id.tv);
        }
    }


}
