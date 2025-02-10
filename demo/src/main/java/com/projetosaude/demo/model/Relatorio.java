package com.projetosaude.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.List;

public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Usuario usuario;

    private LocalDateTime dataGeradoRelatorio;

    private List<Sintoma> sintomasRegistrados;

    private List<Exercicio> exerciciosRecomendados;

}
