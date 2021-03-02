package com.training.aop.aopmadeeasy.model.impl;

import com.training.aop.aopmadeeasy.model.Mammal;

public class Cat implements Mammal {
    private final String name;

    public Cat() {
        this.name = "Fury";
    }

    public Cat(String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return getClass().getName();
    }
}
