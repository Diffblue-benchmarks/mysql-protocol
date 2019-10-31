package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.SecurityUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SecurityUtil_scramble411Test_2_Test {
  @Test
  public void scramble411Test() throws Exception {
    // Arrange
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    byte[] byteArray1 = new byte[]{0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    byte[] actual = SecurityUtil.scramble411(byteArray, byteArray1);

    // Assert
    Assert.assertEquals(20, actual.length);
    Assert.assertEquals((byte) 77, actual[0]);
    Assert.assertEquals((byte) -91, actual[1]);
    Assert.assertEquals((byte) -70, actual[2]);
    Assert.assertEquals((byte) -123, actual[3]);
    Assert.assertEquals((byte) -95, actual[4]);
    Assert.assertEquals((byte) 57, actual[5]);
    Assert.assertEquals((byte) 110, actual[14]);
    Assert.assertEquals((byte) -92, actual[15]);
    Assert.assertEquals((byte) -45, actual[16]);
    Assert.assertEquals((byte) 42, actual[17]);
    Assert.assertEquals((byte) 123, actual[18]);
    Assert.assertEquals((byte) 23, actual[19]);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 10, byteArray1[3]);
    Assert.assertEquals((byte) 0, byteArray1[4]);
    Assert.assertEquals((byte) 0, byteArray1[5]);
    Assert.assertEquals((byte) 0, byteArray1[18]);
    Assert.assertEquals((byte) 0, byteArray1[19]);
    Assert.assertEquals((byte) 0, byteArray1[20]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
