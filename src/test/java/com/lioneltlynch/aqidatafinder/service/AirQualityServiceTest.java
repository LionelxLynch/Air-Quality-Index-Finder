package com.lioneltlynch.aqidatafinder.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lioneltlynch.aqidatafinder.aqimodel.APIData;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirQualityServiceTest {

    @Test
    public void testGetAirQuality() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        AirQualityService airQualityService = new AirQualityService(restTemplate);
        APIData data = airQualityService.getAirQuality(28.5384f, 81.378f);
        // Test for getting just aqi
        System.out.println(data.getList().get(0).getMain().getAqi());

        // Test for getting all data
        System.out.println(data);

        assertNotNull(data);
    }
}
