package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QuitPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QuitPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    QuitPacket quitPacket = new QuitPacket();
    quitPacket.packetId = (byte) 0;
    quitPacket.packetLength = 1;
    quitPacket.payload = (byte) 0;

    // Act
    String actual = quitPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Quit Packet", actual);
    String toStringResult = quitPacket.toString();
    Assert.assertEquals("MySQL Quit Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, quitPacket.payload);
    Assert.assertEquals("MySQL Quit Packet", quitPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
