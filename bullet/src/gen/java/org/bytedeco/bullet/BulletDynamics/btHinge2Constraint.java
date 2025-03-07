// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletDynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;

import static org.bytedeco.bullet.global.BulletDynamics.*;


// Constraint similar to ODE Hinge2 Joint
// has 3 degrees of frredom:
// 2 rotational degrees of freedom, similar to Euler rotations around Z (axis 1) and X (axis 2)
// 1 translational (along axis Z) with suspension spring

@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletDynamics.class)
public class btHinge2Constraint extends btGeneric6DofSpring2Constraint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btHinge2Constraint(Pointer p) { super(p); }


	// constructor
	// anchor, axis1 and axis2 are in world coordinate system
	// axis1 must be orthogonal to axis2
	public btHinge2Constraint(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @ByRef btVector3 anchor, @ByRef btVector3 axis1, @ByRef btVector3 axis2) { super((Pointer)null); allocate(rbA, rbB, anchor, axis1, axis2); }
	private native void allocate(@ByRef btRigidBody rbA, @ByRef btRigidBody rbB, @ByRef btVector3 anchor, @ByRef btVector3 axis1, @ByRef btVector3 axis2);
	// access
	public native @Const @ByRef btVector3 getAnchor();
	public native @Const @ByRef btVector3 getAnchor2();
	public native @Const @ByRef btVector3 getAxis1();
	public native @Const @ByRef btVector3 getAxis2();
	public native @Cast("btScalar") float getAngle1();
	public native @Cast("btScalar") float getAngle2();
	// limits
	public native void setUpperLimit(@Cast("btScalar") float ang1max);
	public native void setLowerLimit(@Cast("btScalar") float ang1min);
}
