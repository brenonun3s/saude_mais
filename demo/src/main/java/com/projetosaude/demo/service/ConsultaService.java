package com.projetosaude.demo.service;

import com.projetosaude.demo.model.Consulta;
import com.projetosaude.demo.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository consultaRepository;

    public Consulta adicionarConsulta(Consulta consulta) {
        consulta.setDescricao("Consulta com o Clinico Geral");
        consulta.setNome("Consulta de Rotina");
        consulta.setEspecialidadeDoutor("Clinico Geral");
        consulta.setNomeDoutor("Dr Vinicius");
        consultaRepository.save(consulta);
        return consulta;
    }

    public List<Consulta> listarConsulta(){
        return consultaRepository.findAll();
    }



}
