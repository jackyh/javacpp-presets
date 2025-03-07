// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;


// btDeformableMultiBodyConstraintSolver extendsn btMultiBodyConstraintSolver to solve for the contact among rigid/multibody and deformable bodies. Notice that the following constraints
// 1. rigid/multibody against rigid/multibody
// 2. rigid/multibody against deforamble
// 3. deformable against deformable
// 4. deformable self collision
// 5. joint constraints
// are all coupled in this solve.
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableMultiBodyConstraintSolver extends btMultiBodyConstraintSolver {
    static { Loader.load(); }
    /** Default native constructor. */
    public btDeformableMultiBodyConstraintSolver() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableMultiBodyConstraintSolver(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableMultiBodyConstraintSolver(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public btDeformableMultiBodyConstraintSolver position(long position) {
        return (btDeformableMultiBodyConstraintSolver)super.position(position);
    }
    @Override public btDeformableMultiBodyConstraintSolver getPointer(long i) {
        return new btDeformableMultiBodyConstraintSolver((Pointer)this).offsetAddress(i);
    }


	public native void setDeformableSolver(btDeformableBodySolver deformableSolver);

	public native void solveDeformableBodyGroup(@Cast("btCollisionObject**") PointerPointer bodies, int numBodies, @Cast("btCollisionObject**") PointerPointer deformableBodies, int numDeformableBodies, @Cast("btPersistentManifold**") PointerPointer manifold, int numManifolds, @Cast("btTypedConstraint**") PointerPointer constraints, int numConstraints, @Cast("btMultiBodyConstraint**") PointerPointer multiBodyConstraints, int numMultiBodyConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
	public native void solveDeformableBodyGroup(@ByPtrPtr btCollisionObject bodies, int numBodies, @ByPtrPtr btCollisionObject deformableBodies, int numDeformableBodies, @ByPtrPtr btPersistentManifold manifold, int numManifolds, @ByPtrPtr btTypedConstraint constraints, int numConstraints, @ByPtrPtr btMultiBodyConstraint multiBodyConstraints, int numMultiBodyConstraints, @Const @ByRef btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher);
}
