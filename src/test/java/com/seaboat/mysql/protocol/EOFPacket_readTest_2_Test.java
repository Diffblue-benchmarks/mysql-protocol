package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.EOFPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EOFPacket_readTest_2_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    EOFPacket eOFPacket = new EOFPacket();
    eOFPacket.header = (byte) 0;
    eOFPacket.packetId = (byte) 0;
    eOFPacket.packetLength = 1;
    eOFPacket.status = 1;
    eOFPacket.warningCount = 1;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    eOFPacket.read(byteArray);

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
    String toStringResult = eOFPacket.toString();
    Assert.assertEquals("MySQL EOF Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(10, eOFPacket.status);
    Assert.assertEquals(0, eOFPacket.warningCount);
    Assert.assertEquals((byte) 0, eOFPacket.header);
    Assert.assertEquals("MySQL EOF Packet", eOFPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
