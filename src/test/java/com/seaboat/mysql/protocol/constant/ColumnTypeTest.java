package com.seaboat.mysql.protocol.constant;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.constant.ColumnType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class ColumnTypeTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ColumnType actual = new ColumnType();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.seaboat.mysql.protocol.constant.ColumnType");

    // The method returns void, testing that no exception is thrown
  }
}
