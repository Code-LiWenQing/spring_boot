// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/com/hry/spring/grpc/mystream/hello_stream.proto

package com.hry.spring.grpc.mystream;

/**
 * Protobuf type {@code SimpleSummary}
 */
public  final class SimpleSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SimpleSummary)
    SimpleSummaryOrBuilder {
  // Use SimpleSummary.newBuilder() to construct.
  private SimpleSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleSummary() {
    featureCount_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SimpleSummary(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 16: {

            featureCount_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hry.spring.grpc.mystream.HelloStreamEntity.internal_static_SimpleSummary_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hry.spring.grpc.mystream.HelloStreamEntity.internal_static_SimpleSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hry.spring.grpc.mystream.SimpleSummary.class, com.hry.spring.grpc.mystream.SimpleSummary.Builder.class);
  }

  public static final int FEATURE_COUNT_FIELD_NUMBER = 2;
  private int featureCount_;
  /**
   * <code>optional int32 feature_count = 2;</code>
   */
  public int getFeatureCount() {
    return featureCount_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (featureCount_ != 0) {
      output.writeInt32(2, featureCount_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (featureCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, featureCount_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hry.spring.grpc.mystream.SimpleSummary)) {
      return super.equals(obj);
    }
    com.hry.spring.grpc.mystream.SimpleSummary other = (com.hry.spring.grpc.mystream.SimpleSummary) obj;

    boolean result = true;
    result = result && (getFeatureCount()
        == other.getFeatureCount());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + FEATURE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hry.spring.grpc.mystream.SimpleSummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hry.spring.grpc.mystream.SimpleSummary prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SimpleSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SimpleSummary)
      com.hry.spring.grpc.mystream.SimpleSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hry.spring.grpc.mystream.HelloStreamEntity.internal_static_SimpleSummary_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hry.spring.grpc.mystream.HelloStreamEntity.internal_static_SimpleSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hry.spring.grpc.mystream.SimpleSummary.class, com.hry.spring.grpc.mystream.SimpleSummary.Builder.class);
    }

    // Construct using com.hry.spring.grpc.mystream.SimpleSummary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      featureCount_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hry.spring.grpc.mystream.HelloStreamEntity.internal_static_SimpleSummary_descriptor;
    }

    public com.hry.spring.grpc.mystream.SimpleSummary getDefaultInstanceForType() {
      return com.hry.spring.grpc.mystream.SimpleSummary.getDefaultInstance();
    }

    public com.hry.spring.grpc.mystream.SimpleSummary build() {
      com.hry.spring.grpc.mystream.SimpleSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hry.spring.grpc.mystream.SimpleSummary buildPartial() {
      com.hry.spring.grpc.mystream.SimpleSummary result = new com.hry.spring.grpc.mystream.SimpleSummary(this);
      result.featureCount_ = featureCount_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hry.spring.grpc.mystream.SimpleSummary) {
        return mergeFrom((com.hry.spring.grpc.mystream.SimpleSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hry.spring.grpc.mystream.SimpleSummary other) {
      if (other == com.hry.spring.grpc.mystream.SimpleSummary.getDefaultInstance()) return this;
      if (other.getFeatureCount() != 0) {
        setFeatureCount(other.getFeatureCount());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hry.spring.grpc.mystream.SimpleSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hry.spring.grpc.mystream.SimpleSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int featureCount_ ;
    /**
     * <code>optional int32 feature_count = 2;</code>
     */
    public int getFeatureCount() {
      return featureCount_;
    }
    /**
     * <code>optional int32 feature_count = 2;</code>
     */
    public Builder setFeatureCount(int value) {
      
      featureCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 feature_count = 2;</code>
     */
    public Builder clearFeatureCount() {
      
      featureCount_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:SimpleSummary)
  }

  // @@protoc_insertion_point(class_scope:SimpleSummary)
  private static final com.hry.spring.grpc.mystream.SimpleSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hry.spring.grpc.mystream.SimpleSummary();
  }

  public static com.hry.spring.grpc.mystream.SimpleSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleSummary>
      PARSER = new com.google.protobuf.AbstractParser<SimpleSummary>() {
    public SimpleSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SimpleSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleSummary> getParserForType() {
    return PARSER;
  }

  public com.hry.spring.grpc.mystream.SimpleSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

