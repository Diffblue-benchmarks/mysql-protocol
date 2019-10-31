package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlMessage;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MysqlMessage_readStringWithNullTest_28_Test {
  @Test
  public void readStringWithNullTest() throws Exception {
    // Arrange
    MysqlMessage mysqlMessage = new MysqlMessage(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    // Act
    String actual = mysqlMessage.readStringWithNull();

    // Assert
    Assert.assertEquals(null, actual);
    BigDecimal readBigDecimalResult = mysqlMessage.readBigDecimal();
    String toStringResult = mysqlMessage.toString();
    boolean hasRemainingResult = mysqlMessage.hasRemaining();
    Assert.assertEquals(null, readBigDecimalResult);
    Assert.assertEquals(24, mysqlMessage.length());
    Assert.assertTrue(hasRemainingResult);
    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
