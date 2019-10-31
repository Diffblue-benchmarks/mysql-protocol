package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.EOFPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class EOFPacket_writeTest_5_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    EOFPacket eOFPacket = new EOFPacket();
//    eOFPacket.header = (byte) 0;
//    eOFPacket.packetId = (byte) 0;
//    eOFPacket.packetLength = 1;
//    eOFPacket.status = 1;
//    eOFPacket.warningCount = 1;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    eOFPacket.write(buffer);
//
//    // Assert
//    String toStringResult = eOFPacket.toString();
//    Assert.assertEquals("MySQL EOF Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals(1, eOFPacket.status);
//    Assert.assertEquals(1, eOFPacket.warningCount);
//    Assert.assertEquals((byte) 0, eOFPacket.header);
//    Assert.assertEquals("MySQL EOF Packet", eOFPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
