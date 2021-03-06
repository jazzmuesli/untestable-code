/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:57:21 GMT 2018
 */

package com.jakubsprega.untestable.code.d;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.d.Call;
import com.jakubsprega.untestable.code.d.OutgoingCall;
import com.jakubsprega.untestable.code.d.PhoneSettings;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PhoneSettings_ESTest extends PhoneSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PhoneSettings phoneSettings0 = PhoneSettings.getInstance();
      List<Call> list0 = phoneSettings0.getRecentCalls();
      //  // Unstable assertion: assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhoneSettings phoneSettings0 = PhoneSettings.getInstance();
      MockDate mockDate0 = new MockDate(0L);
      OutgoingCall outgoingCall0 = new OutgoingCall((-49L), mockDate0);
      phoneSettings0.addRecentCall(outgoingCall0);
      assertEquals((-49L), outgoingCall0.getNumber());
  }
}
