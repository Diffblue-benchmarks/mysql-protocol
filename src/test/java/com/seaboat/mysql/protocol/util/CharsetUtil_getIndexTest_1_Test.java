package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.CharsetUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CharsetUtil_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    String charset = "aaaaa";

    // Act
    int actual = CharsetUtil.getIndex(charset);

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
