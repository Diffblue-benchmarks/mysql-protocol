package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlMessage;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MysqlMessage_readStringWithLengthTest_5_Test {
  @Test
  public void readStringWithLengthTest() throws Exception {
    // Arrange
    MysqlMessage mysqlMessage = new MysqlMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    String actual = mysqlMessage.readStringWithLength();

    // Assert
    Assert.assertEquals(null, actual);
    byte[] bytesResult = mysqlMessage.bytes();
    BigDecimal readBigDecimalResult = mysqlMessage.readBigDecimal();
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
    Assert.assertTrue(hasRemainingResult);
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
    Assert.assertEquals(null, readBigDecimalResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
