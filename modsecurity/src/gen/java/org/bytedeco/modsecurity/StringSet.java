// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;

@Name("std::set<std::string>") @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class StringSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSet(Pointer p) { super(p); }
    public StringSet()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringSet put(@ByRef StringSet x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public native void insert(@StdString BytePointer value);
    public native void erase(@StdString BytePointer value);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdString BytePointer get();
    }
}

