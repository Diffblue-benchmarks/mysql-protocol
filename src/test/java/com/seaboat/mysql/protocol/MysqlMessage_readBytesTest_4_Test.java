package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MysqlMessage_readBytesTest_4_Test {
  @Test
  public void readBytesTest() throws Exception {
    // Arrange
    MysqlMessage mysqlMessage = new MysqlMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    byte[] actual = mysqlMessage.readBytes();

    // Assert
    Assert.assertEquals(24, actual.length);
    Assert.assertEquals((byte) 0, actual[0]);
    Assert.assertEquals((byte) 0, actual[1]);
    Assert.assertEquals((byte) 0, actual[2]);
    Assert.assertEquals((byte) 0, actual[3]);
    Assert.assertEquals((byte) 0, actual[4]);
    Assert.assertEquals((byte) 0, actual[5]);
    Assert.assertEquals((byte) 0, actual[18]);
    Assert.assertEquals((byte) 0, actual[19]);
    Assert.assertEquals((byte) 0, actual[20]);
    Assert.assertEquals((byte) 0, actual[21]);
    Assert.assertEquals((byte) 0, actual[22]);
    Assert.assertEquals((byte) 0, actual[23]);
    byte[] bytesResult = mysqlMessage.bytes();
    String toStringResult = mysqlMessage.toString();
    boolean hasRemainingResult = mysqlMessage.hasRemaining();
    Assert.assertEquals(24, bytesResult.length);
    Assert.assertEquals((byte) 0, bytesResult[0]);
    Assert.assertEquals((byte) 0, bytesResult[1]);
    Assert.assertEquals((byte) 0, bytesResult[2]);
    Assert.assertEquals((byte) 0, bytesResult[21]);
    Assert.assertEquals((byte) 0, bytesResult[22]);
    Assert.assertEquals((byte) 0, bytesResult[23]);
    Assert.assertEquals(24, mysqlMessage.length());
    Assert.assertFalse(hasRemainingResult);
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
