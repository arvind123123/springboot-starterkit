package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
    Course findByCode(String courseCode);
    Course findByName(String name);
}
