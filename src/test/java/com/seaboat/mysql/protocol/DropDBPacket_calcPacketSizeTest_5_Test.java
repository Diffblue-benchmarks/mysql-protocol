package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.DropDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DropDBPacket_calcPacketSizeTest_5_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    DropDBPacket dropDBPacket = new DropDBPacket();
    dropDBPacket.flag = (byte) 0;
    dropDBPacket.packetId = (byte) 0;
    dropDBPacket.packetLength = 1;
    dropDBPacket.schema = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = dropDBPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(25, actual);
    String toStringResult = dropDBPacket.toString();
    byte[] byteArray = dropDBPacket.schema;
    Assert.assertEquals("MySQL Drop DB Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals((byte) 0, dropDBPacket.flag);
    Assert.assertEquals("MySQL Drop DB Packet", dropDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
