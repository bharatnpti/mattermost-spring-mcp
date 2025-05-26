package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
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
 * AddChannelMemberRequest
 */

@JsonTypeName("AddChannelMember_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class AddChannelMemberRequest {

  private String userId;

  @Valid
  private List<String> userIds;

  private String postRootId;

  public AddChannelMemberRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of user to add into the channel, for backwards compatibility.
   * @return userId
  */
  
  @Schema(name = "user_id", description = "The ID of user to add into the channel, for backwards compatibility.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AddChannelMemberRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public AddChannelMemberRequest addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * The IDs of users to add into the channel, required if 'user_id' doess not exist.
   * @return userIds
  */
  @Size(min = 1, max = 1000) 
  @Schema(name = "user_ids", description = "The IDs of users to add into the channel, required if 'user_id' doess not exist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_ids")
  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  public AddChannelMemberRequest postRootId(String postRootId) {
    this.postRootId = postRootId;
    return this;
  }

  /**
   * The ID of root post where link to add channel member originates
   * @return postRootId
  */
  
  @Schema(name = "post_root_id", description = "The ID of root post where link to add channel member originates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("post_root_id")
  public String getPostRootId() {
    return postRootId;
  }

  public void setPostRootId(String postRootId) {
    this.postRootId = postRootId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddChannelMemberRequest addChannelMemberRequest = (AddChannelMemberRequest) o;
    return Objects.equals(this.userId, addChannelMemberRequest.userId) &&
        Objects.equals(this.userIds, addChannelMemberRequest.userIds) &&
        Objects.equals(this.postRootId, addChannelMemberRequest.postRootId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userIds, postRootId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddChannelMemberRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    postRootId: ").append(toIndentedString(postRootId)).append("\n");
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

