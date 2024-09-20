package org.example.converters;

import org.example.values.SimpleWeekDays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class ConverterService {
    @Autowired
    private ConversionService conversionService;

    @PostConstruct
    public void demoFunction() {
        SimpleWeekDays day = conversionService.convert("sunday", SimpleWeekDays.class);
        System.out.println(day);
    }
}
