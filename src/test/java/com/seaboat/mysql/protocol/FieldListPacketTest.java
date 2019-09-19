package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.FieldListPacket;
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
public class FieldListPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final FieldListPacket actual = new FieldListPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.fieldWildcard);
    Assert.assertEquals((byte)0, actual.flag);
    Assert.assertNull(actual.table);
    Assert.assertEquals((byte)0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Field List Packet", fieldListPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({FieldListPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    final byte[] myByteArray = {};
    fieldListPacket.fieldWildcard = myByteArray;
    fieldListPacket.flag = (byte)0;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    fieldListPacket.table = myByteArray1;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer7 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer6 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5)
         .doReturn(byteBuffer6)
         .doReturn(byteBuffer7))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    fieldListPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid() {

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    fieldListPacket.fieldWildcard = null;
    fieldListPacket.flag = (byte)0;
    fieldListPacket.table = null;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    fieldListPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(fieldListPacket.fieldWildcard);
    Assert.assertEquals(fieldListPacket.fieldWildcard, fieldListPacket.table);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({FieldListPacket.class, System.class})
  @Test
  public void readInput6OutputVoid0000d7312fcadf7b633() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    fieldListPacket.fieldWildcard = null;
    fieldListPacket.flag = (byte)0;
    fieldListPacket.table = null;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    fieldListPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(fieldListPacket.fieldWildcard);
    Assert.assertNotNull(fieldListPacket.table);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({FieldListPacket.class, System.class})
  @Test
  public void readInput7OutputVoid0002c8f8a75cea72383() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    fieldListPacket.fieldWildcard = null;
    fieldListPacket.flag = (byte)0;
    fieldListPacket.table = null;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};

    // Act
    fieldListPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(fieldListPacket.fieldWildcard);
    Assert.assertNotNull(fieldListPacket.table);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({FieldListPacket.class, System.class})
  @Test
  public void readInput7OutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    fieldListPacket.fieldWildcard = null;
    fieldListPacket.flag = (byte)0;
    fieldListPacket.table = null;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0};

    // Act
    fieldListPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(fieldListPacket.fieldWildcard);
    Assert.assertNotNull(fieldListPacket.table);
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final FieldListPacket fieldListPacket = new FieldListPacket();
    final byte[] myByteArray = {};
    fieldListPacket.fieldWildcard = myByteArray;
    fieldListPacket.flag = (byte)0;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    fieldListPacket.table = myByteArray1;
    fieldListPacket.packetId = (byte)0;
    fieldListPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(12, fieldListPacket.calcPacketSize());
  }
}
