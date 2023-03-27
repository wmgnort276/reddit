package com.bezkoder.springjwt.controllers;

import com.bezkoder.springjwt.models.SubReddit;
import com.bezkoder.springjwt.payload.request.SubRedditRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.payload.response.SubRedditResponse;
import com.bezkoder.springjwt.service.SubRedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subreddit")
public class SubRedditController {
    @Autowired
    SubRedditService subRedditService;
    @PostMapping("/save")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> save(@RequestBody SubRedditRequest request){
        SubRedditResponse subReddit = subRedditService.createSubreddit(request);
        return ResponseEntity.ok(new MessageResponse("Successfully creating subReddit", 200, subReddit));
    }

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATE') or hasRole('ADMIN')")
    public List<SubRedditResponse> getAll(){
        return subRedditService.getAll();
    }
}
