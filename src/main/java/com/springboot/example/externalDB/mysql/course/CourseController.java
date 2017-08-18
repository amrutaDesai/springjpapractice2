package com.springboot.example.externalDB.mysql.course;

import com.springboot.example.embeddedDB.derby.topic.Topic;
import com.springboot.example.embeddedDB.derby.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Amruta on 4/21/2017.
 */

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private TopicService topicService;


    @RequestMapping(value = "/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
    }

    @RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
        courseService.addCourse(course,topicId);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable String id,@PathVariable String topicId) {
        Topic topic = topicService.getTopic(topicId);
        course.setTopic(topic);
        courseService.updateCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }


}
