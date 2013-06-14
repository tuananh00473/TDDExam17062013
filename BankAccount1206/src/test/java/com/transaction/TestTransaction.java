package com.transaction;

import com.qsoft.BankAccount;
import com.qsoft.BankAccountDAO;
import com.qsoft.BankAccountDTO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/13/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTransaction {
    static String accountNumber = "0123456789";
    static double amount = 1000.0001;

    BankAccountDAO mocBankAccountDAO = mock(BankAccountDAO.class);
    TransactionDAO mocTransactionDAO = mock(TransactionDAO.class);
    @Before
    public void setUp(){
        reset(mocTransactionDAO);
        reset(mocBankAccountDAO);
        Transaction.transactionDAO = mocTransactionDAO;
        BankAccount.bankAccountDAO = mocBankAccountDAO;
    }

    @Test
    public void testDeposit(){
        BankAccountDTO account = new BankAccountDTO(accountNumber);
        account.setBalance(10000000.0001);
        when(mocBankAccountDAO.getAccount(accountNumber)).thenReturn(account);

        TransactionDTO transactionDTO = new TransactionDTO(accountNumber, account.getBalance(), amount, "deposite");
        when(mocTransactionDAO.deposit(accountNumber, amount, "deposite")).thenReturn(transactionDTO);



        assertEquals(mocBankAccountDAO.getAccount(accountNumber).getBalance(), mocTransactionDAO.deposit(accountNumber, amount, "deposite").getBalance() + mocTransactionDAO.deposit(accountNumber, amount, "deposite").getAmount());
    }

}
