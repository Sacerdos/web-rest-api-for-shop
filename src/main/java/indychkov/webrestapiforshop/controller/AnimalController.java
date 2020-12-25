package indychkov.webrestapiforshop.controller;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class AnimalController {

    private AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @GetMapping("/api/animals")
    public Iterable<Animal> animals() {
        return animalService.findAll();
    }

    @PutMapping("/api/animals")
    public Animal addAnimal(@RequestBody Animal animal){
        return animalService.add(animal);
    }

    @GetMapping("/api/animals/id={id}")
    public Animal animal(@PathVariable Integer id) {
        return animalService.findById(id);
    }

    @DeleteMapping("/api/animals/id={id}")
    public String deleteById(@PathVariable Integer id) {
        return animalService.delete(id);
    }
}
