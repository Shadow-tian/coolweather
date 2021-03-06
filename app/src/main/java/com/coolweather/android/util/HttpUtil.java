package com.coolweather.android.util;

import android.app.VoiceInteractor;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by pfei on 2019/2/14.
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
