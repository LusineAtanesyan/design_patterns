package com.patterns.facade.air;

public class AirConditioningSystem {

    public void setTemperature(int temperature) {
        System.out.println("The tempriture is: " + temperature);
    }

    public void setHumidity(int humidity) {
        System.out.println("The humidity is: " + humidity);
    }

    public void off() {
        System.out.println("turn off the air conditioning");
    }
}
