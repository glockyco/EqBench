/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:51:04 GMT 2024
 */

package benchmarks.CLEVER.getSign2.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.getSign2.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib(1179);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib((-2740));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client(2012);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client((-1696));
      assertEquals((-1), int0);
  }
}
