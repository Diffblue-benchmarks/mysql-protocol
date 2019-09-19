package com.seaboat.mysql.protocol.util;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.util.HexUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class HexUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HexUtil actual = new HexUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.util.HexUtil");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void Bytes2HexStringInput1OutputNotNull() {

    // Arrange
    final byte[] b = {(byte)-63};

    // Act
    final String actual = HexUtil.Bytes2HexString(b);

    // Assert result
    Assert.assertEquals("C1", actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void Bytes2HexStringInput2OutputNotNull() {

    // Arrange
    final byte[] b = {(byte)52, (byte)22};

    // Act
    final String actual = HexUtil.Bytes2HexString(b);

    // Assert result
    Assert.assertEquals("3416", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void str2HexStrInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("", HexUtil.str2HexStr(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void str2HexStrInputNotNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("00", HexUtil.str2HexStr("\u0000"));
  }
}
