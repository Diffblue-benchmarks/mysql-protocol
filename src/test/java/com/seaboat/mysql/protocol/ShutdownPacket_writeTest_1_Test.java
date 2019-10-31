package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ShutdownPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ShutdownPacket_writeTest_1_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    ShutdownPacket shutdownPacket = new ShutdownPacket();
//    shutdownPacket.packetId = (byte) 0;
//    shutdownPacket.packetLength = 1;
//    shutdownPacket.type = (byte) 0;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    shutdownPacket.write(buffer);
//
//    // Assert
//    String toStringResult = shutdownPacket.toString();
//    Assert.assertEquals("MySQL Shutdown Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, shutdownPacket.type);
//    Assert.assertEquals("MySQL Shutdown Packet", shutdownPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
