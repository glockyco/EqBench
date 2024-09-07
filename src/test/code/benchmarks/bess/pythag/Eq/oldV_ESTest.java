/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:03:35 GMT 2024
 */

package benchmarks.bess.pythag.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.pythag.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet((-1320.660936768), (-1320.660936768));
      assertEquals(1867.6966080736622, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet((-1786.446), (-291.2604174445));
      assertEquals(1810.0336852351518, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet((-2831.695944558283), 1622548.0973318398);
      assertEquals(1622550.5682896592, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.SQR(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.SQR((-934.4332772506));
      assertEquals(873165.5496332967, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
