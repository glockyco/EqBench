/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:58:03 GMT 2024
 */

package benchmarks.bess.bessj0.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.bessj0.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet((-475.94));
      assertEquals((-184.34560713421638), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet(0.0);
      assertEquals(1.00000000283141, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
  }
}
