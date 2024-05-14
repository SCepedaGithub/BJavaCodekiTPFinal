package com.cac.vuelos;

import com.cac.vuelos.models.Vuelo;
import com.cac.vuelos.services.VuelosServicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class VuelosApplication {

	public static void main(String[] args) {

        SpringApplication.run(VuelosApplication.class, args);
	}


    @GetMapping("/hola")
    public String hello(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
      return String.format("Hola %s!", nombre);
    }

}
