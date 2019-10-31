package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnCountPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnCountPacket_ColumnCountPacketTest_4_Test {
  @Test
  public void ColumnCountPacketTest() throws Exception {
    // Arrange and Act
    ColumnCountPacket columnCountPacket = new ColumnCountPacket();

    // Assert
    Assert.assertEquals("MySQL Column Count Packet", columnCountPacket.getPacketInfo());
    Assert.assertEquals(0, columnCountPacket.columnCount);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
