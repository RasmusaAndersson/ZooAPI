package Rasmus.ZooAPI;

import org.springframework.data.repository.CrudRepository;
import Rasmus.ZooAPI.AnimalDTO;

public interface AnimalRepository extends CrudRepository<AnimalDTO, Integer> {
}
