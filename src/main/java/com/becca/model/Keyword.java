package com.becca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by sungyeonjo on 2019. 7. 22..
 */
@Entity
public class Keyword {
    @Id
    private String name;

    private int totalCount;

    public Keyword() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
