package com.lioneltlynch.aqidatafinder.service;

import com.lioneltlynch.aqidatafinder.aqimodel.APIData;
import com.lioneltlynch.aqidatafinder.profile.ProfileDetector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirQualityService {
    @Autowired
    RestTemplate restTemplate;

    public AirQualityService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public APIData getAirQuality(float lat, float lon) {
        String apiKey = "bc6315a65012add41669d99a8cc34d83";
        String url = String.format("http://api.openweathermap.org/data/2.5/air_pollution?lat=%f&lon=%f&appid=%s", lat, lon, apiKey);
        APIData Airdata = restTemplate.getForObject(url, APIData.class);
        return Airdata;
    }
}