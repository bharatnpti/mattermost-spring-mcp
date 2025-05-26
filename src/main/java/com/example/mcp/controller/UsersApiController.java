package com.example.mcp.controller;

import com.example.mcp.api.ApiApi;
import com.example.mcp.model.*; // Import all models
import com.example.mcp.service.*; // Import all service interfaces
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List; // Ensure this is imported if any method returns a List directly

@RestController
public class UsersApiController implements ApiApi {

    private final UserService userService;
    private final ChannelService channelService;
    private final TeamService teamService;
    private final PostService postService;
    private final GroupService groupService;

    @Autowired
    public UsersApiController(UserService userService, ChannelService channelService, TeamService teamService, PostService postService, GroupService groupService) {
        this.userService = userService;
        this.channelService = channelService;
        this.teamService = teamService;
        this.postService = postService;
        this.groupService = groupService;
    }

    // UserService methods
    @Override
    public ResponseEntity<User> getUser(String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<User> getUserByUsername(String username) {
        User user = userService.getUserByUsername(username);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<User> getUserByEmail(String email) {
        User user = userService.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<List<User>> getUsersByIds(List<String> ids) {
        List<User> users = userService.getUsersByIds(ids);
        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<List<User>> getUsersByUsernames(List<String> usernames) {
        List<User> users = userService.getUsersByUsernames(usernames);
        return ResponseEntity.ok(users);
    }

    @Override
    public ResponseEntity<List<User>> searchUsers(SearchUsersRequest searchUsersRequest) {
        List<User> users = userService.searchUsers(searchUsersRequest);
        return ResponseEntity.ok(users);
    }

    // ChannelService methods
    @Override
    public ResponseEntity<ChannelMember> addChannelMember(String channelId, AddChannelMemberRequest addChannelMemberRequest) {
        ChannelMember channelMember = channelService.addChannelMember(channelId, addChannelMemberRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(channelMember);
    }

    @Override
    public ResponseEntity<Channel> createChannel(CreateChannelRequest createChannelRequest) {
        Channel channel = channelService.createChannel(createChannelRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(channel);
    }

    @Override
    public ResponseEntity<Channel> createDirectChannel(List<String> requestBody) {
        Channel channel = channelService.createDirectChannel(requestBody);
        return ResponseEntity.status(HttpStatus.CREATED).body(channel);
    }

    @Override
    public ResponseEntity<Channel> createGroupChannel(List<String> requestBody) {
        Channel channel = channelService.createGroupChannel(requestBody);
        return ResponseEntity.status(HttpStatus.CREATED).body(channel);
    }

    @Override
    public ResponseEntity<Channel> getChannel(String channelId) {
        Channel channel = channelService.getChannel(channelId);
        return ResponseEntity.ok(channel);
    }

    @Override
    public ResponseEntity<Channel> getChannelByName(String teamId, String channelName) {
        Channel channel = channelService.getChannelByName(teamId, channelName);
        return ResponseEntity.ok(channel);
    }

    @Override
    public ResponseEntity<List<ChannelMember>> getChannelMembers(String channelId, Integer page, Integer perPage) {
        List<ChannelMember> members = channelService.getChannelMembers(channelId, page, perPage);
        return ResponseEntity.ok(members);
    }

    @Override
    public ResponseEntity<SearchAllChannels200Response> searchAllChannels(SearchAllChannelsRequest searchAllChannelsRequest) {
        SearchAllChannels200Response response = channelService.searchAllChannels(searchAllChannelsRequest);
        return ResponseEntity.ok(response);
    }

    // GroupService methods
    @Override
    public ResponseEntity<List<Group>> getGroups(Integer page, Integer perPage) {
        List<Group> groups = groupService.getGroups(page, perPage);
        return ResponseEntity.ok(groups);
    }

    // PostService methods
    @Override
    public ResponseEntity<Post> createPost(CreatePostRequest createPostRequest, Boolean setOnline) {
        Post post = postService.createPost(createPostRequest, setOnline);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    // TeamService methods
    @Override
    public ResponseEntity<TeamMember> addTeamMember(String teamId, AddTeamMemberRequest addTeamMemberRequest) {
        TeamMember teamMember = teamService.addTeamMember(teamId, addTeamMemberRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(teamMember);
    }

    @Override
    public ResponseEntity<List<TeamMember>> addTeamMembers(String teamId, List<TeamMember> requestBody) {
        List<TeamMember> teamMembers = teamService.addTeamMembers(teamId, requestBody);
        return ResponseEntity.status(HttpStatus.CREATED).body(teamMembers);
    }

    @Override
    public ResponseEntity<Team> createTeam(CreateTeamRequest createTeamRequest) {
        Team team = teamService.createTeam(createTeamRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(team);
    }

    @Override
    public ResponseEntity<Team> getTeam(String teamId) {
        Team team = teamService.getTeam(teamId);
        return ResponseEntity.ok(team);
    }

    @Override
    public ResponseEntity<Team> getTeamByName(String name) {
        Team team = teamService.getTeamByName(name);
        return ResponseEntity.ok(team);
    }

    @Override
    public ResponseEntity<List<TeamMember>> getTeamMembers(String teamId, Integer page, Integer perPage) {
        List<TeamMember> members = teamService.getTeamMembers(teamId, page, perPage);
        return ResponseEntity.ok(members);
    }

    @Override
    public ResponseEntity<List<Team>> getTeamsForUser(String userId) {
        List<Team> teams = teamService.getTeamsForUser(userId);
        return ResponseEntity.ok(teams);
    }

    @Override
    public ResponseEntity<SearchTeams200Response> searchTeams(SearchTeamsRequest searchTeamsRequest) {
        SearchTeams200Response response = teamService.searchTeams(searchTeamsRequest);
        return ResponseEntity.ok(response);
    }
}
