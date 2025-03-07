// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


/** \brief Video stream intrinsics */
@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_intrinsics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs_intrinsics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs_intrinsics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_intrinsics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs_intrinsics position(long position) {
        return (rs_intrinsics)super.position(position);
    }
    @Override public rs_intrinsics getPointer(long i) {
        return new rs_intrinsics((Pointer)this).offsetAddress(i);
    }

    /** Width of the image in pixels */
    public native int width(); public native rs_intrinsics width(int setter);
    /** Height of the image in pixels */
    public native int height(); public native rs_intrinsics height(int setter);
    /** Horizontal coordinate of the principal point of the image, as a pixel offset from the left edge */
    public native float ppx(); public native rs_intrinsics ppx(float setter);
    /** Vertical coordinate of the principal point of the image, as a pixel offset from the top edge */
    public native float ppy(); public native rs_intrinsics ppy(float setter);
    /** Focal length of the image plane, as a multiple of pixel width */
    public native float fx(); public native rs_intrinsics fx(float setter);
    /** Focal length of the image plane, as a multiple of pixel height */
    public native float fy(); public native rs_intrinsics fy(float setter);
    /** Distortion model of the image */
    public native @Cast("rs_distortion") int model(); public native rs_intrinsics model(int setter);
    /** Distortion coefficients */
    public native float coeffs(int i); public native rs_intrinsics coeffs(int i, float setter);
    @MemberGetter public native FloatPointer coeffs();
}
