/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:43:37 GMT 2024
 */

package benchmarks.CLEVER.LoopUnreach20.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.LoopUnreach20.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main(22);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(0, 132);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo((-779646), 4964);
      assertEquals(424804552, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo(21, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main(2572);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main((-431));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.foo((-431), 18);
      assertEquals((-7758), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.main(18);
      assertEquals(0, int0);
  }
}
