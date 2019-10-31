package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_ErrorPacketTest_1_Test {
  @Test
  public void ErrorPacketTest() throws Exception {
    // Arrange and Act
    ErrorPacket errorPacket = new ErrorPacket();

    // Assert
    String toStringResult = errorPacket.toString();
    byte[] byteArray = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(5, byteArray.length);
    Assert.assertArrayEquals(new byte[]{72, 89, 48, 48, 48}, byteArray);
    Assert.assertEquals(null, errorPacket.message);
    Assert.assertEquals((byte) 35, errorPacket.mark);
    Assert.assertEquals(0, errorPacket.errno);
    Assert.assertEquals("MySQL Error Packet", errorPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
