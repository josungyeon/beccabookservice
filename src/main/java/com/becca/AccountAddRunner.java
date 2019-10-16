package com.becca;

import com.becca.model.Account;
import com.becca.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

/**
 * @author sungyeonjo
 */
@Component
public class AccountAddRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account adminAccount = accountService.createAccount("admin", "admin123");
        System.out.println(adminAccount.getId() + " " + adminAccount.getPassword());

    }


}