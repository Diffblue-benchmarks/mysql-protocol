package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.PingPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PingPacket_PingPacketTest_5_Test {
  @Test
  public void PingPacketTest() throws Exception {
    // Arrange and Act
    PingPacket pingPacket = new PingPacket();

    // Assert
    String toStringResult = pingPacket.toString();
    Assert.assertEquals("MySQL Ping Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, pingPacket.payload);
    Assert.assertEquals("MySQL Ping Packet", pingPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
