package com.patterns.template_method;

public class ResidentialComplexes extends ConstructionSystemTemplate {

    @Override
    protected void buildParking() {
        System.out.println("Building Parking next tto the houses");
    }

    @Override
    protected void buildBuilding() {
        System.out.println("Build building using smart technologies");
    }

    @Override
    protected void setSewageSystem() {
        System.out.println("Setting sewage system using smart technologies");
    }

    @Override
    protected void setHeatingSystem() {
        System.out.println("Setting heating system using smart technologies");
    }

    @Override
    protected void setCoolingSystem() {
        System.out.println("Setting colling system using smart technologies");
    }

    @Override
    protected void setWindows() {
        System.out.println("Setting windows using wood material");
    }

    @Override
    protected void buildGarden() {
        System.out.println("Build garden next to the houses");
    }
}
