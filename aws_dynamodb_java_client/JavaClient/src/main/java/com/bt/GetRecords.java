package com.bt;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

public class GetRecords {
	public static void getDataFromDynamoDBTable(Table table){

		Item item = table.getItem("employeeId", "118");
		System.out.println("Printing item after retrieving it....");
		System.out.println(item.toJSONPretty());

		Item item2 = table.getItem("employeeId", "119");
		System.out.println("Printing item after retrieving it....");
		System.out.println(item2.toJSONPretty());


	}
}
