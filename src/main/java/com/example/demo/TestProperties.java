package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestProperties {
    @Value("${com.example.demo.name}")
    private String name;
    @Value("${com.example.demo.title}")
    private String title;
    @Value("${com.example.demo.desc}")
    private String desc;
    @Value("${com.example.demo.randomnumber}")
    private String randomnumber;

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getRandomnumber() {
        return this.randomnumber;
    }
}
