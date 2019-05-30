package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pfei on 2019/5/25.
 */
public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature {
        public String max;
        public String min;
    }
}
