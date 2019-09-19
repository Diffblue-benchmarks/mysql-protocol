package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.CharsetUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CharsetUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CharsetUtil actual = new CharsetUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNullOutputZero000107730205c2e74c0() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(8, CharsetUtil.getIndex("LatiN2_geNeraL_CI"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive3() {

    // Act and Assert result
    Assert.assertEquals(2, CharsetUtil.getIndex("LATIN2_CZECH_cS"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive4() {

    // Act and Assert result
    Assert.assertEquals(6, CharsetUtil.getIndex("Hp8_EnGLISh_Ci"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive5() {

    // Act and Assert result
    Assert.assertEquals(8, CharsetUtil.getIndex("LATIN2_GENERAL_CI"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive6() {

    // Act and Assert result
    Assert.assertEquals(14, CharsetUtil.getIndex("ISO-8859-1"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero0000e72a39f508b016f() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(2, CharsetUtil.getIndex("LaTin2_cZech_cS"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero3() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex("\uf86c\u00c1Kin\uf873_\u02f1ZMkh_kS"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero4() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero5() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero001635143a794532262() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero7() {

    // Act and Assert result
    Assert.assertEquals(
        0,
        CharsetUtil.getIndex(
            "\uf7f0\uffe9\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\u00c0\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\uf0c8\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c9\uf0c8\uf0c9\u7ff4\u71ab"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero8() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero9() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex("?"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIndexInputNotNullOutputZero2() {

    // Act and Assert result
    Assert.assertEquals(0, CharsetUtil.getIndex(""));
  }
}
