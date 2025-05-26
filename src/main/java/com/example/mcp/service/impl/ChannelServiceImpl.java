package com.example.mcp.service.impl;

import com.example.mcp.model.AddChannelMemberRequest;
import com.example.mcp.model.Channel;
import com.example.mcp.model.ChannelMember;
import com.example.mcp.model.CreateChannelRequest;
import com.example.mcp.model.SearchAllChannels200Response;
import com.example.mcp.model.SearchAllChannelsRequest;
import com.example.mcp.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    private static final Logger logger = LoggerFactory.getLogger(ChannelServiceImpl.class);

    @Override
    public ChannelMember addChannelMember(String channelId, AddChannelMemberRequest addChannelMemberRequest) {
        logger.info("ChannelServiceImpl.addChannelMember called with channelId: {}, request: {}", channelId, addChannelMemberRequest);
        return null;
    }

    @Override
    public Channel createChannel(CreateChannelRequest createChannelRequest) {
        logger.info("ChannelServiceImpl.createChannel called with request: {}", createChannelRequest);
        return null;
    }

    @Override
    public Channel createDirectChannel(List<String> userIds) {
        logger.info("ChannelServiceImpl.createDirectChannel called with userIds: {}", userIds);
        return null;
    }

    @Override
    public Channel createGroupChannel(List<String> userIds) {
        logger.info("ChannelServiceImpl.createGroupChannel called with userIds: {}", userIds);
        return null;
    }

    @Override
    public Channel getChannel(String channelId) {
        logger.info("ChannelServiceImpl.getChannel called with channelId: {}", channelId);
        return null;
    }

    @Override
    public Channel getChannelByName(String teamId, String channelName) {
        logger.info("ChannelServiceImpl.getChannelByName called with teamId: {}, channelName: {}", teamId, channelName);
        return null;
    }

    @Override
    public List<ChannelMember> getChannelMembers(String channelId, Integer page, Integer perPage) {
        logger.info("ChannelServiceImpl.getChannelMembers called with channelId: {}, page: {}, perPage: {}", channelId, page, perPage);
        return Collections.emptyList();
    }

    @Override
    public SearchAllChannels200Response searchAllChannels(SearchAllChannelsRequest searchAllChannelsRequest) {
        logger.info("ChannelServiceImpl.searchAllChannels called with request: {}", searchAllChannelsRequest);
        return null;
    }
}
