/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 00:34:30 GMT 2018
 */

package com.jakubsprega.untestable.code.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jakubsprega.untestable.code.f.GoogleClient;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class GoogleClient_ESTest extends GoogleClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      GoogleClient googleClient0 = new GoogleClient("", charset0);
      try { 
        googleClient0.search((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      GoogleClient googleClient0 = new GoogleClient("", charset0);
      try { 
        googleClient0.search("");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }
}
