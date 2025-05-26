package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ChannelMember
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class ChannelMember {

  private String channelId;

  private String userId;

  private String roles;

  private Long lastViewedAt;

  public ChannelMember channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
  */
  
  @Schema(name = "channel_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel_id")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ChannelMember userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public ChannelMember roles(String roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  
  @Schema(name = "roles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roles")
  public String getRoles() {
    return roles;
  }

  public void setRoles(String roles) {
    this.roles = roles;
  }

  public ChannelMember lastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
    return this;
  }

  /**
   * Get lastViewedAt
   * @return lastViewedAt
  */
  
  @Schema(name = "last_viewed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_viewed_at")
  public Long getLastViewedAt() {
    return lastViewedAt;
  }

  public void setLastViewedAt(Long lastViewedAt) {
    this.lastViewedAt = lastViewedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelMember channelMember = (ChannelMember) o;
    return Objects.equals(this.channelId, channelMember.channelId) &&
        Objects.equals(this.userId, channelMember.userId) &&
        Objects.equals(this.roles, channelMember.roles) &&
        Objects.equals(this.lastViewedAt, channelMember.lastViewedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, userId, roles, lastViewedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelMember {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    lastViewedAt: ").append(toIndentedString(lastViewedAt)).append("\n");
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

