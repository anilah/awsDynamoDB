package com.bt;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class DynamoDBJavaClient {
	static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
	    	.withRegion(Regions.AP_SOUTHEAST_2).build();
	static DynamoDB dynamoDB = new DynamoDB(client);
	static String tableName = "employeeDetails";
	
	    public static void main(String[] args) throws Exception {
	 	    	 Table table = dynamoDB.getTable(tableName);
	        try {
	        
	        	 InsertRecords.InsertDataIntoDynamoDBTable(table);
	        	 GetRecords.getDataFromDynamoDBTable(table);
	        	 UpdateRecords.UpdateDataIntoDynamoDBTable(table);
	        	 DeleteRecords.DeleteDataIntoDynamoDBTable(table);
	        	 
		 
	        } catch (Exception e) {
	            System.err.println("Program failed:"+e.getMessage());
	        }
	        System.out.println("Success.");
	    }
}