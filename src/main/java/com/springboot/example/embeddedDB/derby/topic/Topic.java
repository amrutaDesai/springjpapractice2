package com.springboot.example.embeddedDB.derby.topic;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * Created by Amruta on 4/21/2017.
 */


@Getter
@Setter
@Entity
public class Topic {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String description;

}
