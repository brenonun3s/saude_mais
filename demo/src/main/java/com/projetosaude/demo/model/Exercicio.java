package com.projetosaude.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_exercicios")
@Data
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_exercicio")
    private String nome;

    @Column(name = "tipo_exercicio")
    private String tipoExercicio;

    @Column(name = "duracao_exercicio")
    private Integer duracaoExercicio;

    @Column(name = "descricao_exercicio")
    private String descricao;


}
