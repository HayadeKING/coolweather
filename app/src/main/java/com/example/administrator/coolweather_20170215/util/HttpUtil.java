package com.example.administrator.coolweather_20170215.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/2/15 0015.
 * 其中封装的是工具方法，用于获得服务器数据。
 */
public class HttpUtil {

    /**
     * 用于向服务器放松请求，从而获得网络数据
     */
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
