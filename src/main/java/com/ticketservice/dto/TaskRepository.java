package com.ticketservice.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ticketservice.modal.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
