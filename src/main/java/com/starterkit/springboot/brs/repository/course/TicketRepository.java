package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface TicketRepository extends MongoRepository<Ticket, Long> {
}
