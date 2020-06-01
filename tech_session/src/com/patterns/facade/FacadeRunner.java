package com.patterns.facade;

import static java.lang.System.out;

public class FacadeRunner {

    public void demoSmartHomeSystem() {
        SmartRemoteControl remoteSystem = new SmartRemoteControl();

        out.println("Client woke up, is going to workout now.");
        remoteSystem.workoutMode();

        out.println("Client left home for a work and will come back in the evening.");
        remoteSystem.outOfHomeMode();

        out.println("Client came back home with friends, and now they are going to have a fantastic party at home.");
        remoteSystem.partyMode();

        out.println("Party is finished, Client is totally drunk, he is going to sleep like a bear till the morning.");
        remoteSystem.sleepMode();


        out.println("Client's vacation started, he is leaving the home for 2 weeks.");
        remoteSystem.vacationMode();
    }
}
