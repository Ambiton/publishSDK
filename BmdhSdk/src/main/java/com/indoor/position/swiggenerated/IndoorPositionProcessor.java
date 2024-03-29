/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.indoor.position.swiggenerated;

public class IndoorPositionProcessor {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IndoorPositionProcessor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndoorPositionProcessor obj) {
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
        IPSJNI.delete_IndoorPositionProcessor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void updateSatelliteInfo(SatelliteInfoList satellites, double[] initialpoint) {
    IPSJNI.IndoorPositionProcessor_updateSatelliteInfo(swigCPtr, this, SatelliteInfoList.getCPtr(satellites), satellites, initialpoint);
  }

  public static int initialAPBCaKFOneDimen() {
    return IPSJNI.IndoorPositionProcessor_initialAPBCaKFOneDimen();
  }

  public static int initialAPBCKFTwoDimen() {
    return IPSJNI.IndoorPositionProcessor_initialAPBCKFTwoDimen();
  }

  public static int initialPseKF() {
    return IPSJNI.IndoorPositionProcessor_initialPseKF();
  }

  public IndoorPositionMeasurement run(SatelliteIndoorMeasurementList L1inputMeasurements, SatelliteIndoorMeasurementList L5inputMeasurements, EnviromentData enviromentData) {
    long cPtr = IPSJNI.IndoorPositionProcessor_run(swigCPtr, this, SatelliteIndoorMeasurementList.getCPtr(L1inputMeasurements), L1inputMeasurements, SatelliteIndoorMeasurementList.getCPtr(L5inputMeasurements), L5inputMeasurements, EnviromentData.getCPtr(enviromentData), enviromentData);
    return (cPtr == 0) ? null : new IndoorPositionMeasurement(cPtr, true);
  }

  public void setInputparameter(Inputparameter input) {
    IPSJNI.IndoorPositionProcessor_setInputparameter(swigCPtr, this, Inputparameter.getCPtr(input), input);
  }

  public IndoorPositionProcessor() {
    this(IPSJNI.new_IndoorPositionProcessor(), true);
  }

}
