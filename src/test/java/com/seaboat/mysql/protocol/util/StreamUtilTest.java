package com.seaboat.mysql.protocol.util;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.util.StreamUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class StreamUtilTest {

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final StreamUtil actual = new StreamUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.util.StreamUtil");

    // Assert side effects
    Assert.assertArrayEquals(
        new byte[] {}, ((byte[])Reflector.getInstanceField(StreamUtil.class, null, "EMPTY_BYTES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_380_342_805);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_380_342_801);
    Reflector.setField(in, "buf", null);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readDouble(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_219_510_272);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_219_510_272);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readDouble(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 27);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 26);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readDouble(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 6);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2);
    final byte[] myByteArray = {(byte)2,  (byte)-128, (byte)0,    (byte)0,    (byte)0, (byte)0,
                                (byte)1,  (byte)0,    (byte)2,    (byte)2,    (byte)1, (byte)1,
                                (byte)1,  (byte)1,    (byte)0,    (byte)0,    (byte)1, (byte)0,
                                (byte)0,  (byte)1,    (byte)2,    (byte)0,    (byte)2, (byte)1,
                                (byte)16, (byte)2,    (byte)-128, (byte)-128, (byte)3, (byte)17};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readDouble(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 179_989_040);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 179_989_040);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readDouble(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_416_746_624);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_416_746_624);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readDouble(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 18);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readDouble(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_832);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0.0, StreamUtil.readDouble(in), 0.0);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2_046_820_352);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2);
    final byte[] myByteArray = {(byte)19, (byte)35, (byte)32, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0,  (byte)0,  (byte)0, (byte)2, (byte)4,
                                (byte)2,  (byte)2,  (byte)3,  (byte)3};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0, StreamUtil.readDouble(in), 0.0);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 8);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0, StreamUtil.readDouble(in), 0.0);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException000fcac193af346135e()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readFloat(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_207_959_552);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -1_207_959_553);
    Reflector.setField(in, "buf", null);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readFloat(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readFloat(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_140_134_671);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -536_224_542);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readFloat(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 10);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)0, (byte)-110, (byte)3,
                                (byte)1, (byte)3, (byte)3, (byte)0,    (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readFloat(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -58_720_248);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_088_763_392);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readFloat(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_446_510_590);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 958_398_470);
    final byte[] myByteArray = {(byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readFloat(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readFloat(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 939_786_239);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 939_524_095);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0.0f, StreamUtil.readFloat(in), 0.0f);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 28);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 24);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)0, (byte)-110, (byte)3, (byte)1, (byte)3,
                                (byte)3, (byte)0, (byte)0, (byte)16,   (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1,    (byte)0, (byte)0, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0,    (byte)0, (byte)0, (byte)2};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0f, StreamUtil.readFloat(in), 0.0f);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_840);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {
        (byte)1, (byte)3, (byte)2, (byte)8, (byte)1, (byte)1, (byte)2, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)2, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)2, (byte)0, (byte)0, (byte)0, (byte)8, (byte)0, (byte)1, (byte)0, (byte)2, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0f, StreamUtil.readFloat(in), 0.0f);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFloatInputNotNullOutputZero4() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0.0f, StreamUtil.readFloat(in), 0.0f);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull0NegativeZeroOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 68);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_147_483_612);
    Reflector.setField(in, "buf", null);
    final byte[] b = {};

    // Act
    StreamUtil.read(in, b, -2_080_374_783, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull0PositivePositiveOutputIndexOutOfBoundsException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {};

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    StreamUtil.read(in, b, 1, 1_073_741_824);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull0PositiveZeroOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 503_136_498);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -1_141_079_168);
    Reflector.setField(in, "buf", null);
    final byte[] b = {};

    // Act
    StreamUtil.read(in, b, 524_288, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull0ZeroPositiveOutputIndexOutOfBoundsException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);
    final byte[] b = {};

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    StreamUtil.read(in, b, 0, 1);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull0ZeroZeroOutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);
    final byte[] b = {};

    // Act
    StreamUtil.read(in, b, 0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull15PositivePositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.read(in, b, 3, 12);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull16NegativeNegativeOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_137_641_744);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_140_351_608);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    StreamUtil.read(in, b, -268_193_792, -2_147_352_577);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull16ZeroPositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 0, 16);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull18PositivePositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 6);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)8,  (byte)0, (byte)1, (byte)0,  (byte)0,    (byte)0,
                                (byte)8,  (byte)0, (byte)1, (byte)8,  (byte)0,    (byte)0,
                                (byte)16, (byte)0, (byte)0, (byte)4,  (byte)9,    (byte)9,
                                (byte)10, (byte)9, (byte)9, (byte)24, (byte)0,    (byte)9,
                                (byte)9,  (byte)0, (byte)9, (byte)24, (byte)-127, (byte)33};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.read(in, b, 6, 12);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull1ZeroPositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 0, 1);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull1ZeroPositiveOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 0, 1);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull1ZeroPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 32);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 27);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0};

    // Act
    StreamUtil.read(in, b, 0, 1);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull20PositivePositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 134_217_745);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)0,    (byte)3,   (byte)9, (byte)3,  (byte)3,    (byte)3,
                                (byte)-125, (byte)0,   (byte)2, (byte)3,  (byte)33,   (byte)2,
                                (byte)1,    (byte)2,   (byte)0, (byte)1,  (byte)0,    (byte)4,
                                (byte)0,    (byte)122, (byte)0, (byte)0,  (byte)-128, (byte)0,
                                (byte)8,    (byte)2,   (byte)0, (byte)64, (byte)0,    (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    StreamUtil.read(in, b, 11, 9);

    // Assert side effects
    Assert.assertNotNull(in);
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                         (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                         (byte)0, (byte)2, (byte)3, (byte)33, (byte)2,
                                         (byte)1, (byte)2, (byte)0, (byte)1,  (byte)0},
                             b);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull23ZeroPositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 33_554_463);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_879_048_221);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)2, (byte)3, (byte)33, (byte)2, (byte)1,
                      (byte)2, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0,  (byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 0, 9);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull24PositivePositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 268_435_466);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)-127, (byte)0,
                                (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0,    (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    StreamUtil.read(in, b, 16, 1);

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull27PositivePositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_147_483_631);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 1, 26);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull27PositivePositiveOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.read(in, b, 8, 19);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull30PositivePositiveOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_147_483_640);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_147_483_641);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                      (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in, b, 13, 17);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNull8NegativePositiveOutputIndexOutOfBoundsException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 278_313_441);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -1_055_682_712);
    Reflector.setField(in, "buf", null);
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    StreamUtil.read(in, b, -1_602_229_112, 1_338_329_724);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullNullNegativePositiveOutputNullPointerException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -36);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(NullPointerException.class);
    StreamUtil.read(in, null, -2_147_483_523, 130);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullNullNegativePositiveOutputNullPointerException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -29_360_128);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -1_065_353_216);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(NullPointerException.class);
    StreamUtil.read(in, null, -2_144_399_020, 2_144_399_020);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullNullPositivePositiveOutputNullPointerException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 670_973_855);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 67_043_358);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(NullPointerException.class);
    StreamUtil.read(in, null, 1_711_374_567, 1_207_861_008);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullNullPositiveZeroOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_683_830_780);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_355_710_464);
    Reflector.setField(in, "buf", null);

    // Act
    StreamUtil.read(in, null, 1_056_948_224, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullNullZeroPositiveOutputNullPointerException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(NullPointerException.class);
    StreamUtil.read(in, null, 0, 1);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_725_013_374);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 877_724_812);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB2(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_610_612_760);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-3,   (byte)-36, (byte)-114, (byte)-64, (byte)99,
                                (byte)-111, (byte)-68, (byte)-3,   (byte)-72, (byte)21,
                                (byte)-100, (byte)105, (byte)-66,  (byte)94,  (byte)-10,
                                (byte)-41,  (byte)-70, (byte)-83,  (byte)-109};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_610_612_760);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-4,   (byte)-35, (byte)-113, (byte)-64, (byte)99,
                                (byte)-112, (byte)-68, (byte)-4,   (byte)-71, (byte)20,
                                (byte)-99,  (byte)104, (byte)-65,  (byte)95,  (byte)-9,
                                (byte)-41,  (byte)-69, (byte)-84,  (byte)-110};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_610_612_760);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-2,   (byte)-33, (byte)-113, (byte)-62, (byte)99,
                                (byte)-110, (byte)-66, (byte)-2,   (byte)-69, (byte)22,
                                (byte)-97,  (byte)106, (byte)-65,  (byte)95,  (byte)-11,
                                (byte)-41,  (byte)-71, (byte)-82,  (byte)-112};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 24);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 6);
    final byte[] myByteArray = {(byte)10, (byte)43,  (byte)123, (byte)54,  (byte)-105, (byte)38,
                                (byte)10, (byte)10,  (byte)79,  (byte)-14, (byte)107,  (byte)-34,
                                (byte)75, (byte)-85, (byte)1,   (byte)35,  (byte)77,   (byte)90};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNullNullZeroZeroOutputVoid00068154e3b7fc6c293() throws IOException {

    // Act
    StreamUtil.read(null, null, 0, 0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException000f4828a42c1da6126()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_013_265_920);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -2_013_265_921);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2_085_380_096);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_086_428_672);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 18);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 4);
    final byte[] myByteArray = {(byte)1,  (byte)1,  (byte)18, (byte)17, (byte)0,
                                (byte)0,  (byte)0,  (byte)16, (byte)16, (byte)18,
                                (byte)3,  (byte)10, (byte)17, (byte)25, (byte)11,
                                (byte)25, (byte)18, (byte)2,  (byte)0,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -58);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_147_483_392);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 24);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {(byte)2,    (byte)8, (byte)4,  (byte)0,    (byte)8,  (byte)0,
                                (byte)11,   (byte)0, (byte)26, (byte)118,  (byte)25, (byte)8,
                                (byte)126,  (byte)0, (byte)41, (byte)-120, (byte)8,  (byte)25,
                                (byte)0,    (byte)8, (byte)22, (byte)0,    (byte)0,  (byte)0,
                                (byte)-128, (byte)1, (byte)18, (byte)-2,   (byte)27, (byte)-128};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 935_774_204);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 937_845_757);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readInt(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 17);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2,
                                (byte)0, (byte)2, (byte)1, (byte)2, (byte)2, (byte)2,
                                (byte)2, (byte)2, (byte)0, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readInt(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputPositive() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)8, (byte)2, (byte)0, (byte)1, (byte)3, (byte)1,
                                (byte)2, (byte)0, (byte)2, (byte)9, (byte)1, (byte)0, (byte)2,
                                (byte)2, (byte)8, (byte)2, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(133_120, StreamUtil.readInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 369_098_752);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 167_772_156);
    final byte[] myByteArray = {};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 26);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 22);
    final byte[] myByteArray = {(byte)-126, (byte)8,  (byte)4,    (byte)0,   (byte)-71, (byte)0,
                                (byte)43,   (byte)96, (byte)26,   (byte)118, (byte)57,  (byte)56,
                                (byte)126,  (byte)32, (byte)41,   (byte)8,   (byte)8,   (byte)57,
                                (byte)0,    (byte)40, (byte)54,   (byte)0,   (byte)0,   (byte)0,
                                (byte)0,    (byte)0,  (byte)-128, (byte)18,  (byte)-2,  (byte)-2};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readIntInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readInt(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException10()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 22);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {
        (byte)0,  (byte)0,  (byte)0, (byte)1, (byte)4, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)16, (byte)16, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0,  (byte)-2, (byte)1, (byte)1, (byte)5, (byte)1, (byte)8, (byte)0, (byte)4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException11()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1,  (byte)4,  (byte)0,
                                (byte)0, (byte)0, (byte)4, (byte)0,  (byte)16, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)-2, (byte)1,  (byte)-2,
                                (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1,  (byte)-1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException12()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1,  (byte)4,  (byte)0,
                                (byte)0, (byte)0, (byte)4, (byte)0,  (byte)16, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)-4, (byte)1,  (byte)-3,
                                (byte)1, (byte)1, (byte)1, (byte)1,  (byte)1,  (byte)-1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException13()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1,   (byte)4,  (byte)0,
                                (byte)0, (byte)0, (byte)4, (byte)0,   (byte)16, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0,   (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)124, (byte)1,  (byte)-4,
                                (byte)1, (byte)1, (byte)1, (byte)1,   (byte)1,  (byte)-1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull22()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-2, (byte)-2, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-1, (byte)-1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException15()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {
        (byte)-118, (byte)64,   (byte)-127, (byte)-127, (byte)-120, (byte)1, (byte)2,    (byte)1,
        (byte)-127, (byte)16,   (byte)9,    (byte)120,  (byte)-128, (byte)2, (byte)-127, (byte)-127,
        (byte)-119, (byte)0,    (byte)-4,   (byte)0,    (byte)0,    (byte)0, (byte)-104, (byte)-127,
        (byte)-128, (byte)-126, (byte)1,    (byte)-127, (byte)96};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException16()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 24);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {
        (byte)-117, (byte)121, (byte)1,    (byte)-71, (byte)-79, (byte)56,   (byte)-126, (byte)84,
        (byte)8,    (byte)16,  (byte)-71,  (byte)121, (byte)56,  (byte)-126, (byte)59,   (byte)40,
        (byte)57,   (byte)-86, (byte)-111, (byte)-78, (byte)-79, (byte)-3,   (byte)33,   (byte)-128,
        (byte)0,    (byte)-85, (byte)-128, (byte)-78, (byte)-88, (byte)-87};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException17()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 24);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {
        (byte)-117, (byte)121, (byte)1,    (byte)-71, (byte)-79, (byte)56,   (byte)-126, (byte)84,
        (byte)9,    (byte)16,  (byte)-71,  (byte)120, (byte)56,  (byte)-126, (byte)59,   (byte)42,
        (byte)56,   (byte)-86, (byte)-110, (byte)-78, (byte)-79, (byte)-2,   (byte)33,   (byte)-128,
        (byte)0,    (byte)-85, (byte)-128, (byte)-78, (byte)-88, (byte)-87};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull21()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException19()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 23);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)3,  (byte)3,  (byte)66,   (byte)19,   (byte)8,    (byte)9,
                                (byte)67, (byte)-3, (byte)1,    (byte)86,   (byte)13,   (byte)3,
                                (byte)67, (byte)71, (byte)5,    (byte)-91,  (byte)86,   (byte)80,
                                (byte)-2, (byte)-5, (byte)-113, (byte)-125, (byte)71,   (byte)-41,
                                (byte)87, (byte)87, (byte)-29,  (byte)-57,  (byte)-121, (byte)-61};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull20()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0, (byte)1,
                                (byte)1,  (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException20()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {(byte)-125, (byte)3,   (byte)74,   (byte)19,  (byte)8,   (byte)28,
                                (byte)66,   (byte)-3,  (byte)3,    (byte)22,  (byte)13,  (byte)3,
                                (byte)91,   (byte)71,  (byte)21,   (byte)-27, (byte)-3,  (byte)-46,
                                (byte)-113, (byte)-41, (byte)87,   (byte)27,  (byte)123, (byte)83,
                                (byte)87,   (byte)87,  (byte)-121, (byte)95,  (byte)31,  (byte)91};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException21()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 17);
    final byte[] myByteArray = {(byte)-125, (byte)3,   (byte)74,   (byte)19,  (byte)8,   (byte)28,
                                (byte)67,   (byte)-11, (byte)11,   (byte)30,  (byte)5,   (byte)3,
                                (byte)87,   (byte)71,  (byte)21,   (byte)-27, (byte)-3,  (byte)-4,
                                (byte)-116, (byte)-41, (byte)87,   (byte)27,  (byte)123, (byte)83,
                                (byte)87,   (byte)87,  (byte)-121, (byte)95,  (byte)31,  (byte)91};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull17()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 14);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)1,  (byte)1, (byte)1,  (byte)64, (byte)64, (byte)1,
                                (byte)16, (byte)1, (byte)-4, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0, (byte)0,  (byte)0,  (byte)0,  (byte)1,
                                (byte)1,  (byte)1, (byte)1,  (byte)2,  (byte)0,  (byte)4,
                                (byte)1,  (byte)2, (byte)1,  (byte)1,  (byte)34, (byte)9};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException23()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)84, (byte)84, (byte)28, (byte)-4,   (byte)20, (byte)4,
                                (byte)21, (byte)21, (byte)20, (byte)17,   (byte)29, (byte)20,
                                (byte)21, (byte)17, (byte)21, (byte)-107, (byte)21};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException24()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)92, (byte)92, (byte)28, (byte)-2,  (byte)20, (byte)12,
                                (byte)29, (byte)29, (byte)20, (byte)17,  (byte)61, (byte)20,
                                (byte)21, (byte)25, (byte)21, (byte)-97, (byte)29};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException25()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)90, (byte)94, (byte)91, (byte)-3,  (byte)22, (byte)10,
                                (byte)27, (byte)27, (byte)22, (byte)19,  (byte)59, (byte)22,
                                (byte)19, (byte)19, (byte)23, (byte)-99, (byte)31};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException26()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)91, (byte)95, (byte)90, (byte)-4, (byte)22,
                                (byte)11, (byte)26, (byte)-4, (byte)0,  (byte)22,
                                (byte)10, (byte)26, (byte)18, (byte)18, (byte)22};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull14()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 504_988_601);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 24);
    final byte[] myByteArray = {(byte)86,  (byte)-38, (byte)1,   (byte)59, (byte)112, (byte)40,
                                (byte)80,  (byte)-56, (byte)0,   (byte)42, (byte)73,  (byte)-16,
                                (byte)81,  (byte)-16, (byte)83,  (byte)54, (byte)-55, (byte)105,
                                (byte)-68, (byte)42,  (byte)121, (byte)53, (byte)-12, (byte)-4,
                                (byte)-3,  (byte)0,   (byte)0,   (byte)0,  (byte)121};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException28()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException29()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)-4,  (byte)108, (byte)-32, (byte)92, (byte)110,
                                (byte)106, (byte)-42, (byte)102, (byte)-3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException30()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 30);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {(byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)-1,  (byte)111, (byte)-29, (byte)95, (byte)109,
                                (byte)105, (byte)-43, (byte)101, (byte)-2};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull13()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 6);
    final byte[] myByteArray = {(byte)16, (byte)114, (byte)1,   (byte)91, (byte)114, (byte)32,
                                (byte)-4, (byte)0,   (byte)0,   (byte)67, (byte)67,  (byte)121,
                                (byte)-2, (byte)-16, (byte)8,   (byte)54, (byte)3,   (byte)-34,
                                (byte)67, (byte)26,  (byte)121, (byte)53};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 21);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-1, (byte)-5, (byte)-1, (byte)-6, (byte)-1,
                                (byte)-3, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-2, (byte)-1, (byte)-6, (byte)-1, (byte)-34,
                                (byte)-1, (byte)-1, (byte)-6, (byte)-2, (byte)-37};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 21);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-4, (byte)-8, (byte)-4, (byte)-7, (byte)-4,
                                (byte)-2, (byte)-4, (byte)-4, (byte)-4, (byte)-67,
                                (byte)-2, (byte)-1, (byte)-8, (byte)-4, (byte)-35,
                                (byte)-1, (byte)-4, (byte)-6, (byte)-3, (byte)-37};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-3, (byte)-7, (byte)-3, (byte)-8,  (byte)-3,
                                (byte)-1, (byte)-3, (byte)-3, (byte)-3,  (byte)-67,
                                (byte)-2, (byte)-1, (byte)-7, (byte)-12, (byte)-36,
                                (byte)-1, (byte)-3, (byte)-5, (byte)-4,  (byte)-37};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 8);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-2,  (byte)95,  (byte)-49, (byte)-2,  (byte)99,
                                (byte)-10, (byte)67,  (byte)-2,  (byte)-69, (byte)6,
                                (byte)15,  (byte)10,  (byte)-2,  (byte)15,  (byte)-11,
                                (byte)55,  (byte)-21, (byte)94,  (byte)50};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 4);
    final byte[] myByteArray = {(byte)-4, (byte)-3, (byte)-4,  (byte)-4,
                                (byte)-4, (byte)-3, (byte)-33, (byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException30()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 6);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 5);
    final byte[] myByteArray = {(byte)-3, (byte)-3,  (byte)-3, (byte)-3, (byte)-20,
                                (byte)-3, (byte)-34, (byte)-3, (byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException29()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1,
                                (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-2, (byte)-1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException28()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-4,
                                (byte)-4, (byte)-4, (byte)-4, (byte)-4, (byte)-3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException27()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-3, (byte)-4};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException25()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)2,  (byte)2,  (byte)0,  (byte)2, (byte)67, (byte)2,
                                (byte)19, (byte)2,  (byte)-3, (byte)3, (byte)3,  (byte)3,
                                (byte)3,  (byte)65, (byte)2,  (byte)2, (byte)66, (byte)2,
                                (byte)2,  (byte)2,  (byte)2,  (byte)3, (byte)3,  (byte)2,
                                (byte)2,  (byte)1,  (byte)2,  (byte)2, (byte)33, (byte)11};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException24()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)3,  (byte)3,  (byte)3,  (byte)3, (byte)67, (byte)3,
                                (byte)18, (byte)3,  (byte)-4, (byte)2, (byte)2,  (byte)2,
                                (byte)2,  (byte)66, (byte)3,  (byte)3, (byte)67, (byte)3,
                                (byte)3,  (byte)3,  (byte)3,  (byte)2, (byte)2,  (byte)3,
                                (byte)3,  (byte)0,  (byte)3,  (byte)3, (byte)32, (byte)10};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 671_088_658);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {(byte)9, (byte)16, (byte)0, (byte)1,  (byte)4,  (byte)3,
                                (byte)0, (byte)2,  (byte)4, (byte)0,  (byte)20, (byte)16,
                                (byte)8, (byte)4,  (byte)0, (byte)64, (byte)32, (byte)-124,
                                (byte)1, (byte)65, (byte)4, (byte)-3, (byte)0,  (byte)0,
                                (byte)1, (byte)1,  (byte)1, (byte)5,  (byte)1,  (byte)33};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(65_536L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_744_699_448);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-102, (byte)80,   (byte)-111, (byte)-111, (byte)-104,
                                (byte)17,   (byte)18,   (byte)-4,   (byte)0,    (byte)16,
                                (byte)0,    (byte)120,  (byte)-128, (byte)18,   (byte)-127,
                                (byte)-128, (byte)0,    (byte)0,    (byte)-96,  (byte)-104,
                                (byte)-127, (byte)-128, (byte)-126, (byte)17,   (byte)-112,
                                (byte)-126, (byte)18,   (byte)-111, (byte)96,   (byte)-111};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(4096L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 58);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-102, (byte)80,   (byte)-111, (byte)-111, (byte)-104,
                                (byte)17,   (byte)18,   (byte)-3,   (byte)0,    (byte)16,
                                (byte)0,    (byte)121,  (byte)-128, (byte)18,   (byte)-128,
                                (byte)-127, (byte)0,    (byte)0,    (byte)-96,  (byte)-104,
                                (byte)-127, (byte)-128, (byte)-126, (byte)17,   (byte)-112,
                                (byte)-125, (byte)18,   (byte)-111, (byte)97,   (byte)-112};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(4096L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 788_529_152);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)0, (byte)0,  (byte)0, (byte)0,  (byte)0, (byte)0,
                                (byte)0, (byte)-2, (byte)0, (byte)87, (byte)0, (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)0,  (byte)1, (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)0,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(22_272L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException23()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)1,  (byte)1,  (byte)1,   (byte)1, (byte)65, (byte)1,
                                (byte)16, (byte)1,  (byte)-10, (byte)0, (byte)0,  (byte)0,
                                (byte)0,  (byte)64, (byte)1,   (byte)1, (byte)65, (byte)1,
                                (byte)1,  (byte)1,  (byte)1,   (byte)0, (byte)0,  (byte)1,
                                (byte)1,  (byte)0,  (byte)1,   (byte)1, (byte)32, (byte)8};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_841);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {
        (byte)3,  (byte)3,  (byte)66, (byte)3,  (byte)0,  (byte)1,  (byte)71, (byte)-7, (byte)1,
        (byte)86, (byte)9,  (byte)3,  (byte)67, (byte)67, (byte)3,  (byte)-7, (byte)82, (byte)84,
        (byte)1,  (byte)67, (byte)7,  (byte)11, (byte)67, (byte)-4, (byte)82, (byte)87, (byte)3};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(22_354L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 55);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 22);
    final byte[] myByteArray = {(byte)3,  (byte)3,  (byte)66, (byte)19, (byte)8,  (byte)9,
                                (byte)67, (byte)-3, (byte)1,  (byte)86, (byte)13, (byte)3,
                                (byte)67, (byte)71, (byte)5,  (byte)-3, (byte)86, (byte)80,
                                (byte)1,  (byte)67, (byte)7,  (byte)11, (byte)-3, (byte)-7,
                                (byte)87, (byte)87, (byte)71, (byte)79, (byte)15, (byte)75};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(5_724_153L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException22()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)1,  (byte)1,  (byte)1,  (byte)1, (byte)65, (byte)1,
                                (byte)16, (byte)1,  (byte)-2, (byte)0, (byte)0,  (byte)0,
                                (byte)0,  (byte)64, (byte)1,  (byte)1, (byte)65, (byte)1,
                                (byte)1,  (byte)1,  (byte)1,  (byte)0, (byte)0,  (byte)1,
                                (byte)1,  (byte)0,  (byte)1,  (byte)1, (byte)32, (byte)8};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero10() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-3, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero11() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 21);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-3, (byte)-7, (byte)-3, (byte)-8, (byte)-3,
                                (byte)-1, (byte)-3, (byte)-3, (byte)-3, (byte)-3,
                                (byte)-4, (byte)-3, (byte)-8, (byte)-3, (byte)-36,
                                (byte)-3, (byte)-3, (byte)-8, (byte)-4, (byte)-39};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 178);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 15);
    final byte[] myByteArray = {(byte)-4, (byte)-8, (byte)-3, (byte)-7, (byte)-4,
                                (byte)-3, (byte)-3, (byte)-3, (byte)-4, (byte)-68,
                                (byte)-3, (byte)-2, (byte)-8, (byte)-3, (byte)-3,
                                (byte)-3, (byte)-4, (byte)-6, (byte)-3, (byte)-38};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero4() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 178);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 15);
    final byte[] myByteArray = {(byte)-3, (byte)-7, (byte)-2, (byte)-5, (byte)-1,
                                (byte)-2, (byte)-2, (byte)-2, (byte)-4, (byte)-65,
                                (byte)-2, (byte)-3, (byte)-7, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-1, (byte)-7, (byte)-2, (byte)-38};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero5() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 671_088_658);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 21);
    final byte[] myByteArray = {(byte)9, (byte)16, (byte)0, (byte)1,  (byte)4,  (byte)3,
                                (byte)0, (byte)2,  (byte)4, (byte)0,  (byte)20, (byte)16,
                                (byte)8, (byte)4,  (byte)0, (byte)64, (byte)32, (byte)-124,
                                (byte)1, (byte)65, (byte)4, (byte)-4, (byte)0,  (byte)0,
                                (byte)1, (byte)1,  (byte)1, (byte)5,  (byte)1,  (byte)33};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException20()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 24);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 20);
    final byte[] myByteArray = {(byte)82,  (byte)-54, (byte)105,  (byte)59,  (byte)112,
                                (byte)40,  (byte)80,  (byte)-104, (byte)112, (byte)42,
                                (byte)73,  (byte)-32, (byte)55,   (byte)-16, (byte)83,
                                (byte)-73, (byte)-56, (byte)123,  (byte)-4,  (byte)42,
                                (byte)-2,  (byte)-74, (byte)0,    (byte)14,  (byte)67};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero7() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 13);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)85, (byte)71, (byte)76, (byte)-2, (byte)12,
                                (byte)19, (byte)20, (byte)-4, (byte)0,  (byte)0,
                                (byte)0,  (byte)4,  (byte)4,  (byte)4,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 6);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 5);
    final byte[] myByteArray = {(byte)-2, (byte)-2,  (byte)-2, (byte)-2, (byte)-17,
                                (byte)-2, (byte)-35, (byte)-2, (byte)-1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero9() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-4, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException000214ed708cbeac0f3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -7);
    Reflector.setField(in, "buf", null);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)0, (byte)32, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_638_399_999);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 469_762_048);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    final byte[] myByteArray = {(byte)1, (byte)0, (byte)3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 18);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {(byte)4, (byte)0,  (byte)0, (byte)32, (byte)64, (byte)68,
                                (byte)0, (byte)0,  (byte)0, (byte)0,  (byte)8,  (byte)8,
                                (byte)0, (byte)0,  (byte)0, (byte)64, (byte)0,  (byte)8,
                                (byte)0, (byte)72, (byte)8, (byte)1,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_153_264_093);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_717_417_311);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLong(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readLong(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -8);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 151_781_384);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)4,  (byte)0, (byte)0, (byte)32, (byte)64, (byte)68,
                                (byte)64, (byte)0, (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0,  (byte)0,  (byte)72,
                                (byte)0,  (byte)1, (byte)0, (byte)32, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLongInputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 8);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLong(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException0009f4811d3d1fe09cc()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB2(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_914_723_826);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -1_914_723_826);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB2(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 4);
    final byte[] myByteArray = {
        (byte)64,   (byte)17,  (byte)88,  (byte)112,  (byte)-112, (byte)80,  (byte)16,  (byte)-47,
        (byte)-47,  (byte)-63, (byte)73,  (byte)-47,  (byte)-47,  (byte)-47, (byte)-47, (byte)-47,
        (byte)-111, (byte)-47, (byte)64,  (byte)81,   (byte)-47,  (byte)40,  (byte)-15, (byte)-47,
        (byte)-112, (byte)-47, (byte)-47, (byte)-111, (byte)-47,  (byte)-47};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB2(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -896_925_695);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 638_910_576);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB2(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 16);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 15);
    final byte[] myByteArray = {
        (byte)0,  (byte)0, (byte)0, (byte)8, (byte)3,  (byte)0, (byte)17, (byte)0, (byte)1, (byte)3,
        (byte)65, (byte)0, (byte)0, (byte)0, (byte)1,  (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0,
        (byte)5,  (byte)0, (byte)0, (byte)1, (byte)17, (byte)9, (byte)0,  (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB2(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readDoubleInputNotNullOutputEOFException00031b37a2f1ce20642()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readDouble(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    final byte[] myByteArray = {(byte)8, (byte)0, (byte)0, (byte)0, (byte)0, (byte)8};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB2(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_147_483_624);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB2(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 29);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB2(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputPositive() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 100_663_299);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1);
    final byte[] myByteArray = {(byte)0, (byte)1, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(1, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputPositive2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 32_786);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 16);
    final byte[] myByteArray = {
        (byte)0,  (byte)0, (byte)0, (byte)8, (byte)3, (byte)0, (byte)17, (byte)0, (byte)1, (byte)3,
        (byte)65, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0,  (byte)8, (byte)0, (byte)0,
        (byte)0,  (byte)4, (byte)0, (byte)9, (byte)0, (byte)1, (byte)0,  (byte)8, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(2048, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -2);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)8};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 134_217_757);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
        (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB2InputNotNullOutputZero4() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB2(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException00006999983ef033434()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB3(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_744_830_463);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_946_157_056);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB3(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB3(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 439_353_344);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 905_969_664);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB3(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 16);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 15);
    final byte[] myByteArray = {
        (byte)9, (byte)0, (byte)8, (byte)8, (byte)8,  (byte)8, (byte)8, (byte)8, (byte)8, (byte)24,
        (byte)9, (byte)9, (byte)1, (byte)9, (byte)17, (byte)0, (byte)9, (byte)8, (byte)0, (byte)9,
        (byte)9, (byte)0, (byte)8, (byte)1, (byte)2,  (byte)1, (byte)8, (byte)0, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB3(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -538_476_542);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_144_575_489);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB3(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2);
    final byte[] myByteArray = {(byte)-118, (byte)-54, (byte)0,   (byte)-54, (byte)0, (byte)-127,
                                (byte)-56,  (byte)-56, (byte)-64, (byte)1,   (byte)0, (byte)0,
                                (byte)121,  (byte)-64, (byte)-53, (byte)11};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB3(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -173_338_624);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_072_002_562);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB3(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB3(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -3);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB3(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_346_437_122);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)1, (byte)1, (byte)0, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB3(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputZero3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 9);
    final byte[] myByteArray = {(byte)7,  (byte)10, (byte)1, (byte)3, (byte)11, (byte)3,
                                (byte)64, (byte)11, (byte)1, (byte)0, (byte)0,  (byte)0,
                                (byte)1,  (byte)2,  (byte)2, (byte)0, (byte)0,  (byte)0,
                                (byte)2,  (byte)3,  (byte)2, (byte)0, (byte)0,  (byte)2,
                                (byte)8,  (byte)17, (byte)2, (byte)2, (byte)2,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB3(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputZero4() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 14);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 11);
    final byte[] myByteArray = {(byte)66,  (byte)-54, (byte)1, (byte)11, (byte)-64,
                                (byte)65,  (byte)8,   (byte)8, (byte)0,  (byte)-63,
                                (byte)-64, (byte)0,   (byte)0, (byte)0,  (byte)-54};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB3(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB3InputNotNullOutputZero5() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 3);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0, StreamUtil.readUB3(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException000bef4450bf7d75660()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB4(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 826_932_994);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 826_932_992);
    Reflector.setField(in, "buf", null);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB4(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -88_673_023);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_826_028_799);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB4(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB4(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_433_567_209);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", -720_539_632);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB4(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 10);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 9);
    final byte[] myByteArray = {(byte)9, (byte)5,  (byte)9,    (byte)8, (byte)8,  (byte)9, (byte)8,
                                (byte)4, (byte)8,  (byte)0,    (byte)9, (byte)4,  (byte)8, (byte)0,
                                (byte)2, (byte)1,  (byte)8,    (byte)3, (byte)16, (byte)2, (byte)0,
                                (byte)0, (byte)10, (byte)-125, (byte)2, (byte)8,  (byte)0, (byte)6};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB4(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 67_092_533);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_744_830_464);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB4(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -557_208_711);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 546_879_296);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readUB4(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 23);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 22);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readUB4(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputPositive() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 57);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 25);
    final byte[] myByteArray = {(byte)9,  (byte)5, (byte)9, (byte)8, (byte)8,  (byte)9,
                                (byte)8,  (byte)4, (byte)8, (byte)0, (byte)9,  (byte)4,
                                (byte)8,  (byte)0, (byte)2, (byte)1, (byte)8,  (byte)3,
                                (byte)16, (byte)2, (byte)0, (byte)0, (byte)10, (byte)-125,
                                (byte)6,  (byte)0, (byte)8, (byte)0, (byte)8,  (byte)9};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(134_219_776L, StreamUtil.readUB4(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputPositive2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 68);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)2, (byte)0,  (byte)2,  (byte)2, (byte)0,
                                (byte)4, (byte)69, (byte)0,  (byte)4, (byte)5,
                                (byte)3, (byte)32, (byte)12, (byte)0, (byte)-128};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(33_685_506L, StreamUtil.readUB4(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 940_179_234);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 938_475_264);
    Reflector.setField(in, "buf", null);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readUB4(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readUB4InputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readUB4(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutput1() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 6);
    final byte[] myByteArray = {(byte)19, (byte)50,   (byte)1,   (byte)83, (byte)50, (byte)32,
                                (byte)1,  (byte)0,    (byte)0,   (byte)67, (byte)67, (byte)121,
                                (byte)-2, (byte)-16,  (byte)8,   (byte)54, (byte)3,  (byte)-34,
                                (byte)65, (byte)-118, (byte)121, (byte)53};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutput12() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 65_547);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)1, (byte)1,  (byte)1, (byte)1,  (byte)65,
                                (byte)1, (byte)16, (byte)1, (byte)0,  (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)64, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutput2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 17);
    final byte[] myByteArray = {
        (byte)-78,  (byte)-126, (byte)-78, (byte)26, (byte)-80,  (byte)-106, (byte)-114,
        (byte)-118, (byte)49,   (byte)108, (byte)0,  (byte)-46,  (byte)-127, (byte)-110,
        (byte)-120, (byte)-128, (byte)0,   (byte)2,  (byte)-110, (byte)-128, (byte)-111};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)-110, (byte)-128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutput22() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 14);
    final byte[] myByteArray = {(byte)50, (byte)18,   (byte)35,   (byte)27,   (byte)51,
                                (byte)6,  (byte)-115, (byte)-118, (byte)32,   (byte)-59,
                                (byte)16, (byte)82,   (byte)-111, (byte)-111, (byte)-3,
                                (byte)2,  (byte)0,    (byte)0,    (byte)18,   (byte)-128,
                                (byte)16, (byte)-109, (byte)-128, (byte)-110, (byte)83};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)18, (byte)-128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 6);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 5);
    final byte[] myByteArray = {(byte)4, (byte)5, (byte)5, (byte)5, (byte)5, (byte)4, (byte)5};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException10()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 8);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)126,  (byte)-33,  (byte)79,  (byte)126,  (byte)-29,
                                (byte)118,  (byte)67,   (byte)126, (byte)59,   (byte)-122,
                                (byte)-113, (byte)-118, (byte)126, (byte)-113, (byte)117,
                                (byte)55,   (byte)107,  (byte)-34, (byte)-78};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException11()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 15);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 9);
    final byte[] myByteArray = {(byte)32, (byte)2,  (byte)48,  (byte)8,  (byte)32,   (byte)4,
                                (byte)5,  (byte)16, (byte)-96, (byte)-4, (byte)12,   (byte)48,
                                (byte)0,  (byte)1,  (byte)0,   (byte)0,  (byte)0,    (byte)0,
                                (byte)32, (byte)1,  (byte)2,   (byte)16, (byte)8,    (byte)36,
                                (byte)0,  (byte)33, (byte)0,   (byte)40, (byte)-128, (byte)0};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException12()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 17);
    final byte[] myByteArray = {(byte)34, (byte)2,  (byte)33,  (byte)24, (byte)34, (byte)4,
                                (byte)4,  (byte)24, (byte)-96, (byte)-2, (byte)0,  (byte)0,
                                (byte)3,  (byte)0,  (byte)8,   (byte)2,  (byte)0,  (byte)-2,
                                (byte)0,  (byte)0,  (byte)3,   (byte)0,  (byte)8};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException19()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 24);
    final byte[] myByteArray = {(byte)22,  (byte)-126, (byte)1,    (byte)91,  (byte)50,
                                (byte)104, (byte)16,   (byte)-120, (byte)0,   (byte)66,
                                (byte)11,  (byte)-16,  (byte)1,    (byte)-80, (byte)1,
                                (byte)54,  (byte)-119, (byte)105,  (byte)-51, (byte)10,
                                (byte)121, (byte)53,   (byte)-12,  (byte)-4,  (byte)-3};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException14()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 21);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 19);
    final byte[] myByteArray = {
        (byte)-78,  (byte)16,  (byte)33,   (byte)91,   (byte)33,  (byte)-108, (byte)-97,
        (byte)8,    (byte)-78, (byte)69,   (byte)-112, (byte)-64, (byte)-6,   (byte)-128,
        (byte)-110, (byte)18,  (byte)-126, (byte)18,   (byte)2,   (byte)-4,   (byte)0,
        (byte)-128, (byte)-48, (byte)16,   (byte)-128, (byte)-30, (byte)-42};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException15()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 21);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 19);
    final byte[] myByteArray = {
        (byte)-78,  (byte)16,  (byte)33,   (byte)90,   (byte)33,  (byte)-108, (byte)-97,
        (byte)8,    (byte)-78, (byte)69,   (byte)-112, (byte)-64, (byte)-6,   (byte)-128,
        (byte)-110, (byte)18,  (byte)-126, (byte)18,   (byte)2,   (byte)-3,   (byte)0,
        (byte)-128, (byte)-48, (byte)16,   (byte)-128, (byte)-30, (byte)-42};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException18()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {(byte)22,  (byte)50,   (byte)1,   (byte)59, (byte)50,  (byte)72,
                                (byte)16,  (byte)-128, (byte)0,   (byte)67, (byte)3,   (byte)121,
                                (byte)41,  (byte)-80,  (byte)1,   (byte)54, (byte)9,   (byte)105,
                                (byte)77,  (byte)10,   (byte)121, (byte)53, (byte)-4,  (byte)-4,
                                (byte)-15, (byte)67,   (byte)67,  (byte)51, (byte)121, (byte)-16};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException17()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 25);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 22);
    final byte[] myByteArray = {(byte)6,   (byte)114, (byte)1,   (byte)123, (byte)34, (byte)0,
                                (byte)16,  (byte)-56, (byte)0,   (byte)67,  (byte)67, (byte)121,
                                (byte)1,   (byte)-16, (byte)8,   (byte)54,  (byte)9,  (byte)35,
                                (byte)65,  (byte)-54, (byte)121, (byte)53,  (byte)16, (byte)-56,
                                (byte)-15, (byte)67,  (byte)67,  (byte)121, (byte)1,  (byte)-16};
    Reflector.setField(in, "buf", myByteArray);
    try {

      // Act
      thrown.expect(EOFException.class);
      StreamUtil.readWithLength(in);
    } catch (EOFException ex) {

      // Assert side effects
      Assert.assertNotNull(in);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullOutputEOFException00149c6b619867af9c2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullOutputEOFException2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -2_147_483_647);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullOutputEOFException3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.read(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullOutputZero000d95e197c5671bc7d()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals((byte)0, StreamUtil.read(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputNotNullOutputZero2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 40);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals((byte)0, StreamUtil.read(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeDoubleInputNotNullZeroOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeDouble(out, 0.0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeDoubleInputNotNullZeroOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)9,   (byte)0, (byte)94,  (byte)123, (byte)119,
                                (byte)123, (byte)0, (byte)127, (byte)1};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeDouble(out, 0.0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException16()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -916_830_210);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 161_254_400);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeFloatInputNotNullZeroOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeFloat(out, 0.0f);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException26()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeFloatInputNotNullZeroOutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)20, (byte)-30, (byte)-1};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeFloat(out, 0.0f);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException21()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", -1_219_664_127);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_811_375_354);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException13()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 32_780);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException14()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 754_712_163);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 899_677_445);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException18()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 788_529_162);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 1_614_807_040);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)67};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 5);
    final byte[] myByteArray = {(byte)-5, (byte)-1,  (byte)-5, (byte)-5, (byte)-5,
                                (byte)-5, (byte)-39, (byte)-5, (byte)-6};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputEOFException6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 26_297);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 34_669);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readWithLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException22()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 262_144);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7_602_174);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException27()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 0);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 2_013_331_453);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 2_013_331_453);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputEOFException5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 103_479);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 103_991);
    Reflector.setField(in, "buf", null);

    // Act
    thrown.expect(EOFException.class);
    StreamUtil.readLength(in);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB3InputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB3(out, 6_356_992);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull2OutputVoid3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)12, (byte)-5, (byte)-70, (byte)35, (byte)34,
                                (byte)35, (byte)0,  (byte)0,   (byte)0,  (byte)0,
                                (byte)0,  (byte)0,  (byte)0,   (byte)0,  (byte)0,
                                (byte)2,  (byte)0,  (byte)0,   (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)-110, (byte)-125};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull2OutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)12, (byte)0, (byte)0, (byte)-48,
                                (byte)0,  (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)0, (byte)4};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull1OutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)16, (byte)16};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)16};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull0OutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)-3, (byte)-3};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull0OutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull4OutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 7);
    final byte[] myByteArray = {(byte)1, (byte)50, (byte)0, (byte)0, (byte)0, (byte)2, (byte)8};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull2OutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 12);
    final byte[] myByteArray = {(byte)11, (byte)1, (byte)-3, (byte)0,  (byte)0,
                                (byte)0,  (byte)0, (byte)3,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0, (byte)0,  (byte)-2, (byte)126};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)3, (byte)1};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull1OutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)-11, (byte)-3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)1};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull12OutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 13);
    final byte[] myByteArray = {(byte)64,   (byte)1,  (byte)-128, (byte)1, (byte)1,
                                (byte)21,   (byte)2,  (byte)1,    (byte)2, (byte)-126,
                                (byte)-127, (byte)15, (byte)-31};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)-31, (byte)12, (byte)-31, (byte)12, (byte)-19, (byte)-123,
                        (byte)13,  (byte)13, (byte)5,   (byte)13, (byte)69,  (byte)13};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull0OutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 29);
    final byte[] myByteArray = {(byte)-2, (byte)124, (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0,   (byte)0, (byte)96, (byte)32, (byte)0,
                                (byte)0,  (byte)0,   (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0,   (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0,  (byte)0,   (byte)0, (byte)0,  (byte)0,  (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithLengthInputNotNull0OutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)-97, (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {};

    // Act
    StreamUtil.writeWithLength(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB4InputNotNullPositiveOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 13);
    final byte[] myByteArray = {(byte)77, (byte)33, (byte)125,  (byte)45, (byte)0,
                                (byte)0,  (byte)45, (byte)18,   (byte)20, (byte)0,
                                (byte)-1, (byte)0,  (byte)-116, (byte)1,  (byte)81};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB4(out, 738_197_677L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB4InputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB4(out, 505_086_722L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB3InputNotNullPositiveOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB3(out, 132_353);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeWithNullInputNotNull2OutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 13);
    final byte[] myByteArray = {(byte)0, (byte)64, (byte)1, (byte)5, (byte)-1, (byte)0,
                                (byte)0, (byte)1,  (byte)0, (byte)0, (byte)0,  (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);
    final byte[] src = {(byte)0, (byte)64};

    // Act
    StreamUtil.writeWithNull(out, src);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB2InputNotNullPositiveOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)6, (byte)0, (byte)4, (byte)0, (byte)4, (byte)4,
                                (byte)0, (byte)5, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB2(out, 5);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeUB2InputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)-128, (byte)0, (byte)-128, (byte)1,
                                (byte)0,    (byte)0, (byte)0,    (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeUB2(out, 384);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLongInputNotNullZeroOutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLong(out, 0L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLongInputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)-33,  (byte)-11, (byte)-111, (byte)-43,  (byte)-107,
                                (byte)-75,  (byte)121, (byte)10,   (byte)-109, (byte)-127,
                                (byte)-124, (byte)1,   (byte)-97,  (byte)-116, (byte)-128};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLong(out, 725_559_330_054_172_932L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 15);
    final byte[] myByteArray = {(byte)-98, (byte)81, (byte)1, (byte)1,  (byte)1, (byte)0,
                                (byte)2,   (byte)1,  (byte)1, (byte)0,  (byte)1, (byte)1,
                                (byte)1,   (byte)-3, (byte)0, (byte)46, (byte)0, (byte)0,
                                (byte)0,   (byte)0,  (byte)0, (byte)0,  (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 2_147_483_712L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 13);
    final byte[] myByteArray = {(byte)-98, (byte)81, (byte)1, (byte)1, (byte)1, (byte)0, (byte)2,
                                (byte)1,   (byte)1,  (byte)0, (byte)1, (byte)1, (byte)1};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 12_582_912L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeIntInputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)14, (byte)8, (byte)10, (byte)15, (byte)10, (byte)-118,
                                (byte)12, (byte)0, (byte)0,  (byte)0,  (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeInt(out, 260_050_820);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeIntInputNotNullPositiveOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)56, (byte)-91, (byte)29, (byte)60, (byte)-92,
                                (byte)3,  (byte)2,   (byte)0,  (byte)0,  (byte)43,
                                (byte)34, (byte)20,  (byte)14, (byte)36, (byte)-65};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeInt(out, 402_760_996);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 7);
    final byte[] myByteArray = {(byte)-124, (byte)-65, (byte)16,  (byte)0,    (byte)0,  (byte)1,
                                (byte)0,    (byte)0,   (byte)0,   (byte)-128, (byte)0,  (byte)0,
                                (byte)0,    (byte)0,   (byte)0,   (byte)0,    (byte)-2, (byte)-1,
                                (byte)-2,   (byte)-1,  (byte)-20, (byte)-1,   (byte)-3};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 8_388_787L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid10()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 7);
    final byte[] myByteArray = {(byte)-98, (byte)81,   (byte)33, (byte)32, (byte)1,  (byte)0,
                                (byte)2,   (byte)0,    (byte)1,  (byte)0,  (byte)0,  (byte)1,
                                (byte)0,   (byte)0,    (byte)0,  (byte)0,  (byte)64, (byte)0,
                                (byte)0,   (byte)-128, (byte)0,  (byte)0,  (byte)0,  (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 252L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid11()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 251L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 4_210_240L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)-2, (byte)0, (byte)0, (byte)64, (byte)2, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0,  (byte)0, (byte)0,
                                (byte)0,  (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 14_914L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)-124, (byte)-2};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 251L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid3() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid4() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullZeroOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 7);
    final byte[] myByteArray = {(byte)-124, (byte)0,   (byte)0, (byte)0,
                                (byte)0,    (byte)-81, (byte)0, (byte)-2};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 0L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullNegativeOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 2);
    final byte[] myByteArray = {(byte)-2, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, -9_223_372_035_176_989_184L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid8()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 13);
    final byte[] myByteArray = {(byte)-98, (byte)81, (byte)1, (byte)1, (byte)1, (byte)0, (byte)2,
                                (byte)1,   (byte)1,  (byte)0, (byte)1, (byte)1, (byte)1};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 64L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullNegativeOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, -9_223_372_036_854_183_932L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 1L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullZeroOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 0L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullPositiveOutputVoid() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)1, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)1);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeLengthInputNotNullPositiveOutputVoid2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 1);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.writeLength(out, 1L);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullPositiveOutputVoid2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)1);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid0008d3de22994fbc3b4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 0);
    final byte[] myByteArray = {};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeInputNotNullZeroOutputVoid2() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayOutputStream out =
        (ByteArrayOutputStream)Reflector.getInstance("java.io.ByteArrayOutputStream");
    Reflector.setField(out, "count", 19);
    final byte[] myByteArray = {(byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
                                (byte)1, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    Reflector.setField(out, "buf", myByteArray);

    // Act
    StreamUtil.write(out, (byte)0);

    // Assert side effects
    Assert.assertNotNull(out);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull11()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 6);
    final byte[] myByteArray = {(byte)17,  (byte)114, (byte)1,   (byte)91,  (byte)113, (byte)32,
                                (byte)0,   (byte)0,   (byte)10,  (byte)67,  (byte)67,  (byte)121,
                                (byte)-2,  (byte)-16, (byte)8,   (byte)54,  (byte)3,   (byte)-34,
                                (byte)67,  (byte)8,   (byte)121, (byte)53,  (byte)64,  (byte)-56,
                                (byte)-13, (byte)-63, (byte)3,   (byte)-48, (byte)1,   (byte)67};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull10()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 12);
    final byte[] myByteArray = {
        (byte)50,   (byte)18,   (byte)51,  (byte)-117, (byte)51,  (byte)22,   (byte)-115,
        (byte)10,   (byte)32,   (byte)-59, (byte)0,    (byte)66,  (byte)-5,   (byte)2,
        (byte)-128, (byte)0,    (byte)18,  (byte)18,   (byte)0,   (byte)-109, (byte)16,
        (byte)-126, (byte)-126, (byte)18,  (byte)81,   (byte)-80, (byte)-124};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull12()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 6);
    final byte[] myByteArray = {(byte)17,  (byte)114, (byte)1,   (byte)91,  (byte)112, (byte)32,
                                (byte)-5,  (byte)1,   (byte)10,  (byte)67,  (byte)67,  (byte)121,
                                (byte)-2,  (byte)-16, (byte)8,   (byte)54,  (byte)3,   (byte)-34,
                                (byte)67,  (byte)8,   (byte)121, (byte)53,  (byte)64,  (byte)-56,
                                (byte)-13, (byte)-63, (byte)3,   (byte)-48, (byte)1,   (byte)67};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull15()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 65_547);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)1, (byte)1,  (byte)1, (byte)1,  (byte)65,
                                (byte)1, (byte)16, (byte)0, (byte)0,  (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)64, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull16()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 8);
    final byte[] myByteArray = {(byte)2,  (byte)2,  (byte)2,  (byte)2, (byte)67, (byte)2,
                                (byte)19, (byte)2,  (byte)-5, (byte)3, (byte)3,  (byte)3,
                                (byte)3,  (byte)65, (byte)2,  (byte)2, (byte)66, (byte)2,
                                (byte)2,  (byte)2,  (byte)2,  (byte)3, (byte)3,  (byte)2,
                                (byte)2,  (byte)1,  (byte)2,  (byte)2, (byte)33, (byte)11};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull9()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 20);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 17);
    final byte[] myByteArray = {
        (byte)-94,  (byte)-126, (byte)-94, (byte)10, (byte)-80,  (byte)-122, (byte)-98,
        (byte)-102, (byte)33,   (byte)124, (byte)16, (byte)-46,  (byte)-111, (byte)-126,
        (byte)-104, (byte)-112, (byte)16,  (byte)0,  (byte)-110, (byte)-128, (byte)-111};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull18()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 31);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull19()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 31);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 28);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 5);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 4);
    final byte[] myByteArray = {(byte)-5, (byte)-1, (byte)-5,  (byte)-5,
                                (byte)-5, (byte)-7, (byte)-39, (byte)-5};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 8);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)0,   (byte)-95, (byte)19,  (byte)60,  (byte)-99,
                                (byte)44,  (byte)61,  (byte)0,   (byte)69,  (byte)-6,
                                (byte)-23, (byte)-36, (byte)64,  (byte)-71, (byte)9,
                                (byte)41,  (byte)77,  (byte)-46, (byte)-10};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readWithLengthInputNotNullOutputNotNull4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 9);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 7);
    final byte[] myByteArray = {(byte)-5, (byte)122,  (byte)-54, (byte)-9,  (byte)102,
                                (byte)-9, (byte)-121, (byte)-5,  (byte)-66, (byte)-14,
                                (byte)10, (byte)-113, (byte)-6,  (byte)11,  (byte)-48,
                                (byte)50, (byte)108,  (byte)123, (byte)52};
    Reflector.setField(in, "buf", myByteArray);

    // Act
    final byte[] actual = StreamUtil.readWithLength(in);

    // Assert side effects
    Assert.assertNotNull(in);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 134_217_731);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-5, (byte)-38};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative6()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)92, (byte)92, (byte)93, (byte)-5,  (byte)20, (byte)12,
                                (byte)29, (byte)29, (byte)20, (byte)17,  (byte)61, (byte)20,
                                (byte)21, (byte)25, (byte)21, (byte)-97, (byte)29};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative4()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)2,  (byte)64, (byte)1, (byte)1,  (byte)9,  (byte)1,
                                (byte)2,  (byte)9,  (byte)1, (byte)16, (byte)8,  (byte)0,
                                (byte)0,  (byte)2,  (byte)1, (byte)1,  (byte)1,  (byte)0,
                                (byte)-5, (byte)0,  (byte)0, (byte)0,  (byte)16, (byte)1,
                                (byte)0,  (byte)2,  (byte)1, (byte)1,  (byte)64};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative3()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_855);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1, (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)16, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)8, (byte)0, (byte)0,  (byte)-5};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 31);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {(byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6,
                                (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-6, (byte)-5};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 134_217_731);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)-2, (byte)-6, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-2, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-6, (byte)-2, (byte)-2,
                                (byte)-2, (byte)-2, (byte)-6, (byte)-1, (byte)-38};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(255L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive10()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 4);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 3);
    final byte[] myByteArray = {(byte)84, (byte)84, (byte)28, (byte)-12,  (byte)20, (byte)4,
                                (byte)21, (byte)21, (byte)20, (byte)17,   (byte)29, (byte)20,
                                (byte)21, (byte)17, (byte)21, (byte)-107, (byte)21};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(244L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero8() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 30);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1,
        (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive2()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_855);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 29);
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)1, (byte)4,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)16, (byte)16,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0, (byte)0,  (byte)0,
                                (byte)4, (byte)0, (byte)8, (byte)0, (byte)4,  (byte)-1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(255L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputPositive7()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 40);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 15);
    final byte[] myByteArray = {(byte)0, (byte)0,  (byte)0, (byte)0,  (byte)0,  (byte)0,
                                (byte)0, (byte)-8, (byte)0, (byte)86, (byte)0,  (byte)0,
                                (byte)0, (byte)0,  (byte)0, (byte)16, (byte)16, (byte)87,
                                (byte)0, (byte)0,  (byte)0, (byte)0,  (byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(16L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)-5};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 0);
    final byte[] myByteArray = {(byte)0};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputZero6() throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 19);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 18);
    final byte[] myByteArray = {(byte)10, (byte)64, (byte)1,    (byte)1,    (byte)8,    (byte)1,
                                (byte)2,  (byte)1,  (byte)1,    (byte)16,   (byte)9,    (byte)-128,
                                (byte)0,  (byte)2,  (byte)-127, (byte)-127, (byte)-119, (byte)-128,
                                (byte)0,  (byte)0,  (byte)0,    (byte)0,    (byte)-104, (byte)1,
                                (byte)0,  (byte)2,  (byte)1,    (byte)1,    (byte)64};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(0L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthInputNotNullOutputNegative5()
      throws IOException, InvocationTargetException {

    // Arrange
    final ByteArrayInputStream in =
        (ByteArrayInputStream)Reflector.getInstance("java.io.ByteArrayInputStream");
    Reflector.setField(in, "count", 1_073_741_841);
    Reflector.setField(in, "mark", 0);
    Reflector.setField(in, "pos", 23);
    final byte[] myByteArray = {
        (byte)1,  (byte)1,  (byte)64, (byte)1,  (byte)0,  (byte)1,  (byte)65, (byte)-7, (byte)1,
        (byte)86, (byte)9,  (byte)1,  (byte)65, (byte)65, (byte)1,  (byte)-5, (byte)80, (byte)86,
        (byte)1,  (byte)65, (byte)1,  (byte)9,  (byte)65, (byte)-5, (byte)80, (byte)87, (byte)1};
    Reflector.setField(in, "buf", myByteArray);

    // Act and Assert result
    Assert.assertEquals(-1L, StreamUtil.readLength(in));

    // Assert side effects
    Assert.assertNotNull(in);
  }
}
