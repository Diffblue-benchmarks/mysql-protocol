package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.StatisticsPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StatisticsPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    StatisticsPacket statisticsPacket = new StatisticsPacket();
    statisticsPacket.packetId = (byte) 0;
    statisticsPacket.packetLength = 1;
    statisticsPacket.payload = (byte) 0;

    // Act
    String actual = statisticsPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Statistics Packet", actual);
    String toStringResult = statisticsPacket.toString();
    Assert.assertEquals("MySQL Statistics Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, statisticsPacket.payload);
    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
