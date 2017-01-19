package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.app.MyApp;
import com.example.gao.giftapplication.bean.Category;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersSimpleAdapter;

import java.util.List;


public class CategoryAdapter extends BaseAdapter implements StickyGridHeadersSimpleAdapter {
    private List<Category.DataBean.ChannelGroupsBean> mCategories;
    private LayoutInflater mInflater;
    private Context mContext;

    public CategoryAdapter(Context context) {
        mContext = context;
        this.mInflater=LayoutInflater.from(context);
    }

    public void setCategories(List<Category.DataBean.ChannelGroupsBean> categories) {
        mCategories = categories;
    }

    @Override
    public long getHeaderId(int position) {
        return mCategories.get(position).getId();
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {

        HeaderViewHolder mHeaderHolder;
        if (convertView == null) {
            mHeaderHolder = new HeaderViewHolder();
            convertView = mInflater.inflate(R.layout.header1, parent, false);
            mHeaderHolder.tv_header = (TextView) convertView
                    .findViewById(R.id.name);
            mHeaderHolder.tv_look_over = (TextView) convertView.findViewById(R.id.look_over);
            convertView.setTag(mHeaderHolder);
        } else {
            mHeaderHolder = (HeaderViewHolder) convertView.getTag();
        }

        mHeaderHolder.tv_header.setText(mCategories.get(position).getName());

        return convertView;

    }

    @Override
    public int getCount() {
        return mCategories.size();
    }

    @Override
    public Object getItem(int position) {
        return mCategories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemViewHolder holder;
        if (convertView == null) {
            holder = new ItemViewHolder();
            convertView = mInflater.inflate(R.layout.item_category, parent, false);
            holder.iv_icon = (ImageView) convertView.findViewById(R.id.category_icon);

            convertView.setTag(holder);
        } else {
            holder = (ItemViewHolder) convertView.getTag();

        }
        Glide.with(MyApp.getContext()).load(mCategories.get(0).getChannels().get(position).getIcon_url()).into(holder.iv_icon);

        return convertView;
    }

    class ItemViewHolder {
        ImageView iv_icon;


    }

    class HeaderViewHolder {
        TextView tv_header;
        TextView tv_look_over;

    }

}
