package org.example.converters;

import org.example.values.SimpleWeekDays;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToSimpleWeekDaysConverter implements Converter<String, SimpleWeekDays> {
    @Override
    public SimpleWeekDays convert(String source) {
        return SimpleWeekDays.valueOf(source.toUpperCase());
    }
}