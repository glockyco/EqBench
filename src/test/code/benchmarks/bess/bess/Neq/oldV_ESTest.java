/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:36:03 GMT 2024
 */

package benchmarks.bess.bess.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.bess.bess.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(2.0, (-1.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(2588.17205, Double.NEGATIVE_INFINITY);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV.snippet(2588.17205, 1.0);
      oldV.snippet(2588.17205, Double.NEGATIVE_INFINITY);
      oldV.snippet(3622.08312705057, (-1000.0));
      // Undeclared exception!
      oldV.snippet(3548.7245387, 587.1812);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.snippet(1.0, 1.0);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.snippet(1372.5581528, 1372.5581528);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
