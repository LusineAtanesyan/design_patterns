package com.patterns.template_method;

public class TemplateMethodRunner {

    public static void main(String[] args) {

        System.out.println("BUILDING BUSINESS CENTER");
        ConstructionSystemTemplate system = new BusinessCenters();
        system.buildBuilding();
        system.buildGarden();
        system.buildParking();
        system.setCoolingSystem();
        system.setHeatingSystem();
        system.setSewageSystem();
        system.setWindows();

        System.out.println("BUILDING RESIDENTIAL COMPLEX");
        ConstructionSystemTemplate system2 = new ResidentialComplexes();
        system2.buildBuilding();
        system2.buildGarden();
        system2.buildParking();
        system2.setCoolingSystem();
        system2.setHeatingSystem();
        system2.setSewageSystem();
        system2.setWindows();
    }

}
