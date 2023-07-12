import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach

    public void setUp() {
        bankAccount = new BankAccount("Sandra", "Martinez", "1995-07-09" ,1240, 5000);

    }


    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        String expected = "Sandra";
        assertThat(result).isEqualTo(expected);


    }
    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Sandra");
        assertThat(bankAccount.getFirstName()).isEqualTo("Sandra");


    }

    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        String expected = "Martinez";
        assertThat(result).isEqualTo(expected);
    }

    @Test

    public void canSetLastName(){
        bankAccount.setLastName("Martinez");
        assertThat(bankAccount.getLastName()).isEqualTo("Martinez");
    }

    @Test
    public void canGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        String expected = "1995-07-09";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("1995-07-09");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("1995-07-09");
    }

    @Test
    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        int expected = 1240;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(1240);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(1240);
    }

    @Test
    public void canGetBalance(){
        int result = bankAccount.getBalance();
        int expected = 5000;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(5000);
        assertThat(bankAccount.getBalance()).isEqualTo(5000);
    }

    @Test
    public void canUpdateBalance(){
        bankAccount.deposit(500);
        assertThat(bankAccount.getBalance()).isEqualTo(5500);

    }










}
