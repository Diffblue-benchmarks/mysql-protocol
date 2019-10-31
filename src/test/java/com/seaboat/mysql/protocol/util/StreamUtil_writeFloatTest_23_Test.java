package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.StreamUtil;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_writeFloatTest_23_Test {
  @Test
  public void writeFloatTest() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    float f = 1.0f;

    // Act
    StreamUtil.writeFloat(byteArrayOutputStream, f);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("\u0000\u0000�?", toStringResult);
    Assert.assertEquals(4, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
