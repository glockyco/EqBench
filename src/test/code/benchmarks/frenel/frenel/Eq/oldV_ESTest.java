/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 20:36:43 GMT 2024
 */

package benchmarks.frenel.frenel.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.frenel.frenel.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV_complex0.assign(387.91978238);
      oldV_complex0.divide(oldV_complex0);
      assertEquals(387.91978238, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV_complex0.assign(474.9046451869819);
      oldV_complex0.multiply(oldV_complex0);
      assertEquals(474.9046451869819, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV.complex oldV_complex1 = new oldV.complex(2.0, 2.0);
      oldV_complex0.minus(oldV_complex1);
      assertEquals(0.0, oldV_complex0.getreal(), 0.01);
      assertEquals(0.0, oldV_complex0.getimag(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV_complex0.assign((-3082.405615109172));
      oldV_complex0.minus(oldV_complex0);
      assertEquals((-3082.405615109172), oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex(0.0, 0.0);
      oldV_complex0.assign(1.0);
      oldV_complex0.plus(oldV_complex0);
      assertEquals(1.0, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV.complex oldV_complex1 = oldV_complex0.plus(oldV_complex0);
      oldV_complex1.assign(oldV_complex0);
      assertEquals(0.0, oldV_complex1.getimag(), 0.01);
      assertEquals(0.0, oldV_complex1.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      oldV.snippet(1.5);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.snippet(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.frenel.frenel.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      oldV.snippet(2.2227587494850775E-162);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV_complex0.divide(oldV_complex0);
      assertEquals(0.0, oldV_complex0.getimag(), 0.01);
      assertEquals(0.0, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      double double0 = oldV_complex0.getimag();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      oldV_complex0.multiply(oldV_complex0);
      assertEquals(0.0, oldV_complex0.getimag(), 0.01);
      assertEquals(0.0, oldV_complex0.getreal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      oldV.complex oldV_complex0 = new oldV.complex();
      double double0 = oldV_complex0.getreal();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, oldV_complex0.getimag(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      oldV.cisi(2.0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      oldV.cisi(0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.snippet((-2328.7883783266902));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.frenel.frenel.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      oldV oldV0 = new oldV();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      oldV.cisi(4.9E-324);
      oldV.snippet(4.9E-324);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      oldV.cisi((-4263.0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      oldV.snippet((-1.0125796045));
  }
}
