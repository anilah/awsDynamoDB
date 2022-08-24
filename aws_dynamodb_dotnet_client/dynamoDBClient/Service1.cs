using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.ServiceProcess;
using System.Text;
using System.Threading.Tasks;
using Amazon.DynamoDBv2;
using Amazon.DynamoDBv2.Model;
using Amazon.Runtime;


namespace dynamoDBClient
{
    public partial class Service1 : ServiceBase
    {
        private static string tableName = "employeeDetails";
        private static AmazonDynamoDBClient client = new AmazonDynamoDBClient();

        public Service1()
        {
            InitializeComponent();
            CreateItem();

        }

        private static void CreateItem()
        {
            var request = new PutItemRequest
            {
                TableName = tableName,
                Item = new Dictionary<string, AttributeValue>()
            {
                { "employeeId", new AttributeValue {
                      S = "121"
                  }},
                { "emp_name", new AttributeValue {
                      S = "ak3"
                  }},
                { "emp_age", new AttributeValue {
                      S = "31"
                  }},
               
            }
            };
            PutItemResponse response= client.PutItem(request);
            Console.WriteLine(response);
        }


        protected override void OnStart(string[] args)
        {
        }

        protected override void OnStop()
        {
        }
    }
}
