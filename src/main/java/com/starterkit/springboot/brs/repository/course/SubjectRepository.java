package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject,String> {

}
