package com.seaboat.mysql.protocol;

import static org.mockito.Matchers.anyByte;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.ProcessKillPacket;
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
public class ProcessKillPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final ProcessKillPacket processKillPacket = new ProcessKillPacket();

    // Act and Assert result
    Assert.assertEquals(5, processKillPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final ProcessKillPacket processKillPacket = new ProcessKillPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Process Kill Packet", processKillPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput10OutputVoid() {

    // Arrange
    final ProcessKillPacket processKillPacket = new ProcessKillPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    processKillPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)0, processKillPacket.flag);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProcessKillPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ProcessKillPacket processKillPacket = new ProcessKillPacket();
    processKillPacket.connectionId = 0;
    processKillPacket.flag = (byte)0;
    processKillPacket.packetId = (byte)0;
    processKillPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer8 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer7 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer6 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5)
         .doReturn(byteBuffer6)
         .doReturn(byteBuffer7)
         .doReturn(byteBuffer8))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    processKillPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }
}
