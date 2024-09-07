/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 13:34:18 GMT 2024
 */

package benchmarks.CLEVER.divide.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.CLEVER.divide.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib(1445, 2285);
      assertEquals(3301825, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib((-1482), 1445);
      assertEquals((-2141490), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client((-1), 190);
      assertEquals((-190), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib((-2508), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client(1, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client((-2508), (-2508));
      assertEquals(6290064, int0);
  }
}
