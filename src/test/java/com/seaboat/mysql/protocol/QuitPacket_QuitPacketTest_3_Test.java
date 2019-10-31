package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QuitPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QuitPacket_QuitPacketTest_3_Test {
  @Test
  public void QuitPacketTest() throws Exception {
    // Arrange and Act
    QuitPacket quitPacket = new QuitPacket();

    // Assert
    String toStringResult = quitPacket.toString();
    Assert.assertEquals("MySQL Quit Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, quitPacket.payload);
    Assert.assertEquals("MySQL Quit Packet", quitPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
