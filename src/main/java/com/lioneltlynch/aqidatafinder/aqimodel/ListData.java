package com.lioneltlynch.aqidatafinder.aqimodel;
/*
Name: Lionel T. Lynch
File Name: ListData.java

Description: Model of the OpenWeather API's list data comprising
the DateSec, MainSec, and Components classes.
 */

public class ListData {
    private DateSec dt;
    private MainSec main;
    private Components components;

    // Empty Constructor
    public  ListData(){};

    // Constructor
    public ListData(DateSec dt, MainSec main, Components components) {
        this.dt = dt;
        this.main = main;
        this.components = components;
    }

    // Setters and Getters
    public DateSec getDt() {
        return dt;
    }

    public void setDt(DateSec dt) {
        this.dt = dt;
    }

    public MainSec getMain() {
        return main;
    }

    public void setMain(MainSec main) {
        this.main = main;
    }

    public Components getComponents() {
        return components;
    }

    public void setComponents(Components components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "dt=" + dt +
                ", main=" + main +
                ", components=" + components +
                '}';
    }
}