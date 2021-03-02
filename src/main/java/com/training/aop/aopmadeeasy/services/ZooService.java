package com.training.aop.aopmadeeasy.services;

import com.training.aop.aopmadeeasy.model.Animal;
import com.training.aop.aopmadeeasy.model.Fish;
import com.training.aop.aopmadeeasy.model.Mammal;
import com.training.aop.aopmadeeasy.model.Verterbrate;

import java.util.List;

public interface ZooService {
    List<Animal> getAnimals();
    List<Animal> getAnimals(String filter);

    List<Mammal> getMammals();

    List<Fish> getFishes();
}
