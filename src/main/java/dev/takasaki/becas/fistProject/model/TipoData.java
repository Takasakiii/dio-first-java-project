package dev.takasaki.becas.fistProject.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoData {
    private final Long id;
    private String descricao;
}
