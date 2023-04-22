package com.lioneltlynch.aqidatafinder.service;

import com.lioneltlynch.aqidatafinder.aqimodel.APIData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class AirQualityService {
    @Autowired
    RestTemplate restTemplate;

    public AirQualityService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public APIData MakeAirQualityObj(float lat, float lon) {
        String apiKey = ""; // API key Would be stored in Env as a var.
        String url = String.format("http://api.openweathermap.org/data/2.5/air_pollution?lat=%f&lon=%f&appid=%s"
                ,lat, lon, apiKey);
        try {
            APIData data = restTemplate.getForObject(url, APIData.class);
            return data;
        } catch (RestClientException e) {
            System.out.println("Error getting air quality data: " + e.getMessage());
            return null;
        }
    }
    public int getAqiNum(APIData data) {
        return data.getList().get(0).getMain().getAqi();
    }}
