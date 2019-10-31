package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.InitDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InitDBPacket_InitDBPacketTest_3_Test {
  @Test
  public void InitDBPacketTest() throws Exception {
    // Arrange and Act
    InitDBPacket initDBPacket = new InitDBPacket();

    // Assert
    String toStringResult = initDBPacket.toString();
    Assert.assertEquals("MySQL Init DB Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, initDBPacket.flag);
    Assert.assertEquals(null, initDBPacket.schema);
    Assert.assertEquals("MySQL Init DB Packet", initDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
