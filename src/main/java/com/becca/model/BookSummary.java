package com.becca.model;

import java.util.List;

/**
 * @author sungyeonjo
 */
public class BookSummary {
    List<String> bookTitleList;
    boolean isEnd;
    int totalCount;

    public BookSummary() {
    }

    public List<String> getBookTitleList() {
        return bookTitleList;
    }

    public void setBookTitleList(List<String> bookTitleList) {
        this.bookTitleList = bookTitleList;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
