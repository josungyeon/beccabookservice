package com.becca.controller;

import com.becca.model.BookSummary;
import com.becca.service.KeywordService;
import com.becca.service.SearchService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sungyeonjo
 */
@RestController
public class SearchController {
    private static Logger logger = LoggerFactory.getLogger(SearchController.class);

    @Autowired
    private SearchService searchService;
    @Autowired
    private KeywordService keywordService;

    @GetMapping("/search")
    public String search(@RequestParam(defaultValue = "") String keyword) {
        BookSummary bookSummary = new BookSummary();

        try {
            bookSummary = searchService.getBookSummaryResult(keyword);
            keywordService.setKeyword(keyword);

            //todo history 저장

        } catch (Exception e) {
            logger.error("Search Error.. ", e);
        }

        return new Gson().toJson(bookSummary);
    }

    @PostMapping("/search/history")
    public String history(@RequestParam String userId) {
        // userId 값으로 history 조회

        return "history";
    }

    @GetMapping("/keyword/famous")
    public String famousKeyword() {
        // keyword 테이블 select (order by count) / 최대 10개

        return "success";
    }
}
