package framework;

public abstract class InterestStrategy {
    double interestRate;

    public InterestStrategy(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public abstract Double getInterest(Double balance);
}

