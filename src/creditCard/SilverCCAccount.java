package creditCard;

import java.time.LocalDate;

import framework.entity.Customer;

public class SilverCCAccount extends CreditAccount {

	public SilverCCAccount(Customer customer, String accountNumber, LocalDate expirationDate) {
		super(customer, accountNumber, expirationDate);
		
	}

}
