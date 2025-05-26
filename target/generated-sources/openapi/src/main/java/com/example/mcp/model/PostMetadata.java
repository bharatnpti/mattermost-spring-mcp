package com.example.mcp.model;

import java.net.URI;
import java.util.Objects;
import com.example.mcp.model.Emoji;
import com.example.mcp.model.FileInfo;
import com.example.mcp.model.Reaction;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Additional information used to display a post.
 */

@Schema(name = "PostMetadata", description = "Additional information used to display a post.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-26T15:11:57.760857540Z[Etc/UTC]")
public class PostMetadata {

  @Valid
  private List<Object> embeds;

  @Valid
  private List<@Valid Emoji> emojis;

  @Valid
  private List<@Valid FileInfo> files;

  private Object images;

  @Valid
  private List<@Valid Reaction> reactions;

  public PostMetadata embeds(List<Object> embeds) {
    this.embeds = embeds;
    return this;
  }

  public PostMetadata addEmbedsItem(Object embedsItem) {
    if (this.embeds == null) {
      this.embeds = new ArrayList<>();
    }
    this.embeds.add(embedsItem);
    return this;
  }

  /**
   * Information about content embedded in the post.
   * @return embeds
  */
  
  @Schema(name = "embeds", description = "Information about content embedded in the post.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("embeds")
  public List<Object> getEmbeds() {
    return embeds;
  }

  public void setEmbeds(List<Object> embeds) {
    this.embeds = embeds;
  }

  public PostMetadata emojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public PostMetadata addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emojis in the post or reactions.
   * @return emojis
  */
  @Valid 
  @Schema(name = "emojis", description = "Custom emojis in the post or reactions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emojis")
  public List<@Valid Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<@Valid Emoji> emojis) {
    this.emojis = emojis;
  }

  public PostMetadata files(List<@Valid FileInfo> files) {
    this.files = files;
    return this;
  }

  public PostMetadata addFilesItem(FileInfo filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * FileInfo objects for attachments.
   * @return files
  */
  @Valid 
  @Schema(name = "files", description = "FileInfo objects for attachments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid FileInfo> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid FileInfo> files) {
    this.files = files;
  }

  public PostMetadata images(Object images) {
    this.images = images;
    return this;
  }

  /**
   * External image URLs and dimensions.
   * @return images
  */
  
  @Schema(name = "images", description = "External image URLs and dimensions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("images")
  public Object getImages() {
    return images;
  }

  public void setImages(Object images) {
    this.images = images;
  }

  public PostMetadata reactions(List<@Valid Reaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public PostMetadata addReactionsItem(Reaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

  /**
   * Reactions to the post.
   * @return reactions
  */
  @Valid 
  @Schema(name = "reactions", description = "Reactions to the post.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reactions")
  public List<@Valid Reaction> getReactions() {
    return reactions;
  }

  public void setReactions(List<@Valid Reaction> reactions) {
    this.reactions = reactions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMetadata postMetadata = (PostMetadata) o;
    return Objects.equals(this.embeds, postMetadata.embeds) &&
        Objects.equals(this.emojis, postMetadata.emojis) &&
        Objects.equals(this.files, postMetadata.files) &&
        Objects.equals(this.images, postMetadata.images) &&
        Objects.equals(this.reactions, postMetadata.reactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeds, emojis, files, images, reactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMetadata {\n");
    sb.append("    embeds: ").append(toIndentedString(embeds)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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

