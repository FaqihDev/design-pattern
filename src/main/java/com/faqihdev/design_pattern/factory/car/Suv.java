package com.faqihdev.design_pattern.factory.car;

import org.springframework.stereotype.Component;

@Component
public class Suv implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Suv");
    }
}
