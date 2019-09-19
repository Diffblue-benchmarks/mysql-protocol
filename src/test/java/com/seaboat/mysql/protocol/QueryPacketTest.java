package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.QueryPacket;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@RunWith(PowerMockRunner.class)
public class QueryPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive00071ecce5dcee6d61e() {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();

    // Act and Assert result
    Assert.assertEquals(1, queryPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Query Packet", queryPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid000ff2cdc13ff67b403() {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    queryPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(queryPacket.message);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({QueryPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();
    queryPacket.message = null;
    queryPacket.flag = (byte)0;
    queryPacket.packetId = (byte)0;
    queryPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    queryPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({QueryPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();
    final byte[] myByteArray = {};
    queryPacket.message = myByteArray;
    queryPacket.flag = (byte)0;
    queryPacket.packetId = (byte)0;
    queryPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    queryPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();
    queryPacket.message = null;
    queryPacket.flag = (byte)0;
    queryPacket.packetId = (byte)0;
    queryPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, queryPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() {

    // Arrange
    final QueryPacket queryPacket = new QueryPacket();
    final byte[] myByteArray = {};
    queryPacket.message = myByteArray;
    queryPacket.flag = (byte)0;
    queryPacket.packetId = (byte)0;
    queryPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, queryPacket.calcPacketSize());
  }
}
