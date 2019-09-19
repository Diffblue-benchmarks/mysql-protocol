package com.seaboat.mysql.protocol.constant;

import com.diffblue.deeptestutils.Reflector;
import com.seaboat.mysql.protocol.constant.ServerStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class ServerStatusTest {

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ServerStatus actual = new ServerStatus();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.seaboat.mysql.protocol.constant.ServerStatus");

    // The method returns void, testing that no exception is thrown
  }
}
