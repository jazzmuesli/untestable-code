/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:58:56 GMT 2018
 */

package com.jakubsprega.untestable.code.h;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.h.Silencer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Silencer_ESTest extends Silencer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Silencer silencer0 = new Silencer();
  }
}