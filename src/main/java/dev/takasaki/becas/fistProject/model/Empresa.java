package dev.takasaki.becas.fistProject.model;

import lombok.Data;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class Empresa {
    @Id
    private final Long id;
    private String descricao;
    private final String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
}
