package com.training.aop.aopmadeeasy;

import com.training.aop.aopmadeeasy.model.Animal;
import com.training.aop.aopmadeeasy.model.Mammal;
import com.training.aop.aopmadeeasy.services.PetStore;
import com.training.aop.aopmadeeasy.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class SampleController {

    private final ZooService zooService;
    private final PetStore petStore;

    @Autowired
    public SampleController(ZooService zooService, PetStore petStore) {
        this.zooService = zooService;
        this.petStore = petStore;
    }

    @GetMapping
    public List<Animal> getAllAnimalsFromEverywhere() {
        List<Animal> animals = new ArrayList();
        animals.addAll(zooService.getAnimals());
        animals.addAll(petStore.getAnimals());

        return animals;
    }

    @GetMapping("/zoo")
    public List<Animal> sample() {
        return zooService.getAnimals();
    }

    @GetMapping("zoo/mammals")
    public List<Mammal> getMammals() {
        return zooService.getMammals();
    }

    @GetMapping("store")
    public List<Mammal> getPetStoreAnimals() {
        return petStore.getAnimals();
    }
}
