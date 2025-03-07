// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;


/** \class PredType
    \brief Class PredType holds the definition of all the HDF5 predefined
    datatypes.
    <p>
    These types can only be made copy of, not created by H5Tcreate or
    closed by H5Tclose.  They are treated as constants.
*/
//  Inheritance: AtomType -> DataType -> H5Object -> H5Location -> IdComponent
@Namespace("H5") @NoOffset @Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class PredType extends AtomType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PredType(Pointer p) { super(p); }

    /**\brief Returns this class name. */
    public native @StdString BytePointer fromClass();

    // Makes a copy of the predefined type and stores the new
    // id in the left hand side object.
    public native @ByRef @Name("operator =") PredType put(@Const @ByRef PredType rhs);

    // Copy constructor: same as the original PredType.
    public PredType(@Const @ByRef PredType original) { super((Pointer)null); allocate(original); }
    private native void allocate(@Const @ByRef PredType original);

    // Noop destructor

    /** \brief This dummy function do not inherit from DataType - it will
        throw a DataTypeIException if invoked.
    */
    public native void commit(@ByRef H5Location loc, @StdString BytePointer name);
    public native void commit(@ByRef H5Location loc, @StdString String name);
    /** \brief This dummy function do not inherit from DataType - it will
        throw a DataTypeIException if invoked.
    */
    /** \brief This dummy function do not inherit from DataType - it will
        throw a DataTypeIException if invoked.
    */
    public native @Cast("bool") boolean committed();

    /**\brief PredType constants */
    @MemberGetter public static native @Const @ByRef PredType STD_I8BE();
    @MemberGetter public static native @Const @ByRef PredType STD_I8LE();
    @MemberGetter public static native @Const @ByRef PredType STD_I16BE();
    @MemberGetter public static native @Const @ByRef PredType STD_I16LE();
    @MemberGetter public static native @Const @ByRef PredType STD_I32BE();
    @MemberGetter public static native @Const @ByRef PredType STD_I32LE();
    @MemberGetter public static native @Const @ByRef PredType STD_I64BE();
    @MemberGetter public static native @Const @ByRef PredType STD_I64LE();
    @MemberGetter public static native @Const @ByRef PredType STD_U8BE();
    @MemberGetter public static native @Const @ByRef PredType STD_U8LE();
    @MemberGetter public static native @Const @ByRef PredType STD_U16BE();
    @MemberGetter public static native @Const @ByRef PredType STD_U16LE();
    @MemberGetter public static native @Const @ByRef PredType STD_U32BE();
    @MemberGetter public static native @Const @ByRef PredType STD_U32LE();
    @MemberGetter public static native @Const @ByRef PredType STD_U64BE();
    @MemberGetter public static native @Const @ByRef PredType STD_U64LE();
    @MemberGetter public static native @Const @ByRef PredType STD_B8BE();
    @MemberGetter public static native @Const @ByRef PredType STD_B8LE();
    @MemberGetter public static native @Const @ByRef PredType STD_B16BE();
    @MemberGetter public static native @Const @ByRef PredType STD_B16LE();
    @MemberGetter public static native @Const @ByRef PredType STD_B32BE();
    @MemberGetter public static native @Const @ByRef PredType STD_B32LE();
    @MemberGetter public static native @Const @ByRef PredType STD_B64BE();
    @MemberGetter public static native @Const @ByRef PredType STD_B64LE();
    @MemberGetter public static native @Const @ByRef PredType STD_REF_OBJ();
    @MemberGetter public static native @Const @ByRef PredType STD_REF_DSETREG();

    @MemberGetter public static native @Const @ByRef PredType C_S1();
    @MemberGetter public static native @Const @ByRef PredType FORTRAN_S1();

    @MemberGetter public static native @Const @ByRef PredType IEEE_F32BE();
    @MemberGetter public static native @Const @ByRef PredType IEEE_F32LE();
    @MemberGetter public static native @Const @ByRef PredType IEEE_F64BE();
    @MemberGetter public static native @Const @ByRef PredType IEEE_F64LE();

    @MemberGetter public static native @Const @ByRef PredType UNIX_D32BE();
    @MemberGetter public static native @Const @ByRef PredType UNIX_D32LE();
    @MemberGetter public static native @Const @ByRef PredType UNIX_D64BE();
    @MemberGetter public static native @Const @ByRef PredType UNIX_D64LE();

    @MemberGetter public static native @Const @ByRef PredType INTEL_I8();
    @MemberGetter public static native @Const @ByRef PredType INTEL_I16();
    @MemberGetter public static native @Const @ByRef PredType INTEL_I32();
    @MemberGetter public static native @Const @ByRef PredType INTEL_I64();
    @MemberGetter public static native @Const @ByRef PredType INTEL_U8();
    @MemberGetter public static native @Const @ByRef PredType INTEL_U16();
    @MemberGetter public static native @Const @ByRef PredType INTEL_U32();
    @MemberGetter public static native @Const @ByRef PredType INTEL_U64();
    @MemberGetter public static native @Const @ByRef PredType INTEL_B8();
    @MemberGetter public static native @Const @ByRef PredType INTEL_B16();
    @MemberGetter public static native @Const @ByRef PredType INTEL_B32();
    @MemberGetter public static native @Const @ByRef PredType INTEL_B64();
    @MemberGetter public static native @Const @ByRef PredType INTEL_F32();
    @MemberGetter public static native @Const @ByRef PredType INTEL_F64();

    @MemberGetter public static native @Const @ByRef PredType ALPHA_I8();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_I16();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_I32();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_I64();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_U8();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_U16();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_U32();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_U64();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_B8();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_B16();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_B32();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_B64();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_F32();
    @MemberGetter public static native @Const @ByRef PredType ALPHA_F64();

    @MemberGetter public static native @Const @ByRef PredType MIPS_I8();
    @MemberGetter public static native @Const @ByRef PredType MIPS_I16();
    @MemberGetter public static native @Const @ByRef PredType MIPS_I32();
    @MemberGetter public static native @Const @ByRef PredType MIPS_I64();
    @MemberGetter public static native @Const @ByRef PredType MIPS_U8();
    @MemberGetter public static native @Const @ByRef PredType MIPS_U16();
    @MemberGetter public static native @Const @ByRef PredType MIPS_U32();
    @MemberGetter public static native @Const @ByRef PredType MIPS_U64();
    @MemberGetter public static native @Const @ByRef PredType MIPS_B8();
    @MemberGetter public static native @Const @ByRef PredType MIPS_B16();
    @MemberGetter public static native @Const @ByRef PredType MIPS_B32();
    @MemberGetter public static native @Const @ByRef PredType MIPS_B64();
    @MemberGetter public static native @Const @ByRef PredType MIPS_F32();
    @MemberGetter public static native @Const @ByRef PredType MIPS_F64();

    @MemberGetter public static native @Const @ByRef PredType NATIVE_CHAR();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_SCHAR();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UCHAR();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_SHORT();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_USHORT();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_LONG();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_ULONG();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_LLONG();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_ULLONG();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_FLOAT();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_DOUBLE();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_LDOUBLE();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_B8();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_B16();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_B32();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_B64();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_OPAQUE();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_HSIZE();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_HSSIZE();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_HERR();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_HBOOL();

    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT8();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT8();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT16();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT16();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT32();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT32();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT64();
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT64();

// LEAST types
// #if H5_SIZEOF_INT_LEAST8_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_LEAST8();
// #endif /* H5_SIZEOF_INT_LEAST8_T */
// #if H5_SIZEOF_UINT_LEAST8_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_LEAST8();
// #endif /* H5_SIZEOF_UINT_LEAST8_T */

// #if H5_SIZEOF_INT_LEAST16_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_LEAST16();
// #endif /* H5_SIZEOF_INT_LEAST16_T */
// #if H5_SIZEOF_UINT_LEAST16_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_LEAST16();
// #endif /* H5_SIZEOF_UINT_LEAST16_T */

// #if H5_SIZEOF_INT_LEAST32_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_LEAST32();
// #endif /* H5_SIZEOF_INT_LEAST32_T */
// #if H5_SIZEOF_UINT_LEAST32_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_LEAST32();
// #endif /* H5_SIZEOF_UINT_LEAST32_T */

// #if H5_SIZEOF_INT_LEAST64_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_LEAST64();
// #endif /* H5_SIZEOF_INT_LEAST64_T */
// #if H5_SIZEOF_UINT_LEAST64_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_LEAST64();
// #endif /* H5_SIZEOF_UINT_LEAST64_T */

// FAST types
// #if H5_SIZEOF_INT_FAST8_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_FAST8();
// #endif /* H5_SIZEOF_INT_FAST8_T */
// #if H5_SIZEOF_UINT_FAST8_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_FAST8();
// #endif /* H5_SIZEOF_UINT_FAST8_T */

// #if H5_SIZEOF_INT_FAST16_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_FAST16();
// #endif /* H5_SIZEOF_INT_FAST16_T */
// #if H5_SIZEOF_UINT_FAST16_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_FAST16();
// #endif /* H5_SIZEOF_UINT_FAST16_T */

// #if H5_SIZEOF_INT_FAST32_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_FAST32();
// #endif /* H5_SIZEOF_INT_FAST32_T */
// #if H5_SIZEOF_UINT_FAST32_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_FAST32();
// #endif /* H5_SIZEOF_UINT_FAST32_T */

// #if H5_SIZEOF_INT_FAST64_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_INT_FAST64();
// #endif /* H5_SIZEOF_INT_FAST64_T */
// #if H5_SIZEOF_UINT_FAST64_T != 0
    @MemberGetter public static native @Const @ByRef PredType NATIVE_UINT_FAST64();
// #endif /* H5_SIZEOF_UINT_FAST64_T */

// #ifndef DOXYGEN_SHOULD_SKIP_THIS

    // Deletes the PredType global constants
    public static native void deleteConstants();

    // Dummy constant
    @MemberGetter public static native @Const @ByRef PredType PREDTYPE_CONST();

}
