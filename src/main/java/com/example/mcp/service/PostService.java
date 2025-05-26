package com.example.mcp.service;

import com.example.mcp.model.CreatePostRequest;
import com.example.mcp.model.Post;

public interface PostService {
    Post createPost(CreatePostRequest createPostRequest, Boolean setOnline);
    // Add other post-related methods if any were missed.
}
