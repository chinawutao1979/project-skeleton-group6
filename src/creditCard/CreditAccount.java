package creditCard;

import java.time.LocalDate;
import java.util.List;

import framework.InterestStrategy;
import framework.entity.Account;
import framework.entity.AccountEntry;
import framework.entity.Customer;

public class CreditAccount extends Account {
	private LocalDate expirationDate;
    private Double limit = 0.0;
    private Double minimumPayment = 0.0;
	
	public CreditAccount(Customer customer, String accountNumber, LocalDate expirationDate) {
		super(customer, accountNumber);
		this.expirationDate = expirationDate;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Double getLimit() {
		return limit;
	}
	public void setLimit(Double limit) {
		this.limit = limit;
	}
	public Double getMinimumPayment() {
		return minimumPayment;
	}
	public void setMinimumPayment(Double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}
	
}
