/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 28 00:34:30 GMT 2018
 */

package com.jakubsprega.untestable.code.f;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jakubsprega.untestable.code.f.GoogleClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class GoogleClient_ESTest extends GoogleClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      GoogleClient googleClient0 = new GoogleClient("", charset0, null);
      try { 
        googleClient0.search((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ContentProvider provider = new ContentProvider() {
		
		@Override
		public String provideContent(URL url) {
			String name = "lufthansa-google-result.json"; 
			try {
				return new String(Files.readAllBytes(Paths.get(getClass().getResource(name).toURI())));
			} catch (Exception e) {
				return null;
			}
		}
	};
	GoogleClient googleClient0 = new GoogleClient("http://ajax.googleapis.com/ajax/services/search/web?v=1.0&q=", charset0, provider);
      try { 
        googleClient0.search("banana");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }
}
