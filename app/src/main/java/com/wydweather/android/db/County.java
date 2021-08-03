package com.wydweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    private String getCountyName(){
        return countyName;
    }
    private void setCountyName(String countyName){
        this.countyName=countyName;
    }
    private String getWeatherId(){
        return weatherId;
    }
    private void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    private int getCityId(){
        return cityId;
    }
    private void setCityId(int cityId){
        this.cityId=cityId;
    }
}
