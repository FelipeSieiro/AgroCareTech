package br.com.fiap.plusoft.AgroCareTech.animal;

import java.util.List;

public record AnimalResponse(
        Long id,
        String nome,
        String especie,
        Double peso,
        Integer idade,
        String urlImageAnimal
){
    public static AnimalResponse fromModel(Animal animal) {
        return new AnimalResponse(
                animal.getId(),
                animal.getNomeAnimal(),
                animal.getEspecieAnimal(),
                animal.getPesoAnimal(),
                animal.getIdadeAnimal(),
                animal.getUrlImageAnimal()
        );
    }

}