package com.patterns.template_method;

public class BusinessCenters extends ConstructionSystemTemplate {

    @Override
    protected void buildParking() {
        System.out.println("Building Parking in the roof");
    }

    @Override
    protected void buildBuilding() {
        System.out.println("Build building using newest technologies");
    }

    @Override
    protected void setSewageSystem() {
        System.out.println("Setting sewage system using newest technologies");
    }

    @Override
    protected void setHeatingSystem() {
        System.out.println("Setting heating system using newest technologies");
    }

    @Override
    protected void setCoolingSystem() {
        System.out.println("Setting colling system using newest technologies");
    }

    @Override
    protected void setWindows() {
        System.out.println("Setting windows using wood material");
    }

    @Override
    protected void buildGarden() {
        System.out.println("Build garden in the roof!");
    }
}
