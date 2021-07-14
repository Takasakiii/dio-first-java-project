package dev.takasaki.becas.fistProject.model;

import lombok.Data;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    private final Long id;
    private String descricao;
}
