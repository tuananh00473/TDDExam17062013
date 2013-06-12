package com.qsoft;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/12/13
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDTO {
    private final String accountNumber;
    private long balance;

    public BankAccountDTO(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
}
