package com.training.aop.aopmadeeasy.services.impl;

import com.training.aop.aopmadeeasy.model.impl.Cat;
import com.training.aop.aopmadeeasy.model.impl.Koala;
import com.training.aop.aopmadeeasy.model.Mammal;
import com.training.aop.aopmadeeasy.services.PetStore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetStoreImpl implements PetStore {
    @Override
    public List<Mammal> getAnimals() {
        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Cat("Pet Cat"));
        mammals.add(new Koala("Pet Koala"));
        return mammals;
    }
}
