package com.patterns.decorator.beaty_salon.services;

import com.patterns.decorator.beaty_salon.BeautySalon;
import com.patterns.decorator.beaty_salon.BeautySalonDecorator;

public class HaircutService extends BeautySalonDecorator {

    public HaircutService(BeautySalon beatySalon) {
        super(beatySalon);
    }

    public String getDescription() {
        return super.getDescription() + " + Haircut Service!";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2000;
    }
}
