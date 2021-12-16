package com.javabrains.QuickStart.repository;

import org.springframework.data.repository.CrudRepository;

import com.javabrains.QuickStart.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	

}
