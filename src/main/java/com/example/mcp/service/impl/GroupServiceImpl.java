package com.example.mcp.service.impl;

import com.example.mcp.model.Group;
import com.example.mcp.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    private static final Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);

    @Override
    public List<Group> getGroups(Integer page, Integer perPage) {
        logger.info("GroupServiceImpl.getGroups called with page: {}, perPage: {}", page, perPage);
        // Actual logic will be implemented later
        return Collections.emptyList();
    }
}
