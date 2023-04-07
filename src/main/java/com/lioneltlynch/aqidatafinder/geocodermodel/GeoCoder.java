/*
Author: Lionel T. Lynch
File name: GeoCoder.java

Description:

This class represents a GeoCoder object used to store location data. It has fields for the location's name,
local names, latitude, longitude, country, and state. It contains an empty constructor and a constructor with
all the fields. The class has getter methods for latitude, longitude, and both as a list. Additionally, it has
an overridden toString method to print the GeoCoder object as a string representation. This class is annotated
with @Component, indicating that it is a Spring-managed bean and can be autowired into other components.
*/


package com.lioneltlynch.aqidatafinder.geocodermodel;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GeoCoder {
    private Name name;
    private Local_Names local_names;
    private Lat lat;
    private Lon lon;
    private Country country;
    private State state;

    // Empty Constructor
    public GeoCoder(){}

    // Constructor
    public GeoCoder(Name name,
                    Local_Names local_names,
                    Lon lon,
                    Lat lat,
                    Country country,
                    State state) {

        this.name = name;
        this.local_names = local_names;
        this.lat = lat;
        this.lon = lon;
        this.country = country;
        this.state = state;
    }

    // Get Lat
    public float getLat() {
        return lat.getLat();
    }

    // Get Lon
    public float getLon() {
        return lon.getLon();
    }

    // Getter for latitude and longitude
    public List<Float> getLatLon() {
        return Arrays.asList(lat.getLat(), lon.getLon());
    }

    // toString override
    @Override
    public String toString() {
        return "GeoCoder{" +
                "name=" + name +
                ", local_names=" + local_names +
                ", lat=" + lat +
                ", lon=" + lon +
                ", country=" + country +
                ", state=" + state +
                '}';
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Local_Names getLocal_names() {
        return local_names;
    }

    public void setLocal_names(Local_Names local_names) {
        this.local_names = local_names;
    }

    public void setLat(Lat lat) {
        this.lat = lat;
    }

    public void setLon(Lon lon) {
        this.lon = lon;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}