// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedFunction extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedFunction(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedFunction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedFunction position(long position) {
        return (SavedFunction)super.position(position);
    }
    @Override public SavedFunction getPointer(long i) {
        return new SavedFunction((Pointer)this).offsetAddress(i);
    }

  public SavedFunction() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedFunction(@Const @ByRef SavedFunction from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedFunction from);

  public native @ByRef @Name("operator =") SavedFunction put(@Const @ByRef SavedFunction from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SavedFunction default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedFunction internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedFunction other);
  public native void Swap(SavedFunction other);
  

  // implements Message ----------------------------------------------

  public native SavedFunction New();

  public native SavedFunction New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedFunction from);
  public native void MergeFrom(@Const @ByRef SavedFunction from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated string concrete_functions = 1;
  public native int concrete_functions_size();
  public native void clear_concrete_functions();
  @MemberGetter public static native int kConcreteFunctionsFieldNumber();
  public static final int kConcreteFunctionsFieldNumber = kConcreteFunctionsFieldNumber();
  public native @StdString BytePointer concrete_functions(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_concrete_functions(int index);
  public native void set_concrete_functions(int index, @StdString BytePointer value);
  public native void set_concrete_functions(int index, @StdString String value);
  public native void set_concrete_functions(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_concrete_functions(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_concrete_functions();
  public native void add_concrete_functions(@StdString BytePointer value);
  public native void add_concrete_functions(@StdString String value);
  public native void add_concrete_functions(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_concrete_functions(String value, @Cast("size_t") long size);

  // .tensorflow.FunctionSpec function_spec = 2;
  public native @Cast("bool") boolean has_function_spec();
  public native void clear_function_spec();
  @MemberGetter public static native int kFunctionSpecFieldNumber();
  public static final int kFunctionSpecFieldNumber = kFunctionSpecFieldNumber();
  public native @Const @ByRef FunctionSpec function_spec();
  public native FunctionSpec release_function_spec();
  public native FunctionSpec mutable_function_spec();
  public native void set_allocated_function_spec(FunctionSpec function_spec);
  public native void unsafe_arena_set_allocated_function_spec(
        FunctionSpec function_spec);
  public native FunctionSpec unsafe_arena_release_function_spec();
}
