package com.bt;
import java.util.ArrayList;
import java.util.List;
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;

public class UpdateRecords {
	public static void UpdateDataIntoDynamoDBTable(Table table){

		AttributeUpdate update1= new AttributeUpdate("emp_name").put("pk_updated");

		// adding new attribute to existing item
		AttributeUpdate update2= new AttributeUpdate("newAttr").put("222");
		List<AttributeUpdate> attrlist=new ArrayList<AttributeUpdate>();

		attrlist.add(update1);
		attrlist.add(update2);

		UpdateItemSpec updateItemSpec = new UpdateItemSpec().withPrimaryKey("employeeId", "118").withAttributeUpdate(attrlist)
				.withReturnValues(ReturnValue.ALL_NEW);
		UpdateItemOutcome outcome = table.updateItem(updateItemSpec);

		// Check the response.
		System.out.println("Printing item after updating new attribute...");
		System.out.println(outcome.getItem().toJSONPretty());
	}
}
