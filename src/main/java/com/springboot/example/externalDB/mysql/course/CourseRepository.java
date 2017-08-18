package com.springboot.example.externalDB.mysql.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Amruta on 4/21/2017.
 */
public interface CourseRepository extends CrudRepository<Course,String>{

    List<Course> findByTopicId(String id);

}
