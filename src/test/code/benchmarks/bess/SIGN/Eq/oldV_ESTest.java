/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 16:21:11 GMT 2024
 */

package benchmarks.bess.SIGN.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.SIGN.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet((-2231.037), (-389.756001504));
      assertEquals((-2231.037), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(389.756001504, (-2231.037));
      assertEquals((-389.756001504), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 1490.08410173);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet(0.0, (-2231.037));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.snippet(389.756001504, 389.756001504);
      assertEquals(389.756001504, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.snippet((-389.756001504), 0.0);
      assertEquals(389.756001504, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
