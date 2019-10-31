package com.seaboat.mysql.protocol.constant;

import com.seaboat.mysql.protocol.constant.ServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerStatus_ServerStatusTest_1_Test {
  @Test
  public void ServerStatusTest() throws Exception {
    // Arrange and Act
    ServerStatus serverStatus = new ServerStatus();

    // Assert
    Assert.assertNotNull(serverStatus.toString());
    Assert.assertEquals(64, ServerStatus.SERVER_STATUS_CURSOR_EXISTS);
    Assert.assertEquals(256, ServerStatus.SERVER_STATUS_DB_DROPPED);
    Assert.assertEquals(16384, ServerStatus.SERVER_SESSION_STATE_CHANGED);
    Assert.assertEquals(1024, ServerStatus.SERVER_STATUS_METADATA_CHANGED);
    Assert.assertEquals(2, ServerStatus.SERVER_STATUS_AUTOCOMMIT);
    Assert.assertEquals(4096, ServerStatus.SERVER_PS_OUT_PARAMS);
    Assert.assertEquals(8, ServerStatus.SERVER_MORE_RESULTS_EXISTS);
    Assert.assertEquals(8192, ServerStatus.SERVER_STATUS_IN_TRANS_READONLY);
    Assert.assertEquals(16, ServerStatus.SERVER_STATUS_NO_GOOD_INDEX_USED);
    Assert.assertEquals(1, ServerStatus.SERVER_STATUS_IN_TRANS);
    Assert.assertEquals(2048, ServerStatus.SERVER_QUERY_WAS_SLOW);
    Assert.assertEquals(32, ServerStatus.SERVER_STATUS_NO_INDEX_USED);
    Assert.assertEquals(128, ServerStatus.SERVER_STATUS_LAST_ROW_SENT);
    Assert.assertEquals(512, ServerStatus.SERVER_STATUS_NO_BACKSLASH_ESCAPES);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
