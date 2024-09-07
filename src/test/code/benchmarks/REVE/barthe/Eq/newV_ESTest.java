/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 22:26:32 GMT 2024
 */

package benchmarks.REVE.barthe.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.REVE.barthe.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.f(5, (-2332));
      assertEquals((-11610), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      // Undeclared exception!
      newV0.f(18899375, 5);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.f(909, 1);
      assertEquals(2064339, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.f((-2200), (-2200));
      assertEquals(0, int0);
  }
}
