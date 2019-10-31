package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.AuthPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AuthPacket_readTest_4_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    AuthPacket authPacket = new AuthPacket();
    authPacket.charsetIndex = 1;
    authPacket.clientFlags = 1L;
    authPacket.database = "aaaaa";
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    authPacket.extra = byteArray;
    authPacket.maxPacketSize = 1L;
    authPacket.packetId = (byte) 0;
    authPacket.packetLength = 1;
    authPacket.password = new byte[]{0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    authPacket.user = "aaaaa";

    // Act and Assert
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    authPacket.read(byteArray);
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
    String toStringResult = authPacket.toString();
    byte[] byteArray1 = authPacket.password;
    Assert.assertEquals("MySQL Authentication Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals("aaaaa", authPacket.database);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 10, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[21]);
    Assert.assertEquals((byte) 0, byteArray1[22]);
    Assert.assertEquals((byte) 0, byteArray1[23]);
    Assert.assertSame(byteArray, authPacket.extra);
    Assert.assertEquals(0, authPacket.charsetIndex);
    Assert.assertEquals(10L, authPacket.maxPacketSize);
    Assert.assertEquals(null, authPacket.user);
    Assert.assertEquals(0L, authPacket.clientFlags);
    Assert.assertEquals("MySQL Authentication Packet", authPacket.getPacketInfo());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
