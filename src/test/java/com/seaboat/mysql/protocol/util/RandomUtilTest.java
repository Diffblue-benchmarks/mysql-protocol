package com.seaboat.mysql.protocol.util;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.util.RandomUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class RandomUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final RandomUtil actual = new RandomUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({RandomUtil.class, System.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    PowerMockito.when(System.nanoTime()).thenReturn(1_515_585_600_000_000L);

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance("com.seaboat.mysql.protocol.util.RandomUtil");

    // Assert side effects
    Assert.assertEquals(65_034_295_298_945L,
                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @Test
//  public void randomBytesInputPositiveOutput1000793f033baa37e72b() {
//
//    // Setup
//    final long seedTemp = (long)Reflector.getInstanceField(RandomUtil.class, null, "seed");
//
//    // Act
//    final byte[] actual = RandomUtil.randomBytes(1);
//
//    // Assert side effects
//    Assert.assertEquals(83_677_532_136_476L,
//                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {(byte)116}, actual);
//
//    // Teardown
//    Reflector.setStaticField(RandomUtil.class, "seed", seedTemp);
//  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @Test
//  public void randomBytesInputPositiveOutput1001793f033baa37e72b() {
//
//    // Setup
//    final long seedTemp = (long)Reflector.getInstanceField(RandomUtil.class, null, "seed");
//
//    // Act
//    final byte[] actual = RandomUtil.randomBytes(1);
//
//    // Assert side effects
//    Assert.assertEquals(83_677_532_136_476L,
//                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {(byte)116}, actual);
//
//    // Teardown
//    Reflector.setStaticField(RandomUtil.class, "seed", seedTemp);
//  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @Test
//  public void randomBytesInputPositiveOutput15000976a616369439684() {
//
//    // Setup
//    final long seedTemp = (long)Reflector.getInstanceField(RandomUtil.class, null, "seed");
//
//    // Act
//    final byte[] actual = RandomUtil.randomBytes(15);
//
//    // Assert side effects
//    Assert.assertEquals(147_973_941_282L,
//                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {(byte)116, (byte)103, (byte)109, (byte)67, (byte)75,
//                                         (byte)118, (byte)50, (byte)122, (byte)103, (byte)121,
//                                         (byte)88, (byte)77, (byte)57, (byte)115, (byte)73},
//                             actual);
//
//    // Teardown
//    Reflector.setStaticField(RandomUtil.class, "seed", seedTemp);
//  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @Test
//  public void randomBytesInputPositiveOutput2() {
//
//    // Setup
//    final long seedTemp = (long)Reflector.getInstanceField(RandomUtil.class, null, "seed");
//
//    // Act
//    final byte[] actual = RandomUtil.randomBytes(2);
//
//    // Assert side effects
//    Assert.assertEquals(74_037_826_193_399L,
//                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {(byte)116, (byte)103}, actual);
//
//    // Teardown
//    Reflector.setStaticField(RandomUtil.class, "seed", seedTemp);
//  }

  // Runtime error
//  // Test written by Diffblue Cover.
//  @Test
//  public void randomBytesInputPositiveOutput7() {
//
//    // Setup
//    final long seedTemp = (long)Reflector.getInstanceField(RandomUtil.class, null, "seed");
//
//    // Act
//    final byte[] actual = RandomUtil.randomBytes(7);
//
//    // Assert side effects
//    Assert.assertEquals(243_765_667_793_050L,
//                        Reflector.getInstanceField(RandomUtil.class, null, "seed"));
//
//    // Assert result
//    Assert.assertArrayEquals(
//        new byte[] {(byte)116, (byte)103, (byte)109, (byte)67, (byte)75, (byte)118, (byte)50},
//        actual);
//
//    // Teardown
//    Reflector.setStaticField(RandomUtil.class, "seed", seedTemp);
//  }

  // Test written by Diffblue Cover.
  @Test
  public void randomBytesInputZeroOutput00006664b1ad99b81c90() {

    // Act
    final byte[] actual = RandomUtil.randomBytes(0);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void randomBytesInputZeroOutputNotNull() {

    // Act
    final byte[] actual = RandomUtil.randomBytes(0);

    // Assert result
    Assert.assertNotNull(actual);
  }
}
