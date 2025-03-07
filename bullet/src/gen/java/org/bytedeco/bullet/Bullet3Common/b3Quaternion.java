// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Common;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.Bullet3Common.*;


// #ifdef B3_USE_SSE

// #endif

// #if defined(B3_USE_SSE) || defined(B3_USE_NEON)

// #endif

/**\brief The b3Quaternion implements quaternion to perform linear algebra rotations in combination with b3Matrix3x3, b3Vector3 and b3Transform. */
@Properties(inherit = org.bytedeco.bullet.presets.Bullet3Common.class)
public class b3Quaternion extends b3QuadWord {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3Quaternion(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3Quaternion(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3Quaternion position(long position) {
        return (b3Quaternion)super.position(position);
    }
    @Override public b3Quaternion getPointer(long i) {
        return new b3Quaternion((Pointer)this).offsetAddress(i);
    }

	/**\brief No initialization constructor */
	public b3Quaternion() { super((Pointer)null); allocate(); }
	private native void allocate();

// #if (defined(B3_USE_SSE_IN_API) && defined(B3_USE_SSE)) || defined(B3_USE_NEON)

// #endif

	//		template <typename b3Scalar>
	//		explicit Quaternion(const b3Scalar *v) : Tuple4<b3Scalar>(v) {}
	/**\brief Constructor from scalars */
	public b3Quaternion(@Cast("const b3Scalar") float _x, @Cast("const b3Scalar") float _y, @Cast("const b3Scalar") float _z, @Cast("const b3Scalar") float _w) { super((Pointer)null); allocate(_x, _y, _z, _w); }
	private native void allocate(@Cast("const b3Scalar") float _x, @Cast("const b3Scalar") float _y, @Cast("const b3Scalar") float _z, @Cast("const b3Scalar") float _w);
	/**\brief Axis angle Constructor
   * @param axis The axis which the rotation is around
   * @param angle The magnitude of the rotation around the angle (Radians) */
	public b3Quaternion(@Const @ByRef b3Vector3 _axis, @Cast("const b3Scalar") float _angle) { super((Pointer)null); allocate(_axis, _angle); }
	private native void allocate(@Const @ByRef b3Vector3 _axis, @Cast("const b3Scalar") float _angle);
	/**\brief Constructor from Euler angles
   * @param yaw Angle around Y unless B3_EULER_DEFAULT_ZYX defined then Z
   * @param pitch Angle around X unless B3_EULER_DEFAULT_ZYX defined then Y
   * @param roll Angle around Z unless B3_EULER_DEFAULT_ZYX defined then X */
	public b3Quaternion(@Cast("const b3Scalar") float yaw, @Cast("const b3Scalar") float pitch, @Cast("const b3Scalar") float roll) { super((Pointer)null); allocate(yaw, pitch, roll); }
	private native void allocate(@Cast("const b3Scalar") float yaw, @Cast("const b3Scalar") float pitch, @Cast("const b3Scalar") float roll);
	/**\brief Set the rotation using axis angle notation 
   * @param axis The axis around which to rotate
   * @param angle The magnitude of the rotation in Radians */
	public native void setRotation(@Const @ByRef b3Vector3 axis1, @Cast("const b3Scalar") float _angle);
	/**\brief Set the quaternion using Euler angles
   * @param yaw Angle around Y
   * @param pitch Angle around X
   * @param roll Angle around Z */
	public native void setEuler(@Cast("const b3Scalar") float yaw, @Cast("const b3Scalar") float pitch, @Cast("const b3Scalar") float roll);

	/**\brief Set the quaternion using euler angles 
   * @param yaw Angle around Z
   * @param pitch Angle around Y
   * @param roll Angle around X */
	public native void setEulerZYX(@Cast("const b3Scalar") float yawZ, @Cast("const b3Scalar") float pitchY, @Cast("const b3Scalar") float rollX);

	/**\brief Get the euler angles from this quaternion
	   * @param yaw Angle around Z
	   * @param pitch Angle around Y
	   * @param roll Angle around X */
	public native void getEulerZYX(@Cast("b3Scalar*") @ByRef FloatPointer yawZ, @Cast("b3Scalar*") @ByRef FloatPointer pitchY, @Cast("b3Scalar*") @ByRef FloatPointer rollX);
	public native void getEulerZYX(@Cast("b3Scalar*") @ByRef FloatBuffer yawZ, @Cast("b3Scalar*") @ByRef FloatBuffer pitchY, @Cast("b3Scalar*") @ByRef FloatBuffer rollX);
	public native void getEulerZYX(@Cast("b3Scalar*") @ByRef float[] yawZ, @Cast("b3Scalar*") @ByRef float[] pitchY, @Cast("b3Scalar*") @ByRef float[] rollX);

	/**\brief Add two quaternions
   * @param q The quaternion to add to this one */
	public native @ByRef @Name("operator +=") b3Quaternion addPut(@Const @ByRef b3Quaternion q);

	/**\brief Subtract out a quaternion
   * @param q The quaternion to subtract from this one */
	public native @ByRef @Name("operator -=") b3Quaternion subtractPut(@Const @ByRef b3Quaternion q);

	/**\brief Scale this quaternion
   * @param s The scalar to scale by */
	public native @ByRef @Name("operator *=") b3Quaternion multiplyPut(@Cast("const b3Scalar") float s);

	/**\brief Multiply this quaternion by q on the right
   * @param q The other quaternion 
   * Equivilant to this = this * q */
	public native @ByRef @Name("operator *=") b3Quaternion multiplyPut(@Const @ByRef b3Quaternion q);
	/**\brief Return the dot product between this quaternion and another
   * @param q The other quaternion */
	public native @Cast("b3Scalar") float dot(@Const @ByRef b3Quaternion q);

	/**\brief Return the length squared of the quaternion */
	public native @Cast("b3Scalar") float length2();

	/**\brief Return the length of the quaternion */
	public native @Cast("b3Scalar") float length();

	/**\brief Normalize the quaternion 
   * Such that x^2 + y^2 + z^2 +w^2 = 1 */
	public native @ByRef b3Quaternion normalize();

	/**\brief Return a scaled version of this quaternion
   * @param s The scale factor */
	public native @ByVal @Name("operator *") b3Quaternion multiply(@Cast("const b3Scalar") float s);

	/**\brief Return an inversely scaled versionof this quaternion
   * @param s The inverse scale factor */
	public native @ByVal @Name("operator /") b3Quaternion divide(@Cast("const b3Scalar") float s);

	/**\brief Inversely scale this quaternion
   * @param s The scale factor */
	public native @ByRef @Name("operator /=") b3Quaternion dividePut(@Cast("const b3Scalar") float s);

	/**\brief Return a normalized version of this quaternion */
	public native @ByVal b3Quaternion normalized();
	/**\brief Return the angle between this quaternion and the other 
   * @param q The other quaternion */
	public native @Cast("b3Scalar") float angle(@Const @ByRef b3Quaternion q);
	/**\brief Return the angle of rotation represented by this quaternion */
	public native @Cast("b3Scalar") float getAngle();

	/**\brief Return the axis of the rotation represented by this quaternion */
	public native @ByVal b3Vector3 getAxis();

	/**\brief Return the inverse of this quaternion */
	public native @ByVal b3Quaternion inverse();

	/**\brief Return the sum of this quaternion and the other 
   * @param q2 The other quaternion */
	public native @ByVal @Name("operator +") b3Quaternion add(@Const @ByRef b3Quaternion q2);

	/**\brief Return the difference between this quaternion and the other 
   * @param q2 The other quaternion */
	public native @ByVal @Name("operator -") b3Quaternion subtract(@Const @ByRef b3Quaternion q2);

	/**\brief Return the negative of this quaternion 
   * This simply negates each element */
	public native @ByVal @Name("operator -") b3Quaternion subtract();
	/**\todo document this and it's use */
	public native @ByVal b3Quaternion farthest(@Const @ByRef b3Quaternion qd);

	/**\todo document this and it's use */
	public native @ByVal b3Quaternion nearest(@Const @ByRef b3Quaternion qd);

	/**\brief Return the quaternion which is the result of Spherical Linear Interpolation between this and the other quaternion
   * @param q The other quaternion to interpolate with 
   * @param t The ratio between this and q to interpolate.  If t = 0 the result is this, if t=1 the result is q.
   * Slerp interpolates assuming constant velocity.  */
	public native @ByVal b3Quaternion slerp(@Const @ByRef b3Quaternion q, @Cast("const b3Scalar") float t);

	public static native @Const @ByRef b3Quaternion getIdentity();

	public native @Cast("const b3Scalar") float getW();
}
