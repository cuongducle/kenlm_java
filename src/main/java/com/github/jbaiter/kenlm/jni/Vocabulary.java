/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jbaiter.kenlm.jni;

public class Vocabulary {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Vocabulary(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vocabulary obj) {
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
        KenLMJNI.delete_Vocabulary(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long BeginSentence() {
    return KenLMJNI.Vocabulary_BeginSentence(swigCPtr, this);
  }

  public long EndSentence() {
    return KenLMJNI.Vocabulary_EndSentence(swigCPtr, this);
  }

  public long NotFound() {
    return KenLMJNI.Vocabulary_NotFound(swigCPtr, this);
  }

  public long Index(String str) {
    return KenLMJNI.Vocabulary_Index(swigCPtr, this, str);
  }

}
