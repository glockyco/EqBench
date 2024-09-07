/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:58:01 GMT 2024
 */

package benchmarks.gam.gcf.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.gcf.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet((-2453.393), 1553.2, 1553.2);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet((-563.1655120819), 0.0, 2.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(2496.5373029, 1727.0, 2292.785178434);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.gammln(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.gammln(0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.gammln(1.000000000190015);
      assertEquals((-1.0968070895955861E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = oldV.gammln(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = oldV.snippet(1.0, (-1546.967515387984), (-1546.967515387984));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
