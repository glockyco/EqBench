/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 17:52:32 GMT 2024
 */

package benchmarks.caldat.caldat.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.caldat.caldat.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV.caldat(0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV.caldat(2299161);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV.caldat((-4726));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV.caldat(2439870);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      newV.caldat(1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      newV newV0 = new newV();
      assertEquals(0, newV.id);
  }
}
