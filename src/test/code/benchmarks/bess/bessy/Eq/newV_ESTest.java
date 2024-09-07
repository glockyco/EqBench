/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 16:18:08 GMT 2024
 */

package benchmarks.bess.bessy.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.bess.bessy.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet(1363.3119235771, 2.356194491);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet(932.44756059, 8.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet(2.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.snippet(8.0, 932.44756059);
      assertEquals(1.8475751175895893E24, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(0.0, 3.733650367E9);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      newV.snippet(7.349264551E8, (-63.585581264463));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      newV newV0 = new newV();
  }
}
