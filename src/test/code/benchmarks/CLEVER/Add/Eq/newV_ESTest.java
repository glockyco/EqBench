/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:10:37 GMT 2024
 */

package benchmarks.CLEVER.Add.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.Add.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo(905, 905);
      assertEquals(905, newV0.main());
      assertEquals(1810, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo(0, (-3545));
      assertEquals(905, newV0.main());
      assertEquals((-3545), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo(0, 0);
      assertEquals(905, newV0.main());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.main();
      assertEquals(905, int0);
  }
}
