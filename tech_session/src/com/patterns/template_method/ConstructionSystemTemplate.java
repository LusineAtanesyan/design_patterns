package com.patterns.template_method;

abstract public class ConstructionSystemTemplate {

    protected void buildParking() {
        System.out.println("Basic parking is set");
    }

    protected void buildBuilding() {
        System.out.println("Basic building is set");
    }

    protected void setSewageSystem() {
        System.out.println("Basic sewage system is set");
    }

    protected void setHeatingSystem() {
        System.out.println("Basic heating system is set");
    }

    protected void setCoolingSystem() {
        System.out.println("Basic cooling system is set");
    }

    protected void setWindows() {
        System.out.println("Basic windows are set");
    }

    protected void buildGarden() {
        System.out.println("BBasic garden is build");
    }
}
