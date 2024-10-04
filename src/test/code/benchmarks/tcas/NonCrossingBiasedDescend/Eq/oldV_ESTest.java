/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 20:17:39 GMT 2024
 */

package benchmarks.tcas.NonCrossingBiasedDescend.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.tcas.NonCrossingBiasedDescend.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = oldV.snippet((-1), (-4381), (-4381), (-4381), 0, (-4381), 0, (-4381), 656, (-4381), (-4381), 500, (-4381), 5433);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.snippet(0, 2485, 1518, 1294, (-380), (-1676), 2673, 2673, 2485, 1518, 300, 2485, 300, 2485);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2485
         //
         verifyException("benchmarks.tcas.NonCrossingBiasedDescend.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = oldV.Inhibit_Biased_Climb(0, 0, (-3000), 0, (-1), (-1), 0, 0, (-1), 0, 0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        oldV.ALIM((-1898), (-135), 0, (-1), (-1898), (-1898), (-1), 0, 0, 0, 300, (-2291), (-1898), (-2291));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -135
         //
         verifyException("benchmarks.tcas.NonCrossingBiasedDescend.Eq.oldV", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = oldV.Inhibit_Biased_Climb(1, 1, 951, 1, 1, 951, 951, 951, 951, 1, (-1), 0, 1, 1);
      assertEquals(301, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = oldV.Inhibit_Biased_Climb((-1020), (-1020), (-2009), (-1694), (-1630), 0, (-3867), (-1694), 421, (-906), (-1020), 0, (-2383), (-4312));
      assertEquals((-4312), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = oldV.Own_Above_Threat((-1), (-1208), (-1208), (-1012), (-1012), (-1208), (-1208), (-1), (-1208), (-1), (-1012), (-1012), (-1), (-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = oldV.Own_Above_Threat(0, 0, 0, 0, 0, 0, 2973, 2973, 1197, 2973, 610, 0, 1197, 1197);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = oldV.Own_Below_Threat((-2009), 3452, (-2383), 500, 421, (-4312), 3690, 500, (-4312), (-921), 959, 5800, 640, 1596);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = oldV.Own_Below_Threat((-1694), 0, 0, (-1020), 0, (-4312), 517, 0, 421, (-461), 3690, 0, 0, 121);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = oldV.ALIM(300, 0, 116, 0, 0, (-552), (-497), (-497), 0, 0, 0, 2758, 0, 0);
      assertEquals(400, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = oldV.snippet(5800, 1, 640, 798, 640, (-56), 500, (-906), (-503), 0, 1367, 5101, 640, 500);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = oldV.snippet(0, 2, 2, 1, 2, 2, 1987, 2, 1, 2, 2, 2, 2, 2);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = oldV.snippet(0, 0, 914, 0, 2331, 0, 2331, 2331, (-2352), 639, 2331, (-2352), 914, 2331);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = oldV.snippet(1, 0, 1, 0, 2, 2, 1987, 0, 2, 2, 1987, 2, 1, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = oldV.snippet(0, 0, 0, (-1), (-1543), 1, 79, 79, (-1), 0, 0, 2337, 79, 1538);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = oldV.snippet(5871, 0, (-2356), (-756), 1, (-2356), (-1543), 0, 679, 0, (-1), (-1), 0, (-783));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
