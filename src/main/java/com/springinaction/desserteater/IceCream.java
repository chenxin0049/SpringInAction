package com.springinaction.desserteater;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("3")
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating ice cream...");
    }
}
