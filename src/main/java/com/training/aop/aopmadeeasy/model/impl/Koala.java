package com.training.aop.aopmadeeasy.model.impl;

import com.training.aop.aopmadeeasy.model.Mammal;

public class Koala implements Mammal {
    private final String name;

    public Koala() {
        this.name = "Koalafication";
    }

    public Koala(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return getClass().getName();
    }
}
