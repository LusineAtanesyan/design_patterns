package com.patterns.decorator.beaty_salon.services;

import com.patterns.decorator.beaty_salon.BeautySalon;
import com.patterns.decorator.beaty_salon.BeautySalonDecorator;

public class ShellacService extends BeautySalonDecorator {

    public ShellacService(BeautySalon beatySalon) {
        super(beatySalon);
    }

    public String getDescription() {
        return super.getDescription() + " + Shellac Service!";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5000;
    }
}
