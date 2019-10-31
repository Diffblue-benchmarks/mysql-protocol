package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.RandomUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RandomUtil_RandomUtilTest_2_Test {
  @Test
  public void RandomUtilTest() throws Exception {
    // Arrange and Act
    RandomUtil randomUtil = new RandomUtil();

    // Assert
    Assert.assertNotNull(randomUtil.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
