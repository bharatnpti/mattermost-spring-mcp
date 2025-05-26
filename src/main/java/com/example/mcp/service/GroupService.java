package com.example.mcp.service;

import com.example.mcp.model.Group;
import java.util.List;

public interface GroupService {
    List<Group> getGroups(Integer page, Integer perPage);
    // Add other group-related methods if any were missed.
}
