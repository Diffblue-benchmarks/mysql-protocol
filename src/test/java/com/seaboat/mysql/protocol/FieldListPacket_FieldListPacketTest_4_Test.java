package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.FieldListPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FieldListPacket_FieldListPacketTest_4_Test {
  @Test
  public void FieldListPacketTest() throws Exception {
    // Arrange and Act
    FieldListPacket fieldListPacket = new FieldListPacket();

    // Assert
    String toStringResult = fieldListPacket.toString();
    Assert.assertEquals("MySQL Field List Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, fieldListPacket.flag);
    Assert.assertEquals(null, fieldListPacket.fieldWildcard);
    Assert.assertEquals(null, fieldListPacket.table);
    Assert.assertEquals("MySQL Field List Packet", fieldListPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
