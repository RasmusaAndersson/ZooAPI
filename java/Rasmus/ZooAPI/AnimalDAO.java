package Rasmus.ZooAPI;

import org.springframework.stereotype.Repository;
import Rasmus.ZooAPI.AnimalDTO;
import Rasmus.ZooAPI.AnimalRepository;


import java.util.Optional;

@Repository
public class AnimalDAO {

    private final AnimalRepository repository;

    public AnimalDAO(AnimalRepository repository) {
        this.repository = repository;
    }

    public AnimalDTO addAnimal(AnimalDTO animalDTO) {
        return repository.save(animalDTO);
    }

    public Iterable<AnimalDTO> getAllAnimals() {
        return repository.findAll();
    }

    public Optional<AnimalDTO> findAnimalByID(Integer id) {
        return repository.findById(id);
    }

    public void deleteAnimal(Integer id) {
        repository.deleteById(id);
    }

    public void deleteAllAnimals() {
        repository.deleteAll();
    }
}
