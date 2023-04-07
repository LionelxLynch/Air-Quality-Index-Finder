/*
Name: Lionel T. Lynch
File Name: DateSec.java

Description: Model of the OpenWeather API's date section.
 */


package com.lioneltlynch.aqidatafinder.aqimodel;

public class DateSec {
    private int dt;

    //Constructor
    public DateSec(int dt) {
        this.dt = dt;
    }

    // Setters and Getters
    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "DateSec{" +
                "dt=" + dt +
                '}';
    }
}