package com.coolweather.Android.coolweathe.gson;

import com.google.gson.annotations.SerializedName;

public class ForeCast {
    public String data;

    @SerializedName("tmp")
    public Temperaturn temperaturn;

    @SerializedName("cond")
    public More more;

    public class Temperaturn{
        public String Max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
