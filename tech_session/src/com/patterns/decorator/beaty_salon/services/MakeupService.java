package com.patterns.decorator.beaty_salon.services;

import com.patterns.decorator.beaty_salon.BeautySalon;
import com.patterns.decorator.beaty_salon.BeautySalonDecorator;

public class MakeupService extends BeautySalonDecorator {

    public MakeupService(BeautySalon beatySalon) {
        super(beatySalon);
    }

    public String getDescription() {
        return super.getDescription() + " + Makeup Service!";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 3000;
    }
}
