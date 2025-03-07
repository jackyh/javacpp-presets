// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class Aarch64Info extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Aarch64Info() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Aarch64Info(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Aarch64Info(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Aarch64Info position(long position) {
        return (Aarch64Info)super.position(position);
    }
    @Override public Aarch64Info getPointer(long i) {
        return new Aarch64Info((Pointer)this).offsetAddress(i);
    }

  public native @ByRef Aarch64Features features(); public native Aarch64Info features(Aarch64Features setter);
  public native int implementer(); public native Aarch64Info implementer(int setter);
  public native int variant(); public native Aarch64Info variant(int setter);
  public native int part(); public native Aarch64Info part(int setter);
  public native int revision(); public native Aarch64Info revision(int setter);
}
