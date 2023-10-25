package io.siddhant.topic;
import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		
		List<Topic> topics = new ArrayList<>();
		topics.add(new Topic("123","sid", "infa"));
		topics.add(new Topic("124","mithun", "infa"));
		topics.add(new Topic("125","rajan", "infa"));
		
		return topics;
	}

}
