/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 27 23:56:44 GMT 2018
 */

package com.jakubsprega.untestable.code.f;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jakubsprega.untestable.code.f.GoogleResult;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GoogleResult_ESTest extends GoogleResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GoogleResult.ResponseData googleResult_ResponseData0 = new GoogleResult.ResponseData();
      String string0 = googleResult_ResponseData0.toString();
      assertEquals("Results[null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GoogleResult googleResult0 = new GoogleResult();
      GoogleResult.ResponseData googleResult_ResponseData0 = new GoogleResult.ResponseData();
      googleResult0.setResponseData(googleResult_ResponseData0);
      GoogleResult.ResponseData googleResult_ResponseData1 = googleResult0.getResponseData();
      assertSame(googleResult_ResponseData1, googleResult_ResponseData0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GoogleResult.ResponseData googleResult_ResponseData0 = new GoogleResult.ResponseData();
      googleResult_ResponseData0.setResults((List<GoogleResult.Result>) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GoogleResult.ResponseData googleResult_ResponseData0 = new GoogleResult.ResponseData();
      List<GoogleResult.Result> list0 = googleResult_ResponseData0.getResults();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GoogleResult.Result googleResult_Result0 = new GoogleResult.Result();
      String string0 = googleResult_Result0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GoogleResult.Result googleResult_Result0 = new GoogleResult.Result();
      googleResult_Result0.setTitle((String) null);
      assertNull(googleResult_Result0.getTitle());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GoogleResult.Result googleResult_Result0 = new GoogleResult.Result();
      String string0 = googleResult_Result0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GoogleResult.Result googleResult_Result0 = new GoogleResult.Result();
      String string0 = googleResult_Result0.toString();
      assertEquals("Result[url:null,title:null]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GoogleResult.Result googleResult_Result0 = new GoogleResult.Result();
      googleResult_Result0.setUrl((String) null);
      assertNull(googleResult_Result0.getTitle());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GoogleResult googleResult0 = new GoogleResult();
      GoogleResult.ResponseData googleResult_ResponseData0 = new GoogleResult.ResponseData();
      googleResult0.setResponseData(googleResult_ResponseData0);
      String string0 = googleResult0.toString();
      assertEquals("ResponseData[Results[null]]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GoogleResult googleResult0 = new GoogleResult();
      GoogleResult.ResponseData googleResult_ResponseData0 = googleResult0.getResponseData();
      assertNull(googleResult_ResponseData0);
  }
}
