// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Resampling backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class resampling_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public resampling_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public resampling_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public resampling_backward position(long position) {
        return (resampling_backward)super.position(position);
    }
    @Override public resampling_backward getPointer(long i) {
        return new resampling_backward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for a resampling backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        public native @ByRef dnnl_resampling_desc_t data(); public native desc data(dnnl_resampling_desc_t setter);

        /** Constructs a descriptor for a resampling backward propagation
         *  primitive using source and destination memory descriptors.
         * 
         *  @param aalgorithm resampling algorithm kind: either
         *      #dnnl::algorithm::resampling_nearest, or
         *      #dnnl::algorithm::resampling_linear
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor. */
        
        ///
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, diff_src_desc, diff_dst_desc); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, diff_src_desc, diff_dst_desc); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);

        /** Constructs a descriptor for resampling backward propagation
         *  primitive.
         * 
         *  @param aalgorithm resampling algorithm kind: either
         *      #dnnl::algorithm::resampling_nearest, or
         *      #dnnl::algorithm::resampling_linear
         *  @param factors Vector of scaling factors for spatial dimension.
         *  @param diff_src_desc Diff source memory descriptor.
         *  @param diff_dst_desc Diff destination memory descriptor. */
        public desc(algorithm aalgorithm, @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(algorithm aalgorithm, @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(algorithm aalgorithm, @StdVector float[] factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(algorithm aalgorithm, @StdVector float[] factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @StdVector FloatPointer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(algorithm aalgorithm, @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(algorithm aalgorithm, @StdVector FloatBuffer factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @StdVector float[] factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(aalgorithm, factors, diff_src_desc, diff_dst_desc); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @StdVector float[] factors,
                        @Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    /** Primitive descriptor for resampling backward propagation primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a resampling backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a resampling backward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a resampling forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a resampling backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a resampling backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for a resampling forward
         *      propagation primitive. It is used as a hint for deciding which
         *      memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef resampling_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for a resampling backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a resampling backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public resampling_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a resampling backward propagation primitive.
     *  @param pd Primitive descriptor for a resampling backward propagation
     *      primitive. */
    public resampling_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs a resampling backward propagation primitive from a cache
     *      blob.
     *  @param pd Primitive descriptor for a resampling backward propagation
     *      primitive.
     *  @param cache_blob Cache blob. */
    public resampling_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public resampling_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public resampling_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
