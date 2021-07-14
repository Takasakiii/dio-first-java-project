package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@Entity
public class BancoHoras {
    @Embeddable
    @Data
    public class BancoHorasId implements Serializable {
        private final Long idBancoHoras;
        private final Long idMovimentacao;
        private final Long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;

    @ManyToOne
    private CategoriaUsuario categoria;
    private LocalDate dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;
}
