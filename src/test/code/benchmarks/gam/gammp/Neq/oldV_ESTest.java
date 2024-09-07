/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 19:39:41 GMT 2024
 */

package benchmarks.gam.gammp.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.gam.gammp.Neq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = oldV.gser(Double.NaN, Double.NaN, 0.0, 772.4710203161814);
      assertEquals(772.4710203161814, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = oldV.gser((-1251.56614), 0.0, 589.4, (-1.0));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = oldV.snippet(363.3504324317454, 1776.705471859338, 1.0, 0.0, 1.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = oldV.snippet(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = oldV.snippet(0.0, 0.0, 0.0, 0.0, 1545.040063905);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.snippet(1695.02585428971, 1695.02585428971, 0.0, 1632.8591008475755, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.gser(0.0, 1776.705471859338, 1776.705471859338, (-22.78));
      assertEquals((-22.78), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = oldV.gcf(3204.171857795377, 0.0, (-1543.218));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = oldV.gcf(436.8400555237227, 1680.1239147, 0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = oldV.gcf(1470.894461, 716.29, 1078.0747128625);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.gammln(1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.gammln(1.000000000190015);
      assertEquals((-1.0968070895955861E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = oldV.gammln(0.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = oldV.gser(1.0, 1.0, 1.0, 664.1448808106);
      assertEquals(0.6321205588285578, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = oldV.gcf(2.0, (-1.0), 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = oldV.gcf(2.0, 0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.gser((-86.50532032941678), (-86.50532032941678), 0.0, (-86.50532032941678));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.snippet(2.0, 45.92289718352917, Double.NaN, 0.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.snippet((-2262.46882002488), 754.093651, 0.0, 0.0, (-883.4));
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = oldV.snippet(598.013602010778, 433.0, 0.0, 754.093651, (-1905.1));
      assertEquals(3.751519081061792E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = oldV.snippet((-86.50532032941678), (-86.50532032941678), 598.013602010778, 598.013602010778, 598.013602010778);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
