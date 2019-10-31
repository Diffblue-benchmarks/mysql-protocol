package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.BufferUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BufferUtil_BufferUtilTest_8_Test {
  @Test
  public void BufferUtilTest() throws Exception {
    // Arrange and Act
    BufferUtil bufferUtil = new BufferUtil();

    // Assert
    Assert.assertNotNull(bufferUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
