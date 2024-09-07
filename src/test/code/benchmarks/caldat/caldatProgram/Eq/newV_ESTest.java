/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 17:36:56 GMT 2024
 */

package benchmarks.caldat.caldatProgram.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.caldat.caldatProgram.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      newV.caldat(2147458839);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      newV.caldat((-1073741824));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.caldat(2299161);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.flmoon((-30), (-540));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.julday(2481, (-1789569706), 2399);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      newV.badluk(2147483646);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.julday((-1766), 0, 275);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.julday(0, 799, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.julday(50616, 50616, (-734));
      assertEquals(2040388.2783776403, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = newV.badluk(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = newV.badluk(885);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      newV.caldat(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      newV.caldat(885);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      newV.flmoon(73731529, 6);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      newV.flmoon(0, 1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      newV.flmoon((-1283), 2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      newV.flmoon(0, 3);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      newV.flmoon(0, 0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      newV newV0 = new newV();
      assertEquals(0.0, newV.frac, 0.01);
  }
}
