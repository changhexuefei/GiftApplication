package com.example.gao.giftapplication.http;

import com.example.gao.giftapplication.http.response.ResponseHandler;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * Created by gao on 2016/12/26.
 */

public class HttpUtils {
    /**
     * 初始化 okHttpClient
     *
     * @param okHttpClient
     */
    public static void init(OkHttpClient okHttpClient) {
        OkHttpUtils.initClient(okHttpClient);
    }

    public static String get(String url, final ResponseHandler handler) {

        String t = time();

        OkHttpUtils.get().url(url).tag(t).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {

                handler.onError(call, e, id);
            }

            @Override
            public void onResponse(String response, int id) {
                handler.onSuccess(response, id);
            }
            @Override
            public void inProgress(float progress, long total, int id) {
                handler.inProgress(progress, total, id);
            }

        });
        return t;
    }



    /**
     * 取消所有以context为Tag的请求
     *
     * @param tag 请求的tag
     */
    public static void cancel(String tag) {
        OkHttpUtils.getInstance().cancelTag(tag);
    }



    /**
     * 获取时间戳（秒数）
     *
     * @return
     */
    private static String time() {
        return (System.currentTimeMillis() / 1000) + "";
    }


}
