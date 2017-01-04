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

import java.util.List;

/**
 * Created by gao on 2017/1/3.
 */

public class ProduceIconAdapter extends BaseAdapter {

    private List<Produce.DataBean.CategoriesBean.SubcategoriesBean> mSubcategoriesBeen;
    private LayoutInflater mInflater;
    private Context mContext;

    public ProduceIconAdapter(Context context) {
        mContext = context;
        this.mInflater=LayoutInflater.from(context);
    }

    public void setSubcategoriesBeen(List<Produce.DataBean.CategoriesBean.SubcategoriesBean> subcategoriesBeen) {
        mSubcategoriesBeen = subcategoriesBeen;
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
            convertView = mInflater.inflate(R.layout.gridviewitem,null);
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

    class ItemViewHolder {
        ImageView iv_icon;
        TextView tv_iconName;


    }

}
