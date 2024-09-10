package br.com.fiap.plusoft.AgroCareTech.agropecuarista;

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

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("agropecuarista")
@Slf4j
public class AgropecuaristaController {

    @Autowired
    AgropecuaristaRepository repository;

    
    @GetMapping
    public List<Agropecuarista> index() {
        return repository.findAll();
    }
    

    @PostMapping
    @ResponseStatus(CREATED)
    public Agropecuarista cadastroAgropecuarista(@RequestBody Agropecuarista agropecuarista) { 
        log.info("cadastrando agropecuarista {} ", agropecuarista);
        return repository.save(agropecuarista);
    }

    @GetMapping("{id}")
    public ResponseEntity<Agropecuarista> buscarAgropecuarista(@PathVariable Long id) {
        log.info("buscando agropecuarista por id {}", id);

        return repository
                .findById(id)
                .map(ResponseEntity::ok) 
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void apagarCadastro(@PathVariable Long id) {
        log.info("apagando  cadastro do agropecuarista");

        verificarSeExisteAgropecuarista(id);
        repository.deleteById(id);
    }

    @PutMapping("{id}")
    public Agropecuarista editarPerfil(@PathVariable Long id, @RequestBody Agropecuarista agropecuarista) {
        log.info("atualizando agropecuarista com id {} para {}", id, agropecuarista);

        verificarSeExisteAgropecuarista(id);
        agropecuarista.setId(id);
        return repository.save(agropecuarista);
    }

    private void verificarSeExisteAgropecuarista(Long id) {
        repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Não existe agropecuarista com o id informado. Consulte lista em /agropecuarista"));
    }
    
}
