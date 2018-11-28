/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 00:33:29 GMT 2018
 */

package com.jakubsprega.untestable.code.d;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.d.IncomingCall;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class IncomingCall_ESTest extends IncomingCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(321L);
      Date date0 = Date.from(instant0);
      IncomingCall incomingCall0 = new IncomingCall(0L, date0);
      assertEquals(0L, incomingCall0.number);
  }
}
