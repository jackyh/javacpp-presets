// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
* typedef for the callback param for dc1394_capture_set_callback
*/

@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394capture_callback_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    dc1394capture_callback_t(Pointer p) { super(p); }
    protected dc1394capture_callback_t() { allocate(); }
    private native void allocate();
    public native void call(dc1394camera_t arg0, Pointer arg1);
}
