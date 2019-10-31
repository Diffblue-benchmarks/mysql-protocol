package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessKillPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessKillPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    ProcessKillPacket processKillPacket = new ProcessKillPacket();
    processKillPacket.connectionId = 1;
    processKillPacket.flag = (byte) 0;
    processKillPacket.packetId = (byte) 0;
    processKillPacket.packetLength = 1;

    // Act
    String actual = processKillPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Process Kill Packet", actual);
    String toStringResult = processKillPacket.toString();
    Assert.assertEquals("MySQL Process Kill Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(1, processKillPacket.connectionId);
    Assert.assertEquals((byte) 0, processKillPacket.flag);
    Assert.assertEquals("MySQL Process Kill Packet", processKillPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
