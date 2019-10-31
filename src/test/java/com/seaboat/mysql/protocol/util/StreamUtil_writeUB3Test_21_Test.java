package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.StreamUtil;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_writeUB3Test_21_Test {
  @Test
  public void writeUB3Test() throws Exception {
    // Arrange
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i = 1;

    // Act
    StreamUtil.writeUB3(byteArrayOutputStream, i);

    // Assert
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("\u0001\u0000\u0000", toStringResult);
    Assert.assertEquals(3, byteArrayOutputStream.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
