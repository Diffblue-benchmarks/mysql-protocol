package com.seaboat.mysql.protocol;

import static org.mockito.Matchers.anyByte;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.ShutdownPacket;
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
public class ShutdownPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final ShutdownPacket shutdownPacket = new ShutdownPacket();

    // Act and Assert result
    Assert.assertEquals(2, shutdownPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final ShutdownPacket shutdownPacket = new ShutdownPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Shutdown Packet", shutdownPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid() {

    // Arrange
    final ShutdownPacket shutdownPacket = new ShutdownPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    shutdownPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid2() {

    // Arrange
    final ShutdownPacket shutdownPacket = new ShutdownPacket();
    final byte[] data = {(byte)2, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    shutdownPacket.read(data);

    // Assert side effects
    Assert.assertEquals(2, shutdownPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ShutdownPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ShutdownPacket shutdownPacket = new ShutdownPacket();
    shutdownPacket.type = (byte)0;
    shutdownPacket.packetId = (byte)0;
    shutdownPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
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
         .doReturn(byteBuffer5))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    shutdownPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }
}
