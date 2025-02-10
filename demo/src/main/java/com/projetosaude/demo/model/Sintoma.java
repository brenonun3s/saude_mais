package com.projetosaude.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tb_sintomas")
@Data
public class Sintoma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tipos_sintomas")
    private String tipoSintoma;

    @Column(name = "descricacao_sintoma")
    private String descricao;

    @Column(name = "grau_intensidade")
    private Integer grauIntensidade;

    @Column(name = "data_registro_sintoma")
    private LocalDate dataRegistroSintoma;


}
