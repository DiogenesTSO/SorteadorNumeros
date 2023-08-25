package devjr.Sorteador.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorteadorControllers {
    
        @GetMapping("/sortear-numeros")
        public List<Integer> sortearNumeros() {
            List<Integer> numerosSorteados = new ArrayList<>();

            Random randon = new Random();
            while (numerosSorteados.size() < 6) {
                int numeroSorteado = randon.nextInt(60) + 1;
                if (!numerosSorteados.contains(numeroSorteado)) {
                    numerosSorteados.add(numeroSorteado);
                }
            }
            return numerosSorteados;
        }
}
