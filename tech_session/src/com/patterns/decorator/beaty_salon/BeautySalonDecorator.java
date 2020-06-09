package com.patterns.decorator.beaty_salon;

public abstract class BeautySalonDecorator implements BeautySalon {
    private BeautySalon beatySalon;

    public BeautySalonDecorator(BeautySalon beatySalon) {
        this.beatySalon = beatySalon;
    }

    @Override
    public String getDescription() {
        return beatySalon.getDescription();
    }

    @Override
    public int getPrice() {
        return beatySalon.getPrice();
    }
}