package com.lioneltlynch.aqidatafinder.service;

import com.lioneltlynch.aqidatafinder.aqimodel.APIData;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class AirQualityService {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private final Dotenv dotenv;

    public AirQualityService(RestTemplate restTemplate, Dotenv dotenv) {
        this.restTemplate = restTemplate;
        this.dotenv = dotenv;
    }

    public APIData MakeAirQualityObj(float lat, float lon) {
        String apiKey = dotenv.get("API_KEY");

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
    }
}