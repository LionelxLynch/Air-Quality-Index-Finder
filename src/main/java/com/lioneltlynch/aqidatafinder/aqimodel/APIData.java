/*
Author: Lionel T. Lynch
File name: APIData.java

Description:

This is a Spring component class named "APIData" that models the data obtained
from an API. It has two instance variables: "coord" and "list", which are of type "Coord" and
"List<ListData>", respectively. It has an empty constructor and a parameterized constructor that
takes in a "coord" and a "list". It also has getter and setter methods for both instance variables.
Additionally, it overrides the "toString()" method to provide a string representation of the instance
variables. This class is used to map the data obtained from the API into Java objects for further processing.
 */


package com.lioneltlynch.aqidatafinder.aqimodel;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class APIData {
    private Coord coord;
    private List<ListData> list;

    // Empty Constructor
    public APIData(){};

    // Constructor
    public APIData(Coord coord, List<ListData> list) {
        this.coord = coord;
        this.list = list;
    }

    // Setters and Getters
    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) { this.coord = coord; }

    public List<ListData> getList() {
        return list;
    }

    public void setList(List<ListData> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "APIData{" +
                "coord=" + coord +
                ", list=" + list +
                '}';
    }
}