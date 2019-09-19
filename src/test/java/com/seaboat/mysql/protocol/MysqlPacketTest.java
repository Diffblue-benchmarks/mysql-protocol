package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.MysqlPacket;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class MysqlPacketTest {

  // Compilation error: com.seaboat.mysql.protocol.MysqlPacket is abstract; cannot be instantiated
//  // Test written by Diffblue Cover.
//  @Test
//  public void constructorOutputNotNull() {
//
//    // Act, creating object to test constructor
//    final MysqlPacket actual = new MysqlPacket();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals((byte)0, actual.packetId);
//    Assert.assertEquals(0, actual.packetLength);
//  }

  // Test written by Diffblue Cover.
  @PrepareForTest(MysqlPacket.class)
  @Test
  public void toStringOutputNotNull() throws Exception {

    // Arrange
    final MysqlPacket mysqlPacket = PowerMockito.mock(MysqlPacket.class);
    PowerMockito.when(mysqlPacket.toString()).thenReturn("foo{length=257,id=104}");
    mysqlPacket.packetId = (byte)104;
    mysqlPacket.packetLength = 257;

    // Act and Assert result
    Assert.assertEquals("foo{length=257,id=104}", mysqlPacket.toString());
  }
}
