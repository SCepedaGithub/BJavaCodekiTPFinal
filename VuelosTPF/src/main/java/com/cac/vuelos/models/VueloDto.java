package com.cac.vuelos.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VueloDto {
    private Long id;
    private String origen;
    private String destino;
    private String fechaHoraSalida;
    private String fechaHoraLlegada;
    private double convertedPrice;
    private String frecuencia;
    private String compañia;
}
