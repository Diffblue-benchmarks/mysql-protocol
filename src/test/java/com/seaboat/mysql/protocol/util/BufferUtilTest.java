package com.seaboat.mysql.protocol.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
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
public class BufferUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BufferUtil actual = new BufferUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeUB2InputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    BufferUtil.writeUB2(buffer, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid()
      throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    BufferUtil.writeLength(buffer, 251L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeUB3InputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    BufferUtil.writeUB3(buffer, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid2()
      throws Exception, InvocationTargetException {

    // Arrange
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
    BufferUtil.writeLength(buffer, 65_536L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeFloatInputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
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
    BufferUtil.writeFloat(buffer, 0.0f);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeIntInputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
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
    BufferUtil.writeInt(buffer, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeDoubleInputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
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
         .doReturn(byteBuffer7))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    BufferUtil.writeDouble(buffer, 0.0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeUB4InputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
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
    BufferUtil.writeUB4(buffer, 0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeLongInputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
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
         .doReturn(byteBuffer7))
        .when(buffer, putMethod)
        .withArguments(anyByte());

    // Act
    BufferUtil.writeLong(buffer, 0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid3()
      throws Exception, InvocationTargetException {

    // Arrange
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
    BufferUtil.writeLength(buffer, 16_777_216L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeLengthInputNotNullZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    PowerMockito.doReturn(byteBuffer).when(buffer, putMethod).withArguments(anyByte());

    // Act
    BufferUtil.writeLength(buffer, 0L);

    // The method returns void, testing that no exception is thrown
  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithNullInputNotNull0OutputVoid() throws Exception, InvocationTargetException {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(byteBuffer).when(buffer, putMethod).withArguments(anyByte());
//    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(byteBuffer1)
//        .when(buffer, putMethod1)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithNull(buffer, src);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithLengthInputNotNull0OutputVoid000d45cf90a79e39655() throws Exception {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(null)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(null).when(buffer, putMethod1).withArguments(anyByte());
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithLength(buffer, src);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithLengthInputNotNull0ZeroOutputVoid3() throws Exception {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(null)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(null).when(buffer, putMethod1).withArguments(anyByte());
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithLength(buffer, src, (byte)0);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithLengthInputNotNull0ZeroOutputVoid001b628bc9fce775afc()
//      throws Exception, InvocationTargetException {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(byteBuffer)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(null).when(buffer, putMethod1).withArguments(anyByte());
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithLength(buffer, src, (byte)0);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithLengthInputNotNull0ZeroOutputVoid()
//      throws Exception, InvocationTargetException {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(byteBuffer)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(byteBuffer1).when(buffer, putMethod1).withArguments(anyByte());
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithLength(buffer, src, (byte)0);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
//  @Test
//  public void writeWithLengthInputNotNull0OutputVoid() throws Exception, InvocationTargetException {
//
//    // Arrange
//    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
//    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
//    PowerMockito.doReturn(byteBuffer)
//        .when(buffer, putMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
//    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
//    PowerMockito.doReturn(byteBuffer1).when(buffer, putMethod1).withArguments(anyByte());
//    final byte[] src = {};
//
//    // Act
//    BufferUtil.writeWithLength(buffer, src);
//
//    // The method returns void, testing that no exception is thrown
//  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeWithLengthInputNotNullNullZeroOutputVoid000c44403772e21be79() throws Exception {

    // Arrange
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    PowerMockito.doReturn(null).when(buffer, putMethod).withArguments(anyByte());

    // Act
    BufferUtil.writeWithLength(buffer, null, (byte)0);

    // The method returns void, testing that no exception is thrown
  }

  // Perfect
  // Test written by Diffblue Cover.
  @Test
  public void getLengthInputZeroOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1, BufferUtil.getLength(0L));
  }

  // Test written by hand.
  @Test
  public void getLengthInputNonZeroOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(1, BufferUtil.getLength(1L));
  }

  // Perfect
  // Test written by Diffblue Cover.
  @Test
  public void getLengthInputPositiveOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(3, BufferUtil.getLength(252L));
  }

  // Perfect
  // Test written by Diffblue Cover.
  @Test
  public void getLengthInputPositiveOutputPositive2() {

    // Act and Assert result
    Assert.assertEquals(4, BufferUtil.getLength(65_536L));
  }

  // Perfect
  // Test written by Diffblue Cover.
  @Test
  public void getLengthInputPositiveOutputPositive3() {

    // Act and Assert result
    Assert.assertEquals(9, BufferUtil.getLength(16_777_216L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLengthInput0OutputPositive00083688741e808c5c4() {

    // Arrange
    final byte[] src = {};

    // Act and Assert result
    Assert.assertEquals(1, BufferUtil.getLength(src));
  }
}
