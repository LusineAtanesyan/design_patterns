package com.patterns.decorator.beaty_salon;

import com.patterns.decorator.beaty_salon.services.HaircutService;
import com.patterns.decorator.beaty_salon.services.MakeupService;
import com.patterns.decorator.beaty_salon.services.ShellacService;

public class DecoratorRunner {
    public static void main(String[] args) {
        demoBeatyService();

    }

    public static void demoBeatyService() {
        BeautySalon beautyService = new ShineBeautySalon();
        System.out.println("Beauty salon: " + beautyService.getDescription());
        System.out.println("Base price: "+ beautyService.getPrice());

        beautyService = new MakeupService(new HaircutService(new ShellacService(new ShineBeautySalon())));
        System.out.println("Beauty salon: " + beautyService.getDescription());
        System.out.println("Price: "+ beautyService.getPrice());
    }
}
