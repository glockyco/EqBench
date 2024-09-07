/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 16:34:58 GMT 2024
 */

package benchmarks.ell.ell.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ell.ell.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = newV.SIGN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = newV.SIGN((-4380.9939609910125), 0.0);
      assertEquals(4380.9939609910125, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = newV.snippet(0.0, 0.2);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = newV.snippet(1808.247639923, 0.0);
      assertEquals((-1.3097285447209535), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = newV.SQR((-1.0));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = newV.SIGN(0.0, (-4070.613));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.MIN(2246.2530445361, 2246.2530445361);
      assertEquals(2246.2530445361, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.MIN((-1212.5395847865418), (-1212.5395847865418));
      assertEquals((-1212.5395847865418), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.MAX((-2274.825027929), (-2274.825027929));
      assertEquals((-2274.825027929), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = newV.MIN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.MIN(1808.247639923, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.MAX((-1724.1), 1659.6740075731464);
      assertEquals(1659.6740075731464, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = newV.MAX(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = newV.SQR(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = newV.snippet((-1504.1409359132483), (-1504.1409359132483));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = newV.SIGN(0.7993585376434894, (-1091.80367543851));
      assertEquals((-0.7993585376434894), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = newV.SIGN(10.004432713676715, 10.004432713676715);
      assertEquals(10.004432713676715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = newV.SIGN((-1091.80367543851), (-1091.80367543851));
      assertEquals((-1091.80367543851), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      newV newV0 = new newV();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = newV.snippet((-1091.80367543851), 0.7993585376434894);
      assertEquals(1.2165256756476828, double0, 0.01);
  }
}
