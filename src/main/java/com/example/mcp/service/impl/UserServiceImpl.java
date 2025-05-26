package com.example.mcp.service.impl;

import com.example.mcp.model.User;
import com.example.mcp.model.SearchUsersRequest;
import com.example.mcp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getUser(String userId) {
        logger.info("UserServiceImpl.getUser called with userId: {}", userId);
        // Actual logic will be implemented later
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        logger.info("UserServiceImpl.getUserByUsername called with username: {}", username);
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        logger.info("UserServiceImpl.getUserByEmail called with email: {}", email);
        return null;
    }

    @Override
    public List<User> getUsersByIds(List<String> ids) {
        logger.info("UserServiceImpl.getUsersByIds called with ids: {}", ids);
        return Collections.emptyList();
    }

    @Override
    public List<User> getUsersByUsernames(List<String> usernames) {
        logger.info("UserServiceImpl.getUsersByUsernames called with usernames: {}", usernames);
        return Collections.emptyList();
    }

    @Override
    public List<User> searchUsers(SearchUsersRequest searchUsersRequest) {
        logger.info("UserServiceImpl.searchUsers called with searchUsersRequest: {}", searchUsersRequest);
        return Collections.emptyList();
    }
}
