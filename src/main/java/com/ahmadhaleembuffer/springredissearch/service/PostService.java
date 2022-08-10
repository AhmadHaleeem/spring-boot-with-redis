package com.ahmadhaleembuffer.springredissearch.service;

import com.ahmadhaleembuffer.springredissearch.model.CategoryStats;
import com.ahmadhaleembuffer.springredissearch.model.Page;
import com.ahmadhaleembuffer.springredissearch.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Page search(String content, Set<String> tags, Integer page) {
        return postRepository.search(content, tags, page);
    }

    public List<CategoryStats> getCategoryWiseTotalPost() {
        return postRepository.getCategoryWiseTotalPost();
    }
}
