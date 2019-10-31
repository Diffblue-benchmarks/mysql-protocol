package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.StatisticsPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StatisticsPacket_StatisticsPacketTest_2_Test {
  @Test
  public void StatisticsPacketTest() throws Exception {
    // Arrange and Act
    StatisticsPacket statisticsPacket = new StatisticsPacket();

    // Assert
    String toStringResult = statisticsPacket.toString();
    Assert.assertEquals("MySQL Statistics Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, statisticsPacket.payload);
    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
