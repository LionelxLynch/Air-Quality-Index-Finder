/*
Name: Lionel T. Lynch
File Name: Coord.java

Description: Model of the OpenWeather API's Coordinates for air pollution
data.
 */

package com.lioneltlynch.aqidatafinder.aqimodel;

import java.util.ArrayList;
import java.util.List;

public class Coord {
    private float lat;
    private float lon;

    private List<Float> coordinates;

    // Empty Constructor
    public Coord(){}

    public Coord(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
        this.coordinates = new ArrayList<>();
        this.coordinates.add(lat);
        this.coordinates.add(lon);
    }

    // Getters and Setters
    public float getLat() {
        return lat;
    }

    public void setLatLon(float lat, float lon){
        this.lat = lat;
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public List<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lat= " + lat +
                ", lon= " + lon +
                "}";
    }
}
