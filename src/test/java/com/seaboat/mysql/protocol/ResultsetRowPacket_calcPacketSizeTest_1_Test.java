package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ResultsetRowPacket;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultsetRowPacket_calcPacketSizeTest_1_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnCount = 1;
    ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0});
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.packetId = (byte) 0;
    resultsetRowPacket.packetLength = 1;

    // Act
    int actual = resultsetRowPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(25, actual);
    String toStringResult = resultsetRowPacket.toString();
    List<byte[]> list = resultsetRowPacket.columnValues;
    Assert.assertEquals("MySQL Resultset Row Packet{length=1,id=0}", toStringResult);
    Assert.assertSame(arrayList, list);
    Assert.assertTrue(list instanceof ArrayList);
    Assert.assertEquals(1, resultsetRowPacket.columnCount);
    Assert.assertSame(arrayList, list);
    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
