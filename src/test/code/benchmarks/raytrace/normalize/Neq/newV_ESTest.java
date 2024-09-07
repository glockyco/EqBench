/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:21:42 GMT 2024
 */

package benchmarks.raytrace.normalize.Neq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.raytrace.normalize.Neq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0, 0.0F, 0);
      newV.Light newV_Light0 = new newV.Light(0, newV_Vector3D0, 0.0F, (-2646.6F), 0.0F);
      newV_Light0.lvec = newV_Vector3D0;
      newV_Light0.lvec.normalize();
      newV_Light0.lvec.normalize();
      assertEquals(Float.NaN, newV_Vector3D0.y, 0.01F);
      assertEquals((-2646.6F), newV_Light0.ig, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D((-1.0F), (-772.73F), (-1.0F));
      newV_Vector3D0.normalize();
      assertEquals((-0.001294111F), newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 0.0F, 0.0F);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      
      newV_Vector3D0.y = Float.NaN;
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(newV_Vector3D0);
      assertEquals(Float.NaN, newV_Vector3D1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.001F, 1625.96F, (-138.358F));
      newV.Light newV_Light0 = new newV.Light((-1), newV_Vector3D0, (-138.358F), (-2608.1804F), (-1.0F));
      assertEquals((-2608.1804F), newV_Light0.ig, 0.01F);
      assertEquals((-138.358F), newV_Light0.ir, 0.01F);
      assertEquals((-1), newV_Light0.lightType);
      assertEquals(1625.96F, newV_Vector3D0.y, 0.01F);
      assertEquals(0.001F, newV_Vector3D0.x, 0.01F);
      assertEquals((-138.358F), newV_Vector3D0.z, 0.01F);
      assertEquals((-1.0F), newV_Light0.ib, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.Surface newV_Surface0 = new newV.Surface(0.0F, 0.0F, 0.57735026F, 0.0F, 0.0F, 2177.0F, 0.0F, (-1.0F), 778.319F, 1.0F);
      assertEquals(0.57735026F, newV_Surface0.ib, 0.01F);
      assertEquals(1.0F, newV_Surface0.nt, 0.01F);
      assertEquals(0.0F, newV_Surface0.ka, 0.01F);
      assertEquals(0.0F, newV_Surface0.ir, 0.01F);
      assertEquals(0.0F, newV_Surface0.kd, 0.01F);
      assertEquals(778.319F, newV_Surface0.kt, 0.01F);
      assertEquals((-0.00392156F), newV_Surface0.kr, 0.01F);
      assertEquals(2177.0F, newV_Surface0.ks, 0.01F);
      assertEquals(0.0F, newV_Surface0.ns, 0.01F);
      assertEquals(0.0F, newV_Surface0.ig, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      newV.Surface newV_Surface0 = new newV.Surface(0.001F, 0.001F, 0.001F, 1066.1F, 0.001F, (-2265.4895F), (-1.0F), 0.001F, 0.001F, 0.001F);
      assertEquals(1066.1F, newV_Surface0.ka, 0.01F);
      assertEquals(0.001F, newV_Surface0.ig, 0.01F);
      assertEquals((-2265.4895F), newV_Surface0.ks, 0.01F);
      assertEquals(3.92156E-6F, newV_Surface0.kr, 0.01F);
      assertEquals((-1.0F), newV_Surface0.ns, 0.01F);
      assertEquals(0.001F, newV_Surface0.ib, 0.01F);
      assertEquals(0.001F, newV_Surface0.kt, 0.01F);
      assertEquals(0.001F, newV_Surface0.ir, 0.01F);
      assertEquals(0.001F, newV_Surface0.kd, 0.01F);
      assertEquals(0.001F, newV_Surface0.nt, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      newV.Surface newV_Surface0 = new newV.Surface(0.0F, 4193.72F, 0.0F, 4193.72F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(4193.72F, 0.0F, 4193.72F);
      newV.Sphere newV_Sphere0 = new newV.Sphere(newV_Surface0, newV_Vector3D0, 0.0F);
      boolean boolean0 = newV_Sphere0.intersect(newV_Sphere0);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      assertEquals(4193.72F, newV_Surface0.ka, 0.01F);
      assertTrue(boolean0);
      assertEquals(0.0F, newV_Surface0.ks, 0.01F);
      assertEquals(4193.72F, newV_Vector3D0.x, 0.01F);
      assertEquals(0.0F, newV_Surface0.ib, 0.01F);
      assertEquals(0.0F, newV_Surface0.ir, 0.01F);
      assertEquals(0.0F, newV_Surface0.nt, 0.01F);
      assertEquals(0.0F, newV_Surface0.kr, 0.01F);
      assertEquals(0.0F, newV_Surface0.ns, 0.01F);
      assertEquals(4193.72F, newV_Surface0.ig, 0.01F);
      assertEquals(4193.72F, newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 0.0F, 0.0F);
      newV.Surface newV_Surface0 = new newV.Surface(0.0F, 3751.4465F, 0.0F, Float.NaN, (-1122.5696F), 1.0F, (-4535.049F), 0.0F, 1384.7F, 1384.7F);
      newV.Sphere newV_Sphere0 = new newV.Sphere(newV_Surface0, newV_Vector3D0, Float.NaN);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(98.63461F, Float.NaN, (-4535.049F));
      newV.Sphere newV_Sphere1 = new newV.Sphere(newV_Surface0, newV_Vector3D1, (-2542.0469F));
      boolean boolean0 = newV_Sphere0.intersect(newV_Sphere1);
      assertEquals(98.63461F, newV_Vector3D1.x, 0.01F);
      assertEquals((-1122.5696F), newV_Surface0.kd, 0.01F);
      assertEquals((-4535.049F), newV_Surface0.ns, 0.01F);
      assertEquals(0.0F, newV_Surface0.kr, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      assertEquals(0.0F, newV_Surface0.ir, 0.01F);
      assertEquals(1.0F, newV_Surface0.ks, 0.01F);
      assertEquals((-4535.049F), newV_Vector3D1.z, 0.01F);
      assertEquals(Float.NaN, newV_Vector3D1.y, 0.01F);
      assertTrue(boolean0);
      assertEquals(3751.4465F, newV_Surface0.ig, 0.01F);
      assertEquals(Float.NaN, newV_Surface0.ka, 0.01F);
      assertEquals(1384.7F, newV_Surface0.nt, 0.01F);
      assertEquals(0.0F, newV_Surface0.ib, 0.01F);
      assertEquals(1384.7F, newV_Surface0.kt, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0, 0, 0);
      newV_Vector3D0.z = (-161.67834F);
      newV_Vector3D0.normalize();
      newV_Vector3D0.normalize();
      assertEquals((-1.0F), newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(1, 1, 1);
      newV.Light newV_Light0 = new newV.Light(1, newV_Vector3D0, 1, 1.7320508F, 1);
      newV.Light newV_Light1 = new newV.Light(2, newV_Light0.lvec, 1.7320508F, 1.0F, 1.7320508F);
      assertEquals(0.57735026F, newV_Vector3D0.z, 0.01F);
      assertEquals(1.7320508F, newV_Vector3D0.x, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 0.0F, 4193.72F);
      newV.Surface newV_Surface0 = new newV.Surface(0.0F, 4193.72F, 0.0F, 4193.72F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(4193.72F, 0.0F, 4193.72F);
      newV.Sphere newV_Sphere0 = new newV.Sphere(newV_Surface0, newV_Vector3D1, 0.0F);
      newV.Sphere newV_Sphere1 = new newV.Sphere(newV_Surface0, newV_Vector3D0, 4193.72F);
      boolean boolean0 = newV_Sphere0.intersect(newV_Sphere1);
      assertEquals(0.0F, newV_Surface0.ks, 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, newV_Surface0.kd, 0.01F);
      assertEquals(0.0F, newV_Surface0.kt, 0.01F);
      assertEquals(0.0F, newV_Surface0.ib, 0.01F);
      assertEquals(0.0F, newV_Surface0.ir, 0.01F);
      assertEquals(0.0F, newV_Surface0.nt, 0.01F);
      assertEquals(0.0F, newV_Surface0.kr, 0.01F);
      assertEquals(0.0F, newV_Vector3D1.y, 0.01F);
      assertEquals(4193.72F, newV_Surface0.ig, 0.01F);
      assertEquals(4193.72F, newV_Vector3D0.z, 0.01F);
      assertEquals(4193.72F, newV_Surface0.ka, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      newV newV0 = new newV();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(1, 1, 1);
      newV.Light newV_Light0 = new newV.Light(1, newV_Vector3D0, 1, 1.7320508F, 1);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(newV_Light0.lvec);
      assertEquals(0.57735026F, newV_Vector3D0.z, 0.01F);
      assertEquals(1.7320508F, newV_Vector3D0.y, 0.01F);
  }
}
