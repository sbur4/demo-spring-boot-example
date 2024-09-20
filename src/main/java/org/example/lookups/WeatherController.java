package org.example.lookups;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final TouristService touristService;

    @GetMapping
    public List<String> getWeather() throws InterruptedException {
        List<String> result = new ArrayList<>();

        result.add(touristService.getWeather());
        Thread.sleep(1000);
        result.add(touristService.getWeather());
        Thread.sleep(1000);
        result.add(touristService.getWeather());

        System.out.println(result);

        return result;
    }
}
