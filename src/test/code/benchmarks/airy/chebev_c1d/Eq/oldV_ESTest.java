/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:49:58 GMT 2024
 */

package benchmarks.airy.chebev_c1d.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.airy.chebev_c1d.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.ryp = (-3.954907512202276E-10);
      oldV.sphbes(0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.rjp = 1.0;
      oldV.sphbes((-1), 1254.3929);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.ry = 997.9422107060145;
      oldV.sphbes(1, (-1.0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.rj = 1.0;
      oldV.sphbes((-933), 2.423096E-10);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      oldV.sphbes(1, 0.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, (-1.702E-13));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = oldV.chebev_c1d(0.0, (-11.2), 5, (-1205.0202054594508));
      assertEquals(9.647456375385815, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.MAX(0.0, (-1.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = oldV.MAX((-393.8), (-393.8));
      assertEquals((-393.8), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.chebev_c1d(226.0, 0.0, 515, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 514
         //
         verifyException("benchmarks.airy.chebev_c1d.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = oldV.chebev_c1d(0.0, 2.0, 0, 1);
      assertEquals((-0.571011340185584), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      oldV.sphbes(1217, 1884.7714);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.SIGN((-540.8234), (-540.8234));
      assertEquals((-540.8234), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.SIGN(3.087090173086E-4, 1907.22533);
      assertEquals(3.087090173086E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.SIGN((-1827.0292476986676), 2.0);
      assertEquals(1827.0292476986676, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = oldV.SIGN(1, (-669.9001));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = oldV.MAX((-1.0), 306.17);
      assertEquals(306.17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.beschb(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("benchmarks.airy.chebev_c1d.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      oldV oldV0 = new oldV();
      assertEquals(0.0, oldV.bip, 0.01);
  }
}
