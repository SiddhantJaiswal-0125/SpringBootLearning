package io.siddhant.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class TopicService {

private List<Topic> topics = new ArrayList<>();
	
	
	
	
	public List<Topic> getAllTopics()
	{
		topics = new ArrayList<>();
		topics.add(new Topic("123","sid", "infa"));
		topics.add(new Topic("124","mithun", "infa"));
		topics.add(new Topic("125","rajan", "infa"));
		return topics;
	}
	
	
	public Topic getTopic(String id)
	{
	return	topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	
	}
	public void addTopic(Topic topic)
	{
		topics.add(topic);
		return;
	}
	
}

