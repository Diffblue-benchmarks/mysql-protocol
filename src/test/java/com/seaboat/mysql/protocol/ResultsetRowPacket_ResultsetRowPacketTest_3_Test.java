package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ResultsetRowPacket;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultsetRowPacket_ResultsetRowPacketTest_3_Test {
  @Test
  public void ResultsetRowPacketTest() throws Exception {
    // Arrange and Act
    ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();

    // Assert
    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
    Assert.assertEquals(null, resultsetRowPacket.columnValues);
    Assert.assertEquals(0, resultsetRowPacket.columnCount);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
