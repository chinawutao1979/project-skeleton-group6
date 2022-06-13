package framework.entity;

import java.time.LocalDate;
import java.util.List;

public class Personal extends Customer{

    private LocalDate birthDate;

    public Personal(int customerId, String name, String street, String city, String state, int zip, String email, List<Account> accountList, LocalDate localDate) {
        super(customerId, name, street, city, state, zip, email, accountList);
        this.birthDate = localDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
