import { Stack, StackProps} from 'aws-cdk-lib';
import {aws_dynamodb }  from 'aws-cdk-lib';
import { Construct } from 'constructs';
// import * as sqs from 'aws-cdk-lib/aws-sqs';

export class AwsCdkCreateDynamodbTableStack extends Stack {
  constructor(scope: Construct, id: string, props?: StackProps) {
    super(scope, id, props);

    const table = new aws_dynamodb.Table(this, 'Table', {
      tableName: 'employeeDetails',
      //partition key having type as string
      partitionKey: { name: 'employeeId', type: aws_dynamodb.AttributeType.STRING },
      //table class default mode, and is recommended for the vast majority of workloads.
      tableClass: aws_dynamodb.TableClass.STANDARD,
      // on-demand pricing and scaling. You only pay for what you use there is no read and write capacity for the table or its global secondary indexes
      billingMode: aws_dynamodb.BillingMode.PAY_PER_REQUEST, 
      //encryption: aws_dynamodb.TableEncryption.CUSTOMER_MANAGED,
      
    });

  }
}
