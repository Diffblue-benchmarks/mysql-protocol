package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.StatisticsPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class StatisticsPacket_writeTest_5_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    StatisticsPacket statisticsPacket = new StatisticsPacket();
//    statisticsPacket.packetId = (byte) 0;
//    statisticsPacket.packetLength = 1;
//    statisticsPacket.payload = (byte) 0;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    statisticsPacket.write(buffer);
//
//    // Assert
//    String toStringResult = statisticsPacket.toString();
//    Assert.assertEquals("MySQL Statistics Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, statisticsPacket.payload);
//    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
