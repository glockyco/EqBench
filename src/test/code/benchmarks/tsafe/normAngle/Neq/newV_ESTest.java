/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:59:19 GMT 2024
 */

package benchmarks.tsafe.normAngle.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.tsafe.normAngle.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet(3.141592653589793);
      assertEquals(3.141592653589793, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet((-3.141592653589793));
      assertEquals((-3.141592653589793), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.snippet((-1069.273075695132));
      assertEquals((-1066.1314830415422), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(1968.1242);
      assertEquals(1964.98260734641, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      newV newV0 = new newV();
  }
}
