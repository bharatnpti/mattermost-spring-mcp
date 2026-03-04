package com.example.server.service;

import com.example.server.model.MattermostChannel;
import com.example.server.model.SendPostRequest;
import com.example.server.model.User;
import com.example.server.rest.client.MattermostApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MattermostService {


    private static final Logger log = LoggerFactory.getLogger(MattermostService.class);
    @Autowired
    private MattermostApiClient mattermostApiClient;

    @Tool(description = "Get Users List")
    public List<User> getUsersList() {

        List<User> users = mattermostApiClient.getUsers();

        log.info("Get Users List");
        users.forEach(user -> {
            log.info(user.toString());
        });

        return users;
    }

    @Tool(description = "Send Message to a channel")
    public String sendPersonalMessage(String channelId, String message) {
        log.info("Send Message to a channel: {}, {}", channelId, message);
        return mattermostApiClient.sendPost(SendPostRequest.builder()
                        .channel_id(channelId)
                        .message(message)
                .build()).toString();
    }

    @Tool(description = "Reply or ask requestor")
    public String askRequestor(String channelId, String message, String rootId) {
        log.info("Send Message to a Requestor: {}, {}, {}", channelId, rootId, message);
        return mattermostApiClient.sendPost(SendPostRequest.builder()
                .channel_id(channelId)
                .message(message)
                .root_id(rootId)
                .build()).toString();
    }

    @Tool(description = "Create a direct channel with user")
    public MattermostChannel createDirectChannel(String otherUserId) {
        MattermostChannel mattermostChannel = mattermostApiClient.createDirectChannel("nif1p7emd3yp5kq9tcid8eciay", otherUserId);
        log.info("Create a direct channel with id: {}", mattermostChannel.getId());
        return mattermostChannel;
    }

}
