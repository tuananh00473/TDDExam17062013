package com.transaction;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/13/13
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDTO {
    private String accountNumber;
    private long balance;
    private long amount;
    private String description;

    public TransactionDTO() {
    }

    public TransactionDTO(String accountNumber, long balance, long amount, String description) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
        this.description = description;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
