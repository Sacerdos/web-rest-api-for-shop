package indychkov.webrestapiforshop.controller;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.model.Basis;
import indychkov.webrestapiforshop.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BindController {
    AnimalController animalController;
    ItemController itemController;

    public BindController(AnimalController animalController, ItemController itemController) {
        this.animalController = animalController;
        this.itemController = itemController;
    }

    @GetMapping("/api/everything")
    public Iterable<Basis> animals() {
        List<Basis> all = new ArrayList<>();
        for (Animal animal :
                animalController.animals()) {
            all.add(animal);
        }
        for (Item item :
                itemController.items()) {
            all.add(item);
        }
        return all;
    }
}
