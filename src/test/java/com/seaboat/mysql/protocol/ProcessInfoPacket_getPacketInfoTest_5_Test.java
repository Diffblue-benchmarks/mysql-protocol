package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessInfoPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessInfoPacket_getPacketInfoTest_5_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    ProcessInfoPacket processInfoPacket = new ProcessInfoPacket();
    processInfoPacket.packetId = (byte) 0;
    processInfoPacket.packetLength = 1;
    processInfoPacket.payload = (byte) 0;

    // Act
    String actual = processInfoPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Process Info Packet", actual);
    String toStringResult = processInfoPacket.toString();
    Assert.assertEquals("MySQL Process Info Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, processInfoPacket.payload);
    Assert.assertEquals("MySQL Process Info Packet", processInfoPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
