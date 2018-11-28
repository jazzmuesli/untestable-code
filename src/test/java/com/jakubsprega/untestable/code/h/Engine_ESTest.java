/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:59:27 GMT 2018
 */

package com.jakubsprega.untestable.code.h;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.h.Cylinder;
import com.jakubsprega.untestable.code.h.Engine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Engine_ESTest extends Engine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Engine engine0 = new Engine((Cylinder) null);
      Cylinder cylinder0 = engine0.getCylinder();
      assertNull(cylinder0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Cylinder cylinder0 = new Cylinder();
      Engine engine0 = new Engine(cylinder0);
      Cylinder cylinder1 = engine0.getCylinder();
      assertSame(cylinder1, cylinder0);
  }
}