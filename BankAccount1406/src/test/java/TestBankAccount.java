import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/14/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBankAccount {

    @Test
    public void testOpenAccount(){
        BankAccountDTO account = BankAccount.openAccount("0123456789");
        assertEquals(0.0, account.getBalance(), 0.0001);
    }

    @Test
    public void testGetAccountByAccountNumber(){
        BankAccountDAO mockDAO = mock(BankAccountDAO.class);
        BankAccount.openAccount("0123456789");

        BankAccountDTO account = BankAccount.getAccount("0123456789");
    }
}
