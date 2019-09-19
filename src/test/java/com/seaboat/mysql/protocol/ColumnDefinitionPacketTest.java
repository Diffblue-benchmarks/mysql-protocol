package com.seaboat.mysql.protocol;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.ColumnDefinitionPacket;
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
public class ColumnDefinitionPacketTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException4() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)98, (byte)-64, (byte)68, (byte)-31, (byte)0,
                         (byte)-5, (byte)-5,  (byte)-5, (byte)32,  (byte)-6};
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
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals((byte)-31, columnDefinitionPacket.packetId);
      Assert.assertEquals(4_505_698, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive000255caa533b96db03() {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket = new ColumnDefinitionPacket();

    // Act and Assert result
    Assert.assertEquals(22, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput30OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)123, (byte)-14, (byte)0,   (byte)0,  (byte)-5, (byte)0,
                         (byte)-3,  (byte)0,   (byte)0,   (byte)0,  (byte)-4, (byte)1,
                         (byte)0,   (byte)-3,  (byte)0,   (byte)0,  (byte)0,  (byte)4,
                         (byte)0,   (byte)-6,  (byte)-25, (byte)10, (byte)64, (byte)-7,
                         (byte)0,   (byte)2,   (byte)0,   (byte)-5, (byte)-5, (byte)-5};

    // Act
    columnDefinitionPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(columnDefinitionPacket.orgName);
    Assert.assertEquals(512, columnDefinitionPacket.flags);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.name);
    Assert.assertEquals((byte)0, columnDefinitionPacket.nextLength);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.schema);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.table);
    Assert.assertEquals(1_074_456_570L, columnDefinitionPacket.length);
    Assert.assertNotNull(columnDefinitionPacket.orgTable);
    Assert.assertNull(columnDefinitionPacket.catalog);
    Assert.assertEquals(4, columnDefinitionPacket.charsetSet);
    Assert.assertEquals(249, columnDefinitionPacket.type);
    Assert.assertEquals(62_075, columnDefinitionPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput30OutputIndexOutOfBoundsException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)1,  (byte)-120, (byte)0,   (byte)0,    (byte)-5,   (byte)0,
                         (byte)-3, (byte)0,    (byte)0,   (byte)0,    (byte)-4,   (byte)1,
                         (byte)0,  (byte)-3,   (byte)0,   (byte)0,    (byte)0,    (byte)4,
                         (byte)0,  (byte)-6,   (byte)-25, (byte)10,   (byte)64,   (byte)-5,
                         (byte)0,  (byte)2,    (byte)0,   (byte)-128, (byte)-128, (byte)-128};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doNothing().doNothing().doThrow(indexOutOfBoundsException))
        .when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.orgName);
      Assert.assertEquals(512, columnDefinitionPacket.flags);
      Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.name);
      Assert.assertEquals((byte)0, columnDefinitionPacket.nextLength);
      Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.schema);
      Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.table);
      Assert.assertEquals(1_074_456_570L, columnDefinitionPacket.length);
      Assert.assertNotNull(columnDefinitionPacket.orgTable);
      Assert.assertNull(columnDefinitionPacket.catalog);
      Assert.assertEquals(4, columnDefinitionPacket.charsetSet);
      Assert.assertEquals(251, columnDefinitionPacket.type);
      Assert.assertEquals(34_817, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput30OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)1,  (byte)8,  (byte)0,  (byte)6,   (byte)2,  (byte)-1,
                         (byte)0,  (byte)0,  (byte)1,  (byte)-27, (byte)3,  (byte)-4,
                         (byte)0,  (byte)0,  (byte)-4, (byte)1,   (byte)0,  (byte)6,
                         (byte)0,  (byte)0,  (byte)3,  (byte)0,   (byte)-5, (byte)-27,
                         (byte)10, (byte)64, (byte)-5, (byte)0,   (byte)0,  (byte)0};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doNothing().doNothing().doNothing().doNothing().doThrow(
         indexOutOfBoundsException))
        .when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.orgName);
      Assert.assertNotNull(columnDefinitionPacket.name);
      Assert.assertEquals((byte)0, columnDefinitionPacket.nextLength);
      Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.schema);
      Assert.assertNotNull(columnDefinitionPacket.table);
      Assert.assertEquals(1_074_456_059L, columnDefinitionPacket.length);
      Assert.assertNotNull(columnDefinitionPacket.orgTable);
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals(3, columnDefinitionPacket.charsetSet);
      Assert.assertEquals(251, columnDefinitionPacket.type);
      Assert.assertEquals((byte)6, columnDefinitionPacket.packetId);
      Assert.assertEquals(2049, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput29OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)1,  (byte)-120, (byte)0,   (byte)0,    (byte)-5,  (byte)0,
                         (byte)-3, (byte)0,    (byte)0,   (byte)0,    (byte)-4,  (byte)1,
                         (byte)0,  (byte)-3,   (byte)0,   (byte)0,    (byte)0,   (byte)4,
                         (byte)0,  (byte)-6,   (byte)-25, (byte)10,   (byte)64,  (byte)-5,
                         (byte)0,  (byte)2,    (byte)0,   (byte)-128, (byte)-128};

    // Act
    columnDefinitionPacket.read(data);

    // Assert side effects
    Assert.assertNotNull(columnDefinitionPacket.orgName);
    Assert.assertEquals(512, columnDefinitionPacket.flags);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.name);
    Assert.assertEquals((byte)0, columnDefinitionPacket.nextLength);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.schema);
    Assert.assertEquals(columnDefinitionPacket.orgName, columnDefinitionPacket.table);
    Assert.assertEquals(1_074_456_570L, columnDefinitionPacket.length);
    Assert.assertNotNull(columnDefinitionPacket.orgTable);
    Assert.assertNull(columnDefinitionPacket.catalog);
    Assert.assertEquals(4, columnDefinitionPacket.charsetSet);
    Assert.assertEquals(251, columnDefinitionPacket.type);
    Assert.assertEquals(34_817, columnDefinitionPacket.packetLength);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException5() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)98, (byte)-64, (byte)68, (byte)-31, (byte)0,
                         (byte)-5, (byte)-5,  (byte)-5, (byte)-5,  (byte)-6};
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
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals((byte)-31, columnDefinitionPacket.packetId);
      Assert.assertEquals(4_505_698, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException3() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)98, (byte)-62, (byte)68, (byte)-31, (byte)0,
                         (byte)-5, (byte)-5,  (byte)5,  (byte)0,   (byte)-6};
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
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals((byte)-31, columnDefinitionPacket.packetId);
      Assert.assertEquals(4_506_210, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)-15, (byte)-15, (byte)-15, (byte)-15, (byte)1,
                         (byte)-7,  (byte)2,   (byte)31,  (byte)-3,  (byte)-1};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doNothing().doNothing().doThrow(indexOutOfBoundsException))
        .when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.schema);
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals((byte)-15, columnDefinitionPacket.packetId);
      Assert.assertEquals(15_856_113, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPacketInfoOutputNotNull() {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket = new ColumnDefinitionPacket();

    // Act and Assert result
    Assert.assertEquals("MySQL Column Definition Packet", columnDefinitionPacket.getPacketInfo());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput7OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)-15, (byte)-15, (byte)-15, (byte)-15, (byte)-4, (byte)1, (byte)0};
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
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertEquals((byte)-15, columnDefinitionPacket.packetId);
      Assert.assertEquals(15_856_113, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, System.class})
  @Test
  public void readInput10OutputIndexOutOfBoundsException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)12;
    final byte[] myByteArray = {(byte)0, (byte)0};
    columnDefinitionPacket.filler = myByteArray;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {(byte)100, (byte)101, (byte)102};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final byte[] data = {(byte)-15, (byte)-15, (byte)-15, (byte)-15, (byte)4,
                         (byte)-17, (byte)0,   (byte)0,   (byte)-2,  (byte)-1};
    final IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
    final IndexOutOfBoundsException indexOutOfBoundsException1 = new IndexOutOfBoundsException();
    Reflector.setField(indexOutOfBoundsException1, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException1, "detailMessage", null);
    Reflector.setField(indexOutOfBoundsException, "cause", indexOutOfBoundsException1);
    Reflector.setField(indexOutOfBoundsException, "detailMessage", null);
    ((PowerMockitoStubber)PowerMockito.doNothing().doThrow(indexOutOfBoundsException))
        .when(System.class);
    System.arraycopy(or(isA(Object.class), isNull(Object.class)), anyInt(),
                     or(isA(Object.class), isNull(Object.class)), anyInt(), anyInt());

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    try {
      columnDefinitionPacket.read(data);
    } catch (java.lang.IndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertNotNull(columnDefinitionPacket.catalog);
      Assert.assertEquals((byte)-15, columnDefinitionPacket.packetId);
      Assert.assertEquals(15_856_113, columnDefinitionPacket.packetLength);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid8() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    final byte[] myByteArray = {};
    columnDefinitionPacket.orgName = myByteArray;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.name = myByteArray1;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray2;
    final byte[] myByteArray3 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray3;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray4 = {};
    columnDefinitionPacket.defaultValues = myByteArray4;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray5 = {(byte)0};
    columnDefinitionPacket.orgTable = myByteArray5;
    final byte[] myByteArray6 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray6;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer7 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer6 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5)
         .doReturn(byteBuffer6)
         .doReturn(byteBuffer7))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer29 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer28 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer27 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer26 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer25 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer24 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer8)
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
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23)
         .doReturn(byteBuffer24)
         .doReturn(byteBuffer25)
         .doReturn(byteBuffer26)
         .doReturn(byteBuffer27)
         .doReturn(byteBuffer28)
         .doReturn(byteBuffer29))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid7() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    final byte[] myByteArray = {};
    columnDefinitionPacket.orgName = myByteArray;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.name = myByteArray1;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray2;
    final byte[] myByteArray3 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray3;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray4 = {(byte)0};
    columnDefinitionPacket.orgTable = myByteArray4;
    final byte[] myByteArray5 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray5;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer6 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5)
         .doReturn(byteBuffer6))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer27 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer26 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer25 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer24 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer7)
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
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23)
         .doReturn(byteBuffer24)
         .doReturn(byteBuffer25)
         .doReturn(byteBuffer26)
         .doReturn(byteBuffer27))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid6() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray = {};
    columnDefinitionPacket.name = myByteArray;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray1;
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray2;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray3 = {(byte)0};
    columnDefinitionPacket.orgTable = myByteArray3;
    final byte[] myByteArray4 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray4;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer5 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4)
         .doReturn(byteBuffer5))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer26 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer25 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer24 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer6)
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
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23)
         .doReturn(byteBuffer24)
         .doReturn(byteBuffer25)
         .doReturn(byteBuffer26))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid5() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray1;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray2 = {(byte)0};
    columnDefinitionPacket.orgTable = myByteArray2;
    final byte[] myByteArray3 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray3;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer4 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2)
         .doReturn(byteBuffer3)
         .doReturn(byteBuffer4))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer25 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer24 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer5)
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
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23)
         .doReturn(byteBuffer24)
         .doReturn(byteBuffer25))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid4() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray;
    final byte[] myByteArray1 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray1;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                 (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray2;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
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
    final ByteBuffer byteBuffer24 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23)
         .doReturn(byteBuffer24))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid3() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.catalog = myByteArray1;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer2 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer)
         .doReturn(byteBuffer1)
         .doReturn(byteBuffer2))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer23 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
    final ByteBuffer byteBuffer3 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod1 = DTUMemberMatcher.method(ByteBuffer.class, "put", byte.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer3)
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
         .doReturn(byteBuffer17)
         .doReturn(byteBuffer18)
         .doReturn(byteBuffer19)
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22)
         .doReturn(byteBuffer23))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid2() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    final byte[] myByteArray = {};
    columnDefinitionPacket.catalog = myByteArray;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer1 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    ((PowerMockitoStubber)PowerMockito.doReturn(byteBuffer).doReturn(byteBuffer1))
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer22 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer17)
         .doReturn(byteBuffer18)
         .doReturn(byteBuffer19)
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21)
         .doReturn(byteBuffer22))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ColumnDefinitionPacket.class, BufferUtil.class, ByteBuffer.class})
  @Test
  public void writeInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;
    final ByteBuffer buffer = PowerMockito.mock(ByteBuffer.class);
    final ByteBuffer byteBuffer = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
    final Method putMethod = DTUMemberMatcher.method(ByteBuffer.class, "put", byte[].class);
    PowerMockito.doReturn(byteBuffer)
        .when(buffer, putMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
    final ByteBuffer byteBuffer21 = (ByteBuffer)Reflector.getInstance("java.nio.ByteBuffer");
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
         .doReturn(byteBuffer16)
         .doReturn(byteBuffer17)
         .doReturn(byteBuffer18)
         .doReturn(byteBuffer19)
         .doReturn(byteBuffer20)
         .doReturn(byteBuffer21))
        .when(buffer, putMethod1)
        .withArguments(anyByte());

    // Act
    columnDefinitionPacket.write(buffer);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.seaboat.mysql.protocol.ColumnDefinitionPacket");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive8() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    final byte[] myByteArray = {};
    columnDefinitionPacket.orgName = myByteArray;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.name = myByteArray1;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray2 = {};
    columnDefinitionPacket.defaultValues = myByteArray2;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray3 = {};
    columnDefinitionPacket.orgTable = myByteArray3;
    final byte[] myByteArray4 = {};
    columnDefinitionPacket.catalog = myByteArray4;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(20, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive3() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.defaultValues = myByteArray1;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(23, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive4() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray = {};
    columnDefinitionPacket.defaultValues = myByteArray;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(20, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive5() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray = {};
    columnDefinitionPacket.name = myByteArray;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.defaultValues = myByteArray1;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(20, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive6() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray = {};
    columnDefinitionPacket.name = myByteArray;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.defaultValues = myByteArray1;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray2 = {};
    columnDefinitionPacket.orgTable = myByteArray2;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(20, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive7() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray = {};
    columnDefinitionPacket.name = myByteArray;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.defaultValues = myByteArray1;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray2 = {};
    columnDefinitionPacket.orgTable = myByteArray2;
    final byte[] myByteArray3 = {};
    columnDefinitionPacket.catalog = myByteArray3;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(20, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive2() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    columnDefinitionPacket.orgName = null;
    columnDefinitionPacket.flags = 0;
    columnDefinitionPacket.name = null;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.schema = myByteArray;
    columnDefinitionPacket.table = null;
    columnDefinitionPacket.length = 0L;
    columnDefinitionPacket.defaultValues = null;
    columnDefinitionPacket.decimals = (byte)0;
    columnDefinitionPacket.orgTable = null;
    columnDefinitionPacket.catalog = null;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(22, columnDefinitionPacket.calcPacketSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void calcPacketSizeOutputPositive9() throws InvocationTargetException {

    // Arrange
    final ColumnDefinitionPacket columnDefinitionPacket =
        (ColumnDefinitionPacket)Reflector.getInstance(
            "com.seaboat.mysql.protocol.ColumnDefinitionPacket");
    final byte[] myByteArray = {};
    columnDefinitionPacket.orgName = myByteArray;
    columnDefinitionPacket.flags = 0;
    final byte[] myByteArray1 = {};
    columnDefinitionPacket.name = myByteArray1;
    columnDefinitionPacket.nextLength = (byte)0;
    columnDefinitionPacket.filler = null;
    columnDefinitionPacket.schema = null;
    final byte[] myByteArray2 = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    columnDefinitionPacket.table = myByteArray2;
    columnDefinitionPacket.length = 0L;
    final byte[] myByteArray3 = {};
    columnDefinitionPacket.defaultValues = myByteArray3;
    columnDefinitionPacket.decimals = (byte)0;
    final byte[] myByteArray4 = {};
    columnDefinitionPacket.orgTable = myByteArray4;
    final byte[] myByteArray5 = {(byte)0, (byte)0};
    columnDefinitionPacket.catalog = myByteArray5;
    columnDefinitionPacket.charsetSet = 0;
    columnDefinitionPacket.type = 0;
    columnDefinitionPacket.packetId = (byte)0;
    columnDefinitionPacket.packetLength = 0;

    // Act and Assert result
    Assert.assertEquals(29, columnDefinitionPacket.calcPacketSize());
  }
}
