package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessKillPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProcessKillPacket_writeTest_2_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    ProcessKillPacket processKillPacket = new ProcessKillPacket();
//    processKillPacket.connectionId = 1;
//    processKillPacket.flag = (byte) 0;
//    processKillPacket.packetId = (byte) 0;
//    processKillPacket.packetLength = 1;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    processKillPacket.write(buffer);
//
//    // Assert
//    String toStringResult = processKillPacket.toString();
//    Assert.assertEquals("MySQL Process Kill Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals(1, processKillPacket.connectionId);
//    Assert.assertEquals((byte) 0, processKillPacket.flag);
//    Assert.assertEquals("MySQL Process Kill Packet", processKillPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
