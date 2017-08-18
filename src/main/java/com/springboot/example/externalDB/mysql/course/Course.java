package com.springboot.example.externalDB.mysql.course;

import com.springboot.example.embeddedDB.derby.topic.Topic;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Amruta on 4/21/2017.
 */


@Getter
@Setter
@Entity
public class Course {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne
    private Topic topic;

}
