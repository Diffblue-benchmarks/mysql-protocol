package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_calcPacketSizeTest_4_Test {
  @Test
  public void calcPacketSizeTest() throws Exception {
    // Arrange
    ErrorPacket errorPacket = new ErrorPacket();
    errorPacket.errno = 1;
    errorPacket.mark = (byte) 0;
    errorPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};
    errorPacket.packetId = (byte) 0;
    errorPacket.packetLength = 1;
    errorPacket.sqlState = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};

    // Act
    int actual = errorPacket.calcPacketSize();

    // Assert
    Assert.assertEquals(33, actual);
    String toStringResult = errorPacket.toString();
    byte[] byteArray = errorPacket.message;
    byte[] byteArray1 = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=1,id=0}", toStringResult);
    Assert.assertEquals(24, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
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
    Assert.assertEquals((byte) 0, errorPacket.mark);
    Assert.assertEquals(1, errorPacket.errno);
    Assert.assertEquals("MySQL Error Packet", errorPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
