/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 22:29:22 GMT 2024
 */

package benchmarks.REVE.triangularMod.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.REVE.triangularMod.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.f((-809));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.tr((-1343));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      // Undeclared exception!
      oldV0.tr(325);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.tr(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.f(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      oldV oldV0 = new oldV();
      // Undeclared exception!
      oldV0.f(1480);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      oldV oldV0 = new oldV();
      int int0 = oldV0.f(1);
      assertEquals(1, int0);
  }
}
