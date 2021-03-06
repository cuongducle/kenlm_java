/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.github.jbaiter.kenlm.jni;

public final class LoadMethod {
  public final static LoadMethod LAZY = new LoadMethod("LAZY");
  public final static LoadMethod POPULATE_OR_LAZY = new LoadMethod("POPULATE_OR_LAZY");
  public final static LoadMethod POPULATE_OR_READ = new LoadMethod("POPULATE_OR_READ");
  public final static LoadMethod READ = new LoadMethod("READ");
  public final static LoadMethod PARALLEL_READ = new LoadMethod("PARALLEL_READ");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LoadMethod swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LoadMethod.class + " with value " + swigValue);
  }

  private LoadMethod(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LoadMethod(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LoadMethod(String swigName, LoadMethod swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LoadMethod[] swigValues = { LAZY, POPULATE_OR_LAZY, POPULATE_OR_READ, READ, PARALLEL_READ };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

