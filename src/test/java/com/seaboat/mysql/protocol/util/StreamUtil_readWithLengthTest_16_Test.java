package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readWithLengthTest_16_Test {
  @Test
  public void readWithLengthTest() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    byte[] actual = StreamUtil.readWithLength(byteArrayInputStream);

    // Assert
    Assert.assertEquals(0, actual.length);
    Assert.assertArrayEquals(new byte[]{}, actual);
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(23, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
