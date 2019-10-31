package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readFloatTest_19_Test {
//failed_pass   @Test
//  public void readFloatTest() throws Exception {
//    // Arrange
//    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
//        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
//
//    // Act
//    float actual = StreamUtil.readFloat(byteArrayInputStream);
//
//    // Assert
//    Assert.assertEquals(0.0f, actual);
//    Assert.assertNotNull(byteArrayInputStream.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
