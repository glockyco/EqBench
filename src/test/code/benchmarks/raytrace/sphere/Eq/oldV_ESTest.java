/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 06 12:14:04 GMT 2024
 */

package benchmarks.raytrace.sphere.Eq;

import org.junit.Test;
import static org.junit.Assert.*;
import benchmarks.raytrace.sphere.Eq.oldV;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class oldV_ESTest extends oldV_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(1.0F, 1.0F, 1.0F);
      oldV_Vector3D0.normalize();
      oldV_Vector3D0.normalize();
      assertEquals(0.57735026F, oldV_Vector3D0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(1.0F, 1.0F, 1.0F);
      oldV_Vector3D0.z = 0.0F;
      oldV_Vector3D0.normalize();
      assertEquals(0.70710677F, oldV_Vector3D0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(5022.575F, 0.0F, (-2012.0F));
      oldV.Vector3D oldV_Vector3D1 = new oldV.Vector3D(oldV_Vector3D0);
      assertEquals(5022.575F, oldV_Vector3D1.x, 0.01F);
      assertEquals((-2012.0F), oldV_Vector3D1.z, 0.01F);
      assertEquals(0.0F, oldV_Vector3D1.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(0.0F, 0.0F, 0.0F);
      oldV.Light oldV_Light0 = new oldV.Light(1, oldV_Vector3D0, (-1.0F), 0.0F, 2116.0F);
      assertEquals(0.0F, oldV_Vector3D0.z, 0.01F);
      assertEquals(0.0F, oldV_Vector3D0.y, 0.01F);
      assertEquals(0.0F, oldV_Vector3D0.x, 0.01F);
      assertEquals((-1.0F), oldV_Light0.ir, 0.01F);
      assertEquals(0.0F, oldV_Light0.ig, 0.01F);
      assertEquals(1, oldV_Light0.lightType);
      assertEquals(2116.0F, oldV_Light0.ib, 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D((-1691), (-813.7863F), (-1691));
      oldV.Light oldV_Light0 = new oldV.Light((-1691), oldV_Vector3D0, 0.0F, (-1691.0F), (-1691.0F));
      assertEquals(0.0F, oldV_Light0.ir, 0.01F);
      assertEquals((-1691.0F), oldV_Vector3D0.x, 0.01F);
      assertEquals((-813.7863F), oldV_Vector3D0.y, 0.01F);
      assertEquals((-1691.0F), oldV_Light0.ig, 0.01F);
      assertEquals((-1691.0F), oldV_Vector3D0.z, 0.01F);
      assertEquals((-1691), oldV_Light0.lightType);
      assertEquals((-1691.0F), oldV_Light0.ib, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      oldV.Surface oldV_Surface0 = new oldV.Surface((-3000.1104F), 1000.5747F, (-457.1F), (-3000.1104F), (-3000.1104F), (-1029.22F), 0.00392156F, (-129.0F), 0.001F, (-457.1F));
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(1.0F, 1000.5747F, (-0.50588125F));
      oldV.Sphere oldV_Sphere0 = new oldV.Sphere(oldV_Surface0, oldV_Vector3D0, (-1.0F));
      oldV.Vector3D oldV_Vector3D1 = new oldV.Vector3D(1402.2084F, 0.001F, 0.001F);
      oldV.Sphere oldV_Sphere1 = new oldV.Sphere(oldV_Surface0, oldV_Vector3D1, (-457.1F));
      boolean boolean0 = oldV_Sphere0.intersect(oldV_Sphere1);
      assertEquals(1000.5747F, oldV_Surface0.ig, 0.01F);
      assertEquals((-457.1F), oldV_Surface0.nt, 0.01F);
      assertEquals((-0.50588125F), oldV_Surface0.kr, 0.01F);
      assertEquals((-1029.22F), oldV_Surface0.ks, 0.01F);
      assertFalse(boolean0);
      assertEquals(0.001F, oldV_Vector3D1.y, 0.01F);
      assertEquals(0.001F, oldV_Surface0.kt, 0.01F);
      assertEquals(0.001F, oldV_Vector3D1.z, 0.01F);
      assertEquals(0.00392156F, oldV_Surface0.ns, 0.01F);
      assertEquals((-457.1F), oldV_Surface0.ib, 0.01F);
      assertEquals((-3000.1104F), oldV_Surface0.ir, 0.01F);
      assertEquals((-3000.1104F), oldV_Surface0.ka, 0.01F);
      assertEquals(1402.2084F, oldV_Vector3D1.x, 0.01F);
      assertEquals((-3000.1104F), oldV_Surface0.kd, 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(1.0F, 1.0F, 1.0F);
      oldV.Vector3D oldV_Vector3D1 = new oldV.Vector3D(oldV_Vector3D0);
      assertEquals(1.0F, oldV_Vector3D1.x, 0.01F);
      
      oldV_Vector3D1.x = 4127.8F;
      oldV.Surface oldV_Surface0 = new oldV.Surface(0.0F, 4127.8F, 0.70710677F, 1.0F, 483.73F, 4127.8F, 0.0F, 0.70710677F, 0.0F, 0.0F);
      oldV.Sphere oldV_Sphere0 = new oldV.Sphere(oldV_Surface0, oldV_Vector3D1, 4127.8F);
      oldV.Sphere oldV_Sphere1 = new oldV.Sphere(oldV_Surface0, oldV_Vector3D0, 0.0F);
      boolean boolean0 = oldV_Sphere0.intersect(oldV_Sphere1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      oldV.Surface oldV_Surface0 = new oldV.Surface(5022.575F, 5022.575F, (-1573.04F), 5022.575F, (-2012.0F), (-1573.04F), (-1573.04F), 5022.575F, (-2012.0F), 5022.575F);
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(5022.575F, 0.0F, (-2012.0F));
      oldV.Sphere oldV_Sphere0 = new oldV.Sphere(oldV_Surface0, oldV_Vector3D0, 0.0F);
      boolean boolean0 = oldV_Sphere0.intersect(oldV_Sphere0);
      assertEquals(19.69633F, oldV_Surface0.kr, 0.01F);
      assertEquals((-2012.0F), oldV_Surface0.kt, 0.01F);
      assertEquals((-2012.0F), oldV_Surface0.kd, 0.01F);
      assertEquals(5022.575F, oldV_Surface0.ig, 0.01F);
      assertTrue(boolean0);
      assertEquals((-1573.04F), oldV_Surface0.ks, 0.01F);
      assertEquals((-1573.04F), oldV_Surface0.ib, 0.01F);
      assertEquals(5022.575F, oldV_Surface0.ir, 0.01F);
      assertEquals((-2012.0F), oldV_Vector3D0.z, 0.01F);
      assertEquals((-1573.04F), oldV_Surface0.ns, 0.01F);
      assertEquals(5022.575F, oldV_Surface0.nt, 0.01F);
      assertEquals(5022.575F, oldV_Surface0.ka, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(0.0F, 0.0F, 0.0F);
      oldV_Vector3D0.y = (-1.0F);
      oldV_Vector3D0.normalize();
      assertEquals((-1.0F), oldV_Vector3D0.y, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      oldV.Vector3D oldV_Vector3D0 = new oldV.Vector3D(0.0F, 0.0F, 0.0F);
      oldV.Light oldV_Light0 = new oldV.Light(0, oldV_Vector3D0, 0.0F, 0.0F, 0.0F);
      assertEquals(0, oldV_Light0.lightType);
      assertEquals(0.0F, oldV_Vector3D0.z, 0.01F);
      assertEquals(0.0F, oldV_Vector3D0.y, 0.01F);
      assertEquals(0.0F, oldV_Vector3D0.x, 0.01F);
      assertEquals(0.0F, oldV_Light0.ig, 0.01F);
      assertEquals(0.0F, oldV_Light0.ir, 0.01F);
      assertEquals(0.0F, oldV_Light0.ib, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      oldV oldV0 = new oldV();
  }
}
