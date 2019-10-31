package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnDefinitionPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnDefinitionPacket_readTest_1_Test {
  @Test
  public void readTest() throws Exception {
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
    columnDefinitionPacket.read(byteArray2);

    // Assert
    Assert.assertEquals(24, byteArray2.length);
    Assert.assertEquals((byte) 0, byteArray2[0]);
    Assert.assertEquals((byte) 0, byteArray2[1]);
    Assert.assertEquals((byte) 0, byteArray2[2]);
    Assert.assertEquals((byte) 0, byteArray2[3]);
    Assert.assertEquals((byte) 0, byteArray2[4]);
    Assert.assertEquals((byte) 0, byteArray2[5]);
    Assert.assertEquals((byte) 0, byteArray2[18]);
    Assert.assertEquals((byte) 0, byteArray2[19]);
    Assert.assertEquals((byte) 0, byteArray2[20]);
    Assert.assertEquals((byte) 0, byteArray2[21]);
    Assert.assertEquals((byte) 0, byteArray2[22]);
    Assert.assertEquals((byte) 0, byteArray2[23]);
    String toStringResult = columnDefinitionPacket.toString();
    byte[] byteArray3 = columnDefinitionPacket.filler;
    byte[] byteArray4 = columnDefinitionPacket.schema;
    Assert.assertEquals("MySQL Column Definition Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0, byteArray4.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray4);
    Assert.assertSame(byteArray4, columnDefinitionPacket.orgName);
    Assert.assertSame(byteArray4, columnDefinitionPacket.catalog);
    Assert.assertEquals(0, columnDefinitionPacket.flags);
    Assert.assertEquals(0L, columnDefinitionPacket.length);
    Assert.assertEquals(0, columnDefinitionPacket.type);
    Assert.assertSame(byteArray4, columnDefinitionPacket.orgTable);
    Assert.assertEquals((byte) 0, columnDefinitionPacket.decimals);
    Assert.assertSame(byteArray4, columnDefinitionPacket.defaultValues);
    Assert.assertEquals(2, byteArray3.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, byteArray3);
    Assert.assertEquals(0, columnDefinitionPacket.charsetSet);
    Assert.assertEquals((byte) 0, columnDefinitionPacket.nextLength);
    Assert.assertSame(byteArray4, columnDefinitionPacket.name);
    Assert.assertSame(byteArray4, columnDefinitionPacket.table);
    Assert.assertEquals("MySQL Column Definition Packet", columnDefinitionPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
