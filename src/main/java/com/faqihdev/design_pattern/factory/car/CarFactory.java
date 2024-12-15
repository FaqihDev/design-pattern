package com.faqihdev.design_pattern.factory.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Map;


@Component
public class CarFactory {

    private final Map<String, Car> carMap;

    @Autowired
    CarFactory(Map<String, Car> carMap) {
        this.carMap = carMap;
    }

    public Car getCar(String carType) {
        carType = carType.toLowerCase();
        Car car = carMap.get(carType.toLowerCase());
        if (car == null) {
            throw new IllegalArgumentException("Unknown car type: " + carType);
        }
        return car;
    }
}

