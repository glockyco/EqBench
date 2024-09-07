/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:38:27 GMT 2024
 */

package benchmarks.gam.gammp.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.gammp.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = newV.snippet(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-583.954), 2661.1, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = newV.snippet((-77.771194055), 5.5, 5.5, 1110.13, 1110.13);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = newV.snippet(866.693423, 866.693423, 866.693423, 0.0, 0.0);
      assertEquals(866.693423, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = newV.gser((-1.0), 2595.568721352266, (-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = newV.gcf(0.0, 1830.46506893138, 4.94065645841247E-310);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = newV.gcf(3479.3675127395613, 3479.3675127395613, 24890.34467104419);
      assertEquals(0.4977455565070159, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.gcf(866.693423, 24.01409824083091, 51.65118901084351);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.gammln(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.gammln(2.0);
      assertEquals((-4.440892098500626E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = newV.gammln(0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.gser((-2595.0), 459.31302, 0.0, 1795.6516892495752);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.gser(Double.NaN, Double.NaN, (-2473.0), 4697.682898443028);
      assertEquals(4697.682898443028, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = newV.gser(248.0804092, 0.0, 1.0, Double.NaN);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = newV.gser(248.0804092, (-2473.0), (-2473.0), 4697.682898443028);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = newV.snippet(4697.682898443028, 1.0, Double.NaN, Double.NaN, (-2473.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = newV.snippet(0.0, 0.0, 0.0, 0.0, 0.0);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = newV.snippet(Double.NaN, 4697.682898443028, 4697.682898443028, 248.0804092, Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = newV.snippet(248.0804092, (-2473.0), Double.NaN, 248.0804092, (-2473.0));
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      newV newV0 = new newV();
  }
}
