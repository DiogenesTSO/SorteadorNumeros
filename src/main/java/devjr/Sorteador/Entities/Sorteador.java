package devjr.Sorteador.Entities;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sorteios")
public class Sorteador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Integer> numerosSorteados;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getNumerosSorteados() {
        return numerosSorteados;
    }

    public void setNumerosSorteados(List<Integer> numerosSorteados) {
        this.numerosSorteados = numerosSorteados;
    }
    
}
