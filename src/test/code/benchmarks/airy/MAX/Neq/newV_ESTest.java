/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:49:51 GMT 2024
 */

package benchmarks.airy.MAX.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.airy.MAX.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet((-264.37), (-1314.59195));
      assertEquals((-264.37), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet((-264.37), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
  }
}
