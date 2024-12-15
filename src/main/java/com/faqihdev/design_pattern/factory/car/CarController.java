package com.faqihdev.design_pattern.factory.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarFactory carFactory;

    public CarController(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @GetMapping("/car/{type}")
    public void createCar(@PathVariable String type)  {
        Car car = carFactory.getCar(type);
        car.drive();
    }

}
