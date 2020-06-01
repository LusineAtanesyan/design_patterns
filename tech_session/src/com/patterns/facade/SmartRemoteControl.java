package com.patterns.facade;

import com.patterns.facade.air.AirConditioningSystem;
import com.patterns.facade.air.AirConditioningSystemDefault;
import com.patterns.facade.light.LightLevel;
import com.patterns.facade.light.LightSystem;
import com.patterns.facade.sound.EqualizerMode;
import com.patterns.facade.sound.VolumeLevel;

import static java.lang.System.out;

public class SmartRemoteControl {

    private LightLevel lightLevel;
    private LightSystem lightSystem;
    private AirConditioningSystem airConditioningSystem;
    private AirConditioningSystemDefault airConditioningSystemDefault;
    private EqualizerMode equalizerMode;
    private VolumeLevel volumeLevel;

    public SmartRemoteControl() {
        this.lightLevel = new LightLevel();
        this.lightSystem = new LightSystem();
        this.airConditioningSystem = new AirConditioningSystem();
        this.airConditioningSystemDefault = new AirConditioningSystemDefault();
        this.equalizerMode = new EqualizerMode();
        this.volumeLevel = new VolumeLevel();
    }

    public void workoutMode() {
        lightLevel.bright();
        airConditioningSystem.setTemperature(21);
        airConditioningSystem.setHumidity(50);
        equalizerMode.music();
        volumeLevel.soft();
    }

    public void outOfHomeMode() {
        lightLevel.off();
        airConditioningSystem.setTemperature(21);
        airConditioningSystem.setHumidity(50);
        volumeLevel.off();
    }

    public void partyMode() {
        lightLevel.dark();
        airConditioningSystemDefault.normal();
        equalizerMode.music();
        volumeLevel.load();
    }

    public void sleepMode() {
        lightLevel.off();
        airConditioningSystemDefault.normal();
        equalizerMode.movie();
        volumeLevel.soft();
    }

    public void vacationMode() {
        lightLevel.off();
        airConditioningSystem.off();
        equalizerMode.off();
        volumeLevel.off();
    }

}

