package com.javabrains.QuickStart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabrains.QuickStart.entity.Topic;
import com.javabrains.QuickStart.repository.TopicRepository;

@Service
public class TopicService {
	
	List<Topic> l1 = new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","spring framework description"),
			new Topic("java","java framework","java framework description"),
			new Topic("hibernate","hibernte framework","hibernate framework description")
			
			));
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
			List<Topic> t2= new ArrayList<>();
			topicRepository.findAll().forEach(t2::add);
			return t2;
	}
	
	public Optional<Topic> getTopic(String id){
			 return topicRepository.findById(id);
			 
	}

	public void addTopicInService(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
	}
	
	public void updateTopic2(Topic topic, String id){
		
		topicRepository.save(topic);	
		
	}

	public void deletetopic(String id) {
		
		topicRepository.deleteById(id);	
		
	}
}
