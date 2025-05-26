package com.example.mcp.service;

import com.example.mcp.model.AddChannelMemberRequest;
import com.example.mcp.model.Channel;
import com.example.mcp.model.ChannelMember;
import com.example.mcp.model.CreateChannelRequest;
import com.example.mcp.model.SearchAllChannels200Response;
import com.example.mcp.model.SearchAllChannelsRequest;

import java.util.List;

public interface ChannelService {
    ChannelMember addChannelMember(String channelId, AddChannelMemberRequest addChannelMemberRequest);
    Channel createChannel(CreateChannelRequest createChannelRequest);
    Channel createDirectChannel(List<String> userIds);
    Channel createGroupChannel(List<String> userIds);
    Channel getChannel(String channelId);
    Channel getChannelByName(String teamId, String channelName);
    List<ChannelMember> getChannelMembers(String channelId, Integer page, Integer perPage);
    SearchAllChannels200Response searchAllChannels(SearchAllChannelsRequest searchAllChannelsRequest);
    // Add other channel-related methods if any were missed.
}
