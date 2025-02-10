package com.projetosaude.demo.service;

import com.projetosaude.demo.model.Sintoma;
import org.springframework.stereotype.Service;

@Service
public class SintomaService {

    public Sintoma registrarSintoma(Sintoma sintoma) {
        return sintoma;
    }

}
