package com.example.banking.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.banking.accounts.beans.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	Accounts findByCustomerId(int customerId);
}
