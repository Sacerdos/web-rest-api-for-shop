package indychkov.webrestapiforshop.service;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.model.Item;
import indychkov.webrestapiforshop.repository.AnimalDAO;
import indychkov.webrestapiforshop.repository.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private ItemDAO itemDAO;
    @Autowired
    public ItemService(ItemDAO itemDAO){
        this.itemDAO=itemDAO;
    }
    public Iterable<Item> findAll(){
        return getAll();
    }
    public Item findById(Integer id){
        return getById(id);
    }

    private Item getById(Integer id) {
        return itemDAO.findById(id).get();
    }

    public Item add(Item item){
        return addItem(item);
    }
    public String delete(Integer id){
        try{
            deleteById(id);
        } catch (Exception e){
            return "Incorrect request";
        }

        return "Successfully";
    }

    private void deleteById(Integer id) {
        itemDAO.deleteById(id);
    }

    private Item addItem(Item item) {
        return itemDAO.save(item);
    }

    private Iterable<Item> getAll(){
        return itemDAO.findAll();
    }
}
