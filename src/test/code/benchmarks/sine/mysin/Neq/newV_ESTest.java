/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:47:15 GMT 2024
 */

package benchmarks.sine.mysin.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.sine.mysin.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = newV.helperdoubleToRawBits(0.0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = newV.helperdoubleToRawBits(3918.3876732370495);
      assertEquals(4660835040691438931L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = newV.snippet(4.5035996273704815E15);
      assertEquals(1.5387504800514722, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = newV.snippet(0.013183813375508467);
      assertEquals(0.0054220078845389754, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = newV.snippet((-355.0));
      assertEquals((-3.0144353374783606E-5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = newV.snippet((-4579019712116092325L));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = newV.snippet(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double double0 = newV.snippet(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = newV.snippet((-6.4462E-10));
      assertEquals((-6.4462E-10), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      newV newV0 = new newV();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = newV.helperdoubleToRawBits((-320.864532288431));
      assertEquals((-4579019712116092325L), long0);
  }
}
