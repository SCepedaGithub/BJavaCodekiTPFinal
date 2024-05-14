package com.cac.vuelos.repositories;

import com.cac.vuelos.models.Compañia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompañiaRepositorio extends JpaRepository<Compañia,Long> {
}