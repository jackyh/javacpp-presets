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


@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableLagrangianForce extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableLagrangianForce(Pointer p) { super(p); }

	public native @ByRef btSoftBodyArray m_softBodies(); public native btDeformableLagrangianForce m_softBodies(btSoftBodyArray setter);
	public native @Const btSoftBodyNodePointerArray m_nodes(); public native btDeformableLagrangianForce m_nodes(btSoftBodyNodePointerArray setter);

	// add all forces
	public native void addScaledForces(@Cast("btScalar") float scale, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array force);

	// add damping df
	public native void addScaledDampingForceDifferential(@Cast("btScalar") float scale, @Cast("const btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array dv, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array df);

	// build diagonal of A matrix
	public native void buildDampingForceDifferentialDiagonal(@Cast("btScalar") float scale, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array diagA);

	// add elastic df
	public native void addScaledElasticForceDifferential(@Cast("btScalar") float scale, @Cast("const btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array dx, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array df);

	// add all forces that are explicit in explicit solve
	public native void addScaledExplicitForce(@Cast("btScalar") float scale, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array force);

	// add all damping forces
	public native void addScaledDampingForce(@Cast("btScalar") float scale, @Cast("btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array force);

	public native void addScaledHessian(@Cast("btScalar") float scale);

	public native @Cast("btDeformableLagrangianForceType") int getForceType();

	public native void reinitialize(@Cast("bool") boolean nodeUpdated);

	// get number of nodes that have the force
	public native int getNumNodes();

	// add a soft body to be affected by the particular lagrangian force
	public native void addSoftBody(btSoftBody psb);

	public native void removeSoftBody(btSoftBody psb);

	public native void setIndices(@Const btSoftBodyNodePointerArray nodes);

	// Calculate the incremental deformable generated from the input dx
	public native @ByVal btMatrix3x3 Ds(int id0, int id1, int id2, int id3, @Cast("const btDeformableLagrangianForce::TVStack*") @ByRef btVector3Array dx);

	// Calculate the incremental deformable generated from the current velocity
	public native @ByVal btMatrix3x3 DsFromVelocity(@Const btSoftBody.Node n0, @Const btSoftBody.Node n1, @Const btSoftBody.Node n2, @Const btSoftBody.Node n3);

	// test for addScaledElasticForce function
	public native void testDerivative();

	// test for addScaledElasticForce function
	public native void testHessian();

	//
	public native double totalElasticEnergy(@Cast("btScalar") float dt);

	//
	public native double totalDampingEnergy(@Cast("btScalar") float dt);

	// total Energy takes dt as input because certain energies depend on dt
	public native double totalEnergy(@Cast("btScalar") float dt);
}
