package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.AuthPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AuthPacket_getPacketInfoTest_1_Test {
  @Test
  public void getPacketInfoTest() throws Exception {
    // Arrange
    AuthPacket authPacket = new AuthPacket();
    authPacket.charsetIndex = 1;
    authPacket.clientFlags = 1L;
    authPacket.database = "aaaaa";
    authPacket.extra = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    authPacket.maxPacketSize = 1L;
    authPacket.packetId = (byte) 0;
    authPacket.packetLength = 1;
    authPacket.password = new byte[]{0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    authPacket.user = "aaaaa";

    // Act
    String actual = authPacket.getPacketInfo();

    // Assert
    Assert.assertEquals("MySQL Authentication Packet", actual);
    String toStringResult = authPacket.toString();
    byte[] byteArray = authPacket.extra;
    byte[] byteArray1 = authPacket.password;
    Assert.assertEquals("MySQL Authentication Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals("aaaaa", authPacket.database);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 10, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    Assert.assertEquals(24, byteArray.length);
    Assert.assertEquals((byte) 0, byteArray[0]);
    Assert.assertEquals((byte) 0, byteArray[1]);
    Assert.assertEquals((byte) 0, byteArray[2]);
    Assert.assertEquals((byte) 0, byteArray[21]);
    Assert.assertEquals((byte) 0, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    Assert.assertEquals(1, authPacket.charsetIndex);
    Assert.assertEquals(1L, authPacket.maxPacketSize);
    Assert.assertEquals("aaaaa", authPacket.user);
    Assert.assertEquals(1L, authPacket.clientFlags);
    Assert.assertEquals("MySQL Authentication Packet", authPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
