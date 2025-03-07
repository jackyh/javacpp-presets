// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * Rect structure
 *
 * x,y coordinates together with width and height that define a rectangle.
 * Can be either normalized [0,1] or absolute representation.
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Rect extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Rect(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Rect position(long position) {
        return (Rect)super.position(position);
    }
    @Override public Rect getPointer(long i) {
        return new Rect((Pointer)this).offsetAddress(i);
    }

    // default constructor
    public Rect() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect(float x, float y, float width, float height) { super((Pointer)null); allocate(x, y, width, height); }
    private native void allocate(float x, float y, float width, float height);

    public Rect(@Const @ByRef Rect r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect r);
    public Rect(@Const @ByRef Point2f org, @Const @ByRef Size2f sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2f org, @Const @ByRef Size2f sz);
    public Rect(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2);

    public native @ByRef @Name("operator =") Rect put(@Const @ByRef Rect r);

    /**
     * The top-left corner.
     */
    public native @ByVal Point2f topLeft();

    /**
     * The bottom-right corner
     */
    public native @ByVal Point2f bottomRight();

    /**
     * Size (width, height) of the rectangle
     */
    public native @ByVal Size2f size();

    /**
     * Area (width*height) of the rectangle
     */
    public native float area();

    /**
     * True if rectangle is empty.
     */
    public native @Cast("bool") boolean empty();

    /**
     * Checks whether the rectangle contains the point.
     */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2f pt);

    /**
     * Whether rectangle is normalized (coordinates in [0,1] range) or not.
     */
    public native @Cast("bool") boolean isNormalized();

    /**
     * Denormalize rectangle.
     * @param width Destination frame width.
     * @param height Destination frame height.
     */
    public native @ByVal Rect denormalize(int width, int height);

    /**
     * Normalize rectangle.
     * @param width Source frame width.
     * @param height Source frame height.
     */
    public native @ByVal Rect normalize(int width, int height);

    public native float x(); public native Rect x(float setter);       // x coordinate of the top-left corner
    public native float y(); public native Rect y(float setter);       // y coordinate of the top-left corner
    public native float width(); public native Rect width(float setter);   // width of the rectangle
    public native float height(); public native Rect height(float setter);  // height of the rectangle
}
