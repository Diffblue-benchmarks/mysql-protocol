package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlMessage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MysqlMessage_moveTest_20_Test {
  @Test
  public void moveTest() throws Exception {
    // Arrange
    MysqlMessage mysqlMessage = new MysqlMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    int i = 655361;

    // Act
    mysqlMessage.move(i);

    // Assert
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
