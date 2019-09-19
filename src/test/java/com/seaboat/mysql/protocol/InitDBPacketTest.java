package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.InitDBPacket;
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
public class InitDBPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final InitDBPacket actual = new InitDBPacket();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.schema);
    Assert.assertEquals((byte)0, actual.flag);
    Assert.assertEquals((byte)0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final InitDBPacket initDBPacket = new InitDBPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Init DB Packet", initDBPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid0005c331e88b447886b() {

    // Arrange
    final InitDBPacket initDBPacket = new InitDBPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    initDBPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(initDBPacket.schema);
  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @PrepareForTest({InitDBPacket.class, BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {
//
//    // Arrange
//    final InitDBPacket initDBPacket = new InitDBPacket();
//    final byte[] myByteArray = {};
//    initDBPacket.schema = myByteArray;
//    initDBPacket.flag = (byte)0;
//    initDBPacket.packetId = (byte)0;
//    initDBPacket.packetLength = 0;
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(byteBuffer)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer1)
//         .doReturn(byteBuffer2)
//         .doReturn(byteBuffer3)
//         .doReturn(byteBuffer4)
//         .doReturn(byteBuffer5))
//        .when(buffer, putMethod1)
//        .withArguments(anyByte());
//
//    // Act
//    initDBPacket.write(buffer);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive() {

    // Arrange
    final InitDBPacket initDBPacket = new InitDBPacket();
    final byte[] myByteArray = {};
    initDBPacket.schema = myByteArray;
    initDBPacket.flag = (byte)0;
    initDBPacket.packetId = (byte)0;
    initDBPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, initDBPacket.calcPacketSize());
  }
}
