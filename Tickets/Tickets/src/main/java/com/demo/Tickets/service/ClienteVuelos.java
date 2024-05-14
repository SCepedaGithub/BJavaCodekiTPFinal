package com.demo.Tickets.service;

import com.demo.Tickets.model.VueloDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient (name = "VuelosApplication")
public interface ClienteVuelos {
    @GetMapping("/vuelos")
    List<VueloDto> listarVuelos();
}
