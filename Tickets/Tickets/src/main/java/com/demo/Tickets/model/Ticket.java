package com.demo.Tickets.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Long id;
    private VueloDto vuelo;
    private String pasNombre;
    private String pasEmail;
    private String pasPasaporte;
}
