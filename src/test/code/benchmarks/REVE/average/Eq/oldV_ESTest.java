/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 23:05:49 GMT 2024
 */

package benchmarks.REVE.average.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.REVE.average.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      oldV oldV0 = new oldV();
      int[] intArray0 = new int[2];
      double double0 = oldV0.average((-1714), intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      oldV oldV0 = new oldV();
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      double double0 = oldV0.average(3, intArray0);
      assertEquals(0.3333333333333333, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      oldV oldV0 = new oldV();
      int[] intArray0 = new int[7];
      intArray0[0] = (-2300);
      double double0 = oldV0.average(1, intArray0);
      assertEquals((-2300.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      oldV oldV0 = new oldV();
      // Undeclared exception!
      try { 
        oldV0.average(1132, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("benchmarks.REVE.average.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      oldV oldV0 = new oldV();
      int[] intArray0 = new int[9];
      double double0 = oldV0.average(0, intArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      oldV oldV0 = new oldV();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        oldV0.average(807, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("benchmarks.REVE.average.Eq.oldV", e);
      }
  }
}
