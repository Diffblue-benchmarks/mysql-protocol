package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.SecurityUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SecurityUtil_SecurityUtilTest_1_Test {
  @Test
  public void SecurityUtilTest() throws Exception {
    // Arrange and Act
    SecurityUtil securityUtil = new SecurityUtil();

    // Assert
    Assert.assertNotNull(securityUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
