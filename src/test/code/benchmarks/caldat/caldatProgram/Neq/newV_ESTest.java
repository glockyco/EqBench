/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 17:40:42 GMT 2024
 */

package benchmarks.caldat.caldatProgram.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.caldat.caldatProgram.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = newV.julday(707, (-16), 1524);
      assertEquals(2278899.3094936176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = newV.badluk(1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.caldat((-2138345419));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.caldat(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.caldat(2299161);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      newV.flmoon((-89), 2412392);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.julday(2806, (-2147479963), 3000958);
      assertEquals((-1.0474305549954066E9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.julday(2318, 2318, 2318);
      assertEquals(2571964.761255684, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.julday((-4713), 231, 231);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = newV.badluk(1648);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.julday(1524, 1524, (-2146558407));
      assertEquals(7.856581985199375E11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.julday((-713), (-3656), 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = newV.badluk(1522);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = newV.badluk(Integer.MAX_VALUE);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      newV.caldat(1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      newV.caldat(2147482560);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      newV.flmoon(3, 3);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      newV.flmoon((-1), (-1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      newV.flmoon((-4722), 0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      newV.flmoon(1, 1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      newV newV0 = new newV();
      assertEquals(0.0, newV.frac, 0.01);
  }
}
