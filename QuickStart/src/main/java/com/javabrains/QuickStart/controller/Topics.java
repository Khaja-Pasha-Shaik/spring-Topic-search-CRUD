package com.javabrains.QuickStart.controller;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.QuickStart.entity.Topic;
import com.javabrains.QuickStart.service.TopicService;

@RestController
public class Topics {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		
		 return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id){
		return topicService.getTopic(id);	
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic){
			topicService.addTopicInService(topic);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		 topicService.updateTopic2(topic,id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
			topicService.deletetopic(id);
	}
}
