package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.StatisticsPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StatisticsPacket_readTest_3_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    StatisticsPacket statisticsPacket = new StatisticsPacket();
    statisticsPacket.packetId = (byte) 0;
    statisticsPacket.packetLength = 1;
    statisticsPacket.payload = (byte) 0;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    statisticsPacket.read(byteArray);

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
    String toStringResult = statisticsPacket.toString();
    Assert.assertEquals("MySQL Statistics Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, statisticsPacket.payload);
    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
