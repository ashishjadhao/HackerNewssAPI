package com.domain.HackerNewAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.HackerNewAPI.dto.StoryDTO;
import com.domain.HackerNewAPI.service.HackerNewsService;

@RestController
	public class TopStoriesController
	{
	    
	    @Autowired
	    private HackerNewsService hackerNewsService;

	    @GetMapping("/top-stories")
	    public ResponseEntity<List<StoryDTO>> getTopStories() {
	        List<StoryDTO> topStories = hackerNewsService.getTopStoriesInLast15Minutes();
	        return ResponseEntity.ok(topStories);
	    }
	}

	
	


