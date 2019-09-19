package com.seaboat.mysql.protocol.constant;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.constant.ErrorCode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class ErrorCodeTest {

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.seaboat.mysql.protocol.constant.ErrorCode");

    // Assert side effects
    Assert.assertArrayEquals(
        new ErrorCode[] {ErrorCode.ER_HASHCHK, ErrorCode.ER_NISAMCHK, ErrorCode.ER_NO,
                         ErrorCode.ER_YES, ErrorCode.ER_CANT_CREATE_FILE,
                         ErrorCode.ER_CANT_CREATE_DB, ErrorCode.ER_ACCESS_DENIED_ERROR,
                         ErrorCode.ER_BAD_DB_ERROR, ErrorCode.ER_UNKNOWN_CHARACTER_SET,
                         ErrorCode.ER_NOT_ALLOWED_COMMAND, ErrorCode.ER_ERROR_DURING_COMMIT},
        ((ErrorCode[])Reflector.getInstanceField(ErrorCode.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    ErrorCode.valueOf("foo");

    // The method is not expected to return due to exception thrown
  }
}
