/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:16:17 GMT 2024
 */

package benchmarks.bess.probks.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.probks.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(1256.73426);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(1.0);
      assertEquals(0.2706705664732254, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet((-240.81423614966758));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
