package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ShutdownPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShutdownPacket_getPacketInfoTest_3_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    ShutdownPacket shutdownPacket = new ShutdownPacket();
    shutdownPacket.packetId = (byte) 0;
    shutdownPacket.packetLength = 1;
    shutdownPacket.type = (byte) 0;

    // Act
    String actual = shutdownPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Shutdown Packet", actual);
    String toStringResult = shutdownPacket.toString();
    Assert.assertEquals("MySQL Shutdown Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, shutdownPacket.type);
    Assert.assertEquals("MySQL Shutdown Packet", shutdownPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
