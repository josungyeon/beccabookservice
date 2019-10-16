package com.becca.controller;

import com.becca.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sungyeonjo
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/signIn")
    public String signIn(@RequestParam String userId, @RequestParam String password) {
        accountService.createAccount(userId, password);
        return "search";
    }

    @GetMapping("/loginProcess")
    public String loginProcess() {
        return "loginProcess";
    }
}
