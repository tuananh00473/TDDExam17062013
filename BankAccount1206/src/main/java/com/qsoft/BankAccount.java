package com.qsoft;

import com.transaction.Transaction;
import com.transaction.TransactionDTO;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/12/13
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    public static BankAccountDAO bankAccountDAO;

    public static BankAccountDTO openAccount(String accountNumber) {
        BankAccountDTO bankAccountDTO = new BankAccountDTO(accountNumber);
        bankAccountDAO.save(bankAccountDTO);
        return bankAccountDTO;
    }

    public static BankAccountDTO getAccount(String accountNumber){
        return bankAccountDAO.getAccount(accountNumber);
    }

    public TransactionDTO deposite(String accountNumber, double amount, String description){
        BankAccountDTO account = bankAccountDAO.getAccount(accountNumber);
        account.setBalance(account.getBalance() + amount);
        return new TransactionDTO(account.getAccountNumber(), account.getBalance(),amount, "deposited");
    }

}
