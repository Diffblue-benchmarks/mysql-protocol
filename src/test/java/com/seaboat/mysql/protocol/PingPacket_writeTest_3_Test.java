package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.PingPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class PingPacket_writeTest_3_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    PingPacket pingPacket = new PingPacket();
//    pingPacket.packetId = (byte) 0;
//    pingPacket.packetLength = 1;
//    pingPacket.payload = (byte) 0;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    pingPacket.write(buffer);
//
//    // Assert
//    String toStringResult = pingPacket.toString();
//    Assert.assertEquals("MySQL Ping Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, pingPacket.payload);
//    Assert.assertEquals("MySQL Ping Packet", pingPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
