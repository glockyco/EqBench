/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 15:58:12 GMT 2024
 */

package benchmarks.bess.bessi1.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.bess.bessi1.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(3.75);
      assertEquals(7.78001515135595, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(4111.463018);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet((-1.0));
      assertEquals((-0.5651590975819435), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.snippet((-2655.171114373));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
