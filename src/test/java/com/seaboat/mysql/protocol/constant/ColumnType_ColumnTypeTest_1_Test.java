package com.seaboat.mysql.protocol.constant;

import com.seaboat.mysql.protocol.constant.ColumnType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ColumnType_ColumnTypeTest_1_Test {
  @Test
  public void ColumnTypeTest() throws Exception {
    // Arrange and Act
    ColumnType columnType = new ColumnType();

    // Assert
    Assert.assertNotNull(columnType.toString());
    Assert.assertEquals(254, ColumnType.FIELD_TYPE_STRING);
    Assert.assertEquals(12, ColumnType.FIELD_TYPE_DATETIME);
    Assert.assertEquals(8, ColumnType.FIELD_TYPE_LONGLONG);
    Assert.assertEquals(7, ColumnType.FIELD_TYPE_TIMESTAMP);
    Assert.assertEquals(15, ColumnType.FIELD_TYPE_VARCHAR);
    Assert.assertEquals(4, ColumnType.FIELD_TYPE_FLOAT);
    Assert.assertEquals(3, ColumnType.FIELD_TYPE_LONG);
    Assert.assertEquals(13, ColumnType.FIELD_TYPE_YEAR);
    Assert.assertEquals(250, ColumnType.FIELD_TYPE_MEDIUM_BLOB);
    Assert.assertEquals(249, ColumnType.FIELD_TYPE_TINY_BLOB);
    Assert.assertEquals(10, ColumnType.FIELD_TYPE_DATE);
    Assert.assertEquals(0, ColumnType.FIELD_TYPE_DECIMAL);
    Assert.assertEquals(16, ColumnType.FIELD_TYPE_BIT);
    Assert.assertEquals(251, ColumnType.FIELD_TYPE_LONG_BLOB);
    Assert.assertEquals(5, ColumnType.FIELD_TYPE_DOUBLE);
    Assert.assertEquals(14, ColumnType.FIELD_TYPE_NEWDATE);
    Assert.assertEquals(252, ColumnType.FIELD_TYPE_BLOB);
    Assert.assertEquals(253, ColumnType.FIELD_TYPE_VAR_STRING);
    Assert.assertEquals(255, ColumnType.FIELD_TYPE_GEOMETRY);
    Assert.assertEquals(6, ColumnType.FIELD_TYPE_NULL);
    Assert.assertEquals(248, ColumnType.FIELD_TYPE_SET);
    Assert.assertEquals(1, ColumnType.FIELD_TYPE_TINY);
    Assert.assertEquals(11, ColumnType.FIELD_TYPE_TIME);
    Assert.assertEquals(247, ColumnType.FIELD_TYPE_ENUM);
    Assert.assertEquals(9, ColumnType.FIELD_TYPE_INT24);
    Assert.assertEquals(246, ColumnType.FIELD_TYPE_NEW_DECIMAL);
    Assert.assertEquals(2, ColumnType.FIELD_TYPE_SHORT);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
