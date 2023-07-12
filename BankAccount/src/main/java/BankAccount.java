import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber = 0;

    private int balance = 0;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getFirstName(){
        return this.firstName;

    }


    public void setFirstName(String name) {
        this.firstName = name;

    }

    public String getLastName() {
        return this.lastName;
    }


    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
}
