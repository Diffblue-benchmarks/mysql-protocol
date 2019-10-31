package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.FieldListPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FieldListPacket_readTest_1_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    FieldListPacket fieldListPacket = new FieldListPacket();
    fieldListPacket.fieldWildcard = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    fieldListPacket.flag = (byte) 0;
    fieldListPacket.packetId = (byte) 0;
    fieldListPacket.packetLength = 1;
    fieldListPacket.table = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    fieldListPacket.read(byteArray);

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
    String toStringResult = fieldListPacket.toString();
    byte[] byteArray1 = fieldListPacket.table;
    byte[] byteArray2 = fieldListPacket.fieldWildcard;
    Assert.assertEquals("MySQL Field List Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, fieldListPacket.flag);
    Assert.assertEquals(18, byteArray2.length);
    Assert.assertEquals((byte) 0, byteArray2[0]);
    Assert.assertEquals((byte) 0, byteArray2[1]);
    Assert.assertEquals((byte) 0, byteArray2[2]);
    Assert.assertEquals((byte) 0, byteArray2[15]);
    Assert.assertEquals((byte) 0, byteArray2[16]);
    Assert.assertEquals((byte) 0, byteArray2[17]);
    Assert.assertEquals(0, byteArray1.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray1);
    Assert.assertEquals("MySQL Field List Packet", fieldListPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
