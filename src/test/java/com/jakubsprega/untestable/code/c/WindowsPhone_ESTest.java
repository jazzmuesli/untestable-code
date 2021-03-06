/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 00:32:59 GMT 2018
 */

package com.jakubsprega.untestable.code.c;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jakubsprega.untestable.code.c.WindowsPhone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class WindowsPhone_ESTest extends WindowsPhone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WindowsPhone windowsPhone0 = null;
      try {
        windowsPhone0 = new WindowsPhone();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not connect to windows store
         //
         verifyException("com.jakubsprega.untestable.code.c.WindowsPhone", e);
      }
  }
}
