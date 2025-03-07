// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the euclidean norm of elements across dimensions of a tensor.
 * 
 *  Reduces {@code input} along the dimensions given in {@code axis}. Unless
 *  {@code keep_dims} is true, the rank of the tensor is reduced by 1 for each entry in
 *  {@code axis}. If {@code keep_dims} is true, the reduced dimensions are
 *  retained with length 1.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The tensor to reduce.
 *  * axis: The dimensions to reduce. Must be in the range
 *  {@code [-rank(input), rank(input))}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * keep_dims: If true, retain reduced dimensions with length 1.
 * 
 *  Returns:
 *  * {@code Output}: The reduced tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EuclideanNorm extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EuclideanNorm(Pointer p) { super(p); }

  /** Optional attribute setters for EuclideanNorm */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** If true, retain reduced dimensions with length 1.
     * 
     *  Defaults to false */
    public native @ByVal Attrs KeepDims(@Cast("bool") boolean x);

    public native @Cast("bool") boolean keep_dims_(); public native Attrs keep_dims_(boolean setter);
  }
  public EuclideanNorm(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input axis) { super((Pointer)null); allocate(scope, input, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input axis);
  public EuclideanNorm(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input axis, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, axis, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                @ByVal Input axis, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs KeepDims(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native EuclideanNorm operation(Operation setter);
  public native @ByRef Output output(); public native EuclideanNorm output(Output setter);
}
