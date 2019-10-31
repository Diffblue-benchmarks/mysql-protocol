package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.CreateDBPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CreateDBPacket_getPacketInfoTest_2_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    CreateDBPacket createDBPacket = new CreateDBPacket();
    createDBPacket.flag = (byte) 0;
    createDBPacket.packetId = (byte) 0;
    createDBPacket.packetLength = 1;
    createDBPacket.schema = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    String actual = createDBPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Create DB Packet", actual);
    String toStringResult = createDBPacket.toString();
    byte[] byteArray = createDBPacket.schema;
    Assert.assertEquals("MySQL Create DB Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, createDBPacket.flag);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals("MySQL Create DB Packet", createDBPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
