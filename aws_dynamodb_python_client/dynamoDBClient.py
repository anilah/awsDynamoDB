# snippet-start:[python.example_code.dynamodb.helper.Movies.imports]
import boto3
dynamodb = boto3.resource('dynamodb')
table = dynamodb.Table('employeeDetails')

response= table.put_item(
   Item={
        'employeeId': '120',
        'emp_name': 'ak2',
        'emp_age': 30,
        
        }
)
print(response)