package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnCountPacket;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ColumnCountPacket_writeTest_3_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    ColumnCountPacket columnCountPacket = new ColumnCountPacket();
//    columnCountPacket.columnCount = 1;
//    columnCountPacket.packetId = (byte) 0;
//    columnCountPacket.packetLength = 1;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    columnCountPacket.write(buffer);
//
//    // Assert
//    String toStringResult = columnCountPacket.toString();
//    Assert.assertEquals("MySQL Column Count Packet{length=1,id=0}", toStringResult);
//    Assert.assertEquals(1, columnCountPacket.columnCount);
//    Assert.assertEquals("MySQL Column Count Packet", columnCountPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
