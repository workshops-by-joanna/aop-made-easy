package com.training.aop.aopmadeeasy;

import com.training.aop.aopmadeeasy.model.Animal;
import com.training.aop.aopmadeeasy.model.Mammal;
import com.training.aop.aopmadeeasy.services.AquariumService;
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
public class DemoController {

    private final ZooService zooService;
    private final PetStore petStore;
    private final AquariumService aquariumService;

    @Autowired
    public DemoController(ZooService zooService, PetStore petStore, AquariumService aquariumService) {
        this.zooService = zooService;
        this.petStore = petStore;
        this.aquariumService = aquariumService;
    }

    @GetMapping
    public List<Animal> getAllAnimalsFromEverywhere() {
        List<Animal> animals = new ArrayList();
        animals.addAll(zooService.getAnimals());
        animals.addAll(petStore.getAnimals());
        animals.addAll(aquariumService.getAnimals());

        return animals;
    }

    @GetMapping("/zoo")
    public List<Animal> sample() {
        return zooService.getAnimals();
    }

    @GetMapping("/zoo/filter")
    public List<Animal> sampleFilter() {
        return zooService.getAnimals("cats");
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
