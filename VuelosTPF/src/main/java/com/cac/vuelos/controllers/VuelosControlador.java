package com.cac.vuelos.controllers;

import com.cac.vuelos.models.Vuelo;
import com.cac.vuelos.services.VuelosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VuelosControlador {

    @Autowired
    VuelosServicio vuelosServicio;

@GetMapping("")
    public List<Vuelo> listarVuelos(){
        return vuelosServicio.listarTodos();
    }

    @PostMapping("/alta")
    public void nuevoVuelo(@RequestBody Vuelo vuelo){
        vuelosServicio.crearVuelo(vuelo);
    }

    @GetMapping("/buscar/{id}")
    public Vuelo buscarVuelo(@PathVariable Long id){
        return vuelosServicio.buscarVueloPorId(id);
    }

    @DeleteMapping("/baja/{id}")
    public void borrarVuelo(@PathVariable Long id){
        vuelosServicio.borrarVueloPorId(id);
    }

    @PutMapping("/modificacion")
    public Vuelo modificarVuelo(@RequestBody Vuelo vuelo){
        return vuelosServicio.editarVuelo(vuelo);
    }

}
