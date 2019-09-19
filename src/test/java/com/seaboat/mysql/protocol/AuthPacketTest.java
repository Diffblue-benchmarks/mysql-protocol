package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.AuthPacket;
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
public class AuthPacketTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive00028139384e5291dcd() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();

    // Act and Assert result
    Assert.assertEquals(35, authPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Authentication Packet", authPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput14OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)1,  (byte)9, (byte)9, (byte)8, (byte)1,
                         (byte)1, (byte)1, (byte)64, (byte)1, (byte)1, (byte)1, (byte)1};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(16_859_137L, authPacket.maxPacketSize);
      Assert.assertEquals(1, authPacket.charsetIndex);
      Assert.assertEquals(16_844_809L, authPacket.clientFlags);
      Assert.assertEquals((byte)9, authPacket.packetId);
      Assert.assertEquals(65_793, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput17OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1,  (byte)32, (byte)1, (byte)1, (byte)5,
                         (byte)1, (byte)1,  (byte)0,  (byte)1, (byte)1, (byte)3,
                         (byte)2, (byte)-4, (byte)16, (byte)0, (byte)32};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(50_397_440L, authPacket.maxPacketSize);
      Assert.assertEquals(2, authPacket.charsetIndex);
      Assert.assertEquals(16_844_033L, authPacket.clientFlags);
      Assert.assertEquals((byte)1, authPacket.packetId);
      Assert.assertEquals(2_097_409, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.AuthPacket");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "\u0000\u0000\u0000";
    authPacket.clientFlags = 0L;
    authPacket.database = "";
    final byte[] myByteArray = {(byte)0, (byte)0};
    authPacket.password = myByteArray;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(null)
         .doReturn(byteBuffer5))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "\u0000\u0000\u0000";
    authPacket.clientFlags = 0L;
    authPacket.database = "";
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(null)
         .doReturn(byteBuffer4))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    final byte[] myByteArray = {(byte)0};
    authPacket.password = myByteArray;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(byteBuffer))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer1)
         .doReturn(null)
         .doReturn(byteBuffer2)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(null)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    final byte[] myByteArray = {(byte)0};
    authPacket.password = myByteArray;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer17 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer16 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer15 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer14 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer13 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer12 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer11 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer10 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer9 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer8 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer7)
         .doReturn(byteBuffer8)
         .doReturn(byteBuffer9)
         .doReturn(byteBuffer10)
         .doReturn(byteBuffer11)
         .doReturn(byteBuffer12)
         .doReturn(byteBuffer13)
         .doReturn(byteBuffer14)
         .doReturn(byteBuffer15)
         .doReturn(byteBuffer16)
         .doReturn(byteBuffer17))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "\u0000\u0000\u0000";
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(byteBuffer))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(null)
         .doReturn(byteBuffer3))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer16 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer15 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer14 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer13 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer12 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer11 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer10 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer9 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer8 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer7 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer6 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer5)
         .doReturn(byteBuffer6)
         .doReturn(byteBuffer7)
         .doReturn(byteBuffer8)
         .doReturn(byteBuffer9)
         .doReturn(byteBuffer10)
         .doReturn(byteBuffer11)
         .doReturn(byteBuffer12)
         .doReturn(byteBuffer13)
         .doReturn(byteBuffer14)
         .doReturn(byteBuffer15)
         .doReturn(byteBuffer16))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid5() throws Exception, InvocationTargetException {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(null)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer1))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    authPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput24OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "?";
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    final byte[] myByteArray = {};
    authPacket.password = myByteArray;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)53, (byte)53, (byte)53, (byte)53,  (byte)60, (byte)53,
                         (byte)53, (byte)55, (byte)52, (byte)52,  (byte)52, (byte)52,
                         (byte)52, (byte)-2, (byte)17, (byte)0,   (byte)0,  (byte)0,
                         (byte)53, (byte)53, (byte)53, (byte)-76, (byte)53, (byte)-76};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(875_836_468L, authPacket.maxPacketSize);
      Assert.assertEquals(52, authPacket.charsetIndex);
      Assert.assertEquals(926_233_916L, authPacket.clientFlags);
      Assert.assertEquals((byte)53, authPacket.packetId);
      Assert.assertEquals(3_487_029, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput16OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1,
                         (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-4, (byte)2, (byte)0};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(16_843_009L, authPacket.maxPacketSize);
      Assert.assertEquals(1, authPacket.charsetIndex);
      Assert.assertEquals(16_843_009L, authPacket.clientFlags);
      Assert.assertEquals((byte)1, authPacket.packetId);
      Assert.assertEquals(65_793, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput15OutputIndexOutOfBoundsException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)2,  (byte)3, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1,
                         (byte)3, (byte)65, (byte)1, (byte)3, (byte)1, (byte)2, (byte)7};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(50_413_827L, authPacket.maxPacketSize);
      Assert.assertEquals(1, authPacket.charsetIndex);
      Assert.assertEquals(16_842_753L, authPacket.clientFlags);
      Assert.assertEquals((byte)1, authPacket.packetId);
      Assert.assertEquals(197_121, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput15OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)0,  (byte)-128, (byte)-128, (byte)1, (byte)1,
                         (byte)1,  (byte)1,    (byte)4,    (byte)1, (byte)2,
                         (byte)16, (byte)2,    (byte)1,    (byte)5, (byte)1};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(34_603_521L, authPacket.maxPacketSize);
      Assert.assertEquals(1, authPacket.charsetIndex);
      Assert.assertEquals(67_174_657L, authPacket.clientFlags);
      Assert.assertEquals((byte)1, authPacket.packetId);
      Assert.assertEquals(8_421_376, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({AuthPacket.class, System.class})
  @Test
  public void readInput21OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;
    final byte[] data = {(byte)-2, (byte)-20, (byte)-18, (byte)-18, (byte)-25, (byte)-2, (byte)-2,
                         (byte)-9, (byte)-26, (byte)-26, (byte)-25, (byte)-2,  (byte)-2, (byte)16,
                         (byte)-2, (byte)-2,  (byte)-2,  (byte)-2,  (byte)-3,  (byte)-2, (byte)-2};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    PowerMockito.doThrow(indexOutOfBoundsException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      authPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals(4_276_610_790L, authPacket.maxPacketSize);
      Assert.assertEquals(254, authPacket.charsetIndex);
      Assert.assertEquals(4_160_683_751L, authPacket.clientFlags);
      Assert.assertEquals((byte)-18, authPacket.packetId);
      Assert.assertEquals(15_658_238, authPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "foo";
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(38, authPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive5() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = "foo";
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    authPacket.password = myByteArray;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(41, authPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive4() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = "foo";
    authPacket.clientFlags = 0L;
    authPacket.database = "foo";
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(41, authPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() {

    // Arrange
    final AuthPacket authPacket = new AuthPacket();
    authPacket.maxPacketSize = 0L;
    authPacket.charsetIndex = 0;
    authPacket.extra = null;
    authPacket.user = null;
    authPacket.clientFlags = 0L;
    authPacket.database = null;
    authPacket.password = null;
    authPacket.packetId = (byte)0;
    authPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(35, authPacket.calcPacketSize());
  }
}
