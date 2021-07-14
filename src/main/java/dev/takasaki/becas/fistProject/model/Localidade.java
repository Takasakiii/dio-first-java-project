package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Builder
@Entity
public class Localidade {
    @Id
    private final Long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
