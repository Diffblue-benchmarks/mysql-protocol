package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.OKPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OKPacket_readTest_5_Test {
  @Test
  public void readTest() throws Exception {
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
    byte[] byteArray = new byte[]{0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    oKPacket.read(byteArray);

    // Assert
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 10, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    String toStringResult = oKPacket.toString();
    byte[] byteArray1 = oKPacket.message;
    Assert.assertEquals("MySQL OK Packet{length=655360,id=0}", toStringResult);
    Assert.assertEquals(0L, oKPacket.affectedRows);
    Assert.assertEquals(0, oKPacket.serverStatus);
    Assert.assertEquals(0L, oKPacket.insertId);
    Assert.assertEquals(0, byteArray1.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray1);
    Assert.assertEquals(0, oKPacket.warningCount);
    Assert.assertEquals((byte) 0, oKPacket.header);
    Assert.assertEquals("MySQL OK Packet", oKPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
