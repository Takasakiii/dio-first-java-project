package dev.takasaki.becas.fistProject.model;

import lombok.*;


@Data
@Builder
public class CategoriaUsuario {
    private final Long id;
    private String descricao;
}
