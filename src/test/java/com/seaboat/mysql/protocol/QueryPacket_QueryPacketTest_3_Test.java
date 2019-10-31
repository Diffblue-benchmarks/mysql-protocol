package com.seaboat.mysql.protocol;

import com.seaboat.mysql.protocol.QueryPacket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QueryPacket_QueryPacketTest_3_Test {
  @Test
  public void QueryPacketTest() throws Exception {
    // Arrange and Act
    QueryPacket queryPacket = new QueryPacket();

    // Assert
    String toStringResult = queryPacket.toString();
    Assert.assertEquals("MySQL Query Packet{length=0,id=0}", toStringResult);
    Assert.assertEquals((byte) 0, queryPacket.flag);
    Assert.assertEquals(null, queryPacket.message);
    Assert.assertEquals("MySQL Query Packet", queryPacket.getPacketInfo());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
