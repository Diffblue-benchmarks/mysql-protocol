package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QueryPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QueryPacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    QueryPacket queryPacket = new QueryPacket();
    queryPacket.flag = (byte) 0;
    queryPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    queryPacket.packetId = (byte) 0;
    queryPacket.packetLength = 1;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};

    // Act
    queryPacket.read(byteArray);

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
    Assert.assertEquals((byte) 10, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    String toStringResult = queryPacket.toString();
    byte[] byteArray1 = queryPacket.message;
    Assert.assertEquals("MySQL Query Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, queryPacket.flag);
    Assert.assertEquals(19, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[16]);
    Assert.assertEquals((byte) 10, byteArray1[17]);
    Assert.assertEquals((byte) 0, byteArray1[18]);
    Assert.assertEquals("MySQL Query Packet", queryPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
