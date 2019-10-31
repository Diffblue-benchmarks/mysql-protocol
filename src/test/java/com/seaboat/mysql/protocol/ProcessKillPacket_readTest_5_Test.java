package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessKillPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ProcessKillPacket_readTest_5_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ProcessKillPacket processKillPacket = new ProcessKillPacket();
    processKillPacket.connectionId = 1;
    processKillPacket.flag = (byte) 0;
    processKillPacket.packetId = (byte) 0;
    processKillPacket.packetLength = 1;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    processKillPacket.read(byteArray);

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
    String toStringResult = processKillPacket.toString();
    Assert.assertEquals("MySQL Process Kill Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0, processKillPacket.connectionId);
    Assert.assertEquals((byte) 0, processKillPacket.flag);
    Assert.assertEquals("MySQL Process Kill Packet", processKillPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
