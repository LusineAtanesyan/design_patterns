package com.patterns.strategy.attack;

public class ShootAttackBehavior implements Attack {

    @Override
    public String attack() {
        return "Shoot Attack!";
    }

}
