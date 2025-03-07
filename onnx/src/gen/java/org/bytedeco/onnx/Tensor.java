// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Tensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Tensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Tensor position(long position) {
        return (Tensor)super.position(position);
    }
    @Override public Tensor getPointer(long i) {
        return new Tensor((Pointer)this).offsetAddress(i);
    }

  public Tensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  public Tensor(@Const @ByRef Tensor other) { super((Pointer)null); allocate(other); }
  private native void allocate(@Const @ByRef Tensor other);

  

  public native @ByRef @Name("operator =") @NoException(true) Tensor put(@ByVal Tensor other);
  public native @ByRef LongVector sizes();

  public native @Cast("int64_t") int size_from_dim(int dim);

  public native @Cast("int32_t*") @ByRef IntPointer elem_type();

  public native @ByRef StringVector strings();

  public native @ByRef FloatVector floats();

  public native @StdVector DoublePointer doubles();

  public native @Cast("int32_t*") @StdVector IntPointer int32s();

  public native @ByRef LongVector int64s();

  public native @Cast("uint64_t*") @StdVector IntPointer uint64s();

  public native @StdString BytePointer raw();

  public native void set_raw_data(@StdString BytePointer raw_data);
  public native void set_raw_data(@StdString String raw_data);

  public native @Cast("bool") boolean is_segment();

  public native @Cast("int64_t") int segment_begin();

  public native @Cast("int64_t") int segment_end();

  public native void set_segment_begin_and_end(@Cast("int64_t") int begin, @Cast("int64_t") int end);

  public native @Cast("bool") boolean hasName();

  public native @StdString BytePointer name();

  public native void setName(@StdString BytePointer name);
  public native void setName(@StdString String name);

  public native @Cast("bool") boolean is_raw_data();

  //this += a
  //Supported for
  //FLOAT, BOOL, INT8, INT16, INT32, UINT8, UINT16, INT64,
  //UINT32, UINT64, DOUBLE,
  //TODO: Support for FLOAT16, COMPLEX64, COMPLEX128
  public native void add(@Const @ByRef Tensor a);

  //this -= a
  //Supported for
  //FLOAT, BOOL, INT8, INT16, INT32, UINT8, UINT16, INT64,
  //UINT32, UINT64, DOUBLE
  //TODO: Support for FLOAT16, COMPLEX64, COMPLEX128
  public native void subtract(@Const @ByRef Tensor a);

  //this *= a
  //Supported for
  //FLOAT, BOOL, INT8, INT16, INT32, UINT8, UINT16, INT64,
  //UINT32, UINT64, DOUBLE
  //TODO: Support for FLOAT16, COMPLEX64, COMPLEX128
  public native void multiply(@Const @ByRef Tensor a);

  //this /= a
  //Supported for
  //FLOAT, INT8, INT16, INT32, UINT8, UINT16, INT64,
  //UINT32, UINT64, DOUBLE
  //TODO: Support for FLOAT16, COMPLEX64, COMPLEX128
  public native void divide(@Const @ByRef Tensor a);

  //Element-wise square root of This
  //Supported for
  //FLOAT, DOUBLE,
  //TODO: Support for FLOAT16
  public native void sqrt();

  //Element wise scaling of tensor s
  //s is one dimensional, has size M, where M is size of first dimension of tensor
  //s must have has data type corresponding to this
  //Supported for
  //FLOAT16, FLOAT, DOUBLE
  public native void scale_by_first_dim(@Const @ByRef Tensor s);
}
