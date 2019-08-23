package com.tzh.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int cityCode;
    private int weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getWeatherId() {
        return weatherId;
    }
}
