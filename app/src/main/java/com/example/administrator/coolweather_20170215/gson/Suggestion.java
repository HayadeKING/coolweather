package com.example.administrator.coolweather_20170215.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class Suggestion {

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

}
