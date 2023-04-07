/*
Name: Lionel T. Lynch
File Name: MainSec.java

Description: Model of the OpenWeather API's main section.
 */


package com.lioneltlynch.aqidatafinder.aqimodel;

public class MainSec {
    private int aqi;

    //Setters and Getters
    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    //Empty Constructor
    public MainSec(){};

    //Constructor
    public MainSec(int aqi){
        this.aqi = aqi;
    }

    @Override
    public String toString() {
        return "MainSec{" +
                "aqi=" + aqi +
                '}';
    }
}
