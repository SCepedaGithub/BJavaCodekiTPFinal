package com.cac.vuelos.repositories;
import com.cac.vuelos.models.Vuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  VuelosRepositorio extends JpaRepository<Vuelo, Long> {

}
