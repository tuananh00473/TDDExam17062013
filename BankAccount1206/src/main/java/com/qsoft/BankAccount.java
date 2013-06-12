package com.qsoft;

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

    public static void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
        BankAccount.bankAccountDAO = bankAccountDAO;
    }

    public static BankAccountDAO getBankAccountDAO() {
        return bankAccountDAO;
    }
}
