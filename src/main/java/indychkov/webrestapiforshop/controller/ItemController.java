package indychkov.webrestapiforshop.controller;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.model.Item;
import indychkov.webrestapiforshop.service.AnimalService;
import indychkov.webrestapiforshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/api/items")
    public Iterable<Item> items() {
        return itemService.findAll();
    }

    @PutMapping("/api/items")
    public Item addItem(@RequestBody Item item){
        return itemService.add(item);
    }

    @GetMapping("/api/items/id={id}")
    public Item item(@PathVariable Integer id) {
        return itemService.findById(id);
    }

    @DeleteMapping("/api/items/id={id}")
    public String deleteById(@PathVariable Integer id) {
        return itemService.delete(id);
    }
}
