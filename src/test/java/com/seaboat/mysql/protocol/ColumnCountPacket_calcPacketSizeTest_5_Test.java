package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnCountPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnCountPacket_calcPacketSizeTest_5_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    ColumnCountPacket columnCountPacket = new ColumnCountPacket();
    columnCountPacket.columnCount = 1;
    columnCountPacket.packetId = (byte) 0;
    columnCountPacket.packetLength = 1;

    // Act
    int actual = columnCountPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = columnCountPacket.toString();
    Assert.assertEquals("MySQL Column Count Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(1, columnCountPacket.columnCount);
    Assert.assertEquals("MySQL Column Count Packet", columnCountPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
