package com.springinaction.desserteater;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("2")
public class Cookies implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating cookies...");
    }
}
