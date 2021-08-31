package Rasmus.ZooAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Rasmus.ZooAPI.AnimalService;


@Controller
public class ZooController {

    @Autowired
    AnimalService animalService;


    @RequestMapping("/index")
    public String start() {
        return "index";
    }

    @RequestMapping("animals")
    public String showAnimals(Model model) {
        model.addAttribute("animals", animalService.getAllAnimals());
        return "animals";
    }



}
