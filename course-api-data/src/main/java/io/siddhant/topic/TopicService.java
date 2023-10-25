package io.siddhant.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class TopicService {

private List<Topic> topics = new ArrayList<>();

@Autowired
	private TopicRepository topicRepository;
	
	
	
	public List<Topic> getAllTopics()
	{
		topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
	
		return topics;
	}
	
	
	public Topic getTopic(String id)
	{
		Optional<Topic> t = topicRepository.findById(id);
	return	t.orElse(null);
	
	}
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
		return;
	}
	public void updateTopic(String id, Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);
	}
}

