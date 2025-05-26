package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.example.mcp.model.Team;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SearchTeams200Response
 */

@JsonTypeName("SearchTeams_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class SearchTeams200Response {

  @Valid
  private List<@Valid Team> teams;

  public SearchTeams200Response teams(List<@Valid Team> teams) {
    this.teams = teams;
    return this;
  }

  public SearchTeams200Response addTeamsItem(Team teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public List<@Valid Team> getTeams() {
    return teams;
  }

  public void setTeams(List<@Valid Team> teams) {
    this.teams = teams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTeams200Response searchTeams200Response = (SearchTeams200Response) o;
    return Objects.equals(this.teams, searchTeams200Response.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTeams200Response {\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

