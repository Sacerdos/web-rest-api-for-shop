package indychkov.webrestapiforshop.repository;

import indychkov.webrestapiforshop.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalDAO extends CrudRepository<Animal, Integer> {
}
