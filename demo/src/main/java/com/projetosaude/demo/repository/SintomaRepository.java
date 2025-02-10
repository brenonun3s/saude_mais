package com.projetosaude.demo.repository;

import com.projetosaude.demo.model.Sintoma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SintomaRepository extends JpaRepository<Sintoma, Long> {
}
