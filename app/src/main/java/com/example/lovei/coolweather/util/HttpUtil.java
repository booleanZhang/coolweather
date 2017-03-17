package com.example.lovei.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lovei on 2017/3/17.
 * 用来发送Http请求
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
