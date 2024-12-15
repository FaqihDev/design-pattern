package com.faqihdev.design_pattern.singleton;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {

    private final SingletonService singleton;

    public SingletonController (SingletonService singleton) {
        this.singleton = singleton;
    }

    @GetMapping("/singleton")
    public void testSingleton() {
        singleton.printMessage();
    }
}
