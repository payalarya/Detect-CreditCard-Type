DetectCreditCardType is a utility library which returns possible credit card types based on the entered credit card number.

Sample Input/Output.

CreditCardType[] types = CreditCardType.forCardNumber("6");
System.out.println(Arrays.deepToString(types)); // Should return [DISCOVER, MAESTRO, UNIONPAY]

types = CreditCardType.forCardNumber("62");
System.out.println(Arrays.deepToString(types)); // Should return [MAESTRO, UNIONPAY]

types = CreditCardType.forCardNumber("4111111111");
System.out.println(Arrays.deepToString(types)); // Should return [VISA]

CreditCardType type = types[0];

type.getSecurityCodeName();   // Should return CVV
type.getSecurityCodeLength(); // Should return 3 (size of CVV)
type.getMinCardLength();      // Minimum Card length 16
type.getMaxCardLength();      // Maximum Card length 16
type.getSpaceIndices();       // Indices useful for formatting

Url to hit Herokuapp  : 

http://testcreditcardservice.herokuapp.com/detectcreditcardtype/fetchCreditCardDetails/4
Result : {"creditCardType":"VISA","validCard":"true"}

http://testcreditcardservice.herokuapp.com/detectcreditcardtype/fetchCreditCardDetails/62
Result : {"creditCardType":["MAESTRO","UNIONPAY"],"validCard":"true"}

Curl command to test api :

