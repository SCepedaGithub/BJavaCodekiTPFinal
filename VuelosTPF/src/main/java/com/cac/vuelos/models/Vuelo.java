package com.cac.vuelos.models;

import java.time.LocalDateTime;

import jakarta.persistence.*;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Vuelo {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destino;
    private LocalDateTime fechaHoraSalida;
    private LocalDateTime fechaHoraLlegada;
    private double precioEnPesos;
    private String frecuencia;
    private String origen;
    @ManyToOne
    @JoinColumn(name = "compañia_id")
    private Compañia compañia;

    public Vuelo(String destino, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada, double precioEnPesos, String frecuencia, String origen, Compañia compañia) {
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.precioEnPesos = precioEnPesos;
        this.frecuencia = frecuencia;
        this.origen = origen;
        this.compañia = compañia;
    }
/*
    public Vuelo(Long id, String destino, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada, double precioEnPesos, String frecuencia, String origen, Compañia compañia) {
        this.id = id;
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.precioEnPesos = precioEnPesos;
        this.frecuencia = frecuencia;
        this.origen = origen;
        this.compañia = compañia;
    }*/

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(LocalDateTime fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public double getPrecioEnPesos() {
        return precioEnPesos;
    }

    public void setPrecioEnPesos(double precioEnPesos) {
        this.precioEnPesos = precioEnPesos;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Compañia getCompañia() {
        return compañia;
    }


    public void setCompañia(Compañia compañia) {
        this.compañia = compañia;
    }

}
