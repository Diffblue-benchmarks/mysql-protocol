package com.seaboat.mysql.protocol;

import static org.mockito.Matchers.anyByte;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.StatisticsPacket;
import com.seaboat.mysql.protocol.util.BufferUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@RunWith(PowerMockRunner.class)
public class StatisticsPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();

    // Act and Assert result
    Assert.assertEquals(1, statisticsPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Statistics Packet", statisticsPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid() {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    statisticsPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StatisticsPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final StatisticsPacket statisticsPacket = new StatisticsPacket();
    statisticsPacket.payload = (byte)0;
    statisticsPacket.packetId = (byte)0;
    statisticsPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    statisticsPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }
}
