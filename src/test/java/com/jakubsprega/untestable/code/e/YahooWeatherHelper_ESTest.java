/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:59:18 GMT 2018
 */

package com.jakubsprega.untestable.code.e;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.e.YahooWeatherHelper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class YahooWeatherHelper_ESTest extends YahooWeatherHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YahooWeatherHelper yahooWeatherHelper0 = new YahooWeatherHelper();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = YahooWeatherHelper.getTemp(2356.2434867112743, 2356.2434867112743);
      assertEquals(10, int0);
  }
}