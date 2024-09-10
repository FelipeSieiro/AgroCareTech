package br.com.fiap.plusoft.AgroCareTech.exception;

public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(Long id) {
        super("Animal not found with id: " + id);
    }
}
