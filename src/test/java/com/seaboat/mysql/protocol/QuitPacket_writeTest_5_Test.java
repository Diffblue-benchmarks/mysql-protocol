package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QuitPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class QuitPacket_writeTest_5_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    QuitPacket quitPacket = new QuitPacket();
//    quitPacket.packetId = (byte) 0;
//    quitPacket.packetLength = 1;
//    quitPacket.payload = (byte) 0;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    quitPacket.write(buffer);
//
//    // Assert
//    String toStringResult = quitPacket.toString();
//    Assert.assertEquals("MySQL Quit Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, quitPacket.payload);
//    Assert.assertEquals("MySQL Quit Packet", quitPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
