package org.example.lookups;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TouristService {
//    private final WeatherService weatherService;

    @Lookup
    public WeatherService getWeatherServiceBean() {
        return null;
    }

    public String getWeather() {
//        return weatherService.getCurrentTemperature();
        return getWeatherServiceBean().getCurrentTemperature();
    }
}
