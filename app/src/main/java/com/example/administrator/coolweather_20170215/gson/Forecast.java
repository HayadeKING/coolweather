package com.example.administrator.coolweather_20170215.gson;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class Forecast {

    public String date;

    public Temperature temperature;

    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        public String info;

    }

}
