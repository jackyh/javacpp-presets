// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


/*
 * @name    ModSecLogCb
 * @brief   Callback to be function on every log generation
 *
 *
 * The callback is going to be called on every log request.
 *
 *
 * void *   Internal reference to be used by the API consumer. Whatever
 *          is set here will be passed on every call.
 * void *   Pointer to a const char * or RuleMessage class. The returned
 *          data is selected on the log register property.
 *
 * @note    Vide LogProperty enum to learn more about Log Properties.
 *
 */
@Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class ModSecLogCb extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ModSecLogCb(Pointer p) { super(p); }
    protected ModSecLogCb() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, @Const Pointer arg1);
}
