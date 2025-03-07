// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Associates a Tensor and a Device, used in the eager runtime. Internal version
// of the TFE_TensorHandle struct and the python EagerTensor class
// (unrelated to python TensorHandle).
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorHandle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorHandle(Pointer p) { super(p); }

  // TensorHandle with no assigned device
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, @ByPtrPtr TensorHandle h);
  // TensorHandle with device == op_device
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, Device d,
                                    EagerContext ctx, @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, Device d,
                                    EagerContext ctx, @ByPtrPtr TensorHandle h);
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, Device d,
                                    Device op_device, EagerContext ctx,
                                    @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateLocalHandle(@Const @ByRef Tensor t, Device d,
                                    Device op_device, EagerContext ctx,
                                    @ByPtrPtr TensorHandle h);
  public static native @ByVal Status CreateAsyncLocalHandle(Device d, Device op_device,
                                         Device resource_device, @Cast("tensorflow::DataType") int dtype,
                                         EagerContext ctx, @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateAsyncLocalHandle(Device d, Device op_device,
                                         Device resource_device, @Cast("tensorflow::DataType") int dtype,
                                         EagerContext ctx, @ByPtrPtr TensorHandle h);
// #if !defined(IS_MOBILE_PLATFORM)
  public static native @ByVal Status CreateRemoteHandle(@Cast("tensorflow::int64") long op_id, int output_num,
                                     @Const @ByRef TensorShape shape,
                                     EagerClient eager_client,
                                     @Cast("tensorflow::uint64") long context_id, @Cast("tensorflow::DataType") int dtype, Device d,
                                     Device resource_device, EagerContext ctx,
                                     @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateRemoteHandle(@Cast("tensorflow::int64") long op_id, int output_num,
                                     @Const @ByRef TensorShape shape,
                                     EagerClient eager_client,
                                     @Cast("tensorflow::uint64") long context_id, @Cast("tensorflow::DataType") int dtype, Device d,
                                     Device resource_device, EagerContext ctx,
                                     @ByPtrPtr TensorHandle h);
  public static native @ByVal Status CreateRemoteHandle(@MoveUniquePtr RemoteTensorHandleData t,
                                     @Cast("tensorflow::DataType") int dtype, Device d,
                                     Device resource_device, EagerContext ctx,
                                     @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateRemoteHandle(@MoveUniquePtr RemoteTensorHandleData t,
                                     @Cast("tensorflow::DataType") int dtype, Device d,
                                     Device resource_device, EagerContext ctx,
                                     @ByPtrPtr TensorHandle h);
  public static native @ByVal Status CreateUnshapedRemoteHandle(@Cast("tensorflow::int64") long op_id, int output_num,
                                             EagerClient eager_client,
                                             @Cast("tensorflow::uint64") long context_id, @Cast("tensorflow::DataType") int dtype,
                                             Device device, EagerContext ctx,
                                             @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateUnshapedRemoteHandle(@Cast("tensorflow::int64") long op_id, int output_num,
                                             EagerClient eager_client,
                                             @Cast("tensorflow::uint64") long context_id, @Cast("tensorflow::DataType") int dtype,
                                             Device device, EagerContext ctx,
                                             @ByPtrPtr TensorHandle h);
  public static native @ByVal Status CreateUnshapedRemoteHandle(
        @MoveUniquePtr UnshapedRemoteTensorHandleData t, @Cast("tensorflow::DataType") int dtype,
        Device device, EagerContext ctx, @Cast("tensorflow::TensorHandle**") PointerPointer h);
  public static native @ByVal Status CreateUnshapedRemoteHandle(
        @MoveUniquePtr UnshapedRemoteTensorHandleData t, @Cast("tensorflow::DataType") int dtype,
        Device device, EagerContext ctx, @ByPtrPtr TensorHandle h);
// #endif  // IS_MOBILE_PLATFORM

  // Symbolic tensor constructor.
  public TensorHandle(@ByVal OutputGraphNode symbolic_tensor, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(symbolic_tensor, dtype); }
  private native void allocate(@ByVal OutputGraphNode symbolic_tensor, @Cast("tensorflow::DataType") int dtype);

  public native @ByVal Status Tensor(@Cast("const tensorflow::Tensor**") PointerPointer t);
  public native @ByVal Status Tensor(@Const @ByPtrPtr Tensor t);

  public native @ByVal Status TensorValue(TensorValue t);

  public native Device device();
  public native Device op_device();
  public native Device resource_device();

  public native Device DeviceOrHostCPU(EagerContext ctx);

  public native @ByVal Status Shape(TensorShape shape);

  public native @ByVal Status NumDims(IntPointer num_dims);
  public native @ByVal Status NumDims(IntBuffer num_dims);
  public native @ByVal Status NumDims(int... num_dims);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongPointer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") LongBuffer dim);
  public native @ByVal Status Dim(int dim_index, @Cast("tensorflow::int64*") long... dim);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongPointer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") LongBuffer num_elements);
  public native @ByVal Status NumElements(@Cast("tensorflow::int64*") long... num_elements);

// #if !defined(IS_MOBILE_PLATFORM)
  public native @Cast("bool") boolean HasRemoteMirror(Device d);

  public native @ByVal Status AddUnshapedRemoteMirror(
        @MoveUniquePtr UnshapedRemoteTensorHandleData t, Device d);
  public native @ByVal Status AddRemoteMirror(@MoveUniquePtr RemoteTensorHandleData t, Device d);

  // Return the op_id and output num if the handle refers to a remote tensor.
  public native @ByVal Status RemoteAddress(Device d, @Cast("tensorflow::int64*") LongPointer op_id, IntPointer output_num);
  public native @ByVal Status RemoteAddress(Device d, @Cast("tensorflow::int64*") LongBuffer op_id, IntBuffer output_num);
  public native @ByVal Status RemoteAddress(Device d, @Cast("tensorflow::int64*") long[] op_id, int... output_num);

  // Set remote_op_id_ and remote_output_num_ if the handle refers to a local
  // tensor that needs to be copied to remote workers.
  public native void SetRemoteOpIdAndOutputNumToLocalTensorHandle(@Cast("const tensorflow::int64") long op_id,
                                                      int output_num);

  // Called on an async remote tensor once it's shape has been determined. This
  // transitions the tensor handle from a non-ready to a ready state by
  // replacing the backing data abstraction to allow for the shape to be
  // queried.
  // This method or Poison must be called exactly once for remote tensors that
  // were created without a known shape.
  public native @ByVal Status SetRemoteShape(@Const @ByRef TensorShape shape, Device d);
// #endif

  // Sets the `tensor` for this async non-ready handle making it ready.
  // This method or Poison must be called exactly once for non-ready async
  // handles to make them ready.
  public native @ByVal Status SetTensor(@Const @ByRef Tensor tensor);

  // Poisons this non-ready handle with an error `status`.
  // Poisoning means that the handle will become ready and methods trying
  // to access the actual tensor or shape will return this error `status`.
  // Exactly one of SetTensor, SetRemoteShape, or Poison methods must be called
  // on a non-ready tensor.
  public native void Poison(@ByVal Status status);

  public native @ByVal Status CopyToDevice(EagerContext ctx, Device dstd,
                        Tensor output);

  // Warning: can return nullptr for CPU tensors.
  // TODO(b/136608821): Move away from nullptr
  public native EagerContext Context();

  // dtype for the handle. It must be the same as t.dtype() once the handle is
  // ready.
  @MemberGetter public native @Cast("const tensorflow::DataType") int dtype();

  // TODO(b/136608821): Move away from nullptr
  public native @Cast("bool") boolean OnHostCPU();

  public native @Cast("bool") boolean IsRemote();

  public native OutputGraphNode getSymbolicTensor();

  public native @StdString BytePointer DebugString();

  // If this TensorHandle is 1) a local tensor, and 2) a resource handle,
  // return data types and shapes of the underlying resource.
  public native @ByVal Status GetResourceHandleDtypesAndShapes(
        @StdVector DtypeAndPartialTensorShape result);
}
