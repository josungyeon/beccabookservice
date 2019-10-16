package com.becca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sungyeonjo on 2019. 7. 20..
 */
@Entity
public class Account {

    @Id
    private String id;

    private String password;

    public Account() {
    }

    public Account(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
