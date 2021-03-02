package com.training.aop.aopmadeeasy.services;

import com.training.aop.aopmadeeasy.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZooServiceImpl implements ZooService {
    @Override
    public List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.addAll(getFishes());
        animals.addAll(getMammals());
        return animals;
    }

    public List<Mammal> getMammals() {
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Cat());
        mammals.add(new Koala());
        return mammals;
    }

    public List<Fish> getFishes() {
        List<Fish> fishies = new ArrayList<>();
        fishies.add(new Cod());
        fishies.add(new Cod("Fancy Cod"));
        return fishies;
    }
}
