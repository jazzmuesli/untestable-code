/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:52:53 GMT 2018
 */

package com.jakubsprega.untestable.code.e;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.e.WeatherIcon;
import com.jakubsprega.untestable.code.e.WeatherWidget;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WeatherWidget_ESTest extends WeatherWidget_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeatherWidget weatherWidget0 = new WeatherWidget();
      WeatherIcon weatherIcon0 = weatherWidget0.getWeatherIcon((-2528.179), 0.0);
      assertEquals(WeatherIcon.COOL, weatherIcon0);
  }
}
