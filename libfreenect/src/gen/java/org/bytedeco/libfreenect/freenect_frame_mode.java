// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect.global.freenect.*;


/** Structure to give information about the width, height, bitrate,
 *  framerate, and buffer size of a frame in a particular mode, as
 *  well as the total number of bytes needed to hold a single frame. */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_frame_mode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_frame_mode() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_frame_mode(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_frame_mode(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_frame_mode position(long position) {
        return (freenect_frame_mode)super.position(position);
    }
    @Override public freenect_frame_mode getPointer(long i) {
        return new freenect_frame_mode((Pointer)this).offsetAddress(i);
    }

	/** unique ID used internally.  The meaning of values may change without notice.  Don't touch or depend on the contents of this field.  We mean it. */
	public native @Cast("uint32_t") int reserved(); public native freenect_frame_mode reserved(int setter);
	/** Resolution this freenect_frame_mode describes, should you want to find it again with freenect_find_*_frame_mode(). */
	public native @Cast("freenect_resolution") int resolution(); public native freenect_frame_mode resolution(int setter);
		public native int dummy(); public native freenect_frame_mode dummy(int setter);
		public native @Cast("freenect_video_format") int video_format(); public native freenect_frame_mode video_format(int setter);
		public native @Cast("freenect_depth_format") int depth_format(); public native freenect_frame_mode depth_format(int setter);
	/** Total buffer size in bytes to hold a single frame of data.  Should be equivalent to width * height * (data_bits_per_pixel+padding_bits_per_pixel) / 8 */
	public native int bytes(); public native freenect_frame_mode bytes(int setter);
	/** Width of the frame, in pixels */
	public native short width(); public native freenect_frame_mode width(short setter);
	/** Height of the frame, in pixels */
	public native short height(); public native freenect_frame_mode height(short setter);
	/** Number of bits of information needed for each pixel */
	public native byte data_bits_per_pixel(); public native freenect_frame_mode data_bits_per_pixel(byte setter);
	/** Number of bits of padding for alignment used for each pixel */
	public native byte padding_bits_per_pixel(); public native freenect_frame_mode padding_bits_per_pixel(byte setter);
	/** Approximate expected frame rate, in Hz */
	public native byte framerate(); public native freenect_frame_mode framerate(byte setter);
	/** If 0, this freenect_frame_mode is invalid and does not describe a supported mode.  Otherwise, the frame_mode is valid. */
	public native byte is_valid(); public native freenect_frame_mode is_valid(byte setter);
}
