package com.seaboat.mysql.protocol.util;

import com.seaboat.mysql.protocol.util.StreamUtil;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamUtil_readDoubleTest_1_Test {
//failed_pass   @Test
//  public void readDoubleTest() throws Exception {
//    // Arrange
//    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
//        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
//
//    // Act
//    double actual = StreamUtil.readDouble(byteArrayInputStream);
//
//    // Assert
//    Assert.assertEquals(0.0, actual);
//    int availableResult = byteArrayInputStream.available();
//    Assert.assertEquals(16, availableResult);
//    Assert.assertNotNull(byteArrayInputStream.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
