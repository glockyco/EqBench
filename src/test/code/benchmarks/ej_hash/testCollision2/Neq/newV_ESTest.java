/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 11:55:07 GMT 2024
 */

package benchmarks.ej_hash.testCollision2.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ej_hash.testCollision2.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      newV.testCollision2(2999L, 32, 0L, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      newV newV0 = new newV(1, (-1135L), 1);
      newV0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      newV.testCollision2(32, 32, 1L, 32);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      newV.testCollision2((-1), 1, (-1), 0);
  }
}
