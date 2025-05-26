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
 * SearchTeamsRequest
 */

@JsonTypeName("SearchTeams_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class SearchTeamsRequest {

  private String term;

  public SearchTeamsRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The search term to match against the name or display name of teams
   * @return term
  */
  
  @Schema(name = "term", description = "The search term to match against the name or display name of teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTeamsRequest searchTeamsRequest = (SearchTeamsRequest) o;
    return Objects.equals(this.term, searchTeamsRequest.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTeamsRequest {\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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

