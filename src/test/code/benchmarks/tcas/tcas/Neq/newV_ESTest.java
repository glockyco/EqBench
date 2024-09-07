/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 20:30:11 GMT 2024
 */

package benchmarks.tcas.tcas.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.tcas.tcas.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend(0, (-864), 0, 0, (-1), (-1), 0, 311, 0, 712, (-1), 0, 1012, (-3492));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.Non_Crossing_Biased_Descend((-1418), (-1101), 1, (-1), (-1253), 740, 3552, 1, 3, 740, 300, 1020, (-1), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1101
         //
         verifyException("benchmarks.tcas.tcas.Neq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = newV.altseptest((-5196), (-5196), (-5196), (-5196), 600, 0, 802, 0, 802, (-1514), 600, (-5196), (-1), (-2717));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = newV.altseptest(0, 0, 498, 362, 600, 0, 258, 258, (-1145), 600, 0, 1127, (-1145), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = newV.Inhibit_Biased_Climb(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (-4322), 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = newV.ALIM(0, 0, 3955, (-1334), (-429), (-1334), (-429), (-429), 0, 866, 0, (-429), 0, 0);
      assertEquals(400, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.altseptest(2, 4203, 1230, 0, (-633), 0, 0, 0, 2, 0, 623, 0, 0, 2875);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4203
         //
         verifyException("benchmarks.tcas.tcas.Neq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.Non_Crossing_Biased_Descend((-2798), (-385), 100, 160, 4233, (-2798), 624, 0, (-1), 1, 1, 624, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -385
         //
         verifyException("benchmarks.tcas.tcas.Neq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = newV.Inhibit_Biased_Climb(700, (-3396), 700, 390, 700, 1127, 1260, 390, 390, (-1), 700, (-1), 390, (-778));
      assertEquals((-778), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = newV.Own_Above_Threat((-1172), (-1983), (-381), (-1983), (-6427), 0, 0, (-1983), 983, (-1983), 1, 1, 62, 62);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = newV.Own_Above_Threat(964, (-588), (-1), 600, (-3006), 0, 964, (-1), 5090, 0, 600, 0, 2795, 1994);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend((-1), 1, 1, 2635, 3449, 772, (-696), (-2178), 772, (-1094), (-2178), 2, 87, (-696));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend((-2426), 0, 2736, 2075, 300, 2184, 740, (-682), (-1104), (-709), 2184, (-231), 0, 598);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend(1, 1, (-21), (-297), (-2393), (-2393), 1, 0, (-2393), 0, 2477, (-1648), 2608, 2578);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend(0, 0, (-70), 0, 0, 0, 1674, 0, 1674, 1568, 3055, 0, 0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = newV.Own_Below_Threat((-1253), (-1884), (-1), (-1884), (-1884), 1020, (-1101), (-5796), (-654), (-1), 1303, (-1884), 0, 422);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = newV.Own_Below_Threat(0, 1633, 0, 0, (-2798), 1633, 1633, 0, 0, 1633, 1633, 0, 0, (-385));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb(65, 600, 600, (-2649), (-3391), 600, 0, 0, 0, 0, (-3391), (-4878), 964, 583);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb((-839), 0, (-1113), 0, (-839), (-864), 0, (-864), (-864), 0, 1384, 0, 0, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb(0, 0, 2994, 0, 300, (-1), 1115, 0, 1966, 119, (-1496), 2, 553, 2994);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb((-1), (-1), (-1), (-1), 3763, (-1), 3763, (-1), (-1), (-1), 1679, (-1), (-1), 1679);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb(0, 0, 2, 0, 4203, 986, 4203, 623, 0, (-1115), 2875, 1230, 0, 986);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.Non_Crossing_Biased_Climb(0, 640, (-2491), (-4099), 0, (-1), (-1), 0, 0, 2085, (-2491), (-2491), 0, 613);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 640
         //
         verifyException("benchmarks.tcas.tcas.Neq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        newV.ALIM(2077, (-70), 1, (-1), 1815, (-938), 680, 1008, (-1537), 732, 2582, 1133, 1674, 634);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -70
         //
         verifyException("benchmarks.tcas.tcas.Neq.newV", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = newV.Inhibit_Biased_Climb(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
      assertEquals(301, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend((-592), 0, (-592), 640, 0, (-592), 640, 891, 640, (-2491), 891, (-592), 640, 640);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Descend(0, 1940, 1, 0, 0, 1, (-1), 0, 1, 2077, 0, (-1), (-1), 1674);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb((-766), 0, (-766), 0, 1, (-766), (-766), (-766), (-766), (-766), 446, 0, 446, 446);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = newV.Non_Crossing_Biased_Climb(0, 0, (-682), 0, 0, 0, (-864), 2184, (-77), (-3769), 1, 0, 0, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = newV.altseptest(1397, 0, 1546, 1397, 1397, 301, 1, 1397, 1644, 301, 1397, 1, 1397, 3997);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = newV.altseptest(647, 1, 1, 301, 1, 301, 1, 1, 1, 301, 647, 1, 1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = newV.altseptest(0, (-743), 0, 740, 1, (-743), 2132, 0, (-3769), (-743), 0, 740, 0, 2075);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = newV.altseptest(3997, 301, 2, (-1259), 3997, 1397, 1397, 1644, (-1259), 3997, (-1259), (-1259), (-1259), 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = newV.altseptest(1323, 2, 0, (-4878), 2, 1994, 0, 1617, 0, (-303), 2614, 2614, (-303), 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      newV newV0 = new newV();
  }
}
