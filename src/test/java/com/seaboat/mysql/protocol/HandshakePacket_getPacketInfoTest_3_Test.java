package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.HandshakePacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HandshakePacket_getPacketInfoTest_3_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.packetId = (byte) 0;
    handshakePacket.packetLength = 1;
    handshakePacket.protocolVersion = (byte) 0;
    handshakePacket.restOfScrambleBuff = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0,
        0, 0};
    handshakePacket.seed = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};
    handshakePacket.serverCapabilities = 1;
    handshakePacket.serverCharsetIndex = (byte) 0;
    handshakePacket.serverStatus = 1;
    handshakePacket.serverVersion = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0};
    handshakePacket.threadId = 1L;

    // Act
    String actual = handshakePacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Handshake Packet", actual);
    String toStringResult = handshakePacket.toString();
    byte[] byteArray = handshakePacket.serverVersion;
    byte[] byteArray1 = handshakePacket.seed;
    byte[] byteArray2 = handshakePacket.restOfScrambleBuff;
    Assert.assertEquals("MySQL Handshake Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(1, handshakePacket.serverCapabilities);
    Assert.assertEquals(24, byteArray2.length);
    Assert.assertEquals((byte) 0, byteArray2[0]);
    Assert.assertEquals((byte) 0, byteArray2[1]);
    Assert.assertEquals((byte) 0, byteArray2[2]);
    Assert.assertEquals((byte) 0, byteArray2[21]);
    Assert.assertEquals((byte) 0, byteArray2[22]);
    Assert.assertEquals((byte) 0, byteArray2[23]);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 10, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    Assert.assertEquals(1, handshakePacket.serverStatus);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals((byte) 0, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(1L, handshakePacket.threadId);
    Assert.assertEquals((byte) 0, handshakePacket.protocolVersion);
    Assert.assertEquals("MySQL Handshake Packet", handshakePacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
