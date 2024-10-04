/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:14:19 GMT 2024
 */

package benchmarks.gam.gser.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.gser.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 651.1850164472274, 651.1850164472274);
      assertEquals(651.1850164472274, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = oldV.snippet(Double.NaN, Double.NaN, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = oldV.snippet(1116.1509656155, 0.0, 1044.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = oldV.snippet(1.0, 1116.1509656155, (-1816.88));
      assertEquals((-1816.88), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = oldV.gammln(1116.1509656155);
      assertEquals(6714.006460357883, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = oldV.gammln(1.000000000190015);
      assertEquals((-1.0968070895955861E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = oldV.gammln(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = oldV.snippet((-68.62165462012777), (-68.62165462012777), (-68.62165462012777));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double double0 = oldV.snippet(77.50547844889725, 77.50547844889725, 77.50547844889725);
      assertEquals(227913.61393198208, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
