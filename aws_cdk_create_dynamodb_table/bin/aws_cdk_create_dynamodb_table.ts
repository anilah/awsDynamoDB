#!/usr/bin/env node
import 'source-map-support/register';
import * as cdk from 'aws-cdk-lib';
import { AwsCdkCreateDynamodbTableStack } from '../lib/aws_cdk_create_dynamodb_table-stack';

const app = new cdk.App();
new AwsCdkCreateDynamodbTableStack(app, 'AwsCdkCreateDynamodbTableStack', {
  /* If you don't specify 'env', this stack will be environment-agnostic.
   * Account/Region-dependent features and context lookups will not work,
   * but a single synthesized template can be deployed anywhere. */

  /* Uncomment the next line if you know exactly what Account and Region you
   * want to deploy the stack to. */
  // env: { account: '123456789012', region: 'us-east-1' },
   env: { account: '323619686659', region: 'ap-southeast-2' },

  /* For more information, see https://docs.aws.amazon.com/cdk/latest/guide/environments.html */
});