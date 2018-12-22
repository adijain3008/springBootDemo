package com.mindtree.springBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.springBootDemo.entity.Topic;
import com.mindtree.springBootDemo.service.serviceImpl.TopicServiceImpl;

@RestController
public class TopicController {

	@Autowired
	private TopicServiceImpl topicServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST, value = "topics")
	public void addTopic(@RequestBody Topic topic) {
		topicServiceImpl.addTopic(topic);
	}

	@RequestMapping("topics/{id}")
	public Topic getTopicById(@PathVariable int id) {
		return topicServiceImpl.getTopicById(id);
	}

	@RequestMapping("topics")
	public List<Topic> getAllTopics() {
		return topicServiceImpl.getAllTopics();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
	public void updateTopic(@RequestBody Topic updatedTopic, @PathVariable int id) {
		topicServiceImpl.updateTopic(id, updatedTopic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "topics/{id}")
	public void deleteTopicById(@PathVariable int id) {
		topicServiceImpl.deleteTopicById(id);
	}
}
