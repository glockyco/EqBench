/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:44:15 GMT 2024
 */

package benchmarks.bess.bessk1.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.bessk1.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet(0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet((-0.0365562));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet((-3.75));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.snippet((-1698.7));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(2.0);
      assertEquals((-25.0034056), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = newV.snippet(2089.78);
      assertEquals(1.2535389973707078, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      newV newV0 = new newV();
  }
}
