package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class NivelAcesso {
    @Id
    private Long id;
    private String descricao;
}
