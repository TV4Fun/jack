
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1;

import com.rapleaf.jack.DatabaseConnection;
import com.rapleaf.jack.queries.GenericQuery;
import com.rapleaf.jack.queries.Table;

public class Database1Query extends GenericQuery {
  private Database1Query(Table table) {
    super(new DatabaseConnection("database1"), table);
  }

  public static GenericQuery from(Table table) {
    return new Database1Query(table);
  }
}