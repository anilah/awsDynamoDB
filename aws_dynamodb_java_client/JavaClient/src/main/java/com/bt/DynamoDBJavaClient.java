package com.bt;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.document.Item;
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
	        	 Item item = new Item()
	                .withPrimaryKey("employeeId", "118").withString("emp_name", "ak")	
	            	.withString("emp_age", "30");
	        	 table.putItem(item);
	        	 
	        	  item = new Item()
	                .withPrimaryKey("employeeId", "119").withString("emp_name", "john")	
	            	.withString("emp_age", "31");
	        	 table.putItem(item);
	        	
	        } catch (Exception e) {
	            System.err.println("Program failed:");
	            System.err.println(e.getMessage());
	        }
	        System.out.println("Success.");
	    }
}