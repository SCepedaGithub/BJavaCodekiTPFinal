package com.cac.vuelos.utils;

import com.cac.vuelos.models.Dolar;
import com.cac.vuelos.models.Vuelo;
import com.cac.vuelos.models.VueloDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VueloUtils {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public List<Vuelo> detectOffers(List<Vuelo> flights, Integer offerPrice) {
        return flights.stream()
                .filter(flight -> flight.getPrecioEnPesos() < offerPrice)
                .collect(Collectors.toList());
    }

    public VueloDto vueloMapper(Vuelo flight, double price){
        return new VueloDto(flight.getId(),flight.getOrigen(), flight.getDestino(), flight.getFechaHoraSalida().toString(),
                flight.getFechaHoraLlegada().toString(), flight.getPrecioEnPesos() * price, flight.getFrecuencia(), flight.getCompañia().getName());
    }

    public Dolar fetchDolar(){
        RestTemplate restTemplate = restTemplate();
        String apiUrl = "https://dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiUrl, Dolar.class);
    }
}
