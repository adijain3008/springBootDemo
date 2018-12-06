package com.mindtree.springBootDemo.service;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.springBootDemo.entity.Topic;

public interface TopicService extends CrudRepository<Topic, Integer> {

}