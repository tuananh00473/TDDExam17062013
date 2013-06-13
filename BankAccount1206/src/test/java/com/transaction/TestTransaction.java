package com.transaction;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 6/13/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTransaction {

    TransactionDAO mocTransactionDAO = mock(TransactionDAO.class);
    @Before
    public void setUp(){
        reset(mocTransactionDAO);
        Transaction.transactionDAO = mocTransactionDAO;
    }

    @Test
    public void testDeposit(String accountNumber, long amount, String description){

    }

}
