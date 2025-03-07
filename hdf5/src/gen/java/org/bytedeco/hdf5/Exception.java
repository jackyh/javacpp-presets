// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class Exception
    \brief Exception provides wrappers of HDF5 error handling functions.
    <p>
    Many classes are derived from Exception for specific HDF5 C interfaces.
*/
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class Exception extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Exception(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Exception(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Exception position(long position) {
        return (Exception)super.position(position);
    }
    @Override public Exception getPointer(long i) {
        return new Exception((Pointer)this).offsetAddress(i);
    }

    // Creates an exception with a function name where the failure occurs
    // and an optional detailed message
    public Exception(@StdString BytePointer func_name, @StdString BytePointer message/*=DEFAULT_MSG*/) { super((Pointer)null); allocate(func_name, message); }
    private native void allocate(@StdString BytePointer func_name, @StdString BytePointer message/*=DEFAULT_MSG*/);
    public Exception(@StdString BytePointer func_name) { super((Pointer)null); allocate(func_name); }
    private native void allocate(@StdString BytePointer func_name);
    public Exception(@StdString String func_name, @StdString String message/*=DEFAULT_MSG*/) { super((Pointer)null); allocate(func_name, message); }
    private native void allocate(@StdString String func_name, @StdString String message/*=DEFAULT_MSG*/);
    public Exception(@StdString String func_name) { super((Pointer)null); allocate(func_name); }
    private native void allocate(@StdString String func_name);

    // Returns a character string that describes the error specified by
    // a major error number.
    public native @StdString BytePointer getMajorString(@Cast("hid_t") long err_major_id);

    // Returns a character string that describes the error specified by
    // a minor error number.
    public native @StdString BytePointer getMinorString(@Cast("hid_t") long err_minor_id);

    // Returns the detailed message set at the time the exception is thrown
    public native @StdString BytePointer getDetailMsg();
    public native @Cast("const char*") BytePointer getCDetailMsg(); // C string of detailed message
    public native @StdString BytePointer getFuncName();   // function name as a string object
    public native @Cast("const char*") BytePointer getCFuncName();  // function name as a char string

    // Turns on the automatic error printing.
    public static native void setAutoPrint(@ByPtrRef H5E_auto2_t func, Pointer client_data);

    // Turns off the automatic error printing.
    public static native void dontPrint();

    // Retrieves the current settings for the automatic error stack
    // traversal function and its data.
    public static native void getAutoPrint(@ByPtrRef H5E_auto2_t func, @Cast("void**") PointerPointer client_data);
    public static native void getAutoPrint(@ByPtrRef H5E_auto2_t func, @Cast("void**") @ByPtrPtr Pointer client_data);

    // Clears the error stack for the current thread.
    public static native void clearErrorStack();

    // Walks the error stack for the current thread, calling the
    // specified function.
    public static native void walkErrorStack(@Cast("H5E_direction_t") int direction, H5E_walk2_t func, Pointer client_data);

    // Prints the error stack in a default manner.
    public static native void printErrorStack(@Cast("FILE*") Pointer stream/*=stderr*/, @Cast("hid_t") long err_stack/*=H5E_DEFAULT*/);
    public static native void printErrorStack();
    // Deprecated in favor of printErrorStack.
    // Removed from code. -BMR, 2017/08/11 1.8.20 and 1.10.2
    // virtual void printError(FILE* stream = NULL) const;

    // Default constructor
    public Exception() { super((Pointer)null); allocate(); }
    private native void allocate();

    // copy constructor
    public Exception(@Const @ByRef Exception orig) { super((Pointer)null); allocate(orig); }
    private native void allocate(@Const @ByRef Exception orig);

    // virtual Destructor
}
