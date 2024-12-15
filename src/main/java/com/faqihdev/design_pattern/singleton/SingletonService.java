package com.faqihdev.design_pattern.singleton;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class SingletonService {

    //todo The Creation that insure a class has only one instance and provide global point of access to it.
    //todo in spring by default is singleton

    public void printMessage() {
        System.out.println("Singleton instance" + this);
    }
}
