/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 17:09:31 GMT 2024
 */

package benchmarks.ell.rd.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.ell.rd.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = oldV.SIGN((-342.2879647874), (-1129.25517786608));
      assertEquals((-342.2879647874), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, (-1000.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = oldV.SQR(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = oldV.SIGN(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = oldV.MIN(0.0, 61.924);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = oldV.MIN(4.5E21, 2108.363719323);
      assertEquals(2108.363719323, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = oldV.MAX((-1314.959120274085), (-1314.959120274085));
      assertEquals((-1314.959120274085), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = oldV.MIN((-1121.251), (-1314.959120274085));
      assertEquals((-1314.959120274085), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = oldV.MIN((-1314.959120274085), (-1314.959120274085));
      assertEquals((-1314.959120274085), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = oldV.MAX(0.0, 4.5E21);
      assertEquals(4.5E21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.SIGN(4.5E21, (-1094.7566978776001));
      assertEquals((-4.5E21), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = oldV.SIGN(4.5E21, 2108.363719323);
      assertEquals(4.5E21, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = oldV.SIGN((-319.40179996156405), 2224.801888980736);
      assertEquals(319.40179996156405, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = oldV.snippet(2224.801888980736, 781.6909438169207, 781.6909438169207);
      assertEquals(3.224526402435422E-5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = oldV.snippet(2224.801888980736, 781.6909438169207, (-319.40179996156405));
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.snippet(2.025E43, 4.100625E86, 2108.363719323);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = oldV.snippet((-1129.25517786608), (-1129.25517786608), 4.5E21);
      assertEquals((-1000.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = oldV.SQR(4.5E21);
      assertEquals(2.025E43, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
