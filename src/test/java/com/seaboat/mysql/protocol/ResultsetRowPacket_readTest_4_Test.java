package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ResultsetRowPacket;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ResultsetRowPacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnCount = 1;
    ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0});
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.packetId = (byte) 0;
    resultsetRowPacket.packetLength = 1;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0};

    // Act
    resultsetRowPacket.read(byteArray);

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
    String toStringResult = resultsetRowPacket.toString();
    List<byte[]> list = resultsetRowPacket.columnValues;
    Assert.assertEquals("MySQL Resultset Row Packet{length=0,id=0}", toStringResult);
    Assert.assertSame(arrayList, list);
    Assert.assertTrue(list instanceof ArrayList);
    Assert.assertEquals(1, resultsetRowPacket.columnCount);
    Assert.assertSame(arrayList, list);
    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
