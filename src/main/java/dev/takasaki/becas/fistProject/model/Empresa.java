package dev.takasaki.becas.fistProject.model;

import lombok.*;

@Data
@Builder
public class Empresa {
    private final Long id;
    private String descricao;
    private final String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
