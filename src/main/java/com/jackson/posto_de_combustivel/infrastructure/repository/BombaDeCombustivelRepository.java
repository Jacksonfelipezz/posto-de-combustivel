package com.jackson.posto_de_combustivel.infrastructure.repository;

import com.jackson.posto_de_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombaDeCombustivelRepository, Integer> {
}
