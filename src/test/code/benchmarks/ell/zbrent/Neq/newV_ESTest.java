/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 17:27:52 GMT 2024
 */

package benchmarks.ell.zbrent.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ell.zbrent.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = newV.MAX(2329.2223036, 0.0);
      assertEquals(2329.2223036, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = newV.SQR(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = newV.MIN(239.0091386, 239.0091386);
      assertEquals(239.0091386, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = newV.MAX(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = newV.SIGN(0.0, (-1973.7934));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = newV.SIGN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.MIN(9724.181782122756, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.MIN((-1375.428075439121), 2461.954747769975);
      assertEquals((-1375.428075439121), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.MAX((-2572.28051816), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = newV.SIGN((-1.411790394294124), (-3206.839249048691));
      assertEquals((-1.411790394294124), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.SIGN((-1.411790394294124), 1485.7094);
      assertEquals(1.411790394294124, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.snippet((-0.1593626521792), (-2.187536493976175E-11), (-2.187536493976175E-11));
      assertEquals(0.9204029647699796, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = newV.snippet((-3206.839249048691), (-3206.839249048691), (-3206.839249048691));
      assertEquals((-1.411790394294124), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = newV.snippet(1.411790394294124, 1.0E-14, 1485.7094);
      assertEquals(1.9913055676848925, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = newV.snippet(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = newV.snippet((-2.187536493976175E-11), (-280.077), 0.9204029647699796);
      assertEquals(0.555871363232895, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = newV.SQR((-36.82432672114426));
      assertEquals(1356.031038465579, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      newV newV0 = new newV();
  }
}
