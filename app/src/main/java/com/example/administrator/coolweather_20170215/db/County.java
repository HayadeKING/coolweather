package com.example.administrator.coolweather_20170215.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class County extends DataSupport {

    private int id;//县的id号

    private String countyName;//县的名字

    private String weatherId;//县所对应的天气的id

    private int cityId;//当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
