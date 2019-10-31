package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.HandshakePacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakePacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.packetId = (byte) 0;
    handshakePacket.packetLength = 1;
    handshakePacket.protocolVersion = (byte) 0;
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};
    handshakePacket.restOfScrambleBuff = byteArray;
    handshakePacket.seed = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};
    handshakePacket.serverCapabilities = 1;
    handshakePacket.serverCharsetIndex = (byte) 0;
    handshakePacket.serverStatus = 1;
    handshakePacket.serverVersion = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0};
    handshakePacket.threadId = 1L;

    // Act
    handshakePacket.read(byteArray);

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
    String toStringResult = handshakePacket.toString();
    byte[] byteArray1 = handshakePacket.serverVersion;
    byte[] byteArray2 = handshakePacket.seed;
    byte[] byteArray3 = handshakePacket.restOfScrambleBuff;
    Assert.assertEquals("MySQL Handshake Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(0, handshakePacket.serverCapabilities);
    Assert.assertEquals(0, byteArray3.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray3);
    Assert.assertEquals(0, byteArray2.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray2);
    Assert.assertEquals(0, handshakePacket.serverStatus);
    Assert.assertEquals(0, byteArray1.length);
    Assert.assertArrayEquals(new byte[]{}, byteArray1);
    Assert.assertEquals((byte) 0, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(0L, handshakePacket.threadId);
    Assert.assertEquals((byte) 0, handshakePacket.protocolVersion);
    Assert.assertEquals("MySQL Handshake Packet", handshakePacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
