package com.projetosaude.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_historico_medico")
public class HistoricoMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_paciente")
    private Usuario usuario;

    @Column(name = "data_de_consulta")
    private LocalDate dataConsulta;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "nome_doutor")
    private String nomeDoutor;


}
