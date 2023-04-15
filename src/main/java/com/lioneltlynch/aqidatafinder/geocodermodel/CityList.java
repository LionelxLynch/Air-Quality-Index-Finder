package com.lioneltlynch.aqidatafinder.geocodermodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityList {
    private List<City> cities;

    public CityList(City[] cities) {
        this.cities = new ArrayList<>();
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CityList[");
        sb.append("cities=");
        sb.append(cities.toString());
        sb.append("]");
        return sb.toString();
    }
}