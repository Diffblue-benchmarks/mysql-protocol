package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ColumnDefinitionPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnDefinitionPacket_ColumnDefinitionPacketTest_3_Test {
  @Test
  public void ColumnDefinitionPacketTest() throws Exception {
    // Arrange and Act
    ColumnDefinitionPacket columnDefinitionPacket = new ColumnDefinitionPacket();

    // Assert
    String toStringResult = columnDefinitionPacket.toString();
    byte[] byteArray = columnDefinitionPacket.filler;
    byte[] byteArray1 = columnDefinitionPacket.catalog;
    Assert.assertEquals("MySQL Column Definition Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(null, columnDefinitionPacket.schema);
    Assert.assertEquals(null, columnDefinitionPacket.orgName);
    Assert.assertEquals(3, byteArray1.length);
    Assert.assertArrayEquals(new byte[]{100, 101, 102}, byteArray1);
    Assert.assertEquals(0, columnDefinitionPacket.flags);
    Assert.assertEquals(0L, columnDefinitionPacket.length);
    Assert.assertEquals(0, columnDefinitionPacket.type);
    Assert.assertEquals(null, columnDefinitionPacket.orgTable);
    Assert.assertEquals((byte) 0, columnDefinitionPacket.decimals);
    Assert.assertEquals(null, columnDefinitionPacket.defaultValues);
    Assert.assertEquals(2, byteArray.length);
    Assert.assertArrayEquals(new byte[]{0, 0}, byteArray);
    Assert.assertEquals(0, columnDefinitionPacket.charsetSet);
    Assert.assertEquals((byte) 12, columnDefinitionPacket.nextLength);
    Assert.assertEquals(null, columnDefinitionPacket.name);
    Assert.assertEquals(null, columnDefinitionPacket.table);
    Assert.assertEquals("MySQL Column Definition Packet", columnDefinitionPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
