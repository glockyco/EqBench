/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:29:14 GMT 2024
 */

package benchmarks.dart.test.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.dart.test.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(1413, (-981));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(20, 20);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(0, 20);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet(1333, 1333);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.snippet((-10), (-1467));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.snippet(1, 10);
      assertEquals(1000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = oldV.snippet((-1467), 20);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = oldV.snippet(1, (-1467));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double double0 = oldV.snippet(1333, 20);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
