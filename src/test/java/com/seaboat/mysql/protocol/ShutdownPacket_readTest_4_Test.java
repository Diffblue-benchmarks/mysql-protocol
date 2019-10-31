package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ShutdownPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ShutdownPacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ShutdownPacket shutdownPacket = new ShutdownPacket();
    shutdownPacket.packetId = (byte) 0;
    shutdownPacket.packetLength = 1;
    shutdownPacket.type = (byte) 0;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    shutdownPacket.read(byteArray);

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
    String toStringResult = shutdownPacket.toString();
    Assert.assertEquals("MySQL Shutdown Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, shutdownPacket.type);
    Assert.assertEquals("MySQL Shutdown Packet", shutdownPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
