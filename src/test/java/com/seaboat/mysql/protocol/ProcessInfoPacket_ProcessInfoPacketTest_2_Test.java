package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessInfoPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessInfoPacket_ProcessInfoPacketTest_2_Test {
  @Test
  public void ProcessInfoPacketTest() throws Exception {
    // Arrange and Act
    ProcessInfoPacket processInfoPacket = new ProcessInfoPacket();

    // Assert
    Assert.assertEquals("MySQL Process Info Packet", processInfoPacket.getPacketInfo());
    Assert.assertEquals((byte) 0, processInfoPacket.payload);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
