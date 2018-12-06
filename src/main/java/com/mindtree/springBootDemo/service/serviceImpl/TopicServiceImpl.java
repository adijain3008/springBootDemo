package com.mindtree.springBootDemo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springBootDemo.entity.Topic;
import com.mindtree.springBootDemo.service.TopicService;

@Service
public class TopicServiceImpl {
	
	@Autowired
	private TopicService topicService;

	public void addTopic(Topic topic) {
		topicService.save(topic);
	}

	public Topic getTopicById(int id) {
		return topicService.findOne(id);
	}

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		topicService.findAll().forEach(topics::add);
		return topics;
	}

	public void updateTopic(int id, Topic updatedTopic) {
		topicService.save(updatedTopic);
	}

	public void deleteTopicById(int id) {
		topicService.delete(id);
	}
}