package com.training.aop.aopmadeeasy.model.impl;

import com.training.aop.aopmadeeasy.model.Mollusk;

public class Octopus implements Mollusk {
    private final String name;

    public Octopus() {
        this.name = "Fred";
    }

    public Octopus(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return getClass().getName();
    }
}
