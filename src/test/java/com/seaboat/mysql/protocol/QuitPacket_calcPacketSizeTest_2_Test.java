package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QuitPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QuitPacket_calcPacketSizeTest_2_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    QuitPacket quitPacket = new QuitPacket();
    quitPacket.packetId = (byte) 0;
    quitPacket.packetLength = 1;
    quitPacket.payload = (byte) 0;

    // Act
    int actual = quitPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = quitPacket.toString();
    Assert.assertEquals("MySQL Quit Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, quitPacket.payload);
    Assert.assertEquals("MySQL Quit Packet", quitPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
