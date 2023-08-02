package com.example.banking.loans.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.banking.loans.beans.Loans;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Integer> {

	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
