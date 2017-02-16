package com.example.administrator.coolweather_20170215.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    public class More {

        @SerializedName("txt")
        public String info;

    }

    @SerializedName("cond")
    public More more;

}
