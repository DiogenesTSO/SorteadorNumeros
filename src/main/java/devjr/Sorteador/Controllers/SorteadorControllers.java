package devjr.Sorteador.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import devjr.Sorteador.Entities.Sorteador;
import devjr.Sorteador.Services.SorteioService;

@RestController
public class SorteadorControllers {

        @Autowired
        private SorteioService sorteioService;
    
        @GetMapping("/sortear-numeros")
        public ResponseEntity<Sorteador> sortearNumeros() {
            Sorteador sorteador = sorteioService.realizarSorteio();
            return new ResponseEntity<>(sorteador, HttpStatus.OK);
        }
}
