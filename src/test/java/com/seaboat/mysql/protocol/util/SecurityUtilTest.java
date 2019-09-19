package com.seaboat.mysql.protocol.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.seaboat.mysql.protocol.util.SecurityUtil;
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
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RunWith(PowerMockRunner.class)
public class SecurityUtilTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final SecurityUtil actual = new SecurityUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({SecurityUtil.class, MessageDigest.class})
//  @Test
//  public void scramble411Input00Output1() throws Exception, NoSuchAlgorithmException {
//
//    // Setup mocks
//    PowerMockito.mockStatic(MessageDigest.class);
//
//    // Arrange
//    final byte[] pass = {};
//    final byte[] seed = {};
//    final MessageDigest messageDigest = PowerMockito.mock(MessageDigest.class);
//    final byte[] myByteArray2 = {(byte)0};
//    final byte[] myByteArray1 = {};
//    final byte[] myByteArray = {(byte)0};
//    final Method digestMethod =
//        DTUMemberMatcher.method(MessageDigest.class, "digest", byte[].class);
//    ((PowerMockitoStubber)PowerMockito.doReturn(myByteArray)
//         .doReturn(myByteArray1)
//         .doReturn(myByteArray2))
//        .when(messageDigest, digestMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final Method getInstanceMethod =
//        DTUMemberMatcher.method(MessageDigest.class, "getInstance", String.class);
//    PowerMockito.doReturn(messageDigest)
//        .when(MessageDigest.class, getInstanceMethod)
//        .withArguments(or(isA(String.class), isNull(String.class)));
//
//    // Act
//    final byte[] actual = SecurityUtil.scramble411(pass, seed);
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {(byte)0}, actual);
//  }

  // Runtime error: NullPointerException
//  // Test written by Diffblue Cover.
//  @PrepareForTest({SecurityUtil.class, MessageDigest.class})
//  @Test
//  public void scramble411Input00Output000046033d0ad787c0f2()
//      throws Exception, NoSuchAlgorithmException {
//
//    // Setup mocks
//    PowerMockito.mockStatic(MessageDigest.class);
//
//    // Arrange
//    final byte[] pass = {};
//    final byte[] seed = {};
//    final MessageDigest messageDigest = PowerMockito.mock(MessageDigest.class);
//    final byte[] myByteArray2 = {};
//    final byte[] myByteArray1 = {};
//    final byte[] myByteArray = {};
//    final Method digestMethod =
//        DTUMemberMatcher.method(MessageDigest.class, "digest", byte[].class);
//    ((PowerMockitoStubber)PowerMockito.doReturn(myByteArray)
//         .doReturn(myByteArray1)
//         .doReturn(myByteArray2))
//        .when(messageDigest, digestMethod)
//        .withArguments(or(isA(byte[].class), isNull(byte[].class)));
//    final Method getInstanceMethod =
//        DTUMemberMatcher.method(MessageDigest.class, "getInstance", String.class);
//    PowerMockito.doReturn(messageDigest)
//        .when(MessageDigest.class, getInstanceMethod)
//        .withArguments(or(isA(String.class), isNull(String.class)));
//
//    // Act
//    final byte[] actual = SecurityUtil.scramble411(pass, seed);
//
//    // Assert result
//    Assert.assertArrayEquals(new byte[] {}, actual);
//  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNotNullOutputNotNull9() {

    // Act and Assert result
    Assert.assertEquals("", SecurityUtil.scramble323(" ", ""));
  }

  // Test written by Diffblue Cover.

  @Test
  public void scramble323InputNotNullNotNullOutputNotNull3() {

    // Arrange
    final String pass = "\u000b\u00f1 ";
    final String seed = "\u00cd\u00d8+";

    // Act
    final String actual = SecurityUtil.scramble323(pass, seed);

    // Assert result
    Assert.assertEquals("C@Z", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNotNullOutputNotNull5() {

    // Act and Assert result
    Assert.assertEquals("", SecurityUtil.scramble323("", "\u00c7Z*\u00c3\u00ef"));
  }

  // Test written by Diffblue Cover.

  @Test
  public void scramble323InputNotNullNotNullOutputNotNull6() {

    // Arrange
    final String pass = "\u00fb\u00f4\"lP\u00c2\u0090";
    final String seed = "\u00f6";

    // Act
    final String actual = SecurityUtil.scramble323(pass, seed);

    // Assert result
    Assert.assertEquals("X", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("@@@", SecurityUtil.scramble323("foo", "foo"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNotNullOutputNotNull8() {

    // Act and Assert result
    Assert.assertEquals("", SecurityUtil.scramble323("\t", ""));
  }

  // Test written by Diffblue Cover.

  @Test
  public void scramble323InputNotNullNotNullOutputNotNull4() {

    // Arrange
    final String pass = "f\u00fb\u00ad";
    final String seed = "\t\u00840";

    // Act
    final String actual = SecurityUtil.scramble323(pass, seed);

    // Assert result
    Assert.assertEquals("MDN", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("", SecurityUtil.scramble323("", null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNotNullNullOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("", SecurityUtil.scramble323("", null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void scramble323InputNullNullOutputNull000ebd0e9639be0db52() {

    // Act and Assert result
    Assert.assertNull(SecurityUtil.scramble323(null, null));
  }

  // Test written by Diffblue Cover.

  @Test
  public void scramble323InputNotNullNotNullOutputNotNull2() {

    // Arrange
    final String pass = "\u0010[\u00ec";
    final String seed = "\u00bd\u00af\u00fd";

    // Act
    final String actual = SecurityUtil.scramble323(pass, seed);

    // Assert result
    Assert.assertEquals("^QQ", actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void scramble323InputNotNullNotNullOutputNotNull7() {

    // Arrange
    final String pass = "\u00fe^\u001d\u0001\t";
    final String seed = "\u00fd\u00e5\u00da\u0087\u00c4\u00f52";

    // Act
    final String actual = SecurityUtil.scramble323(pass, seed);

    // Assert result
    Assert.assertEquals("IOPK\\[H", actual);
  }
}
