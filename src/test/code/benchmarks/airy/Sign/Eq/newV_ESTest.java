/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:51:26 GMT 2024
 */

package benchmarks.airy.Sign.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.airy.Sign.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = newV.snippet((-2121.652), 1972.6766736148995);
      assertEquals(2121.652, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = newV.snippet(1972.6766736148995, 0.0);
      assertEquals(1972.6766736148995, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = newV.snippet(2932.43733, (-1.0));
      assertEquals((-2932.43733), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = newV.snippet((-994.09463), 0.0);
      assertEquals(994.09463, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = newV.snippet(0.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = newV.snippet(0.0, (-994.09463));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = newV.snippet((-994.09463), (-994.09463));
      assertEquals((-994.09463), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      newV newV0 = new newV();
  }
}
