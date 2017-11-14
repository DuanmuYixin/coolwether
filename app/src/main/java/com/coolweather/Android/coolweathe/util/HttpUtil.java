package com.coolweather.Android.coolweathe.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {             //从服务器获取省市区JSON数据

    public static void sendOkHttpRequest(String address , okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
