/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface ListExclusionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListExclusionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  java.util.List<com.google.logging.v2.LogExclusion> getExclusionsList();
  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  com.google.logging.v2.LogExclusion getExclusions(int index);
  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  int getExclusionsCount();
  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  java.util.List<? extends com.google.logging.v2.LogExclusionOrBuilder>
      getExclusionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of exclusions.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogExclusion exclusions = 1;</code>
   */
  com.google.logging.v2.LogExclusionOrBuilder getExclusionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
