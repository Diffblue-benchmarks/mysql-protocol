package com.seaboat.mysql.protocol;

import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PerfectStatisticsPacketTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by hand
  @Test
  public void read1() {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    final byte[] data = {2, 4, 3, 1, 7, 3, 56, 127};

    // Act
    statisticsPacket.read(data);

    // Test side-effects
    Assert.assertEquals(data[0] + data[1]*256 + data[2]*65536, statisticsPacket.packetLength);
    Assert.assertEquals(data[3], statisticsPacket.packetId);
    Assert.assertEquals(data[4], statisticsPacket.payload);
  }

  // Test written by hand
  @Test
  public void read2() {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    final byte[] data = {2, 4, 3, 1}; // array must have at least 5 elements

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    statisticsPacket.read(data);
  }

  // Test written by hand
  @Test
  public void write1() throws Exception, InvocationTargetException {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    ByteBuffer buffer = ByteBuffer.allocate(5);

    // Act
    statisticsPacket.write(buffer);

    // Test side-effects
    byte[] arr = {1, 0, 0, 0, MysqlPacket.COM_STATISTICS};
    ByteBuffer otherBuffer = ByteBuffer.wrap(arr);
    otherBuffer.position(5);
    Assert.assertEquals(otherBuffer, buffer);
  }

  // Test written by hand
  @Test
  public void write2() throws Exception, InvocationTargetException {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    ByteBuffer buffer = ByteBuffer.allocate(4); // buffer to write in must have capacity at least 5

    // Act
    thrown.expect(BufferOverflowException.class);
    statisticsPacket.write(buffer);

    // The method is not expected to return due to exception thrown
  }
}
