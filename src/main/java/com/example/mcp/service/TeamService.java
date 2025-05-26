package com.example.mcp.service;

import com.example.mcp.model.AddTeamMemberRequest;
import com.example.mcp.model.CreateTeamRequest;
import com.example.mcp.model.SearchTeams200Response;
import com.example.mcp.model.SearchTeamsRequest;
import com.example.mcp.model.Team;
import com.example.mcp.model.TeamMember;

import java.util.List;

public interface TeamService {
    TeamMember addTeamMember(String teamId, AddTeamMemberRequest addTeamMemberRequest);
    List<TeamMember> addTeamMembers(String teamId, List<TeamMember> teamMembers); // Assuming TeamMember is the request body type
    Team createTeam(CreateTeamRequest createTeamRequest);
    Team getTeam(String teamId);
    Team getTeamByName(String name);
    List<TeamMember> getTeamMembers(String teamId, Integer page, Integer perPage);
    List<Team> getTeamsForUser(String userId);
    SearchTeams200Response searchTeams(SearchTeamsRequest searchTeamsRequest);
    // Add other team-related methods if any were missed.
}
