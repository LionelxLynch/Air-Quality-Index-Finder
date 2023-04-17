package com.lioneltlynch.aqidatafinder.controller;

import com.lioneltlynch.aqidatafinder.aqimodel.APIData;
import com.lioneltlynch.aqidatafinder.service.AirQualityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirQualityController {
    private final AirQualityService airQualityService;


    public AirQualityController(AirQualityService airQualityService) {
        this.airQualityService = airQualityService;
    }

    @GetMapping("/aqi-data-finder")
    public ResponseEntity<String> getAirQuality(
            @RequestParam("lat") float lat,
            @RequestParam("lon") float lon) {
        APIData data = airQualityService.MakeAirQualityObj(lat, lon);
        int aqi = airQualityService.getAqiNum(data);
        String message = "";
        if (aqi <= 50) {
            message = "The air quality in this location is good.";
        } else if (aqi <= 100) {
            message = "The air quality in this location is moderate.";
        } else if (aqi <= 150) {
            message = "The air quality in this location is unhealthy for sensitive groups.";
        } else if (aqi <= 200) {
            message = "The air quality in this location is unhealthy.";
        } else {
            message = "The air quality in this location is very unhealthy or hazardous.";
        }
        String response = "The AQI is "+aqi + ". " + message;
        return ResponseEntity.ok(response);
    }
}