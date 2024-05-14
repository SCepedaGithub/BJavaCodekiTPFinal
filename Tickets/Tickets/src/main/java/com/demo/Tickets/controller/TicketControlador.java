package com.demo.Tickets.controller;

import com.demo.Tickets.model.VueloDto;
import com.demo.Tickets.service.ClienteVuelos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.Tickets.model.Ticket;
import com.demo.Tickets.service.TicketServicio;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketControlador {
    @Autowired
    private TicketServicio ticketServicio;
    @Autowired
    private ClienteVuelos clienteVuelos;

    @GetMapping("")
    public List<Ticket> getAllTickets() {
        return ticketServicio.allTickets();
    }

    @GetMapping("/vuelos")
    public List <VueloDto> listarVuelos(){
        return clienteVuelos.listarVuelos();
    }

    @PostMapping("/add")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        System.out.println(ticket.toString());
        return ticketServicio.createTicket(ticket);
    }

    /*
    @GetMapping("/{id}")
    public Ticket findTicketById(@PathVariable Long id) {
        return ticketServicio.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTicket(@PathVariable Long id) {

        try {
            ticketServicio.deleteTicket(id);
            return "Ticket eliminado con exito";

        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
            return "No existe el ticket con el Id seleccionado";
        }

    }

    @PutMapping("/update")
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketServicio.updateTicket(ticket);
    }
*/
}