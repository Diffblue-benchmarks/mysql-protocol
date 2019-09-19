package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.ResultsetRowPacket;
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
import java.util.ArrayList;

@RunWith(PowerMockRunner.class)
public class ResultsetRowPacketTest {

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    resultsetRowPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroOutputNotNull() {

    // Act, creating object to test constructor
    final ResultsetRowPacket actual = new ResultsetRowPacket(0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.columnValues);
    Assert.assertEquals(0, actual.columnCount);
    Assert.assertEquals((byte)0, actual.packetId);
    Assert.assertEquals(0, actual.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Resultset Row Packet", resultsetRowPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput5OutputVoid0000ff54aa03e6e01ea() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    resultsetRowPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputZero000e96e46c96a65f134() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();

    // Act and Assert result
    Assert.assertEquals(0, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputZero2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket(0);

    // Act and Assert result
    Assert.assertEquals(0, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {};
    arrayList.add(myByteArray1);
    final byte[] myByteArray2 = {};
    arrayList.add(myByteArray2);
    final byte[] myByteArray3 = {};
    arrayList.add(myByteArray3);
    final byte[] myByteArray4 = {};
    arrayList.add(myByteArray4);
    final byte[] myByteArray5 = {};
    arrayList.add(myByteArray5);
    final byte[] myByteArray6 = {};
    arrayList.add(myByteArray6);
    final byte[] myByteArray7 = {};
    arrayList.add(myByteArray7);
    arrayList.add(null);
    final byte[] myByteArray8 = {};
    arrayList.add(myByteArray8);
    final byte[] myByteArray9 = {};
    arrayList.add(myByteArray9);
    final byte[] myByteArray10 = {};
    arrayList.add(myByteArray10);
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 6;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(byteBuffer1)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer2)
         .doReturn(null)
         .doReturn(byteBuffer3)
         .doReturn(null)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray1);
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray2);
    final byte[] myByteArray3 = {(byte)0, (byte)0};
    arrayList.add(myByteArray3);
    final byte[] myByteArray4 = {(byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray4);
    arrayList.add(null);
    final byte[] myByteArray5 = {};
    arrayList.add(myByteArray5);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 6;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
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
         .doReturn(byteBuffer))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid9() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {};
    arrayList.add(myByteArray1);
    final byte[] myByteArray2 = {};
    arrayList.add(myByteArray2);
    final byte[] myByteArray3 = {};
    arrayList.add(myByteArray3);
    final byte[] myByteArray4 = {};
    arrayList.add(myByteArray4);
    final byte[] myByteArray5 = {};
    arrayList.add(myByteArray5);
    final byte[] myByteArray6 = {};
    arrayList.add(myByteArray6);
    arrayList.add(null);
    final byte[] myByteArray7 = {};
    arrayList.add(myByteArray7);
    final byte[] myByteArray8 = {};
    arrayList.add(myByteArray8);
    final byte[] myByteArray9 = {};
    arrayList.add(myByteArray9);
    arrayList.add(null);
    final byte[] myByteArray10 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                  (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray10);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 6;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(byteBuffer1)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(null)
         .doReturn(byteBuffer4)
         .doReturn(null)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid10() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
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
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid11() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(null)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid00033daa386617bc815() throws Exception {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null).doReturn(null).doReturn(null))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(byteBuffer1))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid5() throws Exception {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {(byte)0, (byte)0};
    arrayList.add(myByteArray1);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 3;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null).doReturn(null))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray1);
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray2);
    final byte[] myByteArray3 = {(byte)0, (byte)0};
    arrayList.add(myByteArray3);
    final byte[] myByteArray4 = {(byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray4);
    final byte[] myByteArray5 = {(byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray5);
    final byte[] myByteArray6 = {};
    arrayList.add(myByteArray6);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 6;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null)
         .doReturn(null))
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
         .doReturn(byteBuffer))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    resultsetRowPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput22OutputVoid() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)1,  (byte)2,  (byte)0,    (byte)0, (byte)-2, (byte)-5,
                         (byte)-1, (byte)-1, (byte)-125, (byte)0, (byte)-3, (byte)123,
                         (byte)-2, (byte)-2, (byte)0,    (byte)0, (byte)0,  (byte)0,
                         (byte)0,  (byte)0,  (byte)0,    (byte)0};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(resultsetRowPacket.columnValues);
    Assert.assertEquals(2, resultsetRowPacket.columnValues.size());
    Assert.assertNull(resultsetRowPacket.columnValues.get(0));
    Assert.assertNotNull(resultsetRowPacket.columnValues.get(1));
    Assert.assertEquals(513, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)-5, (byte)-5, (byte)-5, (byte)-5, (byte)1, (byte)-5, (byte)-5};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)-5, resultsetRowPacket.packetId);
    Assert.assertEquals(16_514_043, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput7OutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)-5, (byte)-5, (byte)-5, (byte)-5, (byte)1, (byte)-5, (byte)-5};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(resultsetRowPacket.columnValues);
    Assert.assertEquals(1, resultsetRowPacket.columnValues.size());
    Assert.assertNotNull(resultsetRowPacket.columnValues.get(0));
    Assert.assertEquals((byte)-5, resultsetRowPacket.packetId);
    Assert.assertEquals(16_514_043, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput7OutputVoid4() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = -2_147_483_646;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    resultsetRowPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput8OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)-3, (byte)2, (byte)0, (byte)0};
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
      resultsetRowPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals((byte)1, resultsetRowPacket.packetId);
      Assert.assertEquals(65_793, resultsetRowPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput9OutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                         (byte)2,  (byte)0,  (byte)0,  (byte)-3};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(resultsetRowPacket.columnValues);
    Assert.assertEquals(2, resultsetRowPacket.columnValues.size());
    Assert.assertNull(resultsetRowPacket.columnValues.get(0));
    Assert.assertNotNull(resultsetRowPacket.columnValues.get(1));
    Assert.assertEquals((byte)-4, resultsetRowPacket.packetId);
    Assert.assertEquals(16_579_836, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput23OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)0,   (byte)16, (byte)0,   (byte)2,  (byte)-2, (byte)0,
                         (byte)0,   (byte)0,  (byte)0,   (byte)3,  (byte)4,  (byte)-6,
                         (byte)-67, (byte)-2, (byte)-68, (byte)0,  (byte)0,  (byte)0,
                         (byte)25,  (byte)9,  (byte)59,  (byte)-1, (byte)-5};
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
      resultsetRowPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(resultsetRowPacket.columnValues);
      Assert.assertEquals(7, resultsetRowPacket.columnValues.size());
      Assert.assertNull(resultsetRowPacket.columnValues.get(0));
      Assert.assertNull(resultsetRowPacket.columnValues.get(1));
      Assert.assertNull(resultsetRowPacket.columnValues.get(2));
      Assert.assertNull(resultsetRowPacket.columnValues.get(3));
      Assert.assertNull(resultsetRowPacket.columnValues.get(4));
      Assert.assertNull(resultsetRowPacket.columnValues.get(5));
      Assert.assertNotNull(resultsetRowPacket.columnValues.get(6));
      Assert.assertEquals((byte)2, resultsetRowPacket.packetId);
      Assert.assertEquals(4096, resultsetRowPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput23OutputVoid() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = -2_147_483_645;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)4,  (byte)20, (byte)4,    (byte)6,  (byte)6,  (byte)9,
                         (byte)41, (byte)0,  (byte)-127, (byte)7,  (byte)0,  (byte)-2,
                         (byte)1,  (byte)0,  (byte)0,    (byte)0,  (byte)26, (byte)11,
                         (byte)29, (byte)13, (byte)63,   (byte)-5, (byte)-2};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)6, resultsetRowPacket.packetId);
    Assert.assertEquals(267_268, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput29OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)-18, (byte)-3, (byte)-3, (byte)-3,   (byte)-2,  (byte)-1,
                         (byte)-1,  (byte)0,  (byte)0,  (byte)-1,   (byte)127, (byte)0,
                         (byte)0,   (byte)-2, (byte)-2, (byte)-1,   (byte)-1,  (byte)127,
                         (byte)0,   (byte)0,  (byte)-2, (byte)-2,   (byte)64,  (byte)-64,
                         (byte)0,   (byte)0,  (byte)32, (byte)-128, (byte)-4};
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
      resultsetRowPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals((byte)-3, resultsetRowPacket.packetId);
      Assert.assertEquals(16_645_614, resultsetRowPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput30OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 3;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)4, (byte)21, (byte)7, (byte)-123, (byte)-2, (byte)34,
                         (byte)0, (byte)0,  (byte)0, (byte)4,    (byte)1,  (byte)4,
                         (byte)4, (byte)-2, (byte)8, (byte)0,    (byte)0,  (byte)0,
                         (byte)5, (byte)20, (byte)4, (byte)2,    (byte)4,  (byte)4,
                         (byte)0, (byte)4,  (byte)4, (byte)6,    (byte)4,  (byte)4};
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
      resultsetRowPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals((byte)-123, resultsetRowPacket.packetId);
      Assert.assertEquals(464_132, resultsetRowPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput30OutputVoid() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)1,  (byte)0,
                         (byte)-2, (byte)13, (byte)0,  (byte)0,  (byte)0,  (byte)1,
                         (byte)1,  (byte)1,  (byte)1,  (byte)1,  (byte)1,  (byte)1,
                         (byte)1,  (byte)1,  (byte)1,  (byte)1,  (byte)1,  (byte)1,
                         (byte)1,  (byte)1,  (byte)1,  (byte)1,  (byte)-4, (byte)-15};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)-1, resultsetRowPacket.packetId);
    Assert.assertEquals(16_777_215, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput6OutputIndexOutOfBoundsException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)-1, (byte)0};
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
    resultsetRowPacket.read(data);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput6OutputVoid() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)-5, (byte)0};

    // Act
    resultsetRowPacket.read(data);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ResultsetRowPacket.class, System.class})
  @Test
  public void readInput22OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 131_073;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)49,  (byte)2,   (byte)0,  (byte)2,  (byte)-2,  (byte)-1,
                         (byte)-1,  (byte)-1,  (byte)-1, (byte)-1, (byte)127, (byte)-33,
                         (byte)-33, (byte)-2,  (byte)1,  (byte)0,  (byte)0,   (byte)0,
                         (byte)-33, (byte)-33, (byte)33, (byte)33};
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
      resultsetRowPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      final ArrayList<byte[]> arrayList1 = new ArrayList<byte[]>();
      arrayList1.add(null);
      Assert.assertEquals(arrayList1, resultsetRowPacket.columnValues);
      Assert.assertEquals((byte)2, resultsetRowPacket.packetId);
      Assert.assertEquals(561, resultsetRowPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput6OutputVoid2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = -2_147_483_648;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final byte[] data = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-23};

    // Act
    resultsetRowPacket.read(data);

    // Assert side effects
    Assert.assertEquals((byte)1, resultsetRowPacket.packetId);
    Assert.assertEquals(65_793, resultsetRowPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException6() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 5;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException7() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 5;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException8() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 5;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException9() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 262_146;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException5() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullOutputIndexOutOfBoundsException() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(buffer);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullOutputIndexOutOfBoundsException2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(buffer);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException4() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException3() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {};
    arrayList.add(myByteArray1);
    arrayList.add(null);
    final byte[] myByteArray2 = {};
    arrayList.add(myByteArray2);
    arrayList.add(null);
    final byte[] myByteArray3 = {};
    arrayList.add(myByteArray3);
    final byte[] myByteArray4 = {};
    arrayList.add(myByteArray4);
    final byte[] myByteArray5 = {};
    arrayList.add(myByteArray5);
    arrayList.add(null);
    final byte[] myByteArray6 = {};
    arrayList.add(myByteArray6);
    final byte[] myByteArray7 = {};
    arrayList.add(myByteArray7);
    final byte[] myByteArray8 = {};
    arrayList.add(myByteArray8);
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 16;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    arrayList.add(null);
    final byte[] myByteArray1 = {};
    arrayList.add(myByteArray1);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 32_768;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    arrayList.add(myByteArray);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 3;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException001124e40011f736b52() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 131_073;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException3() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {(byte)0};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 131_073;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException4() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 131_073;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputIndexOutOfBoundsException5() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 18;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.calcPacketSize();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNullOutputIndexOutOfBoundsException6() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    resultsetRowPacket.write(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputZero000ce6a408842cf2e9d() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = -2_147_483_648;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(0, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputZero000bdf6848e8fe8bb14() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    resultsetRowPacket.columnValues = null;
    resultsetRowPacket.columnCount = 0;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(0, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive5() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive4() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    final byte[] myByteArray = {};
    arrayList.add(myByteArray);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 7;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(7, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    final byte[] myByteArray = {(byte)0};
    arrayList.add(myByteArray);
    final byte[] myByteArray1 = {};
    arrayList.add(myByteArray1);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 2;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(3, resultsetRowPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive002fcb047e245383418() {

    // Arrange
    final ResultsetRowPacket resultsetRowPacket = new ResultsetRowPacket();
    final ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
    arrayList.add(null);
    resultsetRowPacket.columnValues = arrayList;
    resultsetRowPacket.columnCount = 1;
    resultsetRowPacket.packetId = (byte)0;
    resultsetRowPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(1, resultsetRowPacket.calcPacketSize());
  }
}
