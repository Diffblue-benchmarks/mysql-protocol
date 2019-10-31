package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.CreateDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CreateDBPacket_CreateDBPacketTest_1_Test {
  @Test
  public void CreateDBPacketTest() throws Exception {
    // Arrange and Act
    CreateDBPacket createDBPacket = new CreateDBPacket();

    // Assert
    String toStringResult = createDBPacket.toString();
    Assert.assertEquals("MySQL Create DB Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, createDBPacket.flag);
    Assert.assertEquals(null, createDBPacket.schema);
    Assert.assertEquals("MySQL Create DB Packet", createDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
