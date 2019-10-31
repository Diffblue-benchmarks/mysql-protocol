package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessKillPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessKillPacket_ProcessKillPacketTest_3_Test {
  @Test
  public void ProcessKillPacketTest() throws Exception {
    // Arrange and Act
    ProcessKillPacket processKillPacket = new ProcessKillPacket();

    // Assert
    String toStringResult = processKillPacket.toString();
    Assert.assertEquals("MySQL Process Kill Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0, processKillPacket.connectionId);
    Assert.assertEquals((byte) -2, processKillPacket.flag);
    Assert.assertEquals("MySQL Process Kill Packet", processKillPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
