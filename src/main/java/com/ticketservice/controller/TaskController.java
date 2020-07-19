package com.ticketservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketservice.dto.TicketRepository;
import com.ticketservice.exception.NoDataFoundException;
import com.ticketservice.modal.Task;
import com.ticketservice.modal.Ticket;

@RestController
@RequestMapping(value = "/ticketservices")
public class TaskController {

	@Autowired
	private TicketRepository ticketRepository;
	
	@GetMapping("/test")
	public String tests() {
		return "test";
	}
	
	@PostMapping("/create")
	public Ticket create(@RequestBody Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@GetMapping("/get/{ticketid}")
	public List<Task> get(@PathVariable("ticketid") long ticketid) {
		Ticket ticket;
		try {
			ticket = ticketRepository.getTicketByTicketid(ticketid);
			return ticket.getTasks();
		} catch (Exception e) {
			throw new NoDataFoundException("Task not available with " + ticketid);
		}
	}
	
	@PostMapping("/update")
	public Ticket update(@RequestBody Ticket ticket) {
		return ticketRepository.save(ticket);
	}
}
