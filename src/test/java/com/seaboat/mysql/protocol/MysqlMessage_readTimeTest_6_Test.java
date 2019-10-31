package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlMessage;
import java.math.BigDecimal;
import java.sql.Time;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class MysqlMessage_readTimeTest_6_Test {
//failed_pass   @Test
//  public void readTimeTest() throws Exception {
//    // Arrange
//    MysqlMessage mysqlMessage = new MysqlMessage(
//        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
//
//    // Act
//    Time actual = mysqlMessage.readTime();
//
//    // Assert
//    int timezoneOffset = actual.getTimezoneOffset();
//    int hours = actual.getHours();
//    String toStringResult = actual.toString();
//    int minutes = actual.getMinutes();
//    long time = actual.getTime();
//    int seconds = actual.getSeconds();
//    Assert.assertEquals(0, timezoneOffset);
//    Assert.assertEquals("Dec 31, 0002 12:00:00 AM", actual.toLocaleString());
//    Assert.assertEquals(0, seconds);
//    Assert.assertEquals(-62167478399868L, time);
//    Assert.assertEquals(0, minutes);
//    Assert.assertEquals("00:00:00", toStringResult);
//    Assert.assertEquals(0, hours);
//    byte[] bytesResult = mysqlMessage.bytes();
//    BigDecimal readBigDecimalResult = mysqlMessage.readBigDecimal();
//    String toStringResult1 = mysqlMessage.toString();
//    boolean hasRemainingResult = mysqlMessage.hasRemaining();
//    Assert.assertEquals(24, bytesResult.length);
//    Assert.assertEquals((byte) 0, bytesResult[0]);
//    Assert.assertEquals((byte) 0, bytesResult[1]);
//    Assert.assertEquals((byte) 0, bytesResult[2]);
//    Assert.assertEquals((byte) 0, bytesResult[21]);
//    Assert.assertEquals((byte) 0, bytesResult[22]);
//    Assert.assertEquals((byte) 0, bytesResult[23]);
//    Assert.assertEquals(24, mysqlMessage.length());
//    Assert.assertTrue(hasRemainingResult);
//    Assert.assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", toStringResult1);
//    Assert.assertEquals(null, readBigDecimalResult);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
