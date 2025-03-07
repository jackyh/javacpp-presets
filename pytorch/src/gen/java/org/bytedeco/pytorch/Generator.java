// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * Note [Generator]
 * ~~~~~~~~~~~~~~~~
 * A Pseudo Random Number Generator (PRNG) is an engine that uses an algorithm to
 * generate a seemingly random sequence of numbers, that may be later be used in creating
 * a random distribution. Such an engine almost always maintains a state and requires a
 * seed to start off the creation of random numbers. Often times, users have
 * found it beneficial to be able to explicitly create, retain, and destroy
 * PRNG states and also be able to have control over the seed value.
 *
 * A Generator in ATen gives users the ability to read, write and modify a PRNG engine.
 * For instance, it does so by letting users seed a PRNG engine, fork the state of the
 * engine, etc.
 *
 * By default, there is one generator per device, and a device's generator is
 * lazily created. A user can use the torch.Generator() api to create their own generator.
 */

/**
 * Note [Acquire lock when using random generators]
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Generator and its derived classes are NOT thread-safe. Please note that most of the
 * places where we have inserted locking for generators are historically based, and we
 * haven't actually checked that everything is truly thread safe (and it probably isn't).
 * Please use the public mutex_ when using any methods from these classes, except for the
 * read-only methods. You can learn about the usage by looking into the unittests
 * (aten/src/ATen/cpu_generator_test.cpp) and other places where we have used lock_guard.
 *
 * TODO: Look into changing the threading semantics of Generators in ATen (e.g., making
 * them non-thread safe and instead making the generator state splittable, to accommodate
 * forks into other threads).
 */

@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Generator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Generator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Generator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Generator position(long position) {
        return (Generator)super.position(position);
    }
    @Override public Generator getPointer(long i) {
        return new Generator((Pointer)this).offsetAddress(i);
    }

  public Generator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Generator rhs);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef Generator rhs);

  public native @Cast("bool") boolean defined();

  public native @Cast("c10::GeneratorImpl*") Pointer unsafeGetGeneratorImpl();

  public native @Cast("c10::GeneratorImpl*") Pointer unsafeReleaseGeneratorImpl();

  public native void set_current_seed(@Cast("uint64_t") long seed);

  public native @Cast("uint64_t") long current_seed();

  public native @Cast("uint64_t") long seed();

  // Implementation not inlined to prevent cycle reference between
  // `ATen/core/Generator.h` and `ATen/core/Tensor.h`
  public native void set_state(@Const @ByRef Tensor new_state);

  public native @ByVal Tensor get_state();

  public native @ByVal DispatchKeySet key_set();

  public native @ByVal Device device();

  public native @NoException(true) void set_pyobj(@Cast("PyObject*") Pointer pyobj);

  public native @Cast("PyObject*") @NoException(true) Pointer pyobj();

  public native @ByVal Generator clone();
}
