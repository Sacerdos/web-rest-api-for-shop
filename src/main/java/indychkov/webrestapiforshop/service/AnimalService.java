package indychkov.webrestapiforshop.service;

import indychkov.webrestapiforshop.model.Animal;
import indychkov.webrestapiforshop.repository.AnimalDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private AnimalDAO animalDAO;
    @Autowired
    public AnimalService(AnimalDAO animalDAO){
        this.animalDAO=animalDAO;
    }
    public Iterable<Animal> findAll(){
        return getAll();
    }
    public Animal findById(Integer id){
        return getById(id);
    }

    private Animal getById(Integer id) {
        return animalDAO.findById(id).get();
    }

    public Animal add(Animal animal){
        return addAnimal(animal);
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
        animalDAO.deleteById(id);
    }

    private Animal addAnimal(Animal animal) {
        return animalDAO.save(animal);
    }

    private Iterable<Animal> getAll(){
        return animalDAO.findAll();
    }

}
