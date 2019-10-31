package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.PingPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PingPacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    PingPacket pingPacket = new PingPacket();
    pingPacket.packetId = (byte) 0;
    pingPacket.packetLength = 1;
    pingPacket.payload = (byte) 0;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    pingPacket.read(byteArray);

    // Assert
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals("MySQL Ping Packet", pingPacket.getPacketInfo());
    Assert.assertEquals((byte) 0, pingPacket.payload);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
