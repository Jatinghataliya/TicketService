package com.ticketservice.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketservice.modal.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

	Ticket getTicketByTicketid(long ticketid);

}
