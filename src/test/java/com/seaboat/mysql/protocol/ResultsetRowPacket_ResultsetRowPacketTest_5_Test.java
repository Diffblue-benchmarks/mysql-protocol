package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ResultsetRowPacket;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultsetRowPacket_ResultsetRowPacketTest_5_Test {
  @Test
  public void ResultsetRowPacketTest() throws Exception {
    // Arrange
    int columnCount = 1;

    // Act
    ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket(columnCount);

    // Assert
    String toStringResult = resultsetRowPacket.toString();
    Assert.assertEquals("MySQL Resultset Row Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(null, resultsetRowPacket.columnValues);
    Assert.assertEquals(1, resultsetRowPacket.columnCount);
    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
