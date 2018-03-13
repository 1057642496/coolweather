package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 无情 on 2018/3/13.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市名字
    private int provinceId;//记录当前市所属省份的id值
    private int cityCode;//城市的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
