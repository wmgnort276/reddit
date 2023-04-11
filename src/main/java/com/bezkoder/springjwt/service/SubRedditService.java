package com.bezkoder.springjwt.service;

import com.bezkoder.springjwt.models.SubReddit;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.request.SubRedditRequest;
import com.bezkoder.springjwt.payload.response.SubRedditResponse;
import com.bezkoder.springjwt.repository.SubRedditRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubRedditService extends BaseService {
    @Autowired
    private SubRedditRepository subRedditRepository;
    @Autowired
    private UserRepository userRepository;

    public SubRedditResponse createSubreddit(SubRedditRequest request) {
        SubReddit subReddit = mapper.map(request, SubReddit.class);
        subReddit.setCreated(Instant.now());
        subReddit.setUser(getUser());
        subRedditRepository.save(subReddit);
        SubRedditResponse subRedditResponse = mapper.map(subReddit, SubRedditResponse.class);
        User user = userRepository.getById(getUser().getId());
        subRedditResponse.setUsername(user.getUsername());
        return subRedditResponse;
    }

    public List<SubRedditResponse> getAll(){
        List<SubReddit> subRedditList = subRedditRepository.findAll();
        List<SubRedditResponse> subRedditResponseList = mapper.mapAsList(subRedditList, SubRedditResponse.class);
        return subRedditResponseList;
    }

    public SubRedditResponse getSubReddit(Long id){
        return null;
    }
}
