package com.becca.service;

import com.becca.model.Account;
import com.becca.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author sungyeonjo
 */
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public Account createAccount(String id, String password) {
        Account account = new Account(id, passwordEncoder.encode(password));
        return accountRepository.save(account);
    }
}
