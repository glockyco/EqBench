/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:09:34 GMT 2024
 */

package benchmarks.CLEVER.Add.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.Add.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(0, 0);
      assertEquals(905, oldV0.main());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(5, 5);
      assertEquals(905, oldV0.main());
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo((-10), (-10));
      assertEquals(905, oldV0.main());
      assertEquals((-20), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main();
      assertEquals(905, int0);
  }
}
