package br.com.fiap.plusoft.AgroCareTech.animal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("animal")

public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @GetMapping
    public List<AnimalResponse> getAllAnimals() {
        return animalService.getAllAnimals().stream().map(AnimalResponse::fromModel).toList();
    }

    @GetMapping("{id}")
    public AnimalResponse getAnimalById(@PathVariable Long id) {
        return AnimalResponse.fromModel( animalService.getAnimalById(id) );
    }


    
}
