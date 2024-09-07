/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 18:32:04 GMT 2024
 */

package benchmarks.ran.bnldev.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import benchmarks.ran.bnldev.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      newV.ran1((-1.0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      newV.ran1(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.gammln(1.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.gammln(0.41599935685098144);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.gammln(1.3788103944863002);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      newV.ran1((-1150.76932801949));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      newV.snippet(0.41599935685098144, 2967, Integer.MAX_VALUE, 4);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      newV.snippet(Double.NaN, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      newV.snippet(0.7566071022036756, 1011, (-1397), (-1397));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      newV.snippet(0.17181712955786713, 25, 0, 2182);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = newV.snippet(0.5, 1, 0, (-446));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = newV.snippet(Double.POSITIVE_INFINITY, 2, 0, (-2923));
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = newV.snippet(0.0, 1964, (-1899), 3546);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = newV.snippet(3444.8, (-230), 0, 0);
      assertEquals((-230.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      newV newV0 = new newV();
  }
}
