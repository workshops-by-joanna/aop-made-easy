package com.training.aop.aopmadeeasy.model.impl;

import com.training.aop.aopmadeeasy.model.Fish;

public class Cod implements Fish {

    public Cod() {
        this.name = "Cod McCodFace";
    }

    public Cod(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getType() {
        return getClass().getName();
    }
}
