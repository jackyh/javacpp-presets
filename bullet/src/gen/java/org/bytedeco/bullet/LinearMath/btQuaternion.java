// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.LinearMath;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.bullet.global.LinearMath.*;

// #endif  //BT_USE_DOUBLE_PRECISION

// #ifdef BT_USE_SSE

// #endif

// #if defined(BT_USE_SSE)

// #elif defined(BT_USE_NEON)

// #endif

/**\brief The btQuaternion implements quaternion to perform linear algebra rotations in combination with btMatrix3x3, btVector3 and btTransform. */
@Properties(inherit = org.bytedeco.bullet.presets.LinearMath.class)
public class btQuaternion extends btQuadWord {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btQuaternion(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btQuaternion(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btQuaternion position(long position) {
        return (btQuaternion)super.position(position);
    }
    @Override public btQuaternion getPointer(long i) {
        return new btQuaternion((Pointer)this).offsetAddress(i);
    }

	/**\brief No initialization constructor */
	public btQuaternion() { super((Pointer)null); allocate(); }
	private native void allocate();

// #if (defined(BT_USE_SSE_IN_API) && defined(BT_USE_SSE)) || defined(BT_USE_NEON)

// #endif

	//		template <typename btScalar>
	//		explicit Quaternion(const btScalar *v) : Tuple4<btScalar>(v) {}
	/**\brief Constructor from scalars */
	public btQuaternion(@Cast("const btScalar") float _x, @Cast("const btScalar") float _y, @Cast("const btScalar") float _z, @Cast("const btScalar") float _w) { super((Pointer)null); allocate(_x, _y, _z, _w); }
	private native void allocate(@Cast("const btScalar") float _x, @Cast("const btScalar") float _y, @Cast("const btScalar") float _z, @Cast("const btScalar") float _w);
	/**\brief Axis angle Constructor
   * @param axis The axis which the rotation is around
   * @param angle The magnitude of the rotation around the angle (Radians) */
	public btQuaternion(@Const @ByRef btVector3 _axis, @Cast("const btScalar") float _angle) { super((Pointer)null); allocate(_axis, _angle); }
	private native void allocate(@Const @ByRef btVector3 _axis, @Cast("const btScalar") float _angle);
	/**\brief Constructor from Euler angles
   * @param yaw Angle around Y unless BT_EULER_DEFAULT_ZYX defined then Z
   * @param pitch Angle around X unless BT_EULER_DEFAULT_ZYX defined then Y
   * @param roll Angle around Z unless BT_EULER_DEFAULT_ZYX defined then X */
	public btQuaternion(@Cast("const btScalar") float yaw, @Cast("const btScalar") float pitch, @Cast("const btScalar") float roll) { super((Pointer)null); allocate(yaw, pitch, roll); }
	private native void allocate(@Cast("const btScalar") float yaw, @Cast("const btScalar") float pitch, @Cast("const btScalar") float roll);
	/**\brief Set the rotation using axis angle notation 
   * @param axis The axis around which to rotate
   * @param angle The magnitude of the rotation in Radians */
	public native void setRotation(@Const @ByRef btVector3 axis, @Cast("const btScalar") float _angle);
	/**\brief Set the quaternion using Euler angles
   * @param yaw Angle around Y
   * @param pitch Angle around X
   * @param roll Angle around Z */
	public native void setEuler(@Cast("const btScalar") float yaw, @Cast("const btScalar") float pitch, @Cast("const btScalar") float roll);
	/**\brief Set the quaternion using euler angles 
   * @param yaw Angle around Z
   * @param pitch Angle around Y
   * @param roll Angle around X */
	public native void setEulerZYX(@Cast("const btScalar") float yawZ, @Cast("const btScalar") float pitchY, @Cast("const btScalar") float rollX);

	/**\brief Get the euler angles from this quaternion
	   * @param yaw Angle around Z
	   * @param pitch Angle around Y
	   * @param roll Angle around X */
	public native void getEulerZYX(@Cast("btScalar*") @ByRef FloatPointer yawZ, @Cast("btScalar*") @ByRef FloatPointer pitchY, @Cast("btScalar*") @ByRef FloatPointer rollX);
	public native void getEulerZYX(@Cast("btScalar*") @ByRef FloatBuffer yawZ, @Cast("btScalar*") @ByRef FloatBuffer pitchY, @Cast("btScalar*") @ByRef FloatBuffer rollX);
	public native void getEulerZYX(@Cast("btScalar*") @ByRef float[] yawZ, @Cast("btScalar*") @ByRef float[] pitchY, @Cast("btScalar*") @ByRef float[] rollX);

	/**\brief Add two quaternions
   * @param q The quaternion to add to this one */
	public native @ByRef @Name("operator +=") btQuaternion addPut(@Const @ByRef btQuaternion q);

	/**\brief Subtract out a quaternion
   * @param q The quaternion to subtract from this one */
	public native @ByRef @Name("operator -=") btQuaternion subtractPut(@Const @ByRef btQuaternion q);

	/**\brief Scale this quaternion
   * @param s The scalar to scale by */
	public native @ByRef @Name("operator *=") btQuaternion multiplyPut(@Cast("const btScalar") float s);

	/**\brief Multiply this quaternion by q on the right
   * @param q The other quaternion 
   * Equivilant to this = this * q */
	public native @ByRef @Name("operator *=") btQuaternion multiplyPut(@Const @ByRef btQuaternion q);
	/**\brief Return the dot product between this quaternion and another
   * @param q The other quaternion */
	public native @Cast("btScalar") float dot(@Const @ByRef btQuaternion q);

	/**\brief Return the length squared of the quaternion */
	public native @Cast("btScalar") float length2();

	/**\brief Return the length of the quaternion */
	public native @Cast("btScalar") float length();
	public native @ByRef btQuaternion safeNormalize();
	/**\brief Normalize the quaternion 
   * Such that x^2 + y^2 + z^2 +w^2 = 1 */
	public native @ByRef btQuaternion normalize();

	/**\brief Return a scaled version of this quaternion
   * @param s The scale factor */
	public native @ByVal @Name("operator *") btQuaternion multiply(@Cast("const btScalar") float s);

	/**\brief Return an inversely scaled versionof this quaternion
   * @param s The inverse scale factor */
	public native @ByVal @Name("operator /") btQuaternion divide(@Cast("const btScalar") float s);

	/**\brief Inversely scale this quaternion
   * @param s The scale factor */
	public native @ByRef @Name("operator /=") btQuaternion dividePut(@Cast("const btScalar") float s);

	/**\brief Return a normalized version of this quaternion */
	public native @ByVal btQuaternion normalized();
	/**\brief Return the ***half*** angle between this quaternion and the other
   * @param q The other quaternion */
	public native @Cast("btScalar") float angle(@Const @ByRef btQuaternion q);

	/**\brief Return the angle between this quaternion and the other along the shortest path
	* @param q The other quaternion */
	public native @Cast("btScalar") float angleShortestPath(@Const @ByRef btQuaternion q);

	/**\brief Return the angle [0, 2Pi] of rotation represented by this quaternion */
	public native @Cast("btScalar") float getAngle();

	/**\brief Return the angle [0, Pi] of rotation represented by this quaternion along the shortest path */
	public native @Cast("btScalar") float getAngleShortestPath();

	/**\brief Return the axis of the rotation represented by this quaternion */
	public native @ByVal btVector3 getAxis();

	/**\brief Return the inverse of this quaternion */
	public native @ByVal btQuaternion inverse();

	/**\brief Return the sum of this quaternion and the other 
   * @param q2 The other quaternion */
	public native @ByVal @Name("operator +") btQuaternion add(@Const @ByRef btQuaternion q2);

	/**\brief Return the difference between this quaternion and the other 
   * @param q2 The other quaternion */
	public native @ByVal @Name("operator -") btQuaternion subtract(@Const @ByRef btQuaternion q2);

	/**\brief Return the negative of this quaternion 
   * This simply negates each element */
	public native @ByVal @Name("operator -") btQuaternion subtract();
	/**\todo document this and it's use */
	public native @ByVal btQuaternion farthest(@Const @ByRef btQuaternion qd);

	/**\todo document this and it's use */
	public native @ByVal btQuaternion nearest(@Const @ByRef btQuaternion qd);

	/**\brief Return the quaternion which is the result of Spherical Linear Interpolation between this and the other quaternion
   * @param q The other quaternion to interpolate with 
   * @param t The ratio between this and q to interpolate.  If t = 0 the result is this, if t=1 the result is q.
   * Slerp interpolates assuming constant velocity.  */
	public native @ByVal btQuaternion slerp(@Const @ByRef btQuaternion q, @Cast("const btScalar") float t);

	public static native @Const @ByRef btQuaternion getIdentity();

	public native @Cast("const btScalar") float getW();

	public native void serialize(@ByRef btQuaternionFloatData dataOut);

	public native void deSerialize(@Const @ByRef btQuaternionFloatData dataIn);

	public native void deSerialize(@Const @ByRef btQuaternionDoubleData dataIn);

	public native void serializeFloat(@ByRef btQuaternionFloatData dataOut);

	public native void deSerializeFloat(@Const @ByRef btQuaternionFloatData dataIn);

	public native void serializeDouble(@ByRef btQuaternionDoubleData dataOut);

	public native void deSerializeDouble(@Const @ByRef btQuaternionDoubleData dataIn);
}
