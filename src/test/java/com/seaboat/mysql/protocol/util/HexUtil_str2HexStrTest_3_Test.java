package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.HexUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HexUtil_str2HexStrTest_3_Test {
  @Test
  public void str2HexStrTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    String actual = HexUtil.str2HexStr(str);

    // Assert
    Assert.assertEquals("6161616161", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
