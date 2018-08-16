About  :
DetectCreditCardType is a utility library which returns possible credit card types based on the entered credit card number.
This utility accepts the input and output in JSON format.

Request :
The request contains only card number.
Sample reuest : Detect-CreditCard-Type-1.0.1/detectcreditcardtype/fetchCreditCardDetails/{cardNumber}

Response :
Request contains ArrayOfCreditCardType, validCard(boolean)  and error message.
{
"creditCardType":"",
"validCard":""
}
API will return error message in response only in case of negative scenario.

curl command to test API :
curl -k http://localhost:8080/Detect-CreditCard-Type-1.0.1/detectcreditcardtype/fetchCreditCardDetails/{cardNumber}

e.g.
curl -k http://localhost:8080/Detect-CreditCard-Type-1.0.1/detectcreditcardtype/fetchCreditCardDetails/4
Result :  {"creditCardType":"VISA","validCard":"true"}

Deployment :
 I've deployed the utility in Heroku. You can access this using below link.
URL to hit Heroku App  : 
http://testcreditcardservice.herokuapp.com/detectcreditcardtype/fetchCreditCardDetails/{cardNumber}

e.g.
http://testcreditcardservice.herokuapp.com/detectcreditcardtype/fetchCreditCardDetails/4
Result : {"creditCardType":"VISA","validCard":"true"}

http://testcreditcardservice.herokuapp.com/detectcreditcardtype/fetchCreditCardDetails/62
Result : {"creditCardType":["MAESTRO","UNIONPAY"],"validCard":"true"}
