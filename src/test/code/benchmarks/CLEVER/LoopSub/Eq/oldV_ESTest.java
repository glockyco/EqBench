/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 13:30:54 GMT 2024
 */

package benchmarks.CLEVER.LoopSub.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.LoopSub.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo((-1), (-1));
      assertEquals((-2695), oldV0.main());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(2333, 2333);
      assertEquals((-2695), oldV0.main());
      assertEquals((-4666), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(0, 0);
      assertEquals((-2695), oldV0.main());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main();
      assertEquals((-2695), int0);
  }
}
