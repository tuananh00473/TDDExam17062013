/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/14/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    public static BankAccountDTO openAccount(String accountNumber) {
        return new BankAccountDTO(accountNumber);
    }

    public static BankAccountDTO getAccount(String accountNumber) {
        return null;
    }
}
