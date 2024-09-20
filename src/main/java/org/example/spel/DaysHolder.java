package org.example.spel;

import org.example.values.SimpleWeekDays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:weeks.properties")
public class DaysHolder {
    @Value("#{'${wednesday}'.toUpperCase()}")
    private SimpleWeekDays mondayFromSpecFile;

    @Value("#{'${wednesday} ' + 'a good day to say hello'}")
    private String goodDay;

    @PostConstruct
    public void demoFunction() {
        System.out.println(mondayFromSpecFile);
        System.out.println(goodDay);
    }
}
