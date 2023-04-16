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
    public ResponseEntity<Integer> getAirQuality(
            @RequestParam("lat") float lat,
            @RequestParam("lon") float lon) {
        APIData data = airQualityService.MakeAirQualityObj(lat, lon);
        int aqi = airQualityService.getAqiNum(data);
        if (aqi >= 0) {
            return ResponseEntity.ok(aqi);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}