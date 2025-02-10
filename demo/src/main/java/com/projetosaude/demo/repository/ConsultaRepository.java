package com.projetosaude.demo.repository;

import com.projetosaude.demo.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
