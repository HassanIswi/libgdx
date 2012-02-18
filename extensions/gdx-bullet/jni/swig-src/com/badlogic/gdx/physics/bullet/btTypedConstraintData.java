/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btTypedConstraintData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btTypedConstraintData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btTypedConstraintData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btTypedConstraintData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public void setM_rbA(btRigidBodyFloatData value) {
    gdxBulletJNI.btTypedConstraintData_m_rbA_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getM_rbA() {
    long cPtr = gdxBulletJNI.btTypedConstraintData_m_rbA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setM_rbB(btRigidBodyFloatData value) {
    gdxBulletJNI.btTypedConstraintData_m_rbB_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getM_rbB() {
    long cPtr = gdxBulletJNI.btTypedConstraintData_m_rbB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setM_name(String value) {
    gdxBulletJNI.btTypedConstraintData_m_name_set(swigCPtr, this, value);
  }

  public String getM_name() {
    return gdxBulletJNI.btTypedConstraintData_m_name_get(swigCPtr, this);
  }

  public void setM_objectType(int value) {
    gdxBulletJNI.btTypedConstraintData_m_objectType_set(swigCPtr, this, value);
  }

  public int getM_objectType() {
    return gdxBulletJNI.btTypedConstraintData_m_objectType_get(swigCPtr, this);
  }

  public void setM_userConstraintType(int value) {
    gdxBulletJNI.btTypedConstraintData_m_userConstraintType_set(swigCPtr, this, value);
  }

  public int getM_userConstraintType() {
    return gdxBulletJNI.btTypedConstraintData_m_userConstraintType_get(swigCPtr, this);
  }

  public void setM_userConstraintId(int value) {
    gdxBulletJNI.btTypedConstraintData_m_userConstraintId_set(swigCPtr, this, value);
  }

  public int getM_userConstraintId() {
    return gdxBulletJNI.btTypedConstraintData_m_userConstraintId_get(swigCPtr, this);
  }

  public void setM_needsFeedback(int value) {
    gdxBulletJNI.btTypedConstraintData_m_needsFeedback_set(swigCPtr, this, value);
  }

  public int getM_needsFeedback() {
    return gdxBulletJNI.btTypedConstraintData_m_needsFeedback_get(swigCPtr, this);
  }

  public void setM_appliedImpulse(float value) {
    gdxBulletJNI.btTypedConstraintData_m_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getM_appliedImpulse() {
    return gdxBulletJNI.btTypedConstraintData_m_appliedImpulse_get(swigCPtr, this);
  }

  public void setM_dbgDrawSize(float value) {
    gdxBulletJNI.btTypedConstraintData_m_dbgDrawSize_set(swigCPtr, this, value);
  }

  public float getM_dbgDrawSize() {
    return gdxBulletJNI.btTypedConstraintData_m_dbgDrawSize_get(swigCPtr, this);
  }

  public void setM_disableCollisionsBetweenLinkedBodies(int value) {
    gdxBulletJNI.btTypedConstraintData_m_disableCollisionsBetweenLinkedBodies_set(swigCPtr, this, value);
  }

  public int getM_disableCollisionsBetweenLinkedBodies() {
    return gdxBulletJNI.btTypedConstraintData_m_disableCollisionsBetweenLinkedBodies_get(swigCPtr, this);
  }

  public void setM_pad4(String value) {
    gdxBulletJNI.btTypedConstraintData_m_pad4_set(swigCPtr, this, value);
  }

  public String getM_pad4() {
    return gdxBulletJNI.btTypedConstraintData_m_pad4_get(swigCPtr, this);
  }

  public btTypedConstraintData() {
    this(gdxBulletJNI.new_btTypedConstraintData(), true);
  }

}