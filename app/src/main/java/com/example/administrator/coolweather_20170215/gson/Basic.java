package com.example.administrator.coolweather_20170215.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
