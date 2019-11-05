package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic,String> {
    Topic findByName(String topicName);

}
