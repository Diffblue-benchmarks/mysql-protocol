package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.CharsetUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CharsetUtil_CharsetUtilTest_2_Test {
  @Test
  public void CharsetUtilTest() throws Exception {
    // Arrange and Act
    CharsetUtil charsetUtil = new CharsetUtil();

    // Assert
    Assert.assertNotNull(charsetUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
