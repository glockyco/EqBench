/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 16:21:14 GMT 2024
 */

package benchmarks.bess.SIGN.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.SIGN.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet((-1.0), 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet(1.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet(0.0, (-1.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.snippet((-2147.883367061), 561.35);
      assertEquals(2147.883367061, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(2066.61438685, (-3160.601093));
      assertEquals((-2066.61438685), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = newV.snippet(1170.0861063149648, 1170.0861063149648);
      assertEquals(1170.0861063149648, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = newV.snippet((-2147.883367061), (-229.7318));
      assertEquals((-2147.883367061), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      newV newV0 = new newV();
  }
}
