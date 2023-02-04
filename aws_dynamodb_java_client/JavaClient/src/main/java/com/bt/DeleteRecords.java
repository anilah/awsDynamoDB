package com.bt;
import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
public class DeleteRecords {

	public static void DeleteDataIntoDynamoDBTable(Table table){

		DeleteItemSpec deleteItemSpec = new DeleteItemSpec().withPrimaryKey("employeeId", "120").withReturnValues(ReturnValue.ALL_OLD);
		DeleteItemOutcome outcome = table.deleteItem(deleteItemSpec);

		// Check the response.
		System.out.println("Printing item that was deleted...");
		System.out.println(outcome.getItem().toJSONPretty());

	}
}
