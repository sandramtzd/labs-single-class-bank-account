import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach

    public void setUp() {
        bankAccount = new BankAccount("Sandra", "Martinez", "1995-07-09" ,0, 0);

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









}
