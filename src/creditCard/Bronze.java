package creditCard;

import framework.InterestStrategy;

public class Bronze extends InterestStrategy{
	
	private static final Double MI = 0.6;
	
	public Bronze(double interestRate) {
		super(interestRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getInterest(Double balance) {
		// TODO Auto-generated method stub
        return balance * (super.getInterestRate() * MI);
	}
}
