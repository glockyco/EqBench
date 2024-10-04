/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:50:14 GMT 2024
 */

package benchmarks.airy.chebev_c1d.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.airy.chebev_c1d.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.ryp = 939.94762;
      oldV.sphbes((-3802), 252.7235249145986);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.rjp = (-945.181336971);
      oldV.sphbes(1392, 0.0065165112670737);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.ry = 2214.9584100411093;
      oldV.sphbes((-793), (-3582.3430624988));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.rj = (-1410.8);
      oldV.sphbes(1, (-2546.8));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      oldV.sphbes(0, 920.7797493);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.SIGN(2033.715, (-940.180774));
      assertEquals((-2033.715), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.SIGN(3.67795E-11, 0.0);
      assertEquals(3.67795E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = oldV.MAX(5, 0.0);
      assertEquals(5.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.MAX((-3.4706269649E-6), (-3.4706269649E-6));
      assertEquals((-3.4706269649E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.chebev_c1d((-1803), 761.761329757, 572, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 571
         //
         verifyException("benchmarks.airy.chebev_c1d.Neq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = oldV.chebev_c1d(8.0, 0.0012719271366546, 6, 8.0);
      assertEquals((-0.5772156649013973), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      oldV.sphbes(5, 0.0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, (-1.356E-13));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.SIGN((-809.62439478), 0.0);
      assertEquals(809.62439478, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = oldV.SIGN((-113.929), (-461.267179));
      assertEquals((-113.929), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = oldV.chebev_c1d(6.9437664E-9, 3.67795E-11, 5, (-12.939433));
      assertEquals(1.0947412901163454E31, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.beschb((-3.4706269649E-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("benchmarks.airy.chebev_c1d.Neq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      oldV oldV0 = new oldV();
      assertEquals(0.0, oldV.aip, 0.01);
  }
}
