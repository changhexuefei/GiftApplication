package com.example.gao.giftapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gao.giftapplication.R;
import com.example.gao.giftapplication.bean.Produce;

import java.util.List;

/**
 * Created by gao on 2017/1/3.
 */

public class CategoriesNameAdapter extends BaseAdapter {
    private List<Produce.DataBean.CategoriesBean> mCategoriesBeen;
    private LayoutInflater mInflater;
    private Context mContext;

    public CategoriesNameAdapter(Context context) {

        this.mInflater=LayoutInflater.from(context);
    }

    public void setCategoriesBeen(List<Produce.DataBean.CategoriesBean> categoriesBeen) {
        mCategoriesBeen = categoriesBeen;
    }

    @Override
    public int getCount() {
        if (mCategoriesBeen != null)
            return mCategoriesBeen.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return mCategoriesBeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.listviewitem, parent,false);
            holder.tv_name = (TextView) convertView.findViewById(R.id.produce_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (mCategoriesBeen != null) {
            holder.tv_name.setText(mCategoriesBeen.get(position).getName());
        }

        return convertView;
    }

    class ViewHolder {
        TextView tv_name;
    }
}
