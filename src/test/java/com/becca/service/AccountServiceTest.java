package com.becca.service;

import com.becca.model.Account;
import com.becca.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

/**
 * @author sungyeonjo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private AccountRepository repository;

    @Test
    public void testCreateMember() {
        Account account = new Account();
        account.setId("user123");
        account.setPassword("pw123");
        repository.save(account);

        Account member = repository.getOne("user123");

        assertEquals(member.getId(), "user123");
    }
}
