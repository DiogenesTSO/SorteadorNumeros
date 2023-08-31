package devjr.Sorteador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import devjr.Sorteador.Entities.Sorteador;

public interface SorteadorRepository extends JpaRepository<Sorteador, Long> {
    
}
