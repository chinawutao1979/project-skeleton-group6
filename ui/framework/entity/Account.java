package framework.entity;

import java.util.List;

public abstract class Account {

    private Customer customer;
    private  String accountNumber;
    private List<AccountEntry> accountEntryList;

    public Account(Customer customer, String accountNumber, List<AccountEntry> accountEntryList) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.accountEntryList = accountEntryList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<AccountEntry> getAccountEntryList() {
        return accountEntryList;
    }

    public void setAccountEntryList(List<AccountEntry> accountEntryList) {
        this.accountEntryList = accountEntryList;
    }
}
