package br.com.fiap.plusoft.AgroCareTech.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.plusoft.AgroCareTech.model.Agropecuarista;
import br.com.fiap.plusoft.AgroCareTech.model.Animal;
import br.com.fiap.plusoft.AgroCareTech.repository.AgropecuaristaRepository;
import br.com.fiap.plusoft.AgroCareTech.repository.AnimalRepository;


@Configuration
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    AgropecuaristaRepository agropecuaristaRepository;

    @Override
    public void run(String... args) throws Exception {
        agropecuaristaRepository.saveAll(List.of(
            Agropecuarista.builder()
            .id(1L).nomeAgropecuarista("João Carlos")
            .cpfAgropecuarista("187.832.570-12")
            .emailAgropecuarista("joão@fiap.com")
            .telefoneAgropecuarista("(84) 3991-7646")
            .senhaAgropecuarista("#jaoDoGado123").build(),
            Agropecuarista.builder()
            .id(2L)
            .nomeAgropecuarista("Maria Silva")
            .cpfAgropecuarista("238.527.691-45")
            .emailAgropecuarista("maria@fiap.com")
            .telefoneAgropecuarista("(84) 3991-8201")
            .senhaAgropecuarista("#MariaAgro456").build(),

			Agropecuarista.builder()
            .id(3L)
            .nomeAgropecuarista("Antônio Oliveira")
            .cpfAgropecuarista("915.364.227-78")
            .emailAgropecuarista("antonio@fiap.com")
            .telefoneAgropecuarista("(84) 3991-9310")
            .senhaAgropecuarista("#Antonio123").build(),

			Agropecuarista.builder()
            .id(4L)
            .nomeAgropecuarista("Luiza Santos")
            .cpfAgropecuarista("542.819.138-96")
            .emailAgropecuarista("luiza@fiap.com")
            .telefoneAgropecuarista("(84) 3991-7529")
            .senhaAgropecuarista("#LuizaAgro789").build()
        ));

        animalRepository.saveAll(
            List.of(
                Animal.builder()
                    .id(1L)
                    .nomeAnimal("Mimoso")
                    .especieAnimal("Boi")
                    .idadeAnimal(6)
                    .pesoAnimal(420)
                    .agropecuarista(agropecuaristaRepository.findById(1L).get())
                    .build(),

                    Animal.builder()
                    .id(2L)
                    .nomeAnimal("Mimosa")
                    .especieAnimal("Vaca")
                    .idadeAnimal(7)
                    .pesoAnimal(450)
                    .agropecuarista(agropecuaristaRepository.findById(2L).get())
                    .build(),

                    Animal.builder()
                    .id(3L)
                    .nomeAnimal("Touro")
                    .especieAnimal("Boi")
                    .idadeAnimal(9)
                    .pesoAnimal(550)
                    .agropecuarista(agropecuaristaRepository.findById(3L).get())
                    .build(),

                    Animal.builder()
                    .id(4L)
                    .nomeAnimal("Betina")
                    .especieAnimal("Vaca")
                    .idadeAnimal(5)
                    .pesoAnimal(400)
                    .agropecuarista(agropecuaristaRepository.findById(4L).get())
                    .build(),

                    Animal.builder()
                    .id(5L)
                    .nomeAnimal("Fogoso")
                    .especieAnimal("Boi")
                    .idadeAnimal(7)
                    .pesoAnimal(480)
                    .agropecuarista(agropecuaristaRepository.findById(5L).get())
                    .build(),

                    Animal.builder()
                    .id(6L)
                    .nomeAnimal("Bela")
                    .especieAnimal("Vaca")
                    .idadeAnimal(6)
                    .pesoAnimal(420)
                    .agropecuarista(agropecuaristaRepository.findById(6L).get())
                    .build(),

                    Animal.builder()
                    .id(7L)
                    .nomeAnimal("Valente")
                    .especieAnimal("Boi")
                    .idadeAnimal(8)
                    .pesoAnimal(520)
                    .agropecuarista(agropecuaristaRepository.findById(7L).get())
                    .build(),

                    Animal.builder()
                    .id(8L)
                    .nomeAnimal("Pretinha")
                    .especieAnimal("Vaca")
                    .idadeAnimal(4)
                    .pesoAnimal(380)
                    .agropecuarista(agropecuaristaRepository.findById(8L).get())
                    .build(),

                    Animal.builder()
                    .id(9L)
                    .nomeAnimal("Bravo")
                    .especieAnimal("Boi")
                    .idadeAnimal(10)
                    .pesoAnimal(600)
                    .agropecuarista(agropecuaristaRepository.findById(9L).get())
                    .build(),

                    Animal.builder()
                    .id(10L)
                    .nomeAnimal("Mimosa")
                    .especieAnimal("Vaca")
                    .idadeAnimal(5)
                    .pesoAnimal(410)
                    .agropecuarista(agropecuaristaRepository.findById(10L).get())
                    .build(),

                    Animal.builder()
                    .id(11L)
                    .nomeAnimal("Raposo")
                    .especieAnimal("Boi")
                    .idadeAnimal(6)
                    .pesoAnimal(470)
                    .agropecuarista(agropecuaristaRepository.findById(11L).get())
                    .build(),

                    Animal.builder()
                    .id(12L)
                    .nomeAnimal("Branca")
                    .especieAnimal("Vaca")
                    .idadeAnimal(3)
                    .pesoAnimal(360)
                    .agropecuarista(agropecuaristaRepository.findById(12L).get())
                    .build()
            ));
    }
    
}