package com.springboot.example.embeddedDB.derby.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amruta on 4/21/2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }


    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {
      topicRepository.save(topic);
    }


    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
