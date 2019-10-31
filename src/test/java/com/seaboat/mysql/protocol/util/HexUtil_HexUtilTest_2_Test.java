package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.HexUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HexUtil_HexUtilTest_2_Test {
  @Test
  public void HexUtilTest() throws Exception {
    // Arrange and Act
    HexUtil hexUtil = new HexUtil();

    // Assert
    Assert.assertNotNull(hexUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
