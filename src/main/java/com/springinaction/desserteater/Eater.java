package com.springinaction.desserteater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Eater {
    private Dessert dessert;

    @Autowired
    @Qualifier("1")
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    public void eat(){
        dessert.eat();
    }
}
