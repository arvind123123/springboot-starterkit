package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Trip;
import com.starterkit.springboot.brs.model.course.TripSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface TripScheduleRepository extends MongoRepository<TripSchedule, String> {
    TripSchedule findByTripDetailAndTripDate(Trip tripDetail, String tripDate);
}