package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.EOFPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EOFPacket_calcPacketSizeTest_3_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    EOFPacket eOFPacket = new EOFPacket();
    eOFPacket.header = (byte) 0;
    eOFPacket.packetId = (byte) 0;
    eOFPacket.packetLength = 1;
    eOFPacket.status = 1;
    eOFPacket.warningCount = 1;

    // Act
    int actual = eOFPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(5, actual);
    Assert.assertEquals("MySQL EOF Packet", eOFPacket.getPacketInfo());
    Assert.assertEquals(1, eOFPacket.status);
    Assert.assertEquals(1, eOFPacket.warningCount);
    Assert.assertEquals((byte) 0, eOFPacket.header);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
