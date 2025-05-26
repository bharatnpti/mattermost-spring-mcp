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
 * SearchAllChannelsRequest
 */

@JsonTypeName("SearchAllChannels_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class SearchAllChannelsRequest {

  private String term;

  public SearchAllChannelsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchAllChannelsRequest(String term) {
    this.term = term;
  }

  public SearchAllChannelsRequest term(String term) {
    this.term = term;
    return this;
  }

  /**
   * The string to search in the channel name, display name, and purpose.
   * @return term
  */
  @NotNull 
  @Schema(name = "term", description = "The string to search in the channel name, display name, and purpose.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SearchAllChannelsRequest searchAllChannelsRequest = (SearchAllChannelsRequest) o;
    return Objects.equals(this.term, searchAllChannelsRequest.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAllChannelsRequest {\n");
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

