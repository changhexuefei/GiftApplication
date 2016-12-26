package com.example.gao.giftapplication.app;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

import com.example.gao.giftapplication.http.HttpUtils;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import org.xutils.x;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by gao on 2016/11/27.
 */

public class MyApp extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //初始化OkHttp
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggerInterceptor("HttpUtils"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .build();
        HttpUtils.init(okHttpClient);

        x.Ext.setDebug(true);
        x.Ext.init(this);
        initImageLoader();
    }
    /**
     * 获取全局Context变量
     *
     * @return Context
     */
    public static Context getContext() {
        return mContext;
    }


    private void initImageLoader() {

        //缓存的目录
        File cacheDir = new File(Environment.
                getExternalStorageDirectory()
                .getPath() + "/0032/cache");
        //自定义配置
        ImageLoaderConfiguration configuration =
                new ImageLoaderConfiguration.Builder(this)
                        .threadPoolSize(4)//设置线程池的个数
                        .diskCache(new UnlimitedDiskCache(cacheDir))//设置缓存目录
                        .diskCacheSize(10 * 1024 * 1024)//设置缓存目录的大小
                        .diskCacheFileNameGenerator(new Md5FileNameGenerator())//MD5加密
                        .diskCacheFileCount(20)
//                        .diskCacheExtraOptions()
                        .build();
        //初始化配置信息
        ImageLoader.getInstance().init(configuration);

    }
}
