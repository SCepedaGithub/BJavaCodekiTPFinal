package com.cac.vuelos.services;

import com.cac.vuelos.models.Vuelo;
import com.cac.vuelos.repositories.VuelosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VuelosServicio {

    @Autowired
    VuelosRepositorio vuelosRepositorio;

    public List<Vuelo> listarTodos() {
        return vuelosRepositorio.findAll();
    }

    public void crearVuelo(Vuelo vuelo) {
        vuelosRepositorio.save(vuelo);
    }

    public Vuelo buscarVueloPorId(Long id) {
        return vuelosRepositorio.findById(id).orElse(null);
    }

    public void borrarVueloPorId(Long id) {
        vuelosRepositorio.deleteById(id);
    }

    public Vuelo editarVuelo(Vuelo vuelo)  {
        vuelosRepositorio.save(vuelo);
        return vuelosRepositorio.findById(vuelo.getId()).orElse(null);
    }

}
