package com.patterns.strategy.attack;

public class NoAttackBehavior implements Attack {

    @Override
    public String attack() {
        return "No Attack!";
    }

}
