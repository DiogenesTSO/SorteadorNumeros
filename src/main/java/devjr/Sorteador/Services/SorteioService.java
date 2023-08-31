package devjr.Sorteador.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import devjr.Sorteador.Entities.Sorteador;
import devjr.Sorteador.Repository.SorteadorRepository;

@Service
public class SorteioService {

        @Autowired
        private SorteadorRepository sorteadorRepository;

        public Sorteador realizarSorteio() {
            List<Integer> numerosSorteados = new ArrayList<>();
            Random random = new Random();

            while (numerosSorteados.size() < 6){
                int numeroSorteado = random.nextInt(60) + 1;
                if (!numerosSorteados.contains(numeroSorteado)){
                    numerosSorteados.add(numeroSorteado);
                }
            }

            Sorteador sorteio = new Sorteador();
            sorteio.setNumerosSorteados(numerosSorteados);
            return sorteadorRepository.save(sorteio);
        }
    
}
