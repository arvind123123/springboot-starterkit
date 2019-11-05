package com.starterkit.springboot.brs.model.trainer;

import com.starterkit.springboot.brs.model.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "technology")
public class Trainer {
    @Id
    private  String id;
    @DBRef(lazy = true)
    private User user;
    @DBRef(lazy = true)
    private Set<Technology> technologies;
    @DBRef(lazy = true)
    private Set<Skill> skillSet;
    @DBRef(lazy = true)
    private Set<Certifications> certifications;
}
