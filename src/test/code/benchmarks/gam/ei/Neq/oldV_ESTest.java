/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:53:39 GMT 2024
 */

package benchmarks.gam.ei.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.ei.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(2.9633623E-317);
      assertEquals((-728.2559342898534), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(32.23619130191664);
      assertEquals(296.0795041551229, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(0.0);
      assertEquals((-10000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.snippet(Double.POSITIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.snippet(2.889186548675336E-36);
      assertEquals((-81.25487269142678), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = oldV.snippet((-81.25487269142678));
      assertEquals((-10000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = oldV.snippet(2290.9621034415914);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
