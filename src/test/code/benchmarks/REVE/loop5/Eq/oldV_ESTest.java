/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 21:35:58 GMT 2024
 */

package benchmarks.REVE.loop5.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.REVE.loop5.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      oldV0.f(1559);
      oldV0.f(1559);
      // Undeclared exception!
      oldV0.f(3118);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.f((-2134));
      assertEquals(0, int0);
  }
}
