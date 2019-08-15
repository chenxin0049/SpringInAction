package com.springinaction.desserteater;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("1")
public class Cake implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating cake...");
    }
}
