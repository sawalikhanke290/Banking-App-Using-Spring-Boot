package com.bankManagement.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankManagement.backend.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>  {

}
