/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 20:43:39 GMT 2024
 */

package benchmarks.frenel.cisi.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.frenel.cisi.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV_complex0.assign((-542.56349));
      newV_complex0.divide(newV_complex0);
      assertEquals((-542.56349), newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV_complex0.assign((-709.430917904));
      newV_complex0.multiply(newV_complex0);
      assertEquals((-709.430917904), newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV.complex newV_complex1 = new newV.complex();
      newV_complex1.minus(newV_complex0);
      assertEquals(0.0, newV_complex1.getreal(), 0.01);
      assertEquals(0.0, newV_complex1.getimag(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV_complex0.assign((-3729.086840310216));
      newV_complex0.minus(newV_complex0);
      assertEquals((-3729.086840310216), newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex(1.5, (-3061.2197331675397));
      // Undeclared exception!
      try { 
        newV_complex0.minus((newV.complex) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.frenel.cisi.Eq.newV$complex", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV_complex0.assign((-1.7976931348623156E294));
      newV_complex0.plus(newV_complex0);
      assertEquals((-1.7976931348623156E294), newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex(1.5, (-3061.2197331675397));
      newV.complex newV_complex1 = newV_complex0.multiply(newV_complex0);
      newV_complex1.assign(newV_complex0);
      assertEquals(0.0, newV_complex1.getreal(), 0.01);
      assertEquals(0.0, newV_complex1.getimag(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      newV.snippet(2.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      newV_complex0.divide(newV_complex0);
      assertEquals(0.0, newV_complex0.getimag(), 0.01);
      assertEquals(0.0, newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      double double0 = newV_complex0.getreal();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, newV_complex0.getimag(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      newV.frenel(1.5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.frenel(2.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.frenel.cisi.Eq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.frenel(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.frenel.cisi.Eq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      newV.frenel((-1.0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      newV.snippet(2.0E-323);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      newV.snippet((-1.0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      newV.snippet(0.0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      newV newV0 = new newV();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      newV.complex newV_complex0 = new newV.complex();
      double double0 = newV_complex0.getimag();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, newV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      newV.snippet((-691.366));
  }
}
