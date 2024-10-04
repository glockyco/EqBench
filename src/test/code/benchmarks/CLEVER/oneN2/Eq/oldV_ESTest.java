/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 14:24:46 GMT 2024
 */

package benchmarks.CLEVER.oneN2.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.oneN2.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.lib(10);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.lib((-3506));
      assertEquals((-3506), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.client(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.lib(238);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.lib(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.client(4518);
      assertEquals(4518, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.client((-107));
      assertEquals((-107), int0);
  }
}
