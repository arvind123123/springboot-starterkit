package com.starterkit.springboot.brs.repository.course;

import com.starterkit.springboot.brs.model.course.Agency;
import com.starterkit.springboot.brs.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Arpit Khandelwal.
 */
public interface AgencyRepository extends MongoRepository<Agency, String> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
