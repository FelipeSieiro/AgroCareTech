package br.com.fiap.plusoft.AgroCareTech.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.plusoft.AgroCareTech.model.Agropecuarista;
import br.com.fiap.plusoft.AgroCareTech.model.Animal;
import br.com.fiap.plusoft.AgroCareTech.model.Servico;
import br.com.fiap.plusoft.AgroCareTech.model.Veterinario;
import br.com.fiap.plusoft.AgroCareTech.repository.AgropecuaristaRepository;
import br.com.fiap.plusoft.AgroCareTech.repository.AnimalRepository;
import br.com.fiap.plusoft.AgroCareTech.repository.ServicoRepository;
import br.com.fiap.plusoft.AgroCareTech.repository.VeterinarioRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner{

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    AgropecuaristaRepository agropecuaristaRepository;

    @Autowired
    VeterinarioRepository veterinarioRepository;

    @Autowired
    ServicoRepository servicoRepository;

    public void run(String... args) throws Exception {
        agropecuaristaRepository.saveAll(List.of(
            Agropecuarista.builder()
            .id(1L).nomeAgropecuarista("João Carlos")
            .emailAgropecuarista("joao@fiap.com")
            .telefoneAgropecuarista("(84) 3991-7646")
            .senhaAgropecuarista("#jaoDoGado123").build(),
            Agropecuarista.builder()
            .id(2L)
            .nomeAgropecuarista("Maria Silva")
            .emailAgropecuarista("maria@fiap.com")
            .telefoneAgropecuarista("(84) 3991-8201")
            .senhaAgropecuarista("#MariaAgro456").build(),

            Agropecuarista.builder()
            .id(3L)
            .nomeAgropecuarista("Antônio Oliveira")
            .emailAgropecuarista("antonio@fiap.com")
            .telefoneAgropecuarista("(84) 3991-9310")
            .senhaAgropecuarista("#Antonio123").build(),

            Agropecuarista.builder()
            .id(4L)
            .nomeAgropecuarista("Luiza Santos")
            .emailAgropecuarista("luiza@fiap.com")
            .telefoneAgropecuarista("(84) 3991-7529")
            .senhaAgropecuarista("#LuizaAgro789").build()

        ));

        veterinarioRepository.saveAll(List.of(
            Veterinario.builder()
                .id(1L)
                .nomeVeterinario("Ana Silva")
                .emailVeterinario("ana@vetfiap.com")
                .telefoneVeterinario("(33) 1234-5678")
                .senhaVeterinario("#Ana123Senha")
                .cmrv("CMRV1234")
                .especializacaoVeterinario("Dermatologia")
                .build(),

            Veterinario.builder()
                .id(2L)
                .nomeVeterinario("Pedro Oliveira")
                .emailVeterinario("pedro@vetfiap.com")
                .telefoneVeterinario("(19) 9876-5432")
                .senhaVeterinario("#Pedro456Senha")
                .cmrv("CMRV5678")
                .especializacaoVeterinario("Dermatologia")
                .build(),

            Veterinario.builder()
                .id(3L)
                .nomeVeterinario("Mariana Santos")
                .emailVeterinario("mariana@vetfiap.com")
                .telefoneVeterinario("(13) 1111-2222")
                .senhaVeterinario("#Mariana789Senha")
                .cmrv("CMRV91011")
                .especializacaoVeterinario("Dermatologia")
                .build(),

            Veterinario.builder()
                .id(4L)
                .nomeVeterinario("Lucas Almeida")
                .emailVeterinario("lucas@vetfiap.com")
                .telefoneVeterinario("(11) 3333-4444")
                .senhaVeterinario("#LucasSenha789")
                .cmrv("CMRV121314")
                .especializacaoVeterinario("Dermatologia")
                .build()


        ));

            animalRepository.saveAll(List.of(
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
                    .agropecuarista(agropecuaristaRepository.findById(1L).get())
                    .build(),

                    Animal.builder()
                    .id(6L)
                    .nomeAnimal("Bela")
                    .especieAnimal("Vaca")
                    .idadeAnimal(6)
                    .pesoAnimal(420)
                    .agropecuarista(agropecuaristaRepository.findById(2L).get())
                    .build(),

                    Animal.builder()
                    .id(7L)
                    .nomeAnimal("Valente")
                    .especieAnimal("Boi")
                    .idadeAnimal(8)
                    .pesoAnimal(520)
                    .agropecuarista(agropecuaristaRepository.findById(3L).get())
                    .build(),

                    Animal.builder()
                    .id(8L)
                    .nomeAnimal("Pretinha")
                    .especieAnimal("Vaca")
                    .idadeAnimal(4)
                    .pesoAnimal(380)
                    .agropecuarista(agropecuaristaRepository.findById(4L).get())
                    .build(),

                    Animal.builder()
                    .id(9L)
                    .nomeAnimal("Bravo")
                    .especieAnimal("Boi")
                    .idadeAnimal(10)
                    .pesoAnimal(600)
                    .agropecuarista(agropecuaristaRepository.findById(1L).get())
                    .build(),

                    Animal.builder()
                    .id(10L)
                    .nomeAnimal("Mimosa")
                    .especieAnimal("Vaca")
                    .idadeAnimal(5)
                    .pesoAnimal(410)
                    .agropecuarista(agropecuaristaRepository.findById(2L).get())
                    .build(),

                    Animal.builder()
                    .id(11L)
                    .nomeAnimal("Raposo")
                    .especieAnimal("Boi")
                    .idadeAnimal(6)
                    .pesoAnimal(470)
                    .agropecuarista(agropecuaristaRepository.findById(3L).get())
                    .build(),

                    Animal.builder()
                    .id(12L)
                    .nomeAnimal("Branca")
                    .especieAnimal("Vaca")
                    .idadeAnimal(3)
                    .pesoAnimal(360)
                    .agropecuarista(agropecuaristaRepository.findById(4L).get())
                    .build()
            ));

            servicoRepository.saveAll(List.of(
                Servico.builder()
                    .id(1L)
                    .agropecuarista(agropecuaristaRepository.findById(1L).get())
                    .animal(animalRepository.findById(1L).get())
                    .veterinario(veterinarioRepository.findById(1L).get())
                    .dataServico(LocalDate.now())
                    .precoServico(new BigDecimal(1600))
                    .diagnostico("Cancer de pele")
                    .build(),

                Servico.builder()
                    .id(2L)
                    .agropecuarista(agropecuaristaRepository.findById(2L).get())
                    .animal(animalRepository.findById(2L).get())
                    .veterinario(veterinarioRepository.findById(2L).get())
                    .dataServico(LocalDate.now().minusDays(5))
                    .precoServico(new BigDecimal(1200))
                    .diagnostico("Dermatite")
                    .build(),
            
                Servico.builder()
                    .id(3L)
                    .agropecuarista(agropecuaristaRepository.findById(3L).get())
                    .animal(animalRepository.findById(3L).get())
                    .veterinario(veterinarioRepository.findById(3L).get())
                    .dataServico(LocalDate.now().minusDays(10))
                    .precoServico(new BigDecimal(1800))
                    .diagnostico("Micose")
                    .build(),
            
                Servico.builder()
                    .id(4L)
                    .agropecuarista(agropecuaristaRepository.findById(4L).get())
                    .animal(animalRepository.findById(4L).get())
                    .veterinario(veterinarioRepository.findById(4L).get())
                    .dataServico(LocalDate.now().minusDays(15))
                    .precoServico(new BigDecimal(2000))
                    .diagnostico("Eczema")
                    .build()

            ));
    }
    
}
