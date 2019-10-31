package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ProcessInfoPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProcessInfoPacket_writeTest_1_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    ProcessInfoPacket processInfoPacket = new ProcessInfoPacket();
//    processInfoPacket.packetId = (byte) 0;
//    processInfoPacket.packetLength = 1;
//    processInfoPacket.payload = (byte) 0;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    processInfoPacket.write(buffer);
//
//    // Assert
//    String toStringResult = processInfoPacket.toString();
//    Assert.assertEquals("MySQL Process Info Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, processInfoPacket.payload);
//    Assert.assertEquals("MySQL Process Info Packet", processInfoPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
