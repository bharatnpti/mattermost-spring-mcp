package com.example.mcp.service;

import com.example.mcp.model.User;
import com.example.mcp.model.SearchUsersRequest; // Assuming this model is generated
import java.util.List;

public interface UserService {
    User getUser(String userId);
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    List<User> getUsersByIds(List<String> ids);
    List<User> getUsersByUsernames(List<String> usernames);
    List<User> searchUsers(SearchUsersRequest searchUsersRequest);
    // Add other user-related methods if any were missed,
    // matching signatures from the relevant parts of ApiApi.
}
