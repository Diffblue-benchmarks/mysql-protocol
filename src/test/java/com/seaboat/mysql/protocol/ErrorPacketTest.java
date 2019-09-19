package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.ErrorPacket;
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
public class ErrorPacketTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final ErrorPacket errorPacket = new ErrorPacket();

    // Act and Assert result
    Assert.assertEquals(9, errorPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final ErrorPacket errorPacket = new ErrorPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Error Packet", errorPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid() {

    // Arrange
    final ErrorPacket errorPacket = new ErrorPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput30OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    final byte[] myByteArray = {(byte)72, (byte)89, (byte)48, (byte)48, (byte)48};
    errorPacket.sqlState = myByteArray;
    errorPacket.mark = (byte)35;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)35,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             errorPacket.sqlState);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput8OutputIndexOutOfBoundsException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    final byte[] myByteArray = {(byte)72, (byte)89, (byte)48, (byte)48, (byte)48};
    errorPacket.sqlState = myByteArray;
    errorPacket.mark = (byte)35;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)35};
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
    errorPacket.read(data);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput15OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    final byte[] myByteArray = {(byte)72, (byte)89, (byte)48, (byte)48, (byte)48};
    errorPacket.sqlState = myByteArray;
    errorPacket.mark = (byte)35;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
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
         .doReturn(byteBuffer9))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    errorPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    final byte[] myByteArray = {};
    errorPacket.message = myByteArray;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
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
         .doReturn(byteBuffer9))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    errorPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    final byte[] myByteArray = {};
    errorPacket.message = myByteArray;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0,  (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)35, (byte)0, (byte)0};
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
    errorPacket.read(data);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput12OutputIndexOutOfBoundsException002d79ad6149ddf5abc()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)35, (byte)0, (byte)0, (byte)0, (byte)0};
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
    errorPacket.read(data);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput8OutputIndexOutOfBoundsException2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)35};
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
    errorPacket.read(data);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput15OutputVoid001a389447463ef5df4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput23OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)35,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             errorPacket.sqlState);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput29OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)35,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             errorPacket.sqlState);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid000bf76101b713d1c75() throws InvocationTargetException {

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ErrorPacket.class, System.class})
  @Test
  public void readInput10OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    errorPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(errorPacket.message);
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() throws InvocationTargetException {

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    errorPacket.message = myByteArray;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(12, errorPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() throws InvocationTargetException {

    // Arrange
    final ErrorPacket errorPacket =
        (ErrorPacket)Reflector.getInstance("com.seaboat.mysql.protocol.ErrorPacket");
    errorPacket.message = null;
    errorPacket.sqlState = null;
    errorPacket.mark = (byte)0;
    errorPacket.errno = 0;
    errorPacket.packetId = (byte)0;
    errorPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(9, errorPacket.calcPacketSize());
  }
}
