package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.OKPacket;
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
public class OKPacketTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive00074c172f4b1b18d78() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();

    // Act and Assert result
    Assert.assertEquals(7, oKPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL OK Packet", oKPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput11OutputVoid() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    final byte[] data = {(byte)-126, (byte)-126, (byte)-126, (byte)-126, (byte)-126, (byte)-128,
                         (byte)-126, (byte)-126, (byte)-126, (byte)-126, (byte)-126};

    // Act
    oKPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)-126, oKPacket.header);
    Assert.assertEquals(33_410, oKPacket.warningCount);
    Assert.assertEquals(128L, oKPacket.affectedRows);
    Assert.assertEquals(33_410, oKPacket.serverStatus);
    Assert.assertEquals(130L, oKPacket.insertId);
    Assert.assertEquals((byte)-126, oKPacket.packetId);
    Assert.assertEquals(8_553_090, oKPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({OKPacket.class, System.class})
  @Test
  public void readInput15OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    oKPacket.header = (byte)0;
    oKPacket.warningCount = 0;
    oKPacket.affectedRows = 0L;
    oKPacket.message = null;
    oKPacket.serverStatus = 0;
    oKPacket.insertId = 0L;
    oKPacket.packetId = (byte)0;
    oKPacket.packetLength = 0;
    final byte[] data = {(byte)-126, (byte)-126, (byte)-126, (byte)-126, (byte)-126,
                         (byte)-128, (byte)-126, (byte)-126, (byte)-126, (byte)-126,
                         (byte)-126, (byte)-4,   (byte)0,    (byte)-128, (byte)-126};
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
      oKPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals((byte)-126, oKPacket.header);
      Assert.assertEquals(33_410, oKPacket.warningCount);
      Assert.assertEquals(128L, oKPacket.affectedRows);
      Assert.assertEquals(33_410, oKPacket.serverStatus);
      Assert.assertEquals(130L, oKPacket.insertId);
      Assert.assertEquals((byte)-126, oKPacket.packetId);
      Assert.assertEquals(8_553_090, oKPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput15OutputVoid() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    final byte[] data = {(byte)2, (byte)2, (byte)2, (byte)2,  (byte)2, (byte)0, (byte)2, (byte)2,
                         (byte)2, (byte)2, (byte)2, (byte)-4, (byte)0, (byte)0, (byte)2};

    // Act
    oKPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)2, oKPacket.header);
    Assert.assertEquals(514, oKPacket.warningCount);
    Assert.assertNotNull(oKPacket.message);
    Assert.assertEquals(514, oKPacket.serverStatus);
    Assert.assertEquals(2L, oKPacket.insertId);
    Assert.assertEquals((byte)2, oKPacket.packetId);
    Assert.assertEquals(131_586, oKPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({OKPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    oKPacket.header = (byte)0;
    oKPacket.warningCount = 0;
    oKPacket.affectedRows = 0L;
    oKPacket.message = null;
    oKPacket.serverStatus = 0;
    oKPacket.insertId = 0L;
    oKPacket.packetId = (byte)0;
    oKPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
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
         .doReturn(byteBuffer8)
         .doReturn(byteBuffer9)
         .doReturn(byteBuffer10))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    oKPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({OKPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    oKPacket.header = (byte)0;
    oKPacket.warningCount = 0;
    oKPacket.affectedRows = 0L;
    final byte[] myByteArray = {};
    oKPacket.message = myByteArray;
    oKPacket.serverStatus = 0;
    oKPacket.insertId = 0L;
    oKPacket.packetId = (byte)0;
    oKPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
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
         .doReturn(byteBuffer12))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    oKPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.OKPacket");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    oKPacket.header = (byte)0;
    oKPacket.warningCount = 0;
    oKPacket.affectedRows = 17_826_322L;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    oKPacket.message = myByteArray;
    oKPacket.serverStatus = 0;
    oKPacket.insertId = 251L;
    oKPacket.packetId = (byte)0;
    oKPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(25, oKPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() {

    // Arrange
    final OKPacket oKPacket = new OKPacket();
    oKPacket.header = (byte)0;
    oKPacket.warningCount = 0;
    oKPacket.affectedRows = 17_826_322L;
    oKPacket.message = null;
    oKPacket.serverStatus = 0;
    oKPacket.insertId = 251L;
    oKPacket.packetId = (byte)0;
    oKPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(17, oKPacket.calcPacketSize());
  }
}
