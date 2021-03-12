/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jbaiter.kenlm.jni;

public class State {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public State(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(State obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        KenLMJNI.delete_State(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int Compare(State other) {
    return KenLMJNI.State_Compare(swigCPtr, this, State.getCPtr(other), other);
  }

  public State() {
    this(KenLMJNI.new_State(), true);
  }

}