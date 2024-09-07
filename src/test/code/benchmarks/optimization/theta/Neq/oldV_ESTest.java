/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:41:55 GMT 2024
 */

package benchmarks.optimization.theta.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.optimization.theta.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.theta((-2257.730003), 2256.886);
      assertEquals(0.37502975385897275, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.theta(0.625, (-2257.730003));
      assertEquals((-0.2499559416596496), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.theta(0.0, 0.125);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
