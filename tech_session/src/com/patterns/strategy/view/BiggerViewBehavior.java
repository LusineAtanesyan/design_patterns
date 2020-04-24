package com.patterns.strategy.view;

public class BiggerViewBehavior implements View {

    @Override
    public String view() {
        return "Bigger view!";
    }
}
