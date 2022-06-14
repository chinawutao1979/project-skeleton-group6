package creditCard;

import java.time.LocalDate;

import framework.InterestStrategy;
import framework.entity.Customer;

public class BronzeCCAccount extends CreditAccount {
	
	public BronzeCCAccount(String accountNumber, Customer customer, LocalDate expirationDate) {
		super(customer, accountNumber, expirationDate);
		balance = 0.0;
		setMinimumPayment(14.0);
		setInterestStrategy(new BronzeInterestStrategy());
		setLimit(1500.00);
	}

//	@Override
//	public Double getInterest(Double balance) {
//		// TODO Auto-generated method stub
//        return balance * (super.getInterestRate() * MI);
//	}
	
	
}
