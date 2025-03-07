// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3OpenCL;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;
import org.bytedeco.bullet.Bullet3Dynamics.*;
import static org.bytedeco.bullet.global.Bullet3Dynamics.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.Bullet3OpenCL.*;

@Name("b3AlignedObjectArray<b3Contact4>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3OpenCL.class)
public class b3Contact4Array extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Contact4Array(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Contact4Array(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3Contact4Array position(long position) {
        return (b3Contact4Array)super.position(position);
    }
    @Override public b3Contact4Array getPointer(long i) {
        return new b3Contact4Array((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") b3Contact4Array put(@Const @ByRef b3Contact4Array other);
	public b3Contact4Array() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an b3AlignedObjectArray, and use a (const) reference to the array instead. */
	public b3Contact4Array(@Const @ByRef b3Contact4Array otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef b3Contact4Array otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByRef b3Contact4 at(int n);

	public native @ByRef @Name("operator []") b3Contact4 get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @Const @ByRef(nullValue = "b3Contact4()") b3Contact4 fillData);
	public native void resize(int newsize);
	public native @ByRef b3Contact4 expandNonInitializing();

	public native @ByRef b3Contact4 expand(@Const @ByRef(nullValue = "b3Contact4()") b3Contact4 fillValue);
	public native @ByRef b3Contact4 expand();

	public native void push_back(@Const @ByRef b3Contact4 _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	

	

	

	

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef b3Contact4Array otherArray);

	public native void removeAtIndex(int index);
}
