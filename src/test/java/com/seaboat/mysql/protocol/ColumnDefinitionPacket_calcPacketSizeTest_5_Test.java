package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnDefinitionPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnDefinitionPacket_calcPacketSizeTest_5_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    ColumnDefinitionPacket columnDefinitionPacket = new ColumnDefinitionPacket();
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    columnDefinitionPacket.catalog = byteArray;
    columnDefinitionPacket.charsetSet = 2561;
    columnDefinitionPacket.decimals = (byte) 0;
    byte[] byteArray1 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    columnDefinitionPacket.defaultValues = byteArray1;
    byte[] byteArray2 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    columnDefinitionPacket.filler = byteArray2;
    columnDefinitionPacket.flags = 1;
    columnDefinitionPacket.length = 1L;
    columnDefinitionPacket.name = byteArray;
    columnDefinitionPacket.nextLength = (byte) 0;
    columnDefinitionPacket.orgName = byteArray1;
    columnDefinitionPacket.orgTable = byteArray2;
    columnDefinitionPacket.packetId = (byte) 0;
    columnDefinitionPacket.packetLength = 1;
    columnDefinitionPacket.schema = byteArray;
    columnDefinitionPacket.table = byteArray1;
    columnDefinitionPacket.type = 1;

    // Act
    int actual = columnDefinitionPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(188, actual);
    String toStringResult = columnDefinitionPacket.toString();
    byte[] byteArray3 = columnDefinitionPacket.orgTable;
    byte[] byteArray4 = columnDefinitionPacket.orgName;
    byte[] byteArray5 = columnDefinitionPacket.schema;
    Assert.assertEquals("MySQL Column Definition Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(24, byteArray5.length);
    Assert.assertEquals((byte) 0, byteArray5[0]);
    Assert.assertEquals((byte) 0, byteArray5[1]);
    Assert.assertEquals((byte) 0, byteArray5[2]);
    Assert.assertEquals((byte) 0, byteArray5[21]);
    Assert.assertEquals((byte) 0, byteArray5[22]);
    Assert.assertEquals((byte) 0, byteArray5[23]);
    Assert.assertEquals(24, byteArray4.length);
    Assert.assertEquals((byte) 0, byteArray4[0]);
    Assert.assertEquals((byte) 0, byteArray4[1]);
    Assert.assertEquals((byte) 0, byteArray4[2]);
    Assert.assertEquals((byte) 0, byteArray4[21]);
    Assert.assertEquals((byte) 0, byteArray4[22]);
    Assert.assertEquals((byte) 0, byteArray4[23]);
    Assert.assertSame(byteArray5, columnDefinitionPacket.catalog);
    Assert.assertEquals(1, columnDefinitionPacket.flags);
    Assert.assertEquals(1L, columnDefinitionPacket.length);
    Assert.assertEquals(1, columnDefinitionPacket.type);
    Assert.assertEquals(24, byteArray3.length);
    Assert.assertEquals((byte) 0, byteArray3[0]);
    Assert.assertEquals((byte) 0, byteArray3[1]);
    Assert.assertEquals((byte) 0, byteArray3[2]);
    Assert.assertEquals((byte) 0, byteArray3[21]);
    Assert.assertEquals((byte) 0, byteArray3[22]);
    Assert.assertEquals((byte) 0, byteArray3[23]);
    Assert.assertEquals((byte) 0, columnDefinitionPacket.decimals);
    Assert.assertSame(byteArray4, columnDefinitionPacket.defaultValues);
    Assert.assertSame(byteArray3, columnDefinitionPacket.filler);
    Assert.assertEquals(2561, columnDefinitionPacket.charsetSet);
    Assert.assertEquals((byte) 0, columnDefinitionPacket.nextLength);
    Assert.assertSame(byteArray5, columnDefinitionPacket.name);
    Assert.assertSame(byteArray4, columnDefinitionPacket.table);
    Assert.assertEquals("MySQL Column Definition Packet", columnDefinitionPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
