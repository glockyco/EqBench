/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:47:23 GMT 2024
 */

package benchmarks.airy.sphbes.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.airy.sphbes.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.ryp = (-632.38740179);
      oldV.sphbes(0, 1383.73799335471);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.rjp = (double) (-2478);
      oldV.sphbes(481, 481);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.ry = 2665.4268;
      oldV.sphbes(0, (-0.571011340185584));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.rj = 1.0;
      oldV.sphbes((-380), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      oldV.sphbes(0, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, (-566.5));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.chebev_c1d((-847), 1.0, (-3189), Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.SIGN(1.843740587300905, 1015.70232848865);
      assertEquals(1.843740587300905, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 883.91294);
      assertEquals(883.91294, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = oldV.MAX((-1.0), Double.NaN);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.chebev_c1d(-0.0, (-1296.300674), 1567, -0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1566
         //
         verifyException("benchmarks.airy.sphbes.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = oldV.chebev_c1d(1.0, 0.0, 3, 1015.70232848865);
      assertEquals(2531.5299656948337, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.chebev_c1d(0.0, 341.0, (-1740), 0.0);
      assertEquals((-0.571011340185584), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.SIGN(2.423096E-10, (-1334.6917245919824));
      assertEquals((-2.423096E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.SIGN(Double.NaN, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = oldV.SIGN((-872.7353299365), (-872.7353299365));
      assertEquals((-872.7353299365), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = oldV.MAX((-1119.054354), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.beschb(1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("benchmarks.airy.sphbes.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      oldV oldV0 = new oldV();
      assertEquals(0.0, oldV.ai, 0.01);
  }
}
