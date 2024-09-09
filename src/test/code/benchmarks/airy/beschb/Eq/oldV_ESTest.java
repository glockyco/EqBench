/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:47:48 GMT 2024
 */

package benchmarks.airy.beschb.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.airy.beschb.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.ryp = (-4934.78850894689);
      oldV.sphbes(0, 0.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.rjp = (-3620.52306);
      oldV.sphbes(5, (-696.542));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.ry = 3282.94;
      oldV.sphbes(7, (-2598.86));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.rj = 388.4243;
      oldV.sphbes((-1222), (-1222.0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, (-574.23152552));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.SIGN(309.0, 2.0);
      assertEquals(309.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.chebev_c1d(214.6234261986, (-374), 0, 0.0);
      assertEquals((-0.571011340185584), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.MAX(0.0, (-4.9717367042E-6));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.chebev_c1d(0.0, 0.0, 336, (-369.976203622453));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 335
         //
         verifyException("benchmarks.airy.beschb.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      oldV.sphbes(7, 776.8);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.SIGN((-175.866666231482), (-175.866666231482));
      assertEquals((-175.866666231482), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.SIGN((-1945.401), 0.0);
      assertEquals(1945.401, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.SIGN(3463.56754383185, (-2181.335227219));
      assertEquals((-3463.56754383185), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = oldV.MAX((-574.23152552), (-18.5701));
      assertEquals((-18.5701), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = oldV.MAX(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.beschb(581.85);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("benchmarks.airy.beschb.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      oldV oldV0 = new oldV();
      assertEquals(0.0, oldV.ai, 0.01);
  }
}
