package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QueryPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class QueryPacket_writeTest_1_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    QueryPacket queryPacket = new QueryPacket();
//    queryPacket.flag = (byte) 0;
//    queryPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//    queryPacket.packetId = (byte) 0;
//    queryPacket.packetLength = 1;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    queryPacket.write(buffer);
//
//    // Assert
//    String toStringResult = queryPacket.toString();
//    byte[] byteArray = queryPacket.message;
//    Assert.assertEquals("MySQL Query Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals((byte) 0, queryPacket.flag);
//    Assert.assertEquals(24, byteArray.length);
//    Assert.assertEquals((byte) 0, byteArray[0]);
//    Assert.assertEquals((byte) 0, byteArray[1]);
//    Assert.assertEquals((byte) 0, byteArray[2]);
//    Assert.assertEquals((byte) 0, byteArray[21]);
//    Assert.assertEquals((byte) 0, byteArray[22]);
//    Assert.assertEquals((byte) 0, byteArray[23]);
//    Assert.assertEquals("MySQL Query Packet", queryPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
