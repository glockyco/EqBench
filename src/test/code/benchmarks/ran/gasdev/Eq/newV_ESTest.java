/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:58:30 GMT 2024
 */

package benchmarks.ran.gasdev.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ran.gasdev.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet(0, 0);
      assertEquals((-1.6954114856236413), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet((-2664), 32);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.ran1(32);
      assertEquals(0.41599935685098144, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.ran1((-2028));
      assertEquals(0.7422131494349862, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(1576, 1576);
      assertEquals((-1.6954114856236413), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      newV newV0 = new newV();
  }
}
