package org.example.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@PropertySource("classpath:weeks.properties")
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:weeks.properties")
})
public class WeekDaysHolder {
    @Value("${monday}")
    private SimpleWeekDays mondayFromAppProps;

    @Value("${friday}")
    private SimpleWeekDays mondayFromSpecFile;

    @PostConstruct
    public void demoFunction() {
        System.out.println(mondayFromAppProps);
        System.out.println(mondayFromSpecFile);
    }
}
