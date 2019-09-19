package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.HandshakePacket;
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
public class HandshakePacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Handshake Packet", handshakePacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput19OutputVoid() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)2,
                         (byte)0, (byte)2, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0,
                         (byte)1, (byte)0, (byte)1, (byte)0, (byte)1};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(1, handshakePacket.serverCapabilities);
    Assert.assertEquals((byte)1, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(256, handshakePacket.serverStatus);
    Assert.assertEquals(2L, handshakePacket.threadId);
    Assert.assertNotNull(handshakePacket.seed);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput19OutputVoid2() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)3, (byte)2,
                         (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1,
                         (byte)1, (byte)1, (byte)1, (byte)1, (byte)2};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(257, handshakePacket.serverCapabilities);
    Assert.assertEquals((byte)1, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(257, handshakePacket.serverStatus);
    Assert.assertEquals(16_843_009L, handshakePacket.threadId);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals(257, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HandshakePacket actual = new HandshakePacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.restOfScrambleBuff);
    Assert.assertEquals((byte)0, actual.protocolVersion);
    Assert.assertNull(actual.serverVersion);
    Assert.assertEquals(0, actual.serverCapabilities);
    Assert.assertEquals((byte)0, actual.serverCharsetIndex);
    Assert.assertEquals(0, actual.serverStatus);
    Assert.assertEquals(0L, actual.threadId);
    Assert.assertNull(actual.seed);
    Assert.assertEquals((byte)0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    final byte[] myByteArray = {};
    handshakePacket.restOfScrambleBuff = myByteArray;
    handshakePacket.protocolVersion = (byte)0;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0};
    handshakePacket.serverVersion = myByteArray1;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    final byte[] myByteArray2 = {};
    handshakePacket.seed = myByteArray2;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer20 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer19 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer18 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer4)
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
         .doReturn(byteBuffer17)
         .doReturn(byteBuffer18)
         .doReturn(byteBuffer19)
         .doReturn(byteBuffer20))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    handshakePacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.HandshakePacket");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput24OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)0,    (byte)1, (byte)1, (byte)-128,
                         (byte)1, (byte)0, (byte)0,    (byte)0, (byte)0, (byte)0,
                         (byte)1, (byte)1, (byte)-128, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0,    (byte)1, (byte)1, (byte)1};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertEquals((byte)1, handshakePacket.protocolVersion);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals((byte)1, handshakePacket.packetId);
    Assert.assertEquals(257, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput25OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1, (byte)0,
                         (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)4, (byte)1,
                         (byte)1, (byte)0, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0,
                         (byte)1, (byte)1, (byte)1, (byte)1};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(257, handshakePacket.serverCapabilities);
    Assert.assertEquals((byte)1, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(16_842_752L, handshakePacket.threadId);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals((byte)1, handshakePacket.packetId);
    Assert.assertEquals(65_792, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput26OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)0,    (byte)1,    (byte)0, (byte)1, (byte)2,    (byte)3,
                         (byte)2, (byte)0,    (byte)-128, (byte)1, (byte)1, (byte)1,    (byte)0,
                         (byte)1, (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)-127, (byte)2,
                         (byte)2, (byte)-127, (byte)2,    (byte)2, (byte)0};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertEquals((byte)1, handshakePacket.protocolVersion);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(257, handshakePacket.serverCapabilities);
    Assert.assertEquals((byte)1, handshakePacket.serverCharsetIndex);
    Assert.assertEquals(257, handshakePacket.serverStatus);
    Assert.assertEquals(16_843_136L, handshakePacket.threadId);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals(65_537, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput30OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    handshakePacket.serverVersion = null;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    final byte[] myByteArray = {};
    handshakePacket.seed = myByteArray;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)1, (byte)0, (byte)1, (byte)0, (byte)1, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)1, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                         (byte)1, (byte)0, (byte)0, (byte)1, (byte)1, (byte)1};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(1, handshakePacket.serverCapabilities);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals((byte)1, handshakePacket.packetId);
    Assert.assertEquals(256, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HandshakePacket.class, System.class})
  @Test
  public void readInput19OutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    handshakePacket.restOfScrambleBuff = null;
    handshakePacket.protocolVersion = (byte)0;
    final byte[] myByteArray = {(byte)0};
    handshakePacket.serverVersion = myByteArray;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    handshakePacket.seed = null;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)0, (byte)1, (byte)0, (byte)0, (byte)-128, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,    (byte)0,
                         (byte)0, (byte)0, (byte)1, (byte)0, (byte)1};

    // Act
    handshakePacket.read(data);

    // Assert side effects
    Assert.assertNotNull(handshakePacket.restOfScrambleBuff);
    Assert.assertNotNull(handshakePacket.serverVersion);
    Assert.assertEquals(256, handshakePacket.serverStatus);
    Assert.assertEquals(16_777_216L, handshakePacket.threadId);
    Assert.assertNotNull(handshakePacket.seed);
    Assert.assertEquals(65_537, handshakePacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final HandshakePacket handshakePacket = new HandshakePacket();
    final byte[] myByteArray = {};
    handshakePacket.restOfScrambleBuff = myByteArray;
    handshakePacket.protocolVersion = (byte)0;
    final byte[] myByteArray1 = {};
    handshakePacket.serverVersion = myByteArray1;
    handshakePacket.serverCapabilities = 0;
    handshakePacket.serverCharsetIndex = (byte)0;
    handshakePacket.serverStatus = 0;
    handshakePacket.threadId = 0L;
    final byte[] myByteArray2 = {(byte)0};
    handshakePacket.seed = myByteArray2;
    handshakePacket.packetId = (byte)0;
    handshakePacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(27, handshakePacket.calcPacketSize());
  }
}
