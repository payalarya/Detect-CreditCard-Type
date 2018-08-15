package test.java.detectcreditcardtype;

import java.util.Arrays;
import java.util.Collection;

import main.java.detectcreditcardtype.spi.CreditCardType;

public class SampleTestData {

	public static Collection<Object[]> getSampleCreditCards() {
		return Arrays.asList(new Object[][] {
				{ "4", CreditCardType.VISA }, 
				{ "411", CreditCardType.VISA },
				{ "4111111111111111", CreditCardType.VISA },
				{ "4012888888881881", CreditCardType.VISA },
				{ "4222222222222", CreditCardType.VISA }, 
				{ "2221", CreditCardType.MASTERCARD },
				{ "2222", CreditCardType.MASTERCARD }, 
				{ "5555555555554444", CreditCardType.MASTERCARD },
				{ "5454545454545454", CreditCardType.MASTERCARD },
				{ "5105105105105100", CreditCardType.MASTERCARD },
				{ "2221000000000009", CreditCardType.MASTERCARD }, 
				{ "5255419980535069", CreditCardType.MASTERCARD },
				{ "5325179932240400", CreditCardType.MASTERCARD }, 
				{ "5281787130587299", CreditCardType.MASTERCARD },
				{ "347138769411265", CreditCardType.AMEX }, 
				{ "375058920411332", CreditCardType.AMEX },
				{ "39", CreditCardType.DINERS_CLUB }, 
				{ "30569309025904", CreditCardType.DINERS_CLUB },
				{ "6", CreditCardType.DISCOVER }, 
				{ "6011000400000000", CreditCardType.DISCOVER }, 
				{ "6011111111111117", CreditCardType.DISCOVER },
				{ "6011000990139424", CreditCardType.DISCOVER },
				{ "6011419210574576", CreditCardType.DISCOVER },
				{ "6221258812340000", CreditCardType.UNIONPAY }, 
				{ "6221260000000000", CreditCardType.UNIONPAY },
				{ "6", CreditCardType.UNIONPAY },
				{ "62", CreditCardType.UNIONPAY },
				{ "6221260000000000000", CreditCardType.UNIONPAY },
				{ "6222000000000000", CreditCardType.UNIONPAY },
				{ "6223830601214842", CreditCardType.UNIONPAY }, 
				{ "3588720686441012", CreditCardType.JCB },
				{ "3589003075247848", CreditCardType.JCB }, 
				{ "3530822637252230", CreditCardType.JCB },
				{ "5620763730860303", CreditCardType.MAESTRO },
				{ "6856860244118336", CreditCardType.MAESTRO },
				{ "6921737500626684", CreditCardType.MAESTRO },
				{ "6", CreditCardType.MAESTRO },
				{ "62", CreditCardType.MAESTRO },
				{ "2721000000000004", CreditCardType.UNKNOWN },
				{ "", CreditCardType.EMPTY },

		});
	}
}
