package com.training.aop.aopmadeeasy.services.impl;

import com.training.aop.aopmadeeasy.model.Mollusk;
import com.training.aop.aopmadeeasy.model.impl.Octopus;
import com.training.aop.aopmadeeasy.services.AquariumService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AquariumServiceImpl implements AquariumService {

    public List<Mollusk> getAnimals() {
        List<Mollusk> octopi = new ArrayList<>();
        octopi.add(new Octopus());
        octopi.add(new Octopus("Bobo"));
        return octopi;
    }
}
