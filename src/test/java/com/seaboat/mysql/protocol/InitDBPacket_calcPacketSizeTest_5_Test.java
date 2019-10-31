package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.InitDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InitDBPacket_calcPacketSizeTest_5_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    InitDBPacket initDBPacket = new InitDBPacket();
    initDBPacket.flag = (byte) 0;
    initDBPacket.packetId = (byte) 0;
    initDBPacket.packetLength = 1;
    initDBPacket.schema = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = initDBPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(25, actual);
    String toStringResult = initDBPacket.toString();
    byte[] byteArray = initDBPacket.schema;
    Assert.assertEquals("MySQL Init DB Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, initDBPacket.flag);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals("MySQL Init DB Packet", initDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
