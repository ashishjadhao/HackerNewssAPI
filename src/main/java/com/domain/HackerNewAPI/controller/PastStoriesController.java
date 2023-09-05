package com.domain.HackerNewAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.HackerNewAPI.dto.StoryDTO;
import com.domain.HackerNewAPI.service.HackerNewsService;

@RestController
	public class PastStoriesController {
	    
	    @Autowired
	    private HackerNewsService hackerNewsService;

	    @GetMapping("/past-stories")
	    public ResponseEntity<List<StoryDTO>> getPastStories() {
	        List<StoryDTO> pastStories = hackerNewsService.getPastTopStories();
	        return ResponseEntity.ok(pastStories);
	    }
}
