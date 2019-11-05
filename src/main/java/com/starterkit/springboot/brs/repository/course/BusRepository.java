package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Agency;
import com.starterkit.springboot.brs.model.course.Bus;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface BusRepository extends MongoRepository<Bus, String> {
    Bus findByCode(String busCode);

    Bus findByCodeAndAgency(String busCode, Agency agency);
}
