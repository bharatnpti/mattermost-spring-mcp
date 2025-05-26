package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateTeamRequest
 */

@JsonTypeName("CreateTeam_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class CreateTeamRequest {

  private String name;

  private String displayName;

  private String type;

  public CreateTeamRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTeamRequest(String name, String displayName, String type) {
    this.name = name;
    this.displayName = displayName;
    this.type = type;
  }

  public CreateTeamRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique handler for a team, will be present in the team URL
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Unique handler for a team, will be present in the team URL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTeamRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Non-unique UI name for the team
   * @return displayName
  */
  @NotNull 
  @Schema(name = "display_name", description = "Non-unique UI name for the team", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CreateTeamRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * `'O'` for open, `'I'` for invite only
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "`'O'` for open, `'I'` for invite only", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTeamRequest createTeamRequest = (CreateTeamRequest) o;
    return Objects.equals(this.name, createTeamRequest.name) &&
        Objects.equals(this.displayName, createTeamRequest.displayName) &&
        Objects.equals(this.type, createTeamRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTeamRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

