/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/14/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDTO {
    private double balance;
    private final String accountNumber;

    public BankAccountDTO(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
