package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.EOFPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EOFPacket_EOFPacketTest_1_Test {
  @Test
  public void EOFPacketTest() throws Exception {
    // Arrange and Act
    EOFPacket eOFPacket = new EOFPacket();

    // Assert
    String toStringResult = eOFPacket.toString();
    Assert.assertEquals("MySQL EOF Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(2, eOFPacket.status);
    Assert.assertEquals(0, eOFPacket.warningCount);
    Assert.assertEquals((byte) -2, eOFPacket.header);
    Assert.assertEquals("MySQL EOF Packet", eOFPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
