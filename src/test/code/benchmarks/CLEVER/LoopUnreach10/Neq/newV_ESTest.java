/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:37:06 GMT 2024
 */

package benchmarks.CLEVER.LoopUnreach10.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.LoopUnreach10.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.main(12);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.main(9);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo((-498), (-498));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo(0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.main(2164);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.main((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.foo((-1), 1);
      assertEquals(1, int0);
  }
}
