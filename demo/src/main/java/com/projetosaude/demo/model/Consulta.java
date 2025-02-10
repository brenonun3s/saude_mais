package com.projetosaude.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_consultas")
@Data
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_consulta")
    private String nome;

    @Column(name = "descricao_consulta")
    private String descricao;

    @Column(name = "nome_doutor")
    private String nomeDoutor;

    @Column(name = "especialidade_doutor")
    private String especialidadeDoutor;


}
