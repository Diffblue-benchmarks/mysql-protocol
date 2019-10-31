package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessInfoPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessInfoPacket_calcPacketSizeTest_4_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    ProcessInfoPacket processInfoPacket = new ProcessInfoPacket();
    processInfoPacket.packetId = (byte) 0;
    processInfoPacket.packetLength = 1;
    processInfoPacket.payload = (byte) 0;

    // Act
    int actual = processInfoPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = processInfoPacket.toString();
    Assert.assertEquals("MySQL Process Info Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, processInfoPacket.payload);
    Assert.assertEquals("MySQL Process Info Packet", processInfoPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
