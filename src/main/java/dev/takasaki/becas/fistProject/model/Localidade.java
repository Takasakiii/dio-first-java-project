package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
@Builder
public class Localidade {
    private final Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
