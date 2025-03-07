// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3HashPtr extends Pointer {
    static { Loader.load(); }

	public b3HashPtr(@Const Pointer ptr) { super((Pointer)null); allocate(ptr); }
	private native void allocate(@Const Pointer ptr);

	public native @Const Pointer getPointer();

	public native @Cast("bool") boolean equals(@Const @ByRef b3HashPtr other);

	//to our success
	public native @Cast("unsigned int") int getHash();
}
