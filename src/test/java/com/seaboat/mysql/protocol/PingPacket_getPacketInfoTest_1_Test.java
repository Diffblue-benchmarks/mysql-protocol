package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.PingPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PingPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    PingPacket pingPacket = new PingPacket();
    pingPacket.packetId = (byte) 0;
    pingPacket.packetLength = 1;
    pingPacket.payload = (byte) 0;

    // Act
    String actual = pingPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Ping Packet", actual);
    String toStringResult = pingPacket.toString();
    Assert.assertEquals("MySQL Ping Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, pingPacket.payload);
    Assert.assertEquals("MySQL Ping Packet", pingPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
