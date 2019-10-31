package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ShutdownPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShutdownPacket_ShutdownPacketTest_5_Test {
  @Test
  public void ShutdownPacketTest() throws Exception {
    // Arrange and Act
    ShutdownPacket shutdownPacket = new ShutdownPacket();

    // Assert
    String toStringResult = shutdownPacket.toString();
    Assert.assertEquals("MySQL Shutdown Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, shutdownPacket.type);
    Assert.assertEquals("MySQL Shutdown Packet", shutdownPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
