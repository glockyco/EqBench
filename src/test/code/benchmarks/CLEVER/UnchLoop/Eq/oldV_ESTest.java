/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 13:06:47 GMT 2024
 */

package benchmarks.CLEVER.UnchLoop.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.CLEVER.UnchLoop.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo((-1), (-1));
      assertEquals(1, int0);
      assertEquals(4501, oldV0.main());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(1, (-1));
      assertEquals(4501, oldV0.main());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      oldV0.foo(4501, 4501);
      oldV0.foo(4501, (-883));
      // Undeclared exception!
      oldV0.foo(1892, 3392);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      oldV0.foo(957, (-1517));
      oldV0.main();
      oldV0.foo(4501, 957);
      oldV0.main();
      oldV0.main();
      oldV0.main();
      oldV0.main();
      oldV0.main();
      oldV0.foo(4501, 1);
      // Undeclared exception!
      oldV0.main();
  }
}
