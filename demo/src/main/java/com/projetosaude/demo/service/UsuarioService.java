package com.projetosaude.demo.service;

import com.projetosaude.demo.model.Exercicio;
import com.projetosaude.demo.model.Sintoma;
import com.projetosaude.demo.model.Usuario;
import com.projetosaude.demo.repository.ExercicioRepository;
import com.projetosaude.demo.repository.SintomaRepository;
import com.projetosaude.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UsuarioService {


    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    SintomaRepository sintomaRepository;

    @Autowired
    ExercicioRepository exercicioRepository;


    public Usuario registrarUsuario(Usuario usuario) {
        usuario.setNome("Nunes");
        usuario.setEmail("nunes@gmail.com");
        usuario.setSenha("123456");
        usuario.setGenero("Masculino");
        usuario.setDataNascimento(LocalDate.of(2001, 06,23));
        usuarioRepository.save(usuario);
        return usuario;
    }

    public Sintoma registrarSintoma(Sintoma sintoma) {
        sintoma.setTipoSintoma("Febre");
        sintoma.setDescricao("Febre há mais de 30 dias");
        sintoma.setDataRegistroSintoma(LocalDate.of(2025, 02,10));
        sintoma.setGrauIntensidade(6);
        sintomaRepository.save(sintoma);
        return sintoma;
    }

    public Exercicio registrarExercicio(Exercicio exercicio) {
        exercicio.setNome("Abdominal");
        exercicio.setDescricao("30 abdominais, 3 repetições, 60s de descanso");
        exercicio.setDuracaoExercicio(60);
        exercicio.setTipoExercicio("Superiores");
        exercicioRepository.save(exercicio);
        return exercicio;
    }


}
