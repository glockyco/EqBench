/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 20:06:45 GMT 2024
 */

package benchmarks.tsafe.conflict.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.tsafe.conflict.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 870.25023262156, (-124.049483604381), (-594.4), (-594.4), (-124.049483604381), (-850.0), 3294.66841223114, 2986.02168806922);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(870.25023262156, 0.0, (-989.5), (-989.5), 0.0, (-989.5), 1.0, 0.0, (-850.0));
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 870.25023262156, 870.25023262156);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet((-144.7975716185), 1.8734849947421928, (-144.7975716185), 1.2737721604002639, 1.2737721604002639, 1.2737721604002639, 1.2737721604002639, 1.2737721604002639, 1.2737721604002639);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
