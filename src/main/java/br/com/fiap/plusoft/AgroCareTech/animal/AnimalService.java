package br.com.fiap.plusoft.AgroCareTech.animal;

import br.com.fiap.plusoft.AgroCareTech.exception.AnimalNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {

        this.animalRepository = animalRepository;
    }

    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).orElseThrow(
                () -> new AnimalNotFoundException(id)
        );
    }

}
