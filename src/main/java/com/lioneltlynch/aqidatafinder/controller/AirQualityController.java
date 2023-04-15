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
    public ResponseEntity<APIData> getAirQuality(
            @RequestParam("lat") float lat,
            @RequestParam("lon") float lon) {
        APIData airQuality = airQualityService.getAirQuality(lat, lon);
        if (airQuality != null) {
            return ResponseEntity.ok(airQuality);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
