package com.becca.repository;

import com.becca.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author sungyeonjo
 */
public interface AccountRepository extends JpaRepository<Account, String> {
//    Optional<Account> findByUserName(String username);
}
