package com.example.gao.giftapplication.view;

import android.view.View;

import java.util.List;

/**
 * Created by gao on 2016/11/22.
 */

public interface IUIView {

    void skipPage(View view);

    <T> void showData(T t, int pageNumber);

    <T> void showListData(List<T> tList, int pageNumber);

}
