package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pfei on 2019/5/25.
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
