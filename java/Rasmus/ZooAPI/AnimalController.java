package Rasmus.ZooAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Rasmus.ZooAPI.Animal;
import Rasmus.ZooAPI.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping()
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable("id") Integer id) {
        return animalService.getAnimalById(id);
    }

    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") Integer id) {
        animalService.deleteAnimal(id);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable("id") Integer id,
                               @RequestBody Animal newAnimal) {
        return animalService.updateAnimal(newAnimal, id);

    }

    @DeleteMapping("/empty-database")
    public void deleleAllAnimals() {
        animalService.deleteAllAnimals();
    }
}
