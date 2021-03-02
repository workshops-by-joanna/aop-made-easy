package com.training.aop.aopmadeeasy.model;

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
