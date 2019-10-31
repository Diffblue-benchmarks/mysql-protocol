package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ResultsetRowPacket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ResultsetRowPacket_writeTest_2_Test {
//failed_run   @Test
//  public void writeTest() throws Exception {
//    // Arrange
//    ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
//    resultsetRowPacket.columnCount = 1;
//    ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
//    arrayList.add(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0});
//    resultsetRowPacket.columnValues = arrayList;
//    resultsetRowPacket.packetId = (byte) 0;
//    resultsetRowPacket.packetLength = 1;
//    ByteBuffer buffer = Whitebox.newInstance(ByteBuffer.class);
//
//    // Act
//    resultsetRowPacket.write(buffer);
//
//    // Assert
//    String toStringResult = resultsetRowPacket.toString();
//    List<byte[]> list = resultsetRowPacket.columnValues;
//    Assert.assertEquals("MySQL Resultset Row Packet{length=1,id=0}", toStringResult);
//    Assert.assertSame(arrayList, list);
//    Assert.assertTrue(list instanceof ArrayList);
//    Assert.assertEquals(1, resultsetRowPacket.columnCount);
//    Assert.assertSame(arrayList, list);
//    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
