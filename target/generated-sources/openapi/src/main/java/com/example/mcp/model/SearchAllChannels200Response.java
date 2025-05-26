package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.example.mcp.model.Channel;
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
 * SearchAllChannels200Response
 */

@JsonTypeName("SearchAllChannels_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class SearchAllChannels200Response {

  @Valid
  private List<@Valid Channel> channels;

  public SearchAllChannels200Response channels(List<@Valid Channel> channels) {
    this.channels = channels;
    return this;
  }

  public SearchAllChannels200Response addChannelsItem(Channel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

  /**
   * Get channels
   * @return channels
  */
  @Valid 
  @Schema(name = "channels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channels")
  public List<@Valid Channel> getChannels() {
    return channels;
  }

  public void setChannels(List<@Valid Channel> channels) {
    this.channels = channels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAllChannels200Response searchAllChannels200Response = (SearchAllChannels200Response) o;
    return Objects.equals(this.channels, searchAllChannels200Response.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAllChannels200Response {\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

