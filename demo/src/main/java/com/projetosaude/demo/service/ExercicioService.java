package com.projetosaude.demo.service;

import com.projetosaude.demo.model.Sintoma;
import org.springframework.stereotype.Service;

@Service
public class ExercicioService {

    public void recomendarExercicio(){
        // DEVO PENSAR NUMA LÓGICA PARA RECOMENDAR EXERCICIOS CONFORME UMA BASE DE SINTOMAS
    }

    public Sintoma registrarSintoma(Sintoma sintoma){
        return sintoma;
    }



}
