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
import com.example.gao.giftapplication.bean.Produce;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersSimpleAdapter;

import java.util.List;


public class ProduceIconAdapter extends BaseAdapter implements StickyGridHeadersSimpleAdapter {
    private List<Produce.DataBean.CategoriesBean> mCategoriesBeen;
    private List<Produce.DataBean.CategoriesBean.SubcategoriesBean> mSubcategoriesBeen;
    private LayoutInflater mInflater;
    private Context mContext;

    public ProduceIconAdapter(List<Produce.DataBean.CategoriesBean> categoriesBeen, Context context) {
        mCategoriesBeen = categoriesBeen;
        mContext = context;
        this.mInflater=LayoutInflater.from(context);
    }

    public void setSubcategoriesBeen(List<Produce.DataBean.CategoriesBean.SubcategoriesBean> subcategoriesBeen) {
        mSubcategoriesBeen = subcategoriesBeen;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (mSubcategoriesBeen != null) {
            return mSubcategoriesBeen.size();
        } else {

            return 0;
        }
    }

    @Override
    public Object getItem(int position) {
        return mSubcategoriesBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemViewHolder holder;
        if(convertView == null){
            holder = new ItemViewHolder();
            convertView = mInflater.inflate(R.layout.gridviewitem,parent,false);
            holder.iv_icon= (ImageView) convertView.findViewById(R.id.produce_icon);
            holder.tv_iconName = (TextView) convertView.findViewById(R.id.icon_name);
            convertView.setTag(holder);
        }else{
            holder= (ItemViewHolder) convertView.getTag();

        }
        Glide.with(MyApp.getContext()).load(mSubcategoriesBeen.get(position).getIcon_url()).into(holder.iv_icon);
        holder.tv_iconName.setText(mSubcategoriesBeen.get(position).getName());
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return mSubcategoriesBeen.size()-1;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeaderViewHolder mHeaderHolder;
        if (convertView == null) {
            mHeaderHolder = new HeaderViewHolder();
            convertView = mInflater.inflate(R.layout.header, parent,false);
            mHeaderHolder.tv_header = (TextView) convertView
                    .findViewById(R.id.header);
            convertView.setTag(mHeaderHolder);
        } else {
            mHeaderHolder = (HeaderViewHolder) convertView.getTag();
        }

        mHeaderHolder.tv_header.setText(mCategoriesBeen.get(position).getName());

        return convertView;
    }

    class ItemViewHolder {
        ImageView iv_icon;
        TextView tv_iconName;
    }
    class HeaderViewHolder {
        TextView tv_header;

    }

}
