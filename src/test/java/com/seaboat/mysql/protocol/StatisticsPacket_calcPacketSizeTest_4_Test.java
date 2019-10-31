package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.StatisticsPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StatisticsPacket_calcPacketSizeTest_4_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    StatisticsPacket statisticsPacket = new StatisticsPacket();
    statisticsPacket.packetId = (byte) 0;
    statisticsPacket.packetLength = 1;
    statisticsPacket.payload = (byte) 0;

    // Act
    int actual = statisticsPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = statisticsPacket.toString();
    Assert.assertEquals("MySQL Statistics Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, statisticsPacket.payload);
    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
