package com.projetosaude.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(name = "nome_usuario")
    private String nome;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "senha_usuario")
    private String senha;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "genero_usuario")
    private String genero;

    /*
    @ManyToOne
    private HistoricoMedico historicoMedico;

    @ManyToOne
    private Sintoma sintoma;

    @ManyToOne
    private Exercicio exercicio;

    // PESO, ALTURA, IMC FICA MAIS PRA FRENTE

     */
}
