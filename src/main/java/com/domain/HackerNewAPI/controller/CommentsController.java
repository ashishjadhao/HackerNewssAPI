package com.domain.HackerNewAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.domain.HackerNewAPI.dto.CommentDTO;
import com.domain.HackerNewAPI.service.HackerNewsService;

@RestController
	public class CommentsController {
	    
	    @Autowired
	    private HackerNewsService hackerNewsService;

	    @GetMapping("/comments/{storyId}")
	    public ResponseEntity<List<CommentDTO>> getCommentsForStory(@PathVariable Long storyId) {
	        List<CommentDTO> comments = hackerNewsService.getCommentsForStory(storyId);
	        return ResponseEntity.ok(comments);
	    }
}
