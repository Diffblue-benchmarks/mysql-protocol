package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.OKPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OKPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    OKPacket oKPacket = new OKPacket();
    oKPacket.affectedRows = 1L;
    oKPacket.header = (byte) 0;
    oKPacket.insertId = 1L;
    oKPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    oKPacket.packetId = (byte) 0;
    oKPacket.packetLength = 1;
    oKPacket.serverStatus = 1;
    oKPacket.warningCount = 1;

    // Act
    String actual = oKPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL OK Packet", actual);
    String toStringResult = oKPacket.toString();
    byte[] byteArray = oKPacket.message;
    Assert.assertEquals("MySQL OK Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(1L, oKPacket.affectedRows);
    Assert.assertEquals(1, oKPacket.serverStatus);
    Assert.assertEquals(1L, oKPacket.insertId);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(1, oKPacket.warningCount);
    Assert.assertEquals((byte) 0, oKPacket.header);
    Assert.assertEquals("MySQL OK Packet", oKPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
