package com.springboot.example.externalDB.mysql.course;

import com.springboot.example.embeddedDB.derby.topic.Topic;
import com.springboot.example.embeddedDB.derby.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amruta on 4/21/2017.
 *
 * For Postman rest request
 * [
 {
 "name": "Course 1",
 "description": "Course Des 1",
 "topic": {
 "name": "Topic 1",
 "description": "Topic 1",
 "id": "T1"
 },
 "id": "C1"
 }
 ]
 *
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TopicRepository topicRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }


    public void addCourse(Course course,String topicId) {
        course.setTopic(topicRepository.findOne(topicId));
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
      courseRepository.save(course);
    }


    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
