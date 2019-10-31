package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.ErrorPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ErrorPacket_readTest_5_Test {
  @Test
  public void readTest() throws Exception {
    // Arrange
    ErrorPacket errorPacket = new ErrorPacket();
    errorPacket.errno = 1;
    errorPacket.mark = (byte) 0;
    errorPacket.message = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0};
    errorPacket.packetId = (byte) 0;
    errorPacket.packetLength = 1;
    errorPacket.sqlState = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0};
    byte[] byteArray = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0};

    // Act
    errorPacket.read(byteArray);

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
    Assert.assertEquals((byte) 10, byteArray[22]);
    Assert.assertEquals((byte) 0, byteArray[23]);
    String toStringResult = errorPacket.toString();
    byte[] byteArray1 = errorPacket.message;
    byte[] byteArray2 = errorPacket.sqlState;
    Assert.assertEquals("MySQL Error Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals(24, byteArray2.length);
    Assert.assertEquals((byte) 0, byteArray2[0]);
    Assert.assertEquals((byte) 0, byteArray2[1]);
    Assert.assertEquals((byte) 0, byteArray2[2]);
    Assert.assertEquals((byte) 0, byteArray2[21]);
    Assert.assertEquals((byte) 0, byteArray2[22]);
    Assert.assertEquals((byte) 0, byteArray2[23]);
    Assert.assertEquals(17, byteArray1.length);
    Assert.assertEquals((byte) 0, byteArray1[0]);
    Assert.assertEquals((byte) 0, byteArray1[1]);
    Assert.assertEquals((byte) 0, byteArray1[2]);
    Assert.assertEquals((byte) 0, byteArray1[14]);
    Assert.assertEquals((byte) 10, byteArray1[15]);
    Assert.assertEquals((byte) 0, byteArray1[16]);
    Assert.assertEquals((byte) 0, errorPacket.mark);
    Assert.assertEquals(0, errorPacket.errno);
    Assert.assertEquals("MySQL Error Packet", errorPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
