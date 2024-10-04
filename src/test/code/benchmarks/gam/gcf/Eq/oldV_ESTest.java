/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:55:48 GMT 2024
 */

package benchmarks.gam.gcf.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.gcf.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.gammln(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 2736.34, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(1.0, 1.0, 1.0);
      assertEquals(0.1353352832366127, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet(3730.6298538, 725.8321166318798, (-4020.0233986141));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.gammln(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.gammln(2.0);
      assertEquals((-4.440892098500626E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = oldV.gammln(8.194325342382924E28);
      assertEquals(5.373496404424826E30, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
