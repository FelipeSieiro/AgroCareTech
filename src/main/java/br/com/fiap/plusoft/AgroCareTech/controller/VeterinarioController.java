package br.com.fiap.plusoft.AgroCareTech.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.plusoft.AgroCareTech.model.Veterinario;
import br.com.fiap.plusoft.AgroCareTech.repository.VeterinarioRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("veterinario")
@Slf4j
public class VeterinarioController {

    @Autowired
    VeterinarioRepository repository;

    
    @GetMapping
    public List<Veterinario> index() {
        return repository.findAll();
    }
    

    @PostMapping
    @ResponseStatus(CREATED)
    public Veterinario cadastroVeterinario(@RequestBody Veterinario veterinario) { 
        log.info("cadastrando veterinario {} ", veterinario);
        return repository.save(veterinario);
    }

    @GetMapping("{id}")
    public ResponseEntity<Veterinario> buscarVeterinario(@PathVariable Long id) {
        log.info("buscando veterinario por id {}", id);

        return repository
                .findById(id)
                .map(ResponseEntity::ok) 
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void apagarCadastro(@PathVariable Long id) {
        log.info("apagando  cadastro do veterinario");

        verificarSeExisteVeterinario(id);
        repository.deleteById(id);
    }

    @PutMapping("{id}")
    public Veterinario editarPerfil(@PathVariable Long id, @RequestBody Veterinario veterinario) {
        log.info("atualizando veterinario com id {} para {}", id, veterinario);

        verificarSeExisteVeterinario(id);
        veterinario.setId(id);
        return repository.save(veterinario);
    }

    private void verificarSeExisteVeterinario(Long id) {
        repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Não existe veterinario com o id informado. Consulte lista em /veterinario"));
    }
    
}
