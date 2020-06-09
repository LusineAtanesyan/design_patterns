package com.patterns.decorator.beaty_salon;

public class ShineBeautySalon implements BeautySalon {

    @Override
    public String getDescription() {
        return "Base services!";
    }

    @Override
    public int getPrice() {
        return 5000;
    }


}
