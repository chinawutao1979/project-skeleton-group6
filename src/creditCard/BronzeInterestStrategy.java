package creditCard;

import framework.InterestStrategy;

public class BronzeInterestStrategy extends InterestStrategy {

	private static final Double MONTHLYINTEREST = 0.10;
	
	public BronzeInterestStrategy() {
		super(10);
	}
	
	public BronzeInterestStrategy(double interestRate) {
		super(interestRate);
	}

	@Override
	public Double getInterest(Double balance) {
		return balance * MONTHLYINTEREST;
	}
		
}
