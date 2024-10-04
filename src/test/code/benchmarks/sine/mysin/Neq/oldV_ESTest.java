/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:46:11 GMT 2024
 */

package benchmarks.sine.mysin.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.sine.mysin.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = oldV.helperdoubleToRawBits(0.0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = oldV.helperdoubleToRawBits((-1345.32984891331));
      assertEquals((-4569740398160126682L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = oldV.snippet((-290.59733));
      assertEquals((-9.542944144458332E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = oldV.snippet((-4568183924776721389L));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = oldV.snippet(4.503599627370496E15);
      assertEquals(0.8956921482198579, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.snippet(4.5035996273704705E15);
      assertEquals((-1.5387504800514735), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.snippet(0.07969262624561801);
      assertEquals((-0.03285684950962326), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = oldV.snippet((-4005.127));
      assertEquals((-0.17766533716488245), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = oldV.snippet((-6.4462136749E-10));
      assertEquals((-6.4462136749E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = oldV.snippet(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.snippet(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.snippet(9221120237041090560L);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = oldV.helperdoubleToRawBits(Double.NaN);
      assertEquals(9221120237041090560L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
