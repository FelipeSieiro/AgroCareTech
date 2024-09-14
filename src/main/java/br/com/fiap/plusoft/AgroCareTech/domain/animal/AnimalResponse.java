package br.com.fiap.plusoft.AgroCareTech.domain.animal;

public record AnimalResponse(
        Long id,
        String nome,
        String especie,
        Double peso,
        Integer idade,
        String urlImage

){
    public static AnimalResponse fromModel(Animal animal) {
        return new AnimalResponse(
                animal.getId(),
                animal.getNome(),
                animal.getEspecie(),
                animal.getPeso(),
                animal.getIdade(),
                animal.getUrlImage()

        );
    }

}