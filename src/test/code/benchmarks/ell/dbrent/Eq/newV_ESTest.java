/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 16:53:13 GMT 2024
 */

package benchmarks.ell.dbrent.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ell.dbrent.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = newV.MIN(0.0, 1809.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = newV.SIGN((-6838.570531035219), (-0.5289547820998222));
      assertEquals((-6838.570531035219), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = newV.snippet(549.46476551572, 1.0, 1.0, 549.46476551572, (-2674.980387580376));
      assertEquals(0.8414709848078965, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = newV.SQR(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = newV.MIN(2118.89, 2118.89);
      assertEquals(2118.89, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = newV.MIN(0.0, (-8.0));
      assertEquals((-8.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.MAX(0.0, (-0.578387971174914));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.MAX((-0.5289547820998222), (-6838.570531035219));
      assertEquals((-0.5289547820998222), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.SIGN(0.0, 1809.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = newV.SIGN(0.0, (-726.114746));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.MAX(0.0, 2973.1014778861);
      assertEquals(2973.1014778861, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.MAX(0.5, 0.5);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = newV.SIGN((-3172.8532135264), 0.0);
      assertEquals(3172.8532135264, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = newV.snippet(0.0, 2187.0, 0.5, (-1.0), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = newV.snippet((-472.19047018693), (-472.19047018693), 0.0, 0.0, 2216.331);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = newV.snippet((-2936.08), 0.0, (-2936.08), 0.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = newV.snippet(0.3365503039542188, 668.81598412531, 1369.57415, 0.3365503039542188, 668.81598412531);
      assertEquals((-0.7240106993273985), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = newV.snippet(527242.6243586445, (-1.1677063269057155), (-146.4174745), 1.0, (-0.4279363998576389));
      assertEquals((-0.9198532960957566), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = newV.snippet(0.0, 2973.1014778861, 0.0, 0.0, 0.0);
      assertEquals((-0.8709330737088601), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      newV newV0 = new newV();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = newV.SQR((-726.114746));
      assertEquals(527242.6243586445, double0, 0.01);
  }
}
