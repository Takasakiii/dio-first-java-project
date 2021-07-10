package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Builder
public class Calendario {
    private final Long id;

    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
