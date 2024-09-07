/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:06:21 GMT 2024
 */

package benchmarks.raytrace.raytrace.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.raytrace.raytrace.Eq.newV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class newV_ESTest extends newV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(725.8F, 0.0F, 857.94F);
      newV_Vector3D0.x = (-1.0F);
      newV_Vector3D0.normalize();
      newV_Vector3D0.normalize();
      assertEquals(0.9999993F, newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(1, 1, 0.001F);
      newV.Light newV_Light0 = new newV.Light(1, newV_Vector3D0, 7.071066E-4F, 1, 0.001F);
      assertEquals(0.7071066F, newV_Vector3D0.x, 0.01F);
      assertEquals(7.071066E-4F, newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D((-1081.9647F), 0.0F, 0.0F);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(newV_Vector3D0);
      assertEquals(0.0F, newV_Vector3D1.y, 0.01F);
      assertEquals((-1081.9647F), newV_Vector3D1.x, 0.01F);
      assertEquals(0.0F, newV_Vector3D1.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      newV.Surface newV_Surface0 = new newV.Surface((-2997.8F), (-2997.8F), (-2997.8F), 0.0F, 287.039F, 287.039F, 0.0F, 1683.135F, 1683.135F, 1683.135F);
      assertEquals(1683.135F, newV_Surface0.kt, 0.01F);
      assertEquals((-2997.8F), newV_Surface0.ig, 0.01F);
      assertEquals(0.0F, newV_Surface0.ka, 0.01F);
      assertEquals(0.0F, newV_Surface0.ns, 0.01F);
      assertEquals(287.039F, newV_Surface0.kd, 0.01F);
      assertEquals((-2997.8F), newV_Surface0.ib, 0.01F);
      assertEquals((-2997.8F), newV_Surface0.ir, 0.01F);
      assertEquals(287.039F, newV_Surface0.ks, 0.01F);
      assertEquals(6.600515F, newV_Surface0.kr, 0.01F);
      assertEquals(1683.135F, newV_Surface0.nt, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      newV.Surface newV_Surface0 = new newV.Surface(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F);
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 1.0F, 0.00392156F);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D(newV_Vector3D0);
      newV.Sphere newV_Sphere0 = new newV.Sphere(newV_Surface0, newV_Vector3D1, 0.0F);
      newV_Sphere0.center = newV_Vector3D0;
      newV_Vector3D1.normalize();
      newV.Sphere newV_Sphere1 = new newV.Sphere(newV_Surface0, newV_Vector3D1, 0.00392156F);
      boolean boolean0 = newV_Sphere1.intersect(newV_Sphere0);
      assertEquals(0.9999923F, newV_Vector3D1.y, 0.01F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D((-1239.2F), (-1.0F), (-1239.2F));
      newV.Surface newV_Surface0 = new newV.Surface((-1.0F), (-1239.2F), 0.0F, 0.0F, (-1.0F), (-1239.2F), (-1.0F), (-1239.2F), (-2397.6F), 0.0F);
      newV.Sphere newV_Sphere0 = new newV.Sphere(newV_Surface0, newV_Vector3D0, 0.0F);
      newV.Vector3D newV_Vector3D1 = new newV.Vector3D((-1.0F), (-4.859597F), 266.5676F);
      newV.Sphere newV_Sphere1 = new newV.Sphere(newV_Surface0, newV_Vector3D1, (-1239.2F));
      boolean boolean0 = newV_Sphere0.intersect(newV_Sphere1);
      assertEquals((-1.0F), newV_Vector3D1.x, 0.01F);
      assertEquals((-2397.6F), newV_Surface0.kt, 0.01F);
      assertEquals((-4.859597F), newV_Vector3D1.y, 0.01F);
      assertEquals((-4.859597F), newV_Surface0.kr, 0.01F);
      assertEquals(0.0F, newV_Surface0.nt, 0.01F);
      assertEquals((-1.0F), newV_Surface0.kd, 0.01F);
      assertEquals(0.0F, newV_Surface0.ib, 0.01F);
      assertEquals((-1239.2F), newV_Surface0.ig, 0.01F);
      assertEquals((-1.0F), newV_Surface0.ns, 0.01F);
      assertFalse(boolean0);
      assertEquals((-1239.2F), newV_Surface0.ks, 0.01F);
      assertEquals(0.0F, newV_Surface0.ka, 0.01F);
      assertEquals((-1.0F), newV_Surface0.ir, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D((-1081.9647F), 0.0F, 0.0F);
      newV.Sphere newV_Sphere0 = new newV.Sphere((newV.Surface) null, newV_Vector3D0, 0.0F);
      boolean boolean0 = newV_Sphere0.intersect(newV_Sphere0);
      assertTrue(boolean0);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      assertEquals((-1081.9647F), newV_Vector3D0.x, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 1.0F, 0.00392156F);
      newV_Vector3D0.normalize();
      newV_Vector3D0.normalize();
      assertEquals(0.9999923F, newV_Vector3D0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 0.0F, 0.0F);
      newV.Light newV_Light0 = new newV.Light(1, newV_Vector3D0, 0, 1, 0.0F);
      assertEquals(1, newV_Light0.lightType);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.z, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.x, 0.01F);
      assertEquals(0.0F, newV_Light0.ib, 0.01F);
      assertEquals(0.0F, newV_Light0.ir, 0.01F);
      assertEquals(1.0F, newV_Light0.ig, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      newV.Vector3D newV_Vector3D0 = new newV.Vector3D(0.0F, 0.0F, 0.0F);
      newV.Light newV_Light0 = new newV.Light((-2), newV_Vector3D0, (-2), 0.0F, 0.0F);
      newV.Light newV_Light1 = new newV.Light(0, newV_Light0.lvec, (-2.0F), (-2), (-2.0F));
      assertEquals((-2.0F), newV_Light1.ig, 0.01F);
      assertEquals((-2.0F), newV_Light1.ib, 0.01F);
      assertEquals((-2), newV_Light0.lightType);
      assertEquals(0.0F, newV_Vector3D0.x, 0.01F);
      assertEquals((-2.0F), newV_Light0.ir, 0.01F);
      assertEquals(0.0F, newV_Light0.ib, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.y, 0.01F);
      assertEquals(0.0F, newV_Light0.ig, 0.01F);
      assertEquals(0.0F, newV_Vector3D0.z, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      newV newV0 = new newV();
  }
}
