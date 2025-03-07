// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ale.global.ale.*;

@Namespace("ale::stella") @Opaque @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class MediaSource extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public MediaSource() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MediaSource(Pointer p) { super(p); }
}
