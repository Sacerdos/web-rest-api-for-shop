package indychkov.webrestapiforshop.repository;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDAO extends CrudRepository<Item, Integer> {
}
