package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Agency;
import com.starterkit.springboot.brs.model.course.Bus;
import com.starterkit.springboot.brs.model.course.Stop;
import com.starterkit.springboot.brs.model.course.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Arpit Khandelwal.
 */
public interface TripRepository extends MongoRepository<Trip, String> {
    Trip findBySourceStopAndDestStopAndBus(Stop source, Stop destination, Bus bus);

    List<Trip> findAllBySourceStopAndDestStop(Stop source, Stop destination);

    List<Trip> findByAgency(Agency agency);
}
