package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ocorrencia {
    private final Long id;
    private String nome;
    private String descricao;
}
