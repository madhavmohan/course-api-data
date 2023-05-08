package io.madhav.topic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class TopicService implements ApplicationContextAware {
	
	private ApplicationContext context;
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList
			(new Topic("java","java course","learn hjava"),
					new Topic("python","python course","learn python"),
					new Topic("mongodb","mongo db course","learn mongo db")));



	public List<Topic> getAllTopics() {
		List<Topic> topics=new ArrayList<>();
		
		topicRepository.findAll().forEach(t->topics.add(t));
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		
		topicRepository.save(topic);	
		
	}

	public void updateTopic(Topic topic, String id) {
	
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(topic.getId())) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
		
	}
	
	
}
