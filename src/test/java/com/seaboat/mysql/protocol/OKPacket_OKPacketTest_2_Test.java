package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.OKPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OKPacket_OKPacketTest_2_Test {
  @Test
  public void OKPacketTest() throws Exception {
    // Arrange and Act
    OKPacket oKPacket = new OKPacket();

    // Assert
    String toStringResult = oKPacket.toString();
    Assert.assertEquals("MySQL OK Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0L, oKPacket.affectedRows);
    Assert.assertEquals(0, oKPacket.serverStatus);
    Assert.assertEquals(0L, oKPacket.insertId);
    Assert.assertEquals(null, oKPacket.message);
    Assert.assertEquals(0, oKPacket.warningCount);
    Assert.assertEquals((byte) 0, oKPacket.header);
    Assert.assertEquals("MySQL OK Packet", oKPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
