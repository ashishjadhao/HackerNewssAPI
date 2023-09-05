package com.domain.HackerNewAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.domain.HackerNewAPI.dto.CommentDTO;
import com.domain.HackerNewAPI.dto.StoryDTO;

@Service
public class HackerNewsService {

	
	    private String hackerNewsApiUrl;

	    public List<StoryDTO> getTopStoriesInLast15Minutes() 
	    {
	    	{
	    	    RestTemplate restTemplate = new RestTemplate();
	    	    String url = hackerNewsApiUrl + "topstories.json";
	    	    Long[] topStoryIds = restTemplate.getForObject(url, Long[].class);

	    	    List<StoryDTO> topStories = new ArrayList<>();
	    	    for (int i = 0; i < 10 && i < topStoryIds.length; i++) 
	    	    {
	    	        StoryDTO storyDTO = fetchAndFormatStoryDetails(topStoryIds[i]);
	    	        topStories.add(storyDTO);
	    	    }
	    	    return topStories;
	    	}
	    	
	    }
	    
	    private StoryDTO fetchAndFormatStoryDetails(Long long1) 
	    {
			
			return null;
		}

		private List<StoryDTO> pastTopStories = new ArrayList<>(); 

	    public List<StoryDTO> getPastTopStories() 
	    {
	        return pastTopStories;
	    }

	    public void updatePastTopStories(List<StoryDTO> topStories) 
	    {
	        pastTopStories.clear();
	        pastTopStories.addAll(topStories);
	    }

	    	
	    public List<CommentDTO> getCommentsForStory(Long storyId) 
	    {
	        RestTemplate restTemplate = new RestTemplate();
	        String url = hackerNewsApiUrl + "item/" + storyId + ".json";
	        StoryDTO storyDTO = restTemplate.getForObject(url, StoryDTO.class);

	        List<CommentDTO> comments = new ArrayList<>();
	        if (storyDTO != null && storyDTO.getCommentIds() != null) {
	            for (Long commentId : storyDTO.getCommentIds()) {
	                CommentDTO commentDTO = fetchAndFormatCommentDetails(commentId);
	                comments.add(commentDTO);
	            }
	        }
	        return comments;
	    }
     
		private CommentDTO fetchAndFormatCommentDetails(Long commentId)
		{
			
			return null;
		}


	    
}
