package com.cc.java;

public class Bird implements Flyable,IFeathers {

    @Override
    public String fly() {
        return "I'm a bird, i can fly!";
    }

    @Override
    public String hasFeathers() {
        return "I'm a bird, i have feathers!";
    }

    

    

}
