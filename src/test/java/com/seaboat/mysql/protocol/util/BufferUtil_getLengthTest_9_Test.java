package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.BufferUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BufferUtil_getLengthTest_9_Test {
  @Test
  public void getLengthTest() throws Exception {
    // Arrange
    long length = 1L;

    // Act
    int actual = BufferUtil.getLength(length);

    // Assert
    Assert.assertEquals(1, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
