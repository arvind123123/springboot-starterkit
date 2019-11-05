package com.starterkit.springboot.brs.model.trainer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "technology")
public class Certifications {
    @Id
    private  String id;
    private String name;
    private Date earnedDate;
    private String certificateURL;
    private  String vendor;

}
