/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 13:56:41 GMT 2024
 */

package benchmarks.CLEVER.odd.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.CLEVER.odd.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.client((-309));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV();
      // Undeclared exception!
      newV0.lib(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV newV0 = new newV();
      // Undeclared exception!
      newV0.client(0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV newV0 = new newV();
      int int0 = newV0.lib(430);
      assertEquals(2, int0);
  }
}
