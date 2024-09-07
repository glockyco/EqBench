/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 23:04:45 GMT 2024
 */

package benchmarks.REVE.loop.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.REVE.loop.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      float float0 = newV0.f((-356.0F));
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      newV0.f(2240.0F);
      newV0.f(1064.0F);
      newV0.f(2241.0F);
      newV0.f(2242.0F);
      // Undeclared exception!
      newV0.f(2242.0F);
  }
}
