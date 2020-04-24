package com.patterns.strategy;

import com.patterns.strategy.attack.Attack;
import com.patterns.strategy.jump.Jump;
import com.patterns.strategy.move.Move;
import com.patterns.strategy.view.View;

public class Mario {
    private View viewAction;
    private Jump jumpAction;
    private Move moveAction;
    private Attack attackAction;

    public Mario(View viewAction, Jump jumpAction, Move moveAction, Attack attackAction) {
        this.viewAction = viewAction;
        this.jumpAction = jumpAction;
        this.moveAction = moveAction;
        this.attackAction = attackAction;
    }

    public void setJumpAction(Jump jumpAction) {
        this.jumpAction = jumpAction;
    }

    public void setMoveAction(Move moveAction) {
        this.moveAction = moveAction;
    }

    public void setAttackAction(Attack attackAction) {
        this.attackAction = attackAction;
    }

    public void setViewAction(View viewAction) {
        this.viewAction = viewAction;
    }

    public String getViewAction() {
        return viewAction.view();
    }

    public String getJumpAction() {
        return jumpAction.jump();
    }

    public String getAttackAction() {
        return attackAction.attack();
    }

    public String getMoveAction() {
        return moveAction.move();
    }
}

