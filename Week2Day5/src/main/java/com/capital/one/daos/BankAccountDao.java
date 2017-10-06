package com.capital.one.daos;

import java.util.List;

import com.capital.one.beans.BankAccount;

public interface BankAccountDao {
	List<BankAccount> findByUserId(int userId);
}
