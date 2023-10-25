package io.siddhant.topic;

import java.util.ArrayList;
import java.util.List;

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
	return	topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	
	}
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
		return;
	}
	public void updateTopic(String id, Topic topic)
	{
		for (int i = 0; i<topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(i))
			{
				topics.set(i, topic);
				return;
			}
		}
	}
	
	public void deleteTopic(String id)
	{
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}

