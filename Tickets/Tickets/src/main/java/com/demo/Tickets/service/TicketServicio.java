package com.demo.Tickets.service;

import com.demo.Tickets.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServicio {
    private final List<Ticket> tickets = new ArrayList<>();
    public List <Ticket> allTickets() {
        return tickets;
    }

    public Ticket createTicket(Ticket createdTicket) {
        tickets.add(createdTicket);
        return createdTicket;
    }

}
