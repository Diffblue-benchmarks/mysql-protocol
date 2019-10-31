package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnCountPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnCountPacket_readTest_1_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ColumnCountPacket columnCountPacket = new ColumnCountPacket();
    columnCountPacket.columnCount = 1;
    columnCountPacket.packetId = (byte) 0;
    columnCountPacket.packetLength = 1;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    columnCountPacket.read(byteArray);

    // Assert
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[3]);
    Assert.assertEquals((byte) 0, byteArray[4]);
    Assert.assertEquals((byte) 0, byteArray[5]);
    Assert.assertEquals((byte) 0, byteArray[18]);
    Assert.assertEquals((byte) 0, byteArray[19]);
    Assert.assertEquals((byte) 0, byteArray[20]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    String toStringResult = columnCountPacket.toString();
    Assert.assertEquals("MySQL Column Count Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0, columnCountPacket.columnCount);
    Assert.assertEquals("MySQL Column Count Packet", columnCountPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
