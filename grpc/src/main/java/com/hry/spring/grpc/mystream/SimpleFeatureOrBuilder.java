// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/com/hry/spring/grpc/mystream/hello_stream.proto

package com.hry.spring.grpc.mystream;

public interface SimpleFeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SimpleFeature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .Simple location = 2;</code>
   */
  boolean hasLocation();
  /**
   * <code>optional .Simple location = 2;</code>
   */
  com.hry.spring.grpc.mystream.Simple getLocation();
  /**
   * <code>optional .Simple location = 2;</code>
   */
  com.hry.spring.grpc.mystream.SimpleOrBuilder getLocationOrBuilder();
}
