/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 00:31:21 GMT 2018
 */

package com.jakubsprega.untestable.code.h;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jakubsprega.untestable.code.h.Body;
import com.jakubsprega.untestable.code.h.Car;
import com.jakubsprega.untestable.code.h.CarMechanic;
import com.jakubsprega.untestable.code.h.Chassis;
import com.jakubsprega.untestable.code.h.Cylinder;
import com.jakubsprega.untestable.code.h.Engine;
import com.jakubsprega.untestable.code.h.Silencer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true, separateClassLoader = true) 
public class CarMechanic_ESTest extends CarMechanic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      Cylinder cylinder0 = new Cylinder();
      Engine engine0 = new Engine(cylinder0);
      Body body0 = new Body();
      Silencer silencer0 = new Silencer();
      Chassis chassis0 = new Chassis(silencer0);
      Car car0 = new Car(engine0, body0, chassis0);
      carMechanic0.fixCylinder(car0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      Cylinder cylinder0 = new Cylinder();
      Engine engine0 = new Engine(cylinder0);
      Body body0 = new Body();
      Silencer silencer0 = new Silencer();
      Chassis chassis0 = new Chassis(silencer0);
      Car car0 = new Car(engine0, body0, chassis0);
      Engine engine1 = carMechanic0.unmountEngine(car0);
      assertSame(engine1, engine0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      // Undeclared exception!
      try { 
        carMechanic0.unmountEngine((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jakubsprega.untestable.code.h.CarMechanic", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      // Undeclared exception!
      try { 
        carMechanic0.fixSilencer((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jakubsprega.untestable.code.h.CarMechanic", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      Body body0 = new Body();
      Silencer silencer0 = new Silencer();
      Chassis chassis0 = new Chassis(silencer0);
      Car car0 = new Car((Engine) null, body0, chassis0);
      carMechanic0.fixSilencer(car0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      Body body0 = new Body();
      Silencer silencer0 = new Silencer();
      Chassis chassis0 = new Chassis(silencer0);
      Car car0 = new Car((Engine) null, body0, chassis0);
      // Undeclared exception!
      try { 
        carMechanic0.fixCylinder(car0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jakubsprega.untestable.code.h.CarMechanic", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CarMechanic carMechanic0 = new CarMechanic();
      Car car0 = mock(Car.class, new ViolatedAssumptionAnswer());
      Engine engine0 = carMechanic0.unmountEngine(car0);
      assertNull(engine0);
  }
}
