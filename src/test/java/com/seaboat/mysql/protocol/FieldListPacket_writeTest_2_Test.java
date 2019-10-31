package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.FieldListPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class FieldListPacket_writeTest_2_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    FieldListPacket fieldListPacket = new FieldListPacket();
//    fieldListPacket.fieldWildcard = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//    fieldListPacket.flag = (byte) 0;
//    fieldListPacket.packetId = (byte) 0;
//    fieldListPacket.packetLength = 1;
//    fieldListPacket.table = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    fieldListPacket.write(buffer);
//
//    // Assert
//    String toStringResult = fieldListPacket.toString();
//    byte[] byteArray = fieldListPacket.table;
//    byte[] byteArray1 = fieldListPacket.fieldWildcard;
//    Assert.assertEquals("MySQL Field List Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, fieldListPacket.flag);
//    Assert.assertEquals(24, byteArray1.length);
//    Assert.assertEquals((byte) 0, byteArray1[0]);
//    Assert.assertEquals((byte) 0, byteArray1[1]);
//    Assert.assertEquals((byte) 0, byteArray1[2]);
//    Assert.assertEquals((byte) 0, byteArray1[21]);
//    Assert.assertEquals((byte) 0, byteArray1[22]);
//    Assert.assertEquals((byte) 0, byteArray1[23]);
//    Assert.assertEquals(24, byteArray.length);
//    Assert.assertEquals((byte) 0, byteArray[0]);
//    Assert.assertEquals((byte) 0, byteArray[1]);
//    Assert.assertEquals((byte) 0, byteArray[2]);
//    Assert.assertEquals((byte) 0, byteArray[21]);
//    Assert.assertEquals((byte) 10, byteArray[22]);
//    Assert.assertEquals((byte) 0, byteArray[23]);
//    Assert.assertEquals("MySQL Field List Packet", fieldListPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
