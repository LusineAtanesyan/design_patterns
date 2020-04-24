package com.patterns.strategy;

import static java.lang.System.out;

import com.patterns.strategy.attack.NoAttackBehavior;
import com.patterns.strategy.attack.ShootAttackBehavior;
import com.patterns.strategy.jump.ShortJumpBehavior;
import com.patterns.strategy.move.RunMoveBehavior;
import com.patterns.strategy.move.WalkMoveBehavior;
import com.patterns.strategy.view.SmallViewBehavior;

public class Main {

    public static void main(String[] args) {

        Mario mario = new Mario(new SmallViewBehavior(), new ShortJumpBehavior(), new WalkMoveBehavior(), new ShootAttackBehavior());

        out.println(mario.getAttackAction());
        out.println(mario.getJumpAction());
        out.println(mario.getMoveAction());
        out.println(mario.getViewAction());

        mario.setAttackAction(new NoAttackBehavior());
        out.println("Updating attack action: " + mario.getAttackAction());

        mario.setMoveAction(new RunMoveBehavior());
        out.println("Updating move action: " + mario.getMoveAction());

    }

}