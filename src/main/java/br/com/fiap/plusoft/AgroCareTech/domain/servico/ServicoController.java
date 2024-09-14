package br.com.fiap.plusoft.AgroCareTech.domain.servico;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("servico")
@Slf4j
public class ServicoController {

    @Autowired 
    ServicoRepository repository;
    

    @GetMapping
    public List<Servico> index() {
        return repository.findAll() ; 
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Servico cadastroServico(@RequestBody Servico servico) { 
        log.info("cadastrando servico {} ", servico);
        repository.save(servico);
        return servico;
    }

    @GetMapping("{id}")
    public ResponseEntity<Servico> buscarservicos(@PathVariable Long id) {
        log.info("buscando serviço por id {}", id);

        return repository
            .findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<Object> cancelarServico(@PathVariable Long id) {
        log.info("apagando serviço");

        verificarSeExisteServico(id);
        
        repository.deleteById(id);
        return ResponseEntity.noContent().build();

    }
    @PutMapping("{id}")
    public ResponseEntity<Servico> editarServico(@PathVariable Long id, @RequestBody Servico servico){
        log.info("atualizando Servico com id {} para {}", id, servico);
        
        verificarSeExisteServico(id);
                        
        servico.setId(id);
        repository.save(servico);
        return ResponseEntity.ok(servico);
    }


    private void verificarSeExisteServico(Long id) {
        repository
            .findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Não existe categoria com o `id` informado. Consulte lista em /categoria"
            ));
    }
}

     
