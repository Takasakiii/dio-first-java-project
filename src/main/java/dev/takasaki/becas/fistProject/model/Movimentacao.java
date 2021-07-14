package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Movimentacao {
    @Embeddable
    @Data
    @NoArgsConstructor
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;

    @ManyToOne
    private Empresa empresa;

    private LocalDate entrada;
    private LocalDate saida;
    private BigDecimal periodoPermanencia;

    @ManyToOne
    private Ocorrencia ocorrencia;

    @ManyToOne
    Calendario dataEspecial;
}
