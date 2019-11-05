package com.starterkit.springboot.brs.model.student;

import com.starterkit.springboot.brs.model.course.Course;
import com.starterkit.springboot.brs.model.trainer.Trainer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "agency")
public class CourseTaken {
    @Id
    private String id;
    @DBRef(lazy = true)
    private Course course;
    @DBRef(lazy = true)
    private Student student;
    @DBRef(lazy = true)
    private Trainer trainer;

}
