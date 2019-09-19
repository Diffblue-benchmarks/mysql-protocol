package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.MysqlMessage;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

@RunWith(PowerMockRunner.class)
public class MysqlMessageTest {

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ThreadLocal threadLocal = PowerMockito.mock(ThreadLocal.class);
    PowerMockito.whenNew(ThreadLocal.class).withNoArguments().thenReturn(threadLocal);

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");

    // Assert side effects
    Assert.assertArrayEquals(new byte[] {}, ((byte[])Reflector.getInstanceField(
                                                MysqlMessage.class, null, "EMPTY_BYTES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesOutput0() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.bytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, Arrays.class})
  @Test
  public void toStringOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    PowerMockito.when(Arrays.toString(or(isA(byte[].class), isNull(byte[].class))))
        .thenReturn("foo");

    // Act
    final String actual = mysqlMessage.toString();

    // Assert result
    Assert.assertEquals("foo", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4OutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readUB4());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputTrue001e7a374b46daa7b5e() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertTrue(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3OutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, mysqlMessage.readUB3());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2OutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, mysqlMessage.readUB2());
  }

  // Test written by Diffblue Cover.
  @Test
  public void lengthOutputZero() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, mysqlMessage.length());
  }

  // Test written by Diffblue Cover.
  @Test
  public void moveInputZeroOutputVoid() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    mysqlMessage.move(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void positionInputZeroOutputVoid() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    mysqlMessage.position(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void positionOutputZero() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, mysqlMessage.position());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16);
    final byte[] myByteArray = {(byte)-3,  (byte)3, (byte)0, (byte)0, (byte)102, (byte)111,
                                (byte)111, (byte)1, (byte)0, (byte)0, (byte)0,   (byte)0,
                                (byte)0,   (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)14, (byte)0, (byte)13, (byte)77, (byte)13,
                                (byte)0,  (byte)0, (byte)29, (byte)1,  (byte)1,
                                (byte)0,  (byte)0, (byte)0,  (byte)64, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull3() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 14);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 10);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull6() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull5() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull4() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull001b1fe5acc6b595b03() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull10() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)64,
                                (byte)0,  (byte)28, (byte)64, (byte)0,  (byte)0,  (byte)64,
                                (byte)0,  (byte)64, (byte)0,  (byte)16, (byte)64, (byte)1,
                                (byte)0,  (byte)64, (byte)0,  (byte)64, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull11() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0,  (byte)0,  (byte)0,   (byte)0,  (byte)64,
                                (byte)64, (byte)28, (byte)0,  (byte)16,  (byte)0,  (byte)1,
                                (byte)0,  (byte)64, (byte)16, (byte)0,   (byte)64, (byte)1,
                                (byte)0,  (byte)64, (byte)64, (byte)64,  (byte)0,  (byte)16,
                                (byte)16, (byte)2,  (byte)3,  (byte)-64, (byte)65};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull12() {

    // Arrange
    final byte[] myByteArray = {(byte)-5,   (byte)64, (byte)0,  (byte)64,  (byte)0,   (byte)64,
                                (byte)0,    (byte)16, (byte)0,  (byte)1,   (byte)0,   (byte)1,
                                (byte)0,    (byte)1,  (byte)0,  (byte)1,   (byte)-64, (byte)1,
                                (byte)-128, (byte)65, (byte)64, (byte)66,  (byte)2,   (byte)80,
                                (byte)80,   (byte)2,  (byte)3,  (byte)-64, (byte)65};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull13() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)-3};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull001944be2747fd62788() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull0001bd95bbecafe42c0() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull4() {

    // Arrange
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)64, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)0,  (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(
        "\u0001\u0001\u0001@\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
        mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)102, (byte)111, (byte)111};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("foo", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)102, (byte)111, (byte)111, (byte)0, (byte)0,
                                (byte)0,   (byte)0,   (byte)0,   (byte)0, (byte)0,
                                (byte)0,   (byte)0,   (byte)0,   (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("foo", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException6()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-128, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException5()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-128};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException4()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {
        (byte)16,   (byte)-108, (byte)-128, (byte)4,    (byte)64,   (byte)32, (byte)1, (byte)65,
        (byte)-128, (byte)-128, (byte)1,    (byte)-128, (byte)-128, (byte)64, (byte)4, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("\ua475T\uec3a\uec7e");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException3()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)16};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("5T*~");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException2()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull5() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull4() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull3() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull001d0dc9baefa8e593f()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull0000f55dcbb89aa9db5()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull2() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)16, (byte)1, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)64};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0010\u0001\u0001\u0001\u0001\u0001\u0001@",
                        mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0001\u0001\u0001\u0001\u0001\u0001",
                        mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException7()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException6()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-4, (byte)-91, (byte)-124, (byte)-93, (byte)-96,
                                (byte)9,  (byte)9,   (byte)-128, (byte)-127};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException5()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-3,  (byte)-92, (byte)-124, (byte)11, (byte)-127,
                                (byte)-96, (byte)-87, (byte)1,    (byte)-96};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull4() {

    // Arrange
    final byte[] myByteArray = {(byte)-5};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull5() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)3, (byte)0, (byte)0, (byte)3, (byte)0, (byte)0,
                                (byte)3,  (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull6() {

    // Arrange
    final byte[] myByteArray = {(byte)0,    (byte)3, (byte)-128, (byte)-128, (byte)3, (byte)-128,
                                (byte)-128, (byte)3, (byte)1,    (byte)1,    (byte)1, (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull7() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)1, (byte)1, (byte)2, (byte)1,
                                (byte)16, (byte)4, (byte)8, (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull8() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)1, (byte)2, (byte)1,
                                (byte)16, (byte)4, (byte)8, (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull9() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)13, (byte)77, (byte)13,
                                (byte)0, (byte)0, (byte)29, (byte)1,  (byte)1,
                                (byte)0, (byte)0, (byte)0,  (byte)64, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-1, (byte)-1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException4()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)-4, (byte)5, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException3()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-2, (byte)-8, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException2()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)-8, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException0004adf31d286138008()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-1, (byte)-1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull9() {

    // Arrange
    final byte[] myByteArray = {(byte)-5,  (byte)4,   (byte)40,  (byte)0,   (byte)105,
                                (byte)0,   (byte)105, (byte)0,   (byte)-21, (byte)0,
                                (byte)-86, (byte)104, (byte)-86, (byte)-22, (byte)-86};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull8() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)77, (byte)-123, (byte)27, (byte)-128,
                                (byte)1,  (byte)0,  (byte)13,   (byte)12};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull7() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)2, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull6() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)2, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull5() {

    // Arrange
    final byte[] myByteArray = {(byte)0,   (byte)0,   (byte)0,  (byte)102,
                                (byte)111, (byte)111, (byte)111};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull4() {

    // Arrange
    final byte[] myByteArray = {(byte)-4,  (byte)0,   (byte)0,  (byte)102,
                                (byte)111, (byte)111, (byte)111};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException2()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-2, (byte)-2, (byte)-1, (byte)-1, (byte)127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)1, (byte)0, (byte)0, (byte)1, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull10() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)-3};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0, (byte)1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)7,    (byte)4,  (byte)73,   (byte)0,   (byte)73,
                                (byte)0,    (byte)73, (byte)0,    (byte)-55, (byte)0,
                                (byte)-120, (byte)72, (byte)-120, (byte)-56, (byte)-120};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0004I\u0000I\u0000I\u0000", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException3()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 10);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException4()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 14);
    final byte[] myByteArray = {(byte)31,   (byte)0,    (byte)-119, (byte)1,   (byte)1,
                                (byte)-119, (byte)-117, (byte)-119, (byte)9,   (byte)-55,
                                (byte)-115, (byte)-120, (byte)-120, (byte)-120};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException5()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 27);
    final byte[] myByteArray = {(byte)-3, (byte)29, (byte)-120, (byte)1,  (byte)57, (byte)9,
                                (byte)73, (byte)25, (byte)9,    (byte)73, (byte)25, (byte)9,
                                (byte)13, (byte)77, (byte)72,   (byte)13, (byte)77, (byte)72,
                                (byte)13, (byte)77, (byte)0,    (byte)12, (byte)0,  (byte)-128,
                                (byte)12, (byte)1,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException6()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)-4,  (byte)7, (byte)0,   (byte)0, (byte)0,
                                (byte)0,   (byte)0, (byte)0,   (byte)1, (byte)0,
                                (byte)-29, (byte)1, (byte)-94, (byte)0, (byte)-30};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0001\u0000",
                        mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)-4,  (byte)3,   (byte)0,  (byte)102,
                                (byte)111, (byte)111, (byte)111};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("foo", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputUnsupportedEncodingException4()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)7, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithLength("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesInputPositiveOutputIndexOutOfBoundsException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final int length = 1;
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
    mysqlMessage.readBytes(length);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputUnsupportedEncodingException3()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)15, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithLength("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesInputZeroOutput02() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final int length = 0;

    // Act
    final byte[] actual = mysqlMessage.readBytes(length);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputUnsupportedEncodingException2()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)0, (byte)0, (byte)-128,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithLength("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput1() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputUnsupportedEncodingException()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)1, (byte)0, (byte)0, (byte)-128,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithLength("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException4()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput20() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 20);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException3()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16);
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0, (byte)0,  (byte)64, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)10, (byte)0,  (byte)2,
                                (byte)0,  (byte)0, (byte)2, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "UC";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException2()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-1, (byte)-97};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull9() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)2,  (byte)0, (byte)0, (byte)2, (byte)0, (byte)0,
                                (byte)2,  (byte)0, (byte)2, (byte)2};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UB"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull8() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0,  (byte)0, (byte)0,  (byte)0, (byte)10, (byte)0,
                                (byte)10, (byte)0, (byte)10, (byte)0, (byte)10, (byte)0,
                                (byte)10, (byte)0, (byte)10, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UC"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesOutputNotNull0002b1d8d2bc4ba8d30() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull7() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0,  (byte)0,  (byte)0, (byte)0, (byte)4,
                                (byte)12, (byte)36, (byte)11, (byte)0, (byte)0, (byte)4,
                                (byte)12, (byte)36, (byte)11, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UF"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull6() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)28, (byte)8,  (byte)60, (byte)-128,
                                (byte)60, (byte)4,  (byte)0,  (byte)0,  (byte)62,
                                (byte)10, (byte)28, (byte)60, (byte)60, (byte)2};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UT"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull5() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-5};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull4() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull3() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)1, (byte)0, (byte)0, (byte)-128,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull2() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput1() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)-3, (byte)1, (byte)0, (byte)0, (byte)-127};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull12() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)-3};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull11() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull10() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-5,   (byte)0,  (byte)0,  (byte)2, (byte)64, (byte)18,
                                (byte)66,   (byte)64, (byte)10, (byte)0, (byte)0,  (byte)2,
                                (byte)-126, (byte)18, (byte)66, (byte)64};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UB"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull00199fe63ba39c61887()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)11, (byte)0,    (byte)0, (byte)0, (byte)2,
                                (byte)0,  (byte)16, (byte)2,    (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)2,  (byte)-126, (byte)2};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0002\u0000\u0010\u0002\u0000\u0000\u0000\u0000\u0002",
                        mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull0004b8850d42520d32e() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)102, (byte)111, (byte)111};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("foo", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputUnsupportedEncodingException4()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readString("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputUnsupportedEncodingException3()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)4, (byte)64, (byte)0, (byte)0, (byte)0, (byte)2,
                                (byte)0, (byte)1,  (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0,  (byte)1, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readString("????");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputUnsupportedEncodingException2()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readString("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputUnsupportedEncodingException()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readString("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputFalse000483973b0954218ab() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertFalse(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull2() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-3, (byte)4,  (byte)0,  (byte)0, (byte)-5,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-4, (byte)5,  (byte)0,  (byte)0, (byte)-5,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput52() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)5,  (byte)5,  (byte)0,  (byte)0,  (byte)-5,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)0,
                                (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull0002ef2f269df6e79b5()
      throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("foo"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 10);
    final byte[] myByteArray = {(byte)6,  (byte)6,  (byte)0,  (byte)0,  (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull() throws UnsupportedEncodingException {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
                        mysqlMessage.readString("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals((byte)0, mysqlMessage.read());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLong());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero0019e595e355b9f64d8() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero000563119ae9fe3f64f() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive00419ef8f27a66eae98() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)0,  (byte)0,  (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(16_777_215L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 9);
    final byte[] myByteArray = {(byte)-3, (byte)0,  (byte)0,  (byte)1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 6);
    final byte[] myByteArray = {(byte)-4, (byte)6, (byte)0, (byte)1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException3() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 6);
    final byte[] myByteArray = {(byte)6, (byte)6, (byte)0, (byte)0, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException4() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    final byte[] myByteArray = {(byte)-3, (byte)1, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException5() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)-8, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(16_777_215L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative4() {

    // Arrange
    final byte[] myByteArray = {(byte)-5};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative0034a96b5ac82c49582() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)0,  (byte)0,  (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative2() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-2, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative00249cb6080e63690bd() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, mysqlMessage.readInt());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputZeroOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals((byte)0, mysqlMessage.read(0));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0f, mysqlMessage.readFloat(), 0.0f);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0, mysqlMessage.readDouble(), 0.0);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull5() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 12);
    final byte[] myByteArray = {(byte)10, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Timestamp.class, MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 12);
    final byte[] myByteArray = {(byte)11, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Timestamp timestamp = PowerMockito.mock(Timestamp.class);
    PowerMockito.whenNew(Timestamp.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(timestamp);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull3() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)43, (byte)0, (byte)0, (byte)1, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Timestamp.class, MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)11, (byte)0, (byte)0, (byte)1, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Timestamp timestamp = PowerMockito.mock(Timestamp.class);
    PowerMockito.whenNew(Timestamp.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(timestamp);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8);
    final byte[] myByteArray = {(byte)10, (byte)0, (byte)0, (byte)1,
                                (byte)0,  (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull2() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0,  (byte)0,  (byte)0, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull4() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull3() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull3() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-5,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull4() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0,  (byte)0,  (byte)0, (byte)-5,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull5() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull6() {

    // Arrange
    final byte[] myByteArray = {(byte)0,  (byte)-1, (byte)-1, (byte)-1, (byte)-127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull7() {

    // Arrange
    final byte[] myByteArray = {(byte)-4, (byte)0,  (byte)0,  (byte)-1, (byte)-127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull8() {

    // Arrange
    final byte[] myByteArray = {(byte)-3, (byte)0,  (byte)0,  (byte)0, (byte)-127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull9() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull() {

    // Arrange
    final byte[] myByteArray = {(byte)-5, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull0011adb3dcfcae12cd8() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull00033714994541c76c9() {

    // Arrange
    final byte[] myByteArray = {};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput22() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8);
    final byte[] myByteArray = {(byte)1, (byte)-128, (byte)0, (byte)1,
                                (byte)0, (byte)0,    (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)-128, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull00137c54a054f4239a7() {

    // Arrange
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull000f8f8f22fd551cb93() {

    // Arrange
    final byte[] myByteArray = {(byte)-5};
    final MysqlMessage mysqlMessage = new MysqlMessage(myByteArray);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput1() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputIndexOutOfBoundsException001acb3ce69f6c8b0ae()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_147_483_647);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", -2_147_483_648);
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
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputNullPointerException5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 402_653_248);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 402_571_264);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException8() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)18, (byte)3, (byte)3,  (byte)125, (byte)-46,
                                (byte)34, (byte)-2, (byte)1, (byte)0,  (byte)0,   (byte)0,
                                (byte)0,  (byte)0,  (byte)8, (byte)111};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException7() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)48, (byte)48, (byte)-2, (byte)53,
                                (byte)119, (byte)1,  (byte)0,  (byte)-9, (byte)-1,
                                (byte)-9,  (byte)49, (byte)48, (byte)48, (byte)48};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException6() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)127, (byte)1, (byte)0,
                                (byte)-1, (byte)-1, (byte)-1,  (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutputIndexOutOfBoundsException9() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-123, (byte)1,  (byte)64,   (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1,   (byte)1,  (byte)1,    (byte)1,
                                (byte)1,  (byte)1,  (byte)-2,   (byte)-1, (byte)-123, (byte)1,
                                (byte)0,  (byte)-1, (byte)-1,   (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);
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
      mysqlMessage.readBytesWithLength();
    } catch (java.lang.IndexOutOfBoundsException ex) {
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputNullPointerException() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_825_831);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_610_825_827);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputNullPointerException2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 12_902_400);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 12_894_208);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputNullPointerException3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutputNullPointerException4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -175_308_409);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -175_308_410);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.doThrow(nullPointerException).when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readBytes();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 536_870_912);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)8, (byte)0, (byte)9, (byte)0, (byte)9,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16_405);
    final byte[] myByteArray = {(byte)7,    (byte)0,    (byte)0, (byte)0,    (byte)0,    (byte)-124,
                                (byte)-122, (byte)4,    (byte)4, (byte)6,    (byte)0,    (byte)6,
                                (byte)0,    (byte)2,    (byte)0, (byte)0,    (byte)-128, (byte)4,
                                (byte)0,    (byte)0,    (byte)0, (byte)-128, (byte)7,    (byte)7,
                                (byte)7,    (byte)-123, (byte)5, (byte)22,   (byte)0,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 10);
    final byte[] myByteArray = {(byte)86,  (byte)0,   (byte)0,  (byte)0,  (byte)64,
                                (byte)-59, (byte)-61, (byte)87, (byte)67, (byte)67,
                                (byte)67,  (byte)0,   (byte)67, (byte)64, (byte)65};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException14()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3, (byte)2, (byte)4, (byte)4,    (byte)-3,
                                (byte)0, (byte)0, (byte)4, (byte)5,    (byte)0,
                                (byte)2, (byte)1, (byte)0, (byte)-128, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException13()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,  (byte)-4,  (byte)-1,  (byte)-32, (byte)-4,  (byte)-4,
                                (byte)-1,  (byte)-32, (byte)-32, (byte)-20, (byte)-25, (byte)-12,
                                (byte)-24, (byte)-30, (byte)-59, (byte)-22, (byte)-26};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException12()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3,  (byte)-2, (byte)-1, (byte)0, (byte)3,  (byte)-4,
                                (byte)-12, (byte)-3, (byte)2,  (byte)5, (byte)39, (byte)-126,
                                (byte)2,   (byte)2,  (byte)39, (byte)0, (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException11()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,   (byte)1,  (byte)1,  (byte)1, (byte)1,  (byte)-2,
                                (byte)-10, (byte)-1, (byte)-1, (byte)7, (byte)37, (byte)-128,
                                (byte)0,   (byte)0,  (byte)37, (byte)2, (byte)4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 5);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException10()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)17, (byte)-2, (byte)16, (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)0,  (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException13()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-96, (byte)68,  (byte)41,   (byte)-24, (byte)56,  (byte)-29,
                                (byte)-37, (byte)-40, (byte)-117, (byte)-96, (byte)32,  (byte)-94,
                                (byte)-86, (byte)-4,  (byte)18,   (byte)0,   (byte)-31, (byte)-31};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException14()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-96, (byte)68, (byte)41, (byte)-32,  (byte)56, (byte)-30,
                                (byte)-37, (byte)-5, (byte)43, (byte)-128, (byte)4,  (byte)-126,
                                (byte)-3,  (byte)18, (byte)0,  (byte)0,    (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 12);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException15()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-121, (byte)1, (byte)1,    (byte)-127,
                                (byte)0,    (byte)1, (byte)-127, (byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException16()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)15, (byte)-117, (byte)14,   (byte)10, (byte)14,   (byte)10,
                                (byte)15, (byte)5,    (byte)-113, (byte)10, (byte)-114, (byte)13,
                                (byte)14, (byte)10,   (byte)7,    (byte)10, (byte)14,   (byte)15};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException17()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-109, (byte)3,    (byte)-98,  (byte)3,    (byte)-97,
                                (byte)-110, (byte)-122, (byte)-102, (byte)15,   (byte)-126,
                                (byte)-97,  (byte)-122, (byte)-114, (byte)-126, (byte)-113,
                                (byte)-4,   (byte)-1,   (byte)7};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException18()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)71,  (byte)-45, (byte)-128, (byte)67, (byte)93,  (byte)-110,
                                (byte)-57, (byte)-46, (byte)-57,  (byte)74, (byte)-50, (byte)-45,
                                (byte)78,  (byte)82,  (byte)-3,   (byte)2,  (byte)0,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException19()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)65, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException20()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)65, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException21()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)65, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)1,  (byte)65, (byte)64, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException22()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)4, (byte)0, (byte)3, (byte)3, (byte)3,
                                (byte)0,  (byte)3, (byte)3, (byte)0, (byte)0, (byte)3,
                                (byte)16, (byte)1, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException23()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3,  (byte)4,  (byte)0, (byte)3, (byte)3, (byte)3,
                                (byte)1,  (byte)3,  (byte)3, (byte)6, (byte)0, (byte)7,
                                (byte)16, (byte)-4, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException24()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)-4, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 19);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException7()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-7, (byte)-1, (byte)-1, (byte)31,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException8()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3,   (byte)4, (byte)2, (byte)2,
                                (byte)-30, (byte)2, (byte)2, (byte)2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException9()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-21, (byte)-75, (byte)-19, (byte)-19, (byte)-19, (byte)-19,
                                (byte)-20, (byte)-19, (byte)-19, (byte)-19, (byte)4,   (byte)-17,
                                (byte)-19, (byte)108, (byte)-19, (byte)-19, (byte)-19, (byte)-4,
                                (byte)-19, (byte)-19, (byte)-19, (byte)-19, (byte)-19, (byte)-19,
                                (byte)-19, (byte)-19, (byte)1,   (byte)109, (byte)-19};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException9()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)17, (byte)-4, (byte)16, (byte)0, (byte)-128, (byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 14);
    final byte[] myByteArray = {(byte)0,    (byte)-128, (byte)0, (byte)-128, (byte)32,
                                (byte)-128, (byte)1,    (byte)1, (byte)-125, (byte)-128,
                                (byte)-127, (byte)-128, (byte)1, (byte)-128, (byte)-127};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 11);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException8()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-46, (byte)-46, (byte)-46, (byte)-46};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException10()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)33, (byte)14, (byte)42, (byte)105, (byte)-4,
                                (byte)-4, (byte)8,  (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 5);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)58, (byte)57, (byte)60,  (byte)60, (byte)60, (byte)60,
                                (byte)56, (byte)57, (byte)58,  (byte)58, (byte)57, (byte)56,
                                (byte)57, (byte)-2, (byte)-22, (byte)-1, (byte)-1, (byte)127,
                                (byte)59, (byte)42, (byte)59,  (byte)59, (byte)59, (byte)58};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_750);
    final byte[] myByteArray = {(byte)10, (byte)50,  (byte)27, (byte)59, (byte)51,
                                (byte)18, (byte)1,   (byte)82, (byte)58, (byte)1,
                                (byte)25, (byte)122, (byte)48, (byte)50, (byte)1,
                                (byte)0,  (byte)49,  (byte)26, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)0,  (byte)48, (byte)0,    (byte)0,  (byte)0,
                                (byte)0,  (byte)32, (byte)32, (byte)32,   (byte)32, (byte)32,
                                (byte)16, (byte)32, (byte)16, (byte)-128, (byte)33, (byte)81,
                                (byte)17, (byte)96, (byte)17, (byte)49,   (byte)52, (byte)97,
                                (byte)34, (byte)39, (byte)1,  (byte)34};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,  (byte)-1, (byte)31, (byte)115, (byte)83,  (byte)115,
                                (byte)71,  (byte)35, (byte)81, (byte)21,  (byte)81,  (byte)115,
                                (byte)71,  (byte)35, (byte)49, (byte)57,  (byte)112, (byte)106,
                                (byte)97,  (byte)35, (byte)66, (byte)37,  (byte)101, (byte)86,
                                (byte)113, (byte)82, (byte)33, (byte)81};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0,  (byte)32, (byte)0,  (byte)0,  (byte)32,
                                (byte)16, (byte)48, (byte)1,  (byte)17, (byte)17, (byte)17,
                                (byte)16, (byte)16, (byte)0,  (byte)3,  (byte)0,  (byte)17,
                                (byte)49, (byte)48, (byte)17, (byte)49, (byte)17, (byte)0,
                                (byte)2,  (byte)65, (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-1, (byte)-106};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-128, (byte)-4, (byte)2, (byte)0, (byte)0, (byte)2, (byte)0,
                                (byte)0,    (byte)2,  (byte)0, (byte)0, (byte)2, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-128, (byte)-3, (byte)2, (byte)0, (byte)0, (byte)2, (byte)0,
                                (byte)0,    (byte)2,  (byte)0, (byte)0, (byte)2, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException13()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)11, (byte)11, (byte)11, (byte)1,  (byte)9,
                                (byte)10, (byte)10, (byte)10, (byte)10, (byte)-2,
                                (byte)9,  (byte)10, (byte)10, (byte)10, (byte)10,
                                (byte)10, (byte)10, (byte)11, (byte)10};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException12()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException11()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)0, (byte)-3, (byte)1, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException10()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNullPointerException()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)88, (byte)-32, (byte)-63, (byte)65,  (byte)2,
                                (byte)64, (byte)64,  (byte)64,  (byte)-64, (byte)64,
                                (byte)64, (byte)-64, (byte)64,  (byte)65};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithLength(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException9()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)9, (byte)14, (byte)8, (byte)73, (byte)-3,
                                (byte)6, (byte)0,  (byte)0, (byte)40};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException9()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)15, (byte)25,   (byte)1,  (byte)1, (byte)1,   (byte)1,
                                (byte)0,  (byte)1,    (byte)1,  (byte)1, (byte)-24, (byte)3,
                                (byte)1,  (byte)-128, (byte)1,  (byte)1, (byte)1,   (byte)16,
                                (byte)1,  (byte)1,    (byte)1,  (byte)1, (byte)1,   (byte)1,
                                (byte)1,  (byte)1,    (byte)-3, (byte)1, (byte)1,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);
    final String charset = "US-ASCIIR";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException8()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-3, (byte)0, (byte)1,
                                (byte)1,  (byte)5,  (byte)5, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException7()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)-4, (byte)0, (byte)0, (byte)0,
                                (byte)4,  (byte)4,  (byte)0, (byte)3, (byte)67};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException6()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)0, (byte)0, (byte)0,
                                (byte)4,  (byte)4,  (byte)0, (byte)3, (byte)67};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException5()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthInputNotNullOutputStringIndexOutOfBoundsException10()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)15, (byte)25,   (byte)1,  (byte)1, (byte)1,   (byte)1,
                                (byte)0,  (byte)1,    (byte)1,  (byte)1, (byte)-24, (byte)3,
                                (byte)1,  (byte)-128, (byte)1,  (byte)1, (byte)1,   (byte)16,
                                (byte)1,  (byte)1,    (byte)1,  (byte)1, (byte)1,   (byte)1,
                                (byte)1,  (byte)1,    (byte)-4, (byte)1, (byte)1,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);
    final String charset = "US-ASCII\u00d0";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringInputNotNullOutputStringIndexOutOfBoundsException()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -242_778_014);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -494_796_800);
    final String charset = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringInputNotNullOutputStringIndexOutOfBoundsException2()
      throws InvocationTargetException, UnsupportedEncodingException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 879_230_976);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -268_435_456);
    final String charset = "\ufffe";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString(charset);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException11()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)5,   (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)-2, (byte)103, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0,   (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readBigDecimalOutputStringIndexOutOfBoundsException12()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-24, (byte)68,  (byte)32,  (byte)-24, (byte)-80, (byte)-21,
                                (byte)-13, (byte)18,  (byte)-54, (byte)-23, (byte)-23, (byte)105,
                                (byte)-23, (byte)-23, (byte)-23, (byte)18,  (byte)-54, (byte)-23};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readBigDecimal();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException18()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)103, (byte)3, (byte)2, (byte)-4, (byte)103, (byte)3, (byte)2,
                                (byte)2,   (byte)2, (byte)2, (byte)2,  (byte)2,   (byte)2, (byte)2,
                                (byte)2,   (byte)2, (byte)2, (byte)2,  (byte)2,   (byte)2, (byte)2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException17()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)17, (byte)19, (byte)2,  (byte)19, (byte)19, (byte)19,
                                (byte)16, (byte)19, (byte)24, (byte)18, (byte)17, (byte)16,
                                (byte)19, (byte)19, (byte)16, (byte)19, (byte)18, (byte)19,
                                (byte)19, (byte)19, (byte)19, (byte)19, (byte)19, (byte)16};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException16()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringWithLengthOutputStringIndexOutOfBoundsException15()
      throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)-9,  (byte)-1,  (byte)-32, (byte)99,  (byte)-18,
                                (byte)-30, (byte)-31, (byte)-29, (byte)-31, (byte)-30, (byte)-62,
                                (byte)-32, (byte)-26, (byte)-25, (byte)-32};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readStringWithLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNullPointerException()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -268_443_638);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -268_451_839);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readString(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNullPointerException2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_744);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_073_741_822);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readString(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNullPointerException3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_879_048_192);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -2_147_483_646);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readString(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNullPointerException4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 396_934_985);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 361_360_536);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readString(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNullPointerException2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_752);
    final byte[] myByteArray = {(byte)8,    (byte)0,    (byte)0, (byte)-127, (byte)0,    (byte)0,
                                (byte)-127, (byte)-128, (byte)3, (byte)0,    (byte)-128, (byte)0,
                                (byte)0,    (byte)-127, (byte)0, (byte)2,    (byte)-127, (byte)0,
                                (byte)1,    (byte)-128, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act
    thrown.expect(NullPointerException.class);
    mysqlMessage.readStringWithNull(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputStringIndexOutOfBoundsException7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2_147_483_643);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -2_147_483_648);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringOutputStringIndexOutOfBoundsException6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -935_330_029);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -935_330_053);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringOutputStringIndexOutOfBoundsException5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 911_851_546);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -864_444_416);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringOutputStringIndexOutOfBoundsException4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 13_604_553);
    final byte[] myByteArray = {(byte)5, (byte)12, (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringOutputStringIndexOutOfBoundsException3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -268_435_447);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -268_435_455);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void readStringOutputStringIndexOutOfBoundsException2() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_013_265_920);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -2_147_483_648);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputStringIndexOutOfBoundsException() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_456_939_104);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -1_104_259_072);

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    mysqlMessage.readString();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException9()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 27);
    final byte[] myByteArray = {(byte)10,  (byte)48,  (byte)27, (byte)59, (byte)51, (byte)-96,
                                (byte)-79, (byte)122, (byte)34, (byte)1,  (byte)56, (byte)114,
                                (byte)1,   (byte)51,  (byte)17, (byte)32, (byte)48, (byte)0,
                                (byte)27,  (byte)26,  (byte)30, (byte)2,  (byte)50, (byte)107,
                                (byte)32,  (byte)32,  (byte)49, (byte)33, (byte)58, (byte)26};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 25);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("\ufc46\ufc46");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)4, (byte)5, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 536_870_914);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("foo");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException11()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 11);
    final byte[] myByteArray = {(byte)74, (byte)0,  (byte)90, (byte)15, (byte)71,
                                (byte)64, (byte)10, (byte)13, (byte)10, (byte)10,
                                (byte)0,  (byte)88, (byte)0,  (byte)2,  (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("\ufffe\ufffe\ufffe\ufffe");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputUnsupportedEncodingException10()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)6, (byte)0, (byte)22, (byte)7};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    mysqlMessage.readStringWithNull("\ufff9\ufff9\ufff9\ufff9");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull6() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Calendar.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);
    final Calendar calendar = PowerMockito.mock(Calendar.class);
    PowerMockito.when(calendar.getTimeInMillis()).thenReturn(1_513_546_775_042L);
    final TimeZone timeZone = PowerMockito.mock(TimeZone.class);
    Reflector.setField(timeZone, "ID", "foo");
    Reflector.setField(calendar, "zone", timeZone);
    Reflector.setField(calendar, "time", 1_513_546_775_042L);
    PowerMockito.when(Calendar.getInstance()).thenReturn(calendar);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readTimeOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)59, (byte)59, (byte)59,  (byte)59, (byte)59,
                                (byte)59, (byte)58, (byte)122, (byte)58, (byte)35};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final Time time = PowerMockito.mock(Time.class);
    PowerMockito.whenNew(Time.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(time);

    // Act
    final Time actual = mysqlMessage.readTime();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull6() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)2, (byte)9, (byte)2, (byte)2, (byte)3,
                                (byte)2, (byte)2, (byte)2, (byte)2, (byte)2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Timestamp.class, MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Calendar.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)1, (byte)11, (byte)8, (byte)0, (byte)1,
                                (byte)1, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);
    final Timestamp timestamp = PowerMockito.mock(Timestamp.class);
    PowerMockito.whenNew(Timestamp.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(timestamp);
    final Calendar calendar = PowerMockito.mock(Calendar.class);
    PowerMockito.when(calendar.getTimeInMillis()).thenReturn(1_513_438_116_352L);
    final TimeZone timeZone = PowerMockito.mock(TimeZone.class);
    Reflector.setField(timeZone, "ID", "foo");
    Reflector.setField(calendar, "zone", timeZone);
    Reflector.setField(calendar, "time", 1_513_438_116_352L);
    PowerMockito.when(Calendar.getInstance()).thenReturn(calendar);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Calendar.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)1, (byte)27, (byte)8, (byte)0, (byte)1,
                                (byte)1, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);
    final Calendar calendar = PowerMockito.mock(Calendar.class);
    PowerMockito.when(calendar.getTimeInMillis()).thenReturn(1_513_438_283_774L);
    final TimeZone timeZone = PowerMockito.mock(TimeZone.class);
    Reflector.setField(timeZone, "ID", "foo");
    Reflector.setField(calendar, "zone", timeZone);
    Reflector.setField(calendar, "time", 1_513_438_283_774L);
    PowerMockito.when(Calendar.getInstance()).thenReturn(calendar);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, ThreadLocal.class, Calendar.class})
  @Test
  public void readDateOutputNotNull9() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)1, (byte)27, (byte)8, (byte)0, (byte)1,
                                (byte)1, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);
    final java.sql.Date date = PowerMockito.mock(java.sql.Date.class);
    PowerMockito.whenNew(java.sql.Date.class)
        .withParameterTypes(long.class)
        .withArguments(anyLong())
        .thenReturn(date);

    // Act
    final Date actual = mysqlMessage.readDate();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputTrue3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertTrue(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputTrue00115af2da25437b69c() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertTrue(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputFalse3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertFalse(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasRemainingOutputFalse000e8a300a72c5395b0() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertFalse(mysqlMessage.hasRemaining());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull19() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)-4, (byte)0, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,  (byte)1,   (byte)0,    (byte)4,   (byte)-35, (byte)76,
                                (byte)12,  (byte)94,  (byte)-102, (byte)6,   (byte)80,  (byte)126,
                                (byte)88,  (byte)123, (byte)-64,  (byte)106, (byte)-36, (byte)-4,
                                (byte)124, (byte)97,  (byte)-54};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0004", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput134() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-50, (byte)61,   (byte)8,    (byte)48, (byte)48,  (byte)-49,
                                (byte)-4,  (byte)13,   (byte)0,    (byte)0,  (byte)0,   (byte)79,
                                (byte)-37, (byte)-115, (byte)-116, (byte)48, (byte)-33, (byte)32,
                                (byte)44,  (byte)60,   (byte)-2,   (byte)-68};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull17() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)120,  (byte)7,   (byte)75, (byte)4,   (byte)119, (byte)23,
                                (byte)-122, (byte)-42, (byte)-8, (byte)-61, (byte)-14, (byte)1,
                                (byte)4,    (byte)0,   (byte)5,  (byte)66,  (byte)69,  (byte)12,
                                (byte)-4,   (byte)1,   (byte)0,  (byte)0,   (byte)6,   (byte)67};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act and Assert result
    Assert.assertEquals("\u0000", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull10()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)2, (byte)0, (byte)-2, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("", mysqlMessage.readStringWithLength("UTF-16"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput63() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)4,  (byte)7,  (byte)125, (byte)-7, (byte)-72, (byte)7,
                                (byte)7,  (byte)7,  (byte)7,   (byte)-7, (byte)-7,  (byte)-7,
                                (byte)-7, (byte)-7, (byte)124, (byte)6,  (byte)0,   (byte)0,
                                (byte)0,  (byte)-6, (byte)31,  (byte)-4, (byte)6,   (byte)0,
                                (byte)0,  (byte)0,  (byte)-6,  (byte)31, (byte)56,  (byte)7};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull33() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)-4, (byte)0, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull9() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-110, (byte)0, (byte)8, (byte)99, (byte)-117,
                                (byte)-4, (byte)2,    (byte)0, (byte)8, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act and Assert result
    Assert.assertEquals("\b\u0001", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull17() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,   (byte)19,  (byte)3,    (byte)19,  (byte)125, (byte)19,
                                (byte)19,   (byte)-4,  (byte)0,    (byte)0,   (byte)0,   (byte)125,
                                (byte)19,   (byte)19,  (byte)27,   (byte)-17, (byte)-19, (byte)-5,
                                (byte)-50,  (byte)-1,  (byte)-11,  (byte)-80, (byte)21,  (byte)-39,
                                (byte)-116, (byte)111, (byte)-104, (byte)16,  (byte)-62};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull19() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)0,   (byte)0,  (byte)114, (byte)2,  (byte)-70,
                                (byte)1,  (byte)-70, (byte)-3, (byte)67,  (byte)0,  (byte)-70,
                                (byte)-3, (byte)-53, (byte)0,  (byte)-70, (byte)-3, (byte)122};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,  (byte)-5,  (byte)-1,  (byte)-1,  (byte)99, (byte)-29,
                                (byte)-30, (byte)98,  (byte)-21, (byte)-29, (byte)-5, (byte)99,
                                (byte)-29, (byte)107, (byte)123, (byte)-17};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(65_531L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull27() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-4, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 27);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull8() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)1, (byte)0, (byte)0, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput32() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-3, (byte)-4, (byte)3,  (byte)0,
                                (byte)0,  (byte)0,  (byte)-1, (byte)-3, (byte)-1,
                                (byte)-3, (byte)-4, (byte)-4, (byte)-4, (byte)-4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput25() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)22, (byte)67,   (byte)-4,   (byte)2,
                                (byte)0,   (byte)0,  (byte)-112, (byte)-123, (byte)-1,
                                (byte)-27, (byte)1,  (byte)51,   (byte)114,  (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive0025d461396b1ed95ac() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-5, (byte)79};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(20_475L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-4, (byte)-3, (byte)-3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(65_020L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)-4, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)7,  (byte)0,  (byte)0,  (byte)0,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull26() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)-8, (byte)70, (byte)38, (byte)7, (byte)6,  (byte)5,   (byte)2,   (byte)65, (byte)-4,
        (byte)0,  (byte)0,  (byte)5,  (byte)0, (byte)6,  (byte)32,  (byte)101, (byte)64, (byte)5,
        (byte)0,  (byte)6,  (byte)84, (byte)7, (byte)54, (byte)101, (byte)-4,  (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 24);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull28() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)35, (byte)36, (byte)32, (byte)35, (byte)35, (byte)3,
                                (byte)33, (byte)35, (byte)35, (byte)38, (byte)2,  (byte)7,
                                (byte)16, (byte)-4, (byte)0,  (byte)0,  (byte)1,  (byte)32};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull14()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull21() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,   (byte)0,    (byte)0,   (byte)0,   (byte)1, (byte)-127,
                                (byte)-128, (byte)-128, (byte)32,  (byte)0,   (byte)1, (byte)35,
                                (byte)-128, (byte)-124, (byte)-95, (byte)-120};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)89,  (byte)34,  (byte)-67,  (byte)68, (byte)76,  (byte)87,   (byte)-79,  (byte)-4,
        (byte)9,   (byte)0,   (byte)0,    (byte)0,  (byte)2,   (byte)0,    (byte)0,    (byte)0,
        (byte)0,   (byte)0,   (byte)0,    (byte)1,  (byte)1,   (byte)-128, (byte)-125, (byte)-125,
        (byte)-94, (byte)-94, (byte)-126, (byte)82, (byte)-77, (byte)89};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000",
                        mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull18() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)1, (byte)0, (byte)0, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0000", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4,   (byte)19,  (byte)3,    (byte)19,  (byte)125, (byte)19,
                                (byte)19,   (byte)-3,  (byte)0,    (byte)0,   (byte)0,   (byte)125,
                                (byte)19,   (byte)19,  (byte)27,   (byte)-17, (byte)-20, (byte)-5,
                                (byte)-50,  (byte)-1,  (byte)-11,  (byte)-80, (byte)21,  (byte)-39,
                                (byte)-116, (byte)-18, (byte)-104, (byte)16,  (byte)-62};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)90, (byte)73, (byte)-33, (byte)-118, (byte)-3,
                                (byte)13, (byte)14, (byte)-21, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertEquals(15_404_557L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)-3, (byte)0, (byte)0, (byte)0, (byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull17() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3, (byte)2, (byte)4, (byte)4,    (byte)-3,
                                (byte)0, (byte)0, (byte)0, (byte)5,    (byte)0,
                                (byte)2, (byte)1, (byte)0, (byte)-128, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull20() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3,   (byte)0, (byte)0,  (byte)0, (byte)0, (byte)1,
                                (byte)-128, (byte)0, (byte)32, (byte)0, (byte)1, (byte)35,
                                (byte)0,    (byte)4, (byte)33, (byte)8};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3,  (byte)-5,  (byte)-1,  (byte)-1,  (byte)99, (byte)-29,
                                (byte)-30, (byte)98,  (byte)-21, (byte)-29, (byte)-5, (byte)99,
                                (byte)-29, (byte)107, (byte)123, (byte)-17};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(16_777_211L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull23() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0, (byte)68};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput133() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-50, (byte)61,   (byte)8,    (byte)48,  (byte)48,  (byte)-49,
                                (byte)-3,  (byte)13,   (byte)0,    (byte)0,   (byte)0,   (byte)79,
                                (byte)-37, (byte)-115, (byte)-116, (byte)48,  (byte)-33, (byte)32,
                                (byte)44,  (byte)60,   (byte)-4,   (byte)-68, (byte)60};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull28() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-3, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull4() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-57, (byte)91, (byte)1,  (byte)66,  (byte)-43, (byte)26,
                                (byte)79,  (byte)90, (byte)79, (byte)-61, (byte)-58, (byte)-45,
                                (byte)-50, (byte)90, (byte)-3, (byte)4,   (byte)0,   (byte)0,
                                (byte)93,  (byte)83, (byte)3,  (byte)5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull20() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-3, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)-75, (byte)-75,  (byte)-75,  (byte)-75, (byte)-75,  (byte)-75, (byte)-75, (byte)-75,
        (byte)-75, (byte)53,   (byte)1,    (byte)17,  (byte)1,    (byte)1,   (byte)1,   (byte)1,
        (byte)1,   (byte)1,    (byte)-127, (byte)1,   (byte)-111, (byte)33,  (byte)5,   (byte)-79,
        (byte)21,  (byte)-127, (byte)-3,   (byte)-76, (byte)-76,  (byte)-76};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act and Assert result
    Assert.assertEquals(11_842_740L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput33() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-4, (byte)-3, (byte)-3, (byte)3,  (byte)0,
                                (byte)0,  (byte)0,  (byte)-1, (byte)-4, (byte)-1,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput53() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)4,  (byte)5,  (byte)127, (byte)-5, (byte)-70, (byte)5,
                                (byte)5,  (byte)5,  (byte)5,   (byte)-5, (byte)-5,  (byte)-5,
                                (byte)-5, (byte)-5, (byte)125, (byte)5,  (byte)0,   (byte)0,
                                (byte)0,  (byte)-7, (byte)31,  (byte)-3, (byte)5,   (byte)0,
                                (byte)0,  (byte)0,  (byte)-7,  (byte)31, (byte)57,  (byte)5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-11, (byte)18, (byte)-120, (byte)1, (byte)-29, (byte)-118,
                                (byte)-3,  (byte)2,  (byte)0,    (byte)0, (byte)8,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act and Assert result
    Assert.assertEquals("\b\u0000", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)1, (byte)0, (byte)0, (byte)68};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("D", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull29() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)39, (byte)32, (byte)32, (byte)35, (byte)35, (byte)3,
                                (byte)33, (byte)35, (byte)35, (byte)52, (byte)2,  (byte)7,
                                (byte)16, (byte)-3, (byte)0,  (byte)0,  (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)3,  (byte)0,  (byte)0,    (byte)0,  (byte)0,
                                (byte)0,  (byte)32, (byte)32, (byte)32,   (byte)32, (byte)32,
                                (byte)16, (byte)32, (byte)16, (byte)-128, (byte)33, (byte)81,
                                (byte)17, (byte)96, (byte)17, (byte)49,   (byte)52, (byte)97,
                                (byte)34, (byte)39, (byte)1,  (byte)34};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000", mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput62() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)6,  (byte)0,  (byte)0,  (byte)0,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull15()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)0,   (byte)0,   (byte)0,   (byte)49,
                                (byte)32, (byte)100, (byte)-42, (byte)-73, (byte)27,
                                (byte)55, (byte)-65, (byte)96,  (byte)110, (byte)16,
                                (byte)80, (byte)-92, (byte)26,  (byte)54};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)88, (byte)-93, (byte)-68, (byte)68, (byte)77,   (byte)87,
                                (byte)48, (byte)-3,  (byte)9,   (byte)0,  (byte)0,    (byte)0,
                                (byte)0,  (byte)0,   (byte)0,   (byte)0,  (byte)0,    (byte)0,
                                (byte)0,  (byte)0,   (byte)1,   (byte)0,  (byte)-120, (byte)3,
                                (byte)2,  (byte)-86, (byte)1,   (byte)82, (byte)-77,  (byte)80};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
                        mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull23() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)71,  (byte)-45, (byte)-128, (byte)67, (byte)93,  (byte)-110,
                                (byte)-57, (byte)-46, (byte)-57,  (byte)74, (byte)-50, (byte)-45,
                                (byte)78,  (byte)82,  (byte)-3,   (byte)0,  (byte)0,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput24() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)22, (byte)67,   (byte)-3,   (byte)2,
                                (byte)0,   (byte)0,  (byte)-112, (byte)-123, (byte)-1,
                                (byte)-27, (byte)1,  (byte)51,   (byte)114,  (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3, (byte)2, (byte)4, (byte)4,    (byte)-3,
                                (byte)1, (byte)0, (byte)0, (byte)5,    (byte)0,
                                (byte)2, (byte)1, (byte)0, (byte)-128, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertEquals("\u0005", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive003bd9905c8380f384f() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3,  (byte)-5,  (byte)79,  (byte)13, (byte)15,
                                (byte)-97, (byte)-98, (byte)90,  (byte)13, (byte)15,
                                (byte)11,  (byte)13,  (byte)95,  (byte)13, (byte)29,
                                (byte)74,  (byte)75,  (byte)-37, (byte)57};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(872_443L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull34() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-3, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)121,  (byte)3,   (byte)79, (byte)0,   (byte)115, (byte)19,
                                (byte)-126, (byte)-44, (byte)-4, (byte)-63, (byte)-10, (byte)1,
                                (byte)0,    (byte)64,  (byte)1,  (byte)70,  (byte)65,  (byte)8,
                                (byte)-3,   (byte)1,   (byte)0,  (byte)0,   (byte)1,   (byte)70};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act and Assert result
    Assert.assertEquals("\u0001", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    final byte[] myByteArray = {(byte)2,   (byte)-63,  (byte)0,    (byte)0,    (byte)0,  (byte)2,
                                (byte)-60, (byte)65,   (byte)2,    (byte)0,    (byte)33, (byte)1,
                                (byte)0,   (byte)1,    (byte)0,    (byte)-127, (byte)0,  (byte)0,
                                (byte)1,   (byte)-128, (byte)0,    (byte)-128, (byte)0,  (byte)0,
                                (byte)0,   (byte)0,    (byte)-128, (byte)1,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000", mysqlMessage.readString("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)80, (byte)73, (byte)0,  (byte)65, (byte)0, (byte)25,
                                (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)0, (byte)1,
                                (byte)0,  (byte)1,  (byte)64, (byte)1,  (byte)1, (byte)1,
                                (byte)64, (byte)1,  (byte)64, (byte)64, (byte)96};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0001\u0000\u0001@",
                        mysqlMessage.readString("ISO-8859-1"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)1,   (byte)0,  (byte)0,    (byte)0,
                                (byte)1,   (byte)0,   (byte)0,  (byte)-3,   (byte)126,
                                (byte)126, (byte)126, (byte)-3, (byte)-120, (byte)46};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("~", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,   (byte)3,   (byte)0,   (byte)-70, (byte)-3,
                                (byte)-117, (byte)0,   (byte)-70, (byte)1,   (byte)3,
                                (byte)0,    (byte)-70, (byte)-3,  (byte)-117};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertEquals("\u0003", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)17, (byte)0, (byte)0, (byte)0, (byte)-126,
                                (byte)-2, (byte)1,  (byte)0, (byte)0, (byte)0, (byte)-126,
                                (byte)-6, (byte)1,  (byte)3, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act and Assert result
    Assert.assertEquals("\u0001", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)2,   (byte)-127, (byte)2, (byte)-128, (byte)64, (byte)-103,
                                (byte)2,   (byte)1,    (byte)2, (byte)-128, (byte)64, (byte)-111,
                                (byte)-26, (byte)8,    (byte)2, (byte)1,    (byte)2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0002", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16_405);
    final byte[] myByteArray = {(byte)83,  (byte)2,   (byte)0,  (byte)16, (byte)0,   (byte)-59,
                                (byte)-46, (byte)81,  (byte)67, (byte)67, (byte)-64, (byte)68,
                                (byte)67,  (byte)2,   (byte)0,  (byte)0,  (byte)-64, (byte)81,
                                (byte)0,   (byte)-64, (byte)0,  (byte)64, (byte)69,  (byte)69,
                                (byte)64,  (byte)64,  (byte)65, (byte)66, (byte)0,   (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act and Assert result
    Assert.assertEquals("@EE@@AB", mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_752);
    final byte[] myByteArray = {(byte)8,    (byte)-128, (byte)1,    (byte)0, (byte)33,   (byte)0,
                                (byte)-127, (byte)-127, (byte)3,    (byte)0, (byte)1,    (byte)1,
                                (byte)-128, (byte)0,    (byte)-127, (byte)2, (byte)-127, (byte)0,
                                (byte)1,    (byte)1,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0001", mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)3,  (byte)3,  (byte)19, (byte)7,  (byte)1,  (byte)0,
                                (byte)2,  (byte)0,  (byte)0,  (byte)16, (byte)22, (byte)2,
                                (byte)16, (byte)16, (byte)18, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(
        "\u0003\u0003\u0013\u0007\u0001\u0000\u0002\u0000\u0000\u0010\u0016\u0002\u0010\u0010\u0012",
        mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 6);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000", mysqlMessage.readString("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16);
    final byte[] myByteArray = {(byte)4,    (byte)8,  (byte)0, (byte)4, (byte)1,   (byte)3,
                                (byte)1,    (byte)16, (byte)2, (byte)3, (byte)1,   (byte)4,
                                (byte)-127, (byte)1,  (byte)0, (byte)2, (byte)0,   (byte)1,
                                (byte)1,    (byte)1,  (byte)3, (byte)3, (byte)-126};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0000\u0002", mysqlMessage.readString("US-ASCII"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)4, (byte)4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0004\u0004", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 24);
    final byte[] myByteArray = {(byte)5,  (byte)4,  (byte)-124, (byte)0,  (byte)4, (byte)20,
                                (byte)4,  (byte)4,  (byte)20,   (byte)4,  (byte)4, (byte)4,
                                (byte)16, (byte)20, (byte)16,   (byte)16, (byte)4, (byte)20,
                                (byte)4,  (byte)4,  (byte)0,    (byte)4,  (byte)0, (byte)4,
                                (byte)4,  (byte)20, (byte)16,   (byte)20, (byte)0, (byte)4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 23);

    // Act and Assert result
    Assert.assertEquals("\u0004", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_737);
    final byte[] myByteArray = {
        (byte)0,  (byte)16, (byte)0,  (byte)33, (byte)2,  (byte)1, (byte)33, (byte)33, (byte)65,
        (byte)65, (byte)96, (byte)72, (byte)65, (byte)64, (byte)1, (byte)0,  (byte)48, (byte)0,
        (byte)33, (byte)64, (byte)33, (byte)64, (byte)1,  (byte)0, (byte)48, (byte)32, (byte)32};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act and Assert result
    Assert.assertEquals("@\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_571_834_008);
    final byte[] myByteArray = {(byte)-127, (byte)1, (byte)-116, (byte)8, (byte)-128,
                                (byte)1,    (byte)0, (byte)1,    (byte)1, (byte)-120,
                                (byte)1,    (byte)1, (byte)32,   (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 10);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0001 \u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 18);
    final byte[] myByteArray = {
        (byte)-128, (byte)-127, (byte)-124, (byte)9, (byte)-95,  (byte)-95, (byte)33,  (byte)0,
        (byte)-96,  (byte)-128, (byte)32,   (byte)0, (byte)-95,  (byte)0,   (byte)1,   (byte)32,
        (byte)1,    (byte)1,    (byte)32,   (byte)1, (byte)1,    (byte)32,  (byte)-95, (byte)32,
        (byte)0,    (byte)1,    (byte)-95,  (byte)1, (byte)-127, (byte)4};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 17);

    // Act and Assert result
    Assert.assertEquals("\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull7() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)17, (byte)64, (byte)19, (byte)19, (byte)19,
                                (byte)19, (byte)-2, (byte)1,  (byte)0,  (byte)0,  (byte)0,
                                (byte)16, (byte)84, (byte)2,  (byte)18, (byte)2,  (byte)18};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull6() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)-70, (byte)5, (byte)96, (byte)69,  (byte)4,    (byte)1, (byte)2, (byte)-3, (byte)106,
        (byte)35,  (byte)4, (byte)8,  (byte)106, (byte)2,    (byte)6, (byte)0, (byte)6,  (byte)32,
        (byte)2,   (byte)6, (byte)6,  (byte)7,   (byte)-124, (byte)4, (byte)6, (byte)7,  (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 11);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull5() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-105, (byte)26, (byte)69,  (byte)1, (byte)-112, (byte)91,
                                (byte)42,   (byte)91, (byte)-2,  (byte)2, (byte)0,    (byte)0,
                                (byte)0,    (byte)20, (byte)120, (byte)0, (byte)2,    (byte)16,
                                (byte)6,    (byte)22, (byte)117};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull9() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 52);
    final byte[] myByteArray = {
        (byte)44,   (byte)34, (byte)0,  (byte)41, (byte)6,  (byte)32, (byte)54, (byte)32, (byte)56,
        (byte)41,   (byte)0,  (byte)16, (byte)41, (byte)2,  (byte)40, (byte)0,  (byte)24, (byte)40,
        (byte)-120, (byte)12, (byte)34, (byte)0,  (byte)48, (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act and Assert result
    Assert.assertEquals(")", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlMessage.class)
  @Test
  public void readBigDecimalOutputNotNull3() throws Exception, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)2, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(bigDecimal);

    // Act
    final BigDecimal actual = mysqlMessage.readBigDecimal();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)22};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0016", mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 19);
    final byte[] myByteArray = {(byte)4,  (byte)-112, (byte)32, (byte)33,   (byte)2,  (byte)1,
                                (byte)1,  (byte)33,   (byte)65, (byte)65,   (byte)96, (byte)72,
                                (byte)65, (byte)64,   (byte)1,  (byte)-128, (byte)0,  (byte)64,
                                (byte)1,  (byte)-128, (byte)0,  (byte)64,   (byte)1,  (byte)-128,
                                (byte)0,  (byte)16,   (byte)0,  (byte)32,   (byte)32, (byte)32};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 17);

    // Act and Assert result
    Assert.assertEquals("@\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 33);
    final byte[] myByteArray = {(byte)4,  (byte)-124, (byte)4,  (byte)4,  (byte)4, (byte)4,
                                (byte)6,  (byte)6,    (byte)20, (byte)68, (byte)4, (byte)4,
                                (byte)36, (byte)0,    (byte)6,  (byte)4,  (byte)4, (byte)20,
                                (byte)4,  (byte)4,    (byte)0,  (byte)0,  (byte)0, (byte)0,
                                (byte)4,  (byte)5,    (byte)4,  (byte)6,  (byte)4, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 28);

    // Act and Assert result
    Assert.assertEquals("\u0004", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)32};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act and Assert result
    Assert.assertEquals(" ", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)3,  (byte)0,  (byte)0,  (byte)0,   (byte)32, (byte)32,
                                (byte)0,  (byte)32, (byte)32, (byte)0,   (byte)32, (byte)32,
                                (byte)16, (byte)48, (byte)16, (byte)-96, (byte)35, (byte)81,
                                (byte)17, (byte)96, (byte)25, (byte)56,  (byte)52, (byte)97,
                                (byte)34, (byte)39, (byte)1,  (byte)34};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000", mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)80,  (byte)-95, (byte)-12, (byte)5,   (byte)69, (byte)49,
                                (byte)57,  (byte)-2,  (byte)9,   (byte)0,   (byte)0,  (byte)0,
                                (byte)-14, (byte)-45, (byte)-56, (byte)89,  (byte)0,  (byte)0,
                                (byte)0,   (byte)0,   (byte)0,   (byte)0,   (byte)0,  (byte)0,
                                (byte)0,   (byte)-78, (byte)0,   (byte)-14, (byte)82, (byte)16};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
                        mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 29);
    final byte[] myByteArray = {(byte)44,  (byte)33, (byte)0,  (byte)1,  (byte)47, (byte)40,
                                (byte)52,  (byte)40, (byte)56, (byte)40, (byte)0,  (byte)16,
                                (byte)1,   (byte)1,  (byte)1,  (byte)33, (byte)0,  (byte)1,
                                (byte)-96, (byte)12, (byte)34, (byte)8,  (byte)48, (byte)1,
                                (byte)8,   (byte)16, (byte)1,  (byte)1,  (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 23);

    // Act and Assert result
    Assert.assertEquals("\u0001\b\u0010\u0001\u0001\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 11);
    final byte[] myByteArray = {(byte)74, (byte)0,  (byte)90, (byte)15, (byte)71,
                                (byte)64, (byte)10, (byte)13, (byte)10, (byte)10,
                                (byte)0,  (byte)88, (byte)0,  (byte)2,  (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act and Assert result
    Assert.assertEquals("\n", mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)1,   (byte)0,   (byte)0,  (byte)0,   (byte)-15,
                                (byte)8,  (byte)76,  (byte)-64, (byte)68, (byte)-35, (byte)72,
                                (byte)72, (byte)120, (byte)-8,  (byte)64, (byte)120, (byte)126,
                                (byte)84, (byte)-27, (byte)-24};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("D", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_750);
    final byte[] myByteArray = {(byte)42, (byte)16,  (byte)27, (byte)59, (byte)51,
                                (byte)18, (byte)1,   (byte)82, (byte)51, (byte)1,
                                (byte)25, (byte)122, (byte)48, (byte)51, (byte)1,
                                (byte)32, (byte)0,   (byte)26, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act and Assert result
    Assert.assertEquals(" ", mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)5,  (byte)67, (byte)19, (byte)1,   (byte)19, (byte)3,
                                (byte)32, (byte)0,  (byte)11, (byte)-63, (byte)1,  (byte)-63,
                                (byte)1,  (byte)3,  (byte)1,  (byte)65,  (byte)1,  (byte)65,
                                (byte)1,  (byte)65, (byte)1,  (byte)65,  (byte)1,  (byte)65};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act and Assert result
    Assert.assertEquals("A", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNotNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)122,  (byte)3,   (byte)70, (byte)0,   (byte)115, (byte)19,
                                (byte)-126, (byte)-44, (byte)-4, (byte)-63, (byte)-2,  (byte)1,
                                (byte)0,    (byte)0,   (byte)0,  (byte)65,  (byte)124, (byte)0,
                                (byte)-10,  (byte)1,   (byte)6,  (byte)65,  (byte)0,   (byte)65};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 10);

    // Act and Assert result
    Assert.assertEquals("\u0001", mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNotNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 536_936_451);
    final byte[] myByteArray = {(byte)1,    (byte)1,  (byte)1, (byte)1, (byte)1, (byte)0,
                                (byte)-128, (byte)4,  (byte)4, (byte)1, (byte)1, (byte)1,
                                (byte)0,    (byte)65, (byte)1, (byte)2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0001", mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("\u0000", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 6);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0,
                                (byte)0, (byte)1, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000", mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull9()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)43,   (byte)27,   (byte)1, (byte)1, (byte)1,  (byte)1,
                                (byte)-128, (byte)1,    (byte)1, (byte)1, (byte)18, (byte)3,
                                (byte)1,    (byte)-128, (byte)1, (byte)1, (byte)1,  (byte)-104,
                                (byte)1,    (byte)1,    (byte)1, (byte)1, (byte)1,  (byte)1,
                                (byte)1,    (byte)1,    (byte)2, (byte)1, (byte)1,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 26);

    // Act and Assert result
    Assert.assertEquals("\u0001\u0001", mysqlMessage.readStringWithLength("US-ASCII"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNotNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-96, (byte)-47, (byte)-68, (byte)76, (byte)77,  (byte)-57,
                                (byte)48,  (byte)9,   (byte)0,   (byte)0,  (byte)0,   (byte)0,
                                (byte)0,   (byte)0,   (byte)0,   (byte)0,  (byte)0,   (byte)26,
                                (byte)-16, (byte)-16, (byte)119, (byte)0,  (byte)-24, (byte)81,
                                (byte)89,  (byte)-6,  (byte)0,   (byte)2,  (byte)-69, (byte)16};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
                        mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput14() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-3, (byte)18, (byte)3, (byte)3,   (byte)125, (byte)-46,
                                (byte)34, (byte)-2, (byte)1, (byte)0,   (byte)0,   (byte)0,
                                (byte)0,  (byte)0,  (byte)8, (byte)111, (byte)-17};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)48, (byte)48, (byte)-2, (byte)53,
                                (byte)-9, (byte)-1, (byte)-9, (byte)-9, (byte)-1,
                                (byte)-9, (byte)49, (byte)48, (byte)48, (byte)48};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,   (byte)1,  (byte)1,   (byte)1,   (byte)1,   (byte)-2,
                                (byte)-10, (byte)-1, (byte)-1,  (byte)-57, (byte)37,  (byte)-128,
                                (byte)0,   (byte)0,  (byte)-91, (byte)2,   (byte)-124};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 5);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)5,  (byte)1, (byte)1, (byte)65,   (byte)1, (byte)1,
                                (byte)-2, (byte)35, (byte)0, (byte)0, (byte)-128, (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)1, (byte)1, (byte)1,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull16()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0,  (byte)0,    (byte)0,  (byte)0,
                                (byte)32, (byte)0,  (byte)-42,  (byte)0,  (byte)58,
                                (byte)32, (byte)0,  (byte)-42,  (byte)76, (byte)-96,
                                (byte)80, (byte)52, (byte)-113, (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull17()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)3,  (byte)0,    (byte)-128, (byte)-128, (byte)32,
                                (byte)0,   (byte)32, (byte)32,   (byte)0,    (byte)0,    (byte)0,
                                (byte)-96, (byte)32, (byte)0,    (byte)32,   (byte)32,   (byte)81,
                                (byte)17,  (byte)96, (byte)-111, (byte)49,   (byte)52,   (byte)-31,
                                (byte)34,  (byte)39, (byte)-127, (byte)34};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull19()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)90,   (byte)-55, (byte)28,  (byte)85,  (byte)45,   (byte)-39,
                                (byte)81,   (byte)-2,  (byte)-17, (byte)-1,  (byte)0,    (byte)-24,
                                (byte)-102, (byte)-69, (byte)-24, (byte)57,  (byte)-128, (byte)108,
                                (byte)90,   (byte)-8,  (byte)-24, (byte)-71, (byte)0,    (byte)106,
                                (byte)82,   (byte)-6,  (byte)104, (byte)-5,  (byte)-102, (byte)104};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("E\u4054Fm86BA\u4052S????"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull18() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0,  (byte)0, (byte)0, (byte)1,
                                (byte)1,  (byte)0, (byte)32, (byte)5, (byte)1, (byte)35,
                                (byte)0,  (byte)1, (byte)0,  (byte)9};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-67, (byte)-65, (byte)-1,  (byte)-1,
                                (byte)-1, (byte)-2,  (byte)-67, (byte)-65, (byte)-1,
                                (byte)-1, (byte)-1,  (byte)127, (byte)-67, (byte)-68};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-2, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-9, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull30() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-31, (byte)-31, (byte)-31, (byte)-31, (byte)-31, (byte)-31,
                                (byte)-31, (byte)-2,  (byte)-95, (byte)-31, (byte)-95, (byte)-95,
                                (byte)-95, (byte)-31, (byte)-31, (byte)-96, (byte)-95, (byte)-31,
                                (byte)-95, (byte)-95, (byte)-95, (byte)-95, (byte)-95};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-2, (byte)3,  (byte)0,
                                (byte)0,  (byte)0,  (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-2, (byte)-2, (byte)-2, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputPositive0045786abf55c2cb08d() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)-7,   (byte)77,  (byte)7,  (byte)13,
                                (byte)-99, (byte)-108, (byte)89,  (byte)13, (byte)45,
                                (byte)9,   (byte)15,   (byte)95,  (byte)15, (byte)31,
                                (byte)72,  (byte)73,   (byte)-40, (byte)58};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(961_963_397_669_670_393L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-127,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput72() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-123, (byte)1,  (byte)64, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1,   (byte)1,  (byte)1,  (byte)1,
                                (byte)1,  (byte)1,  (byte)-2,   (byte)7,  (byte)0,  (byte)0,
                                (byte)0,  (byte)-1, (byte)-1,   (byte)-1, (byte)-1, (byte)1,
                                (byte)-6, (byte)1,  (byte)-8,   (byte)1,  (byte)1,  (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,
                                (byte)-1,  (byte)-2,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,
                                (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-4,  (byte)4,
                                (byte)54,  (byte)-37, (byte)77,  (byte)-52, (byte)-51, (byte)61,
                                (byte)120, (byte)-4,  (byte)124, (byte)-4,  (byte)62};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)-2, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 10);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull18() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-17, (byte)-1, (byte)-1,  (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1,  (byte)-1, (byte)-1,  (byte)-1,
                                (byte)-1, (byte)-1, (byte)-2,  (byte)-1, (byte)-17, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1,  (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65,
        (byte)65, (byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)65, (byte)65, (byte)1,
        (byte)0,  (byte)65, (byte)65, (byte)65, (byte)65, (byte)1,  (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 10);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-4, (byte)-3, (byte)-3, (byte)-4,
                                (byte)-4, (byte)-3, (byte)-3, (byte)-3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(-144_680_349_987_897_860L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)-8,  (byte)-4,  (byte)-4,  (byte)66, (byte)-56,
                                (byte)-64, (byte)97,  (byte)-56, (byte)-32, (byte)-8, (byte)105,
                                (byte)-55, (byte)105, (byte)122, (byte)-52};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(-4_007_710_227_033_162_504L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-2, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 14);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput22() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)22, (byte)16,  (byte)-2, (byte)2,
                                (byte)0,  (byte)0,  (byte)0,   (byte)-9, (byte)-1,
                                (byte)-9, (byte)49, (byte)114, (byte)50, (byte)54};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-2, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)1,  (byte)0,  (byte)0,  (byte)0,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull25() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)64, (byte)1,  (byte)0,  (byte)0, (byte)1,
                                (byte)1,  (byte)65, (byte)-2, (byte)0,  (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)35, (byte)97, (byte)64};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-127, (byte)-1,
                                (byte)-1,  (byte)-2,  (byte)-1,  (byte)-1,  (byte)-1,   (byte)-127,
                                (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)-4,   (byte)4,
                                (byte)54,  (byte)-37, (byte)77,  (byte)-52, (byte)-55,  (byte)61,
                                (byte)120, (byte)-4,  (byte)124, (byte)-4,  (byte)62};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-7, (byte)-1, (byte)-1, (byte)-17,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull30() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)17, (byte)64, (byte)19, (byte)19, (byte)19,
                                (byte)19, (byte)-2, (byte)0,  (byte)0,  (byte)0,  (byte)0,
                                (byte)16, (byte)84, (byte)2,  (byte)18, (byte)50, (byte)18};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull36() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)1, (byte)1, (byte)1, (byte)-127, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1, (byte)1,    (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)0,    (byte)1, (byte)1, (byte)-2, (byte)0, (byte)0,
                                (byte)0, (byte)-128, (byte)0, (byte)0, (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)-65, (byte)-1,  (byte)-17, (byte)-2,  (byte)-1,
                                (byte)-1,  (byte)-1,  (byte)-1,  (byte)-1,  (byte)126, (byte)-2,
                                (byte)123, (byte)-9,  (byte)-65, (byte)-9};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)13,  (byte)8,    (byte)0,  (byte)0,   (byte)-1,
                                (byte)-2, (byte)13,  (byte)0,    (byte)0,  (byte)0,   (byte)-1,
                                (byte)-1, (byte)-67, (byte)-68,  (byte)0,  (byte)-17, (byte)16,
                                (byte)28, (byte)28,  (byte)-116, (byte)12, (byte)12,  (byte)-51,
                                (byte)0,  (byte)0,   (byte)0,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_073_741_824);
    final byte[] myByteArray = {
        (byte)16, (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)16, (byte)16, (byte)0,
        (byte)16, (byte)16, (byte)0,  (byte)16, (byte)16, (byte)0,  (byte)0,  (byte)1,  (byte)16,
        (byte)16, (byte)1,  (byte)16, (byte)2,  (byte)16, (byte)16, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesInputZeroOutput0000ccd1bddc3dcc57b5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final int length = 0;

    // Act
    final byte[] actual = mysqlMessage.readBytes(length);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput12() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput13() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 23);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 22);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 7);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput42() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 20);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput43() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 4);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesOutput5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput0() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 67_109_125);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 5);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput132() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)13,  (byte)8,  (byte)0,   (byte)0,
                                (byte)-1, (byte)13,  (byte)13, (byte)0,   (byte)0,
                                (byte)0,  (byte)-1,  (byte)-1, (byte)-67, (byte)-68,
                                (byte)0,  (byte)-17, (byte)16, (byte)28,  (byte)28};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)8,  (byte)-81, (byte)2,   (byte)99,   (byte)72,
                                (byte)0,  (byte)72,  (byte)-73, (byte)-108, (byte)-121,
                                (byte)53, (byte)52,  (byte)-44, (byte)-100};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 2);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput23() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)22, (byte)80,  (byte)2,   (byte)2,
                                (byte)32,  (byte)48, (byte)-96, (byte)-73, (byte)-49,
                                (byte)-41, (byte)49, (byte)3,   (byte)66,  (byte)54};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput8() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)6,  (byte)7,   (byte)125, (byte)-7, (byte)-72, (byte)7,
                                (byte)7,  (byte)7,   (byte)7,   (byte)-7, (byte)-7,  (byte)-7,
                                (byte)-7, (byte)-7,  (byte)72,  (byte)7,  (byte)0,   (byte)0,
                                (byte)0,  (byte)-21, (byte)31,  (byte)8,  (byte)7,   (byte)0,
                                (byte)0,  (byte)0,   (byte)-21, (byte)31, (byte)8,   (byte)7};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 21);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithLengthOutput9() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)9,   (byte)6,   (byte)0,   (byte)0,   (byte)0,
                                (byte)-81, (byte)-81, (byte)-81, (byte)-81, (byte)-84};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                         (byte)0, (byte)0, (byte)0},
                             actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesInputZeroOutput03() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);
    final int length = 0;

    // Act
    final byte[] actual = mysqlMessage.readBytes(length);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput72() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 19);
    final byte[] myByteArray = {(byte)0,  (byte)0,  (byte)0, (byte)16, (byte)0, (byte)16,
                                (byte)1,  (byte)0,  (byte)0, (byte)0,  (byte)1, (byte)1,
                                (byte)17, (byte)16, (byte)1, (byte)1,  (byte)1, (byte)1,
                                (byte)17, (byte)0,  (byte)0, (byte)16, (byte)1, (byte)0,
                                (byte)0,  (byte)0,  (byte)0, (byte)0,  (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 12);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_048_592);
    final byte[] myByteArray = {(byte)0,  (byte)0, (byte)0,  (byte)16, (byte)0, (byte)16,
                                (byte)1,  (byte)0, (byte)0,  (byte)0,  (byte)1, (byte)1,
                                (byte)17, (byte)0, (byte)17, (byte)0,  (byte)1, (byte)1,
                                (byte)17, (byte)0, (byte)1,  (byte)16, (byte)1, (byte)1,
                                (byte)17, (byte)1, (byte)1,  (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 20);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput19() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_048_592);
    final byte[] myByteArray = {(byte)1,   (byte)1, (byte)1,  (byte)2, (byte)1, (byte)1,
                                (byte)1,   (byte)1, (byte)1,  (byte)1, (byte)1, (byte)1,
                                (byte)1,   (byte)0, (byte)1,  (byte)1, (byte)1, (byte)88,
                                (byte)1,   (byte)1, (byte)64, (byte)0, (byte)0, (byte)1,
                                (byte)-64, (byte)8, (byte)2,  (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 20);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput18() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 17);
    final byte[] myByteArray = {(byte)-112, (byte)-128, (byte)-128, (byte)-128, (byte)-120,
                                (byte)-120, (byte)-112, (byte)-112, (byte)-128, (byte)-112,
                                (byte)-112, (byte)-127, (byte)-112, (byte)-112, (byte)-128,
                                (byte)-128, (byte)-127};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput17() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 14);
    final byte[] myByteArray = {(byte)0,  (byte)1, (byte)1,  (byte)65, (byte)3, (byte)1,  (byte)0,
                                (byte)10, (byte)3, (byte)16, (byte)65, (byte)0, (byte)42, (byte)17};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput16() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput15() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 536_870_929);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput110() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 21);
    final byte[] myByteArray = {(byte)1,    (byte)1, (byte)1,    (byte)2, (byte)1, (byte)1,
                                (byte)1,    (byte)1, (byte)1,    (byte)1, (byte)1, (byte)1,
                                (byte)1,    (byte)0, (byte)1,    (byte)1, (byte)1, (byte)88,
                                (byte)-127, (byte)1, (byte)-128, (byte)0, (byte)0, (byte)1,
                                (byte)-128, (byte)8, (byte)2,    (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 20);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput05() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_048_592);
    final byte[] myByteArray = {(byte)1,  (byte)1, (byte)1, (byte)2,    (byte)1,  (byte)1, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1,    (byte)1,  (byte)1, (byte)0,
                                (byte)1,  (byte)1, (byte)1, (byte)8,    (byte)64, (byte)1, (byte)0,
                                (byte)16, (byte)0, (byte)1, (byte)-128, (byte)0,  (byte)2, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 20);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput04() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_073_741_824);
    final byte[] myByteArray = {(byte)16, (byte)0,  (byte)0,  (byte)0,  (byte)0,  (byte)0,
                                (byte)16, (byte)16, (byte)0,  (byte)16, (byte)16, (byte)0,
                                (byte)16, (byte)16, (byte)0,  (byte)0,  (byte)0,  (byte)16,
                                (byte)16, (byte)0,  (byte)16, (byte)2,  (byte)16, (byte)16};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput03() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 14);
    final byte[] myByteArray = {(byte)3,  (byte)1, (byte)1,  (byte)65, (byte)3, (byte)1,  (byte)8,
                                (byte)10, (byte)3, (byte)16, (byte)65, (byte)4, (byte)42, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MysqlMessage.class, System.class})
  @Test
  public void readBytesWithNullOutput02() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_073_741_841);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 18);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)0,    (byte)1, (byte)1, (byte)-5, (byte)0, (byte)0,
                                (byte)0, (byte)-128, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)1,
                                (byte)1, (byte)1,    (byte)1, (byte)1, (byte)1,  (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull9() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)51, (byte)6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)74, (byte)-52, (byte)-37, (byte)-85, (byte)12,
                                (byte)12, (byte)13,  (byte)-54, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull17() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)-83, (byte)-55, (byte)1,  (byte)89, (byte)2,
                                (byte)26, (byte)-5,  (byte)35,  (byte)0,  (byte)0,  (byte)-128,
                                (byte)0,  (byte)0,   (byte)0,   (byte)-5, (byte)35, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)33,  (byte)33,  (byte)33, (byte)33, (byte)33,
                                (byte)-96, (byte)-96, (byte)-87, (byte)33, (byte)33, (byte)33,
                                (byte)33,  (byte)33,  (byte)33,  (byte)-95};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull19() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0,    (byte)0, (byte)1,  (byte)0,   (byte)0, (byte)-127,
                                (byte)-127, (byte)0, (byte)32, (byte)0,   (byte)1, (byte)35,
                                (byte)0,    (byte)5, (byte)1,  (byte)-119};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)2, (byte)2, (byte)-126, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)18, (byte)18, (byte)-110, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0,   (byte)-17, (byte)-17, (byte)-17, (byte)-127, (byte)-17,
                                (byte)-17, (byte)0,   (byte)-17, (byte)-17, (byte)-17,  (byte)-127,
                                (byte)-17, (byte)-17, (byte)-25, (byte)19,  (byte)16,   (byte)4,
                                (byte)50,  (byte)3,   (byte)9,   (byte)76,  (byte)-23,  (byte)21,
                                (byte)112, (byte)18,  (byte)100, (byte)-20, (byte)62};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull35() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative0019ba5da3679bc0fed() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)11};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-21, (byte)-12, (byte)-17, (byte)-8,  (byte)-5,  (byte)-11,
                                (byte)-1,  (byte)-24, (byte)-1,  (byte)-28, (byte)-19, (byte)-3,
                                (byte)-30, (byte)-32, (byte)-60, (byte)-29, (byte)-17};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)16,   (byte)-12,  (byte)-11,  (byte)-128, (byte)0,
                                (byte)-11,  (byte)-1,   (byte)-119, (byte)-119, (byte)-119,
                                (byte)-119, (byte)-121, (byte)0,    (byte)-11,  (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 12);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull0008d89fd34f26404e2() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull32() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull18() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-2, (byte)67,  (byte)0,  (byte)-70, (byte)-3, (byte)-53,
                                (byte)0,  (byte)-70, (byte)-5, (byte)67,  (byte)0,  (byte)-70};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)0, (byte)0, (byte)9, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull20() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)112,  (byte)-102, (byte)-115, (byte)16,   (byte)99,
                                (byte)-117, (byte)-5,   (byte)8,    (byte)0,    (byte)-128,
                                (byte)8,    (byte)64,   (byte)-126, (byte)-128, (byte)66};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull21() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull22() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull31() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)17, (byte)19, (byte)80, (byte)19, (byte)19, (byte)19,
                                (byte)3,  (byte)-9, (byte)17, (byte)0,  (byte)16, (byte)20,
                                (byte)0,  (byte)84, (byte)2,  (byte)-5, (byte)17, (byte)16};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull13()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)-5, (byte)-5, (byte)-5, (byte)-5,
                                (byte)-5, (byte)-5, (byte)-5, (byte)-5, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull24() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1,  (byte)3, (byte)18, (byte)3, (byte)19, (byte)3, (byte)32,
                                (byte)0,  (byte)8, (byte)3,  (byte)1, (byte)1,  (byte)3, (byte)3,
                                (byte)19, (byte)3, (byte)0,  (byte)3, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 16);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull25() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)123, (byte)3,    (byte)10,  (byte)0,  (byte)119,
                                (byte)23,  (byte)-106, (byte)-42, (byte)-4, (byte)-61,
                                (byte)-14, (byte)3,    (byte)7,   (byte)0,  (byte)5,
                                (byte)66,  (byte)69,   (byte)14,  (byte)-8, (byte)-5,
                                (byte)3,   (byte)6,    (byte)2,   (byte)16, (byte)71};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 19);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull26() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero000b76a8a2335f1ab98() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)0, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull27() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-72, (byte)2,  (byte)102, (byte)71, (byte)4, (byte)5,
                                (byte)2,   (byte)-5, (byte)92,  (byte)16, (byte)6, (byte)-70,
                                (byte)6,   (byte)2,  (byte)32,  (byte)0,  (byte)0, (byte)0,
                                (byte)16,  (byte)6,  (byte)4,   (byte)7};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)105, (byte)78, (byte)-102, (byte)73, (byte)-5,
                                (byte)-5,  (byte)8,  (byte)-5,   (byte)8};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 7);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthOutputNull29() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNotNull21() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithLength();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputZero7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 28);

    // Act and Assert result
    Assert.assertEquals(0L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull18()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,  (byte)1,  (byte)0,    (byte)-128, (byte)-96, (byte)32,
                                (byte)0,   (byte)32, (byte)32,   (byte)0,    (byte)0,   (byte)0,
                                (byte)-96, (byte)32, (byte)0,    (byte)32,   (byte)32,  (byte)81,
                                (byte)17,  (byte)96, (byte)-111, (byte)49,   (byte)52,  (byte)-31,
                                (byte)34,  (byte)39, (byte)-127, (byte)34};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 28);

    // Act and Assert result
    Assert.assertEquals(-1L, mysqlMessage.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 29);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull20()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)81,   (byte)-117, (byte)52,  (byte)-60, (byte)-51,
                                (byte)119,  (byte)-5,   (byte)-88, (byte)8,   (byte)0,
                                (byte)-127, (byte)1,    (byte)1,   (byte)0,   (byte)-127};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 6);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull24() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)37,  (byte)-84,  (byte)-11, (byte)-79, (byte)32,
                                (byte)91,  (byte)-100, (byte)-53, (byte)-5,  (byte)-112,
                                (byte)16,  (byte)-80,  (byte)117, (byte)-77, (byte)-80,
                                (byte)-81, (byte)-78,  (byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNotNullOutputNull21()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1,  (byte)1, (byte)0,
                                (byte)0, (byte)1, (byte)64, (byte)3, (byte)-128};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength("U"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBigDecimalOutputNull22() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5,   (byte)0,    (byte)1,  (byte)-128, (byte)0, (byte)1,
                                (byte)-127, (byte)-128, (byte)32, (byte)0,    (byte)2, (byte)35,
                                (byte)0,    (byte)5,    (byte)33, (byte)9};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBigDecimal());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)48, (byte)48};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)88, (byte)-32, (byte)-63, (byte)65, (byte)0,  (byte)64,
                                (byte)64, (byte)64,  (byte)-64, (byte)64, (byte)64, (byte)-64};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-72, (byte)-86, (byte)-5, (byte)-86,
                                (byte)-22, (byte)-5,  (byte)-70};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 5);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6,  (byte)-70, (byte)-5,  (byte)-21, (byte)-5, (byte)-6,
                                (byte)-78, (byte)-5,  (byte)-7,  (byte)122, (byte)-1, (byte)-5,
                                (byte)-5,  (byte)-5,  (byte)-77, (byte)-79};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 4);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)-6, (byte)-6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithLengthInputNullOutputNull7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5, (byte)-6};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 28);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithLength(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithLengthOutputNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    final byte[] myByteArray = {(byte)-5, (byte)-3, (byte)-67};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readBytesWithLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesOutputNotNull000bcbec6a64f8b0717() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytes();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8_389_734);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 5);
    final byte[] myByteArray = {(byte)0,  (byte)-128, (byte)0,  (byte)0,  (byte)1, (byte)8,
                                (byte)18, (byte)0,    (byte)1,  (byte)1,  (byte)1, (byte)2,
                                (byte)0,  (byte)-128, (byte)16, (byte)0,  (byte)1, (byte)8,
                                (byte)18, (byte)0,    (byte)0,  (byte)16, (byte)1, (byte)0,
                                (byte)0,  (byte)0,    (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 13);
    final byte[] myByteArray = {(byte)0, (byte)2, (byte)0, (byte)0,
                                (byte)0, (byte)2, (byte)1, (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)0, (byte)16, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 22);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 23);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull0009e9637936b59e97f() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 20);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_147_483_644);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1_073_741_824);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull9() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -134_217_683);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -134_217_683);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)0, (byte)-128, (byte)1, (byte)0, (byte)0,
                                (byte)0, (byte)-128, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesWithNullOutputNotNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 15);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act
    final byte[] actual = mysqlMessage.readBytesWithNull();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_750);
    final byte[] myByteArray = {(byte)10, (byte)50,  (byte)27, (byte)59, (byte)51,
                                (byte)18, (byte)1,   (byte)82, (byte)58, (byte)1,
                                (byte)25, (byte)122, (byte)48, (byte)50, (byte)1,
                                (byte)0,  (byte)49,  (byte)26, (byte)3};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 15);

    // Act and Assert result
    Assert.assertEquals("", mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNotNull8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act and Assert result
    Assert.assertEquals("", mysqlMessage.readStringWithNull("UTF-16BE"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNotNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 2);
    final byte[] myByteArray = {(byte)-2, (byte)-1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertEquals("", mysqlMessage.readString("UTF-16"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull6() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_097_220_070);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_939_447_808);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull5() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -5);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 104_299);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull4() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -5);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull3() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_759_626_896);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -1_556_924_443);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull2() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -5);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -5);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringOutputNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_339_850_749);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_202_360_320);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNull()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -5);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -5);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_610_612_734);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 2_147_483_640);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("UTF-16BE"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -5);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -5);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNull2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_147_483_648);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -2_133_852_160);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNullOutputNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringInputNotNullOutputNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_268_252_672);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_879_048_192);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readString("\ufffe\uffff\ufffd\ufffc\ufffc\ufffc\ufffc\ufffc"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull12() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_610_612_740);
    final byte[] myByteArray = {(byte)0,  (byte)20, (byte)0,  (byte)33, (byte)0,
                                (byte)0,  (byte)33, (byte)33, (byte)1,  (byte)1,
                                (byte)32, (byte)8,  (byte)1,  (byte)0,  (byte)1};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull13() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_147_483_169);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -34);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull14() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8_388_631);
    final byte[] myByteArray = {(byte)-127, (byte)-127, (byte)-124, (byte)9,    (byte)-127,
                                (byte)1,    (byte)41,   (byte)1,    (byte)-128, (byte)-128,
                                (byte)0,    (byte)0,    (byte)0,    (byte)0,    (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 13);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull15() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -342_177_280);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 536_870_912);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull16() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1_750_073_364);
    final byte[] myByteArray = {
        (byte)12,   (byte)42, (byte)0,  (byte)41, (byte)4,  (byte)0,  (byte)50, (byte)36, (byte)56,
        (byte)0,    (byte)12, (byte)16, (byte)41, (byte)42, (byte)40, (byte)50, (byte)48, (byte)40,
        (byte)-120, (byte)44, (byte)10, (byte)9,  (byte)48, (byte)0,  (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 9);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull17() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -964_395_005);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 369_393_667);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull18() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 65_539);
    final byte[] myByteArray = {(byte)1,    (byte)1,  (byte)1, (byte)0, (byte)1, (byte)1,
                                (byte)-128, (byte)4,  (byte)4, (byte)0, (byte)1, (byte)0,
                                (byte)3,    (byte)65, (byte)0, (byte)2, (byte)3, (byte)1,
                                (byte)-128, (byte)1,  (byte)5, (byte)1, (byte)1, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull19() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull8() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 268_435_458);
    final byte[] myByteArray = {(byte)0, (byte)0,    (byte)0, (byte)0,    (byte)2,
                                (byte)0, (byte)-128, (byte)0, (byte)-128, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 3);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull20() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull11() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -3);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -2);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull9() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 289_472_335);
    final byte[] myByteArray = {};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 352_386_891);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull10() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 16_777_219);
    final byte[] myByteArray = {(byte)68, (byte)38,  (byte)36, (byte)32,  (byte)103, (byte)70,
                                (byte)64, (byte)103, (byte)0,  (byte)103, (byte)103, (byte)6,
                                (byte)0,  (byte)0,   (byte)96, (byte)38};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 8);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullOutputNull7() throws InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_341_911_034);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -1_341_124_601);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -626_524_150);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_279_787_010);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull5()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 267_677_691);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 268_201_851);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull11()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 3);
    final byte[] myByteArray = {(byte)0, (byte)2, (byte)0, (byte)71, (byte)71, (byte)64, (byte)10};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("UTF-8"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -2_235_396);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -400_387);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 20_447_556);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 103_365_292);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull9()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -1_114_295_773);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", -1_084_531_616);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("UTF-16"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNotNullOutputNull10()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 27);
    final byte[] myByteArray = {(byte)0,  (byte)41, (byte)35, (byte)18, (byte)19, (byte)-65,
                                (byte)50, (byte)12, (byte)56, (byte)16, (byte)3,  (byte)19,
                                (byte)19, (byte)0,  (byte)19, (byte)56, (byte)29, (byte)26,
                                (byte)9,  (byte)19, (byte)30, (byte)10, (byte)35, (byte)34,
                                (byte)16, (byte)0,  (byte)57, (byte)19, (byte)51, (byte)19};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull("\ufff4\ufff4"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull2()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", -117);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 2_147_483_160);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull3()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 8_421_378);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull8()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull7()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 0);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull6()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 10_011_136);
    Reflector.setField(mysqlMessage, "data", null);
    Reflector.setField(mysqlMessage, "position", 1_073_741_824);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readStringWithNullInputNullOutputNull4()
      throws UnsupportedEncodingException, InvocationTargetException {

    // Arrange
    final MysqlMessage mysqlMessage =
        (MysqlMessage)Reflector.getInstance("com.seaboat.mysql.protocol.MysqlMessage");
    Reflector.setField(mysqlMessage, "length", 11);
    final byte[] myByteArray = {(byte)0,  (byte)67, (byte)0,  (byte)66, (byte)64,
                                (byte)65, (byte)1,  (byte)1,  (byte)67, (byte)67,
                                (byte)67, (byte)0,  (byte)67, (byte)64, (byte)65};
    Reflector.setField(mysqlMessage, "data", myByteArray);
    Reflector.setField(mysqlMessage, "position", 0);

    // Act and Assert result
    Assert.assertNull(mysqlMessage.readStringWithNull(null));
  }
}
