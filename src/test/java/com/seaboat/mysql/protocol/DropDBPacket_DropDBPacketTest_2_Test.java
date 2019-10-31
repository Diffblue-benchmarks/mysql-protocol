package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.DropDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DropDBPacket_DropDBPacketTest_2_Test {
  @Test
  public void DropDBPacketTest() throws Exception {
    // Arrange and Act
    DropDBPacket dropDBPacket = new DropDBPacket();

    // Assert
    String toStringResult = dropDBPacket.toString();
    Assert.assertEquals("MySQL Drop DB Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(null, dropDBPacket.schema);
    Assert.assertEquals((byte) 0, dropDBPacket.flag);
    Assert.assertEquals("MySQL Drop DB Packet", dropDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
