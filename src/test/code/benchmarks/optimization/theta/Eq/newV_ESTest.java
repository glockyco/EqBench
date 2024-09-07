/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:40:51 GMT 2024
 */

package benchmarks.optimization.theta.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.optimization.theta.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.theta((-859.2), 0.0);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.theta(3875.2, (-841.219065007));
      assertEquals((-0.034021136279104504), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.theta(0.0, 0.625);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.theta((-1212.32194), (-1212.32194));
      assertEquals(0.625, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      newV newV0 = new newV();
  }
}
