package com.becca.model;

import java.util.List;

/**
 * Created by sungyeonjo on 2019. 7. 23..
 */
public class BookSearchResult {
    List<Book> documents;
    Meta meta;

    public List<Book> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Book> documents) {
        this.documents = documents;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
