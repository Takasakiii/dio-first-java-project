package dev.takasaki.becas.fistProject.model;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class JornadaTrabalho {
    @Id
    private Long id;
    private String descricao;
}
