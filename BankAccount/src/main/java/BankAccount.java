import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber=0;

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


    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;

    }

    public String getLastName() {
        return this.lastName;
    }


    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public int getBalance() {
        return this.balance;
    }


    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void deposit(int deposit) {
        this.balance += deposit;

    }
// Is it good practice to name the method and variable the same?
    public void withdrawal(int withdrawal) {
        if (withdrawal > balance){
            this.balance = balance;

        }
        this.balance -= withdrawal;
    }

    public void overdraft(int overdraft) {
    }
}
