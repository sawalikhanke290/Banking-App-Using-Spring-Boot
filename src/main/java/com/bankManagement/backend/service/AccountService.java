package com.bankManagement.backend.service;

import java.util.List;

import com.bankManagement.backend.Entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	public Account getAccountDetailsByAccountNumber(Long accountNumber);
	public List<Account> getAllAccountDetails();
	public Account depositAmount(Long accountNumber,Double amount);
	public Account withDrawAmount(Long accountNumber,Double amount);
	public void closeAccount(Long accountNumber);

}
