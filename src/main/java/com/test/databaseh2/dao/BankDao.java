package com.test.databaseh2.dao;

import com.test.databaseh2.bean.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankDao extends JpaRepository<Bank,Long> {
}
