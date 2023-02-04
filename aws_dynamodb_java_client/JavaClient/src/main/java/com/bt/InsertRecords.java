package com.bt;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

public class InsertRecords {
	public static void InsertDataIntoDynamoDBTable(Table table){
		Item item = new Item()
				.withPrimaryKey("employeeId", "118").withString("emp_name", "pk")	
				.withString("emp_age", "30");
		table.putItem(item);

		item = new Item()
				.withPrimaryKey("employeeId", "119").withString("emp_name", "john")	
				.withString("emp_age", "31");
		table.putItem(item);

		item = new Item()
				.withPrimaryKey("employeeId", "120").withString("emp_name", "james")	
				.withString("emp_age", "33");
		table.putItem(item);
	}
}
