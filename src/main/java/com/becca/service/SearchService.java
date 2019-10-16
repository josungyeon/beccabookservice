package com.becca.service;

import com.becca.model.Book;
import com.becca.model.BookSearchResult;
import com.becca.model.BookSummary;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * @author sungyeonjo
 */
@Service
public class SearchService {
    private final static Logger logger = LoggerFactory.getLogger(SearchService.class);

    private final static String KAKAO_BOOK_SEARCH_API = "https://dapi.kakao.com/v3/search/book";
//    private final static String NAVER_BOOK_SEARCH_API = "";
    private final static String PARAMS = "?target=title&query=";

    public BookSearchResult getBookResult(String keyword) throws Exception {
        String json = readUrl(KAKAO_BOOK_SEARCH_API + PARAMS + keyword);
        logger.info("json : " + json);

        Gson gson = new Gson();
        BookSearchResult bookSearchResult = gson.fromJson(json, BookSearchResult.class);

        return bookSearchResult;
    }

    public BookSummary getBookSummaryResult(String keyword) throws Exception {
        String json = readUrl(KAKAO_BOOK_SEARCH_API + PARAMS + keyword);

        Gson gson = new Gson();
        BookSearchResult target = gson.fromJson(json, BookSearchResult.class);

        List<String> bookTitleList = new ArrayList<>();
        for (Book item: target.getDocuments()) {
            bookTitleList.add(item.getTitle());
        }

        BookSummary bookSummary = new BookSummary();
        bookSummary.setBookTitleList(bookTitleList);
        bookSummary.setEnd(target.getMeta().isEnd());
        bookSummary.setTotalCount(target.getMeta().getTotalCount());

        return bookSummary;
    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            logger.info(urlString);
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Authorization", "KakaoAK bbc572ad739d92671a21d7d5f41084e5");

            InputStream inputStream = httpURLConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder builder = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                builder.append(chars, 0, read);

            return builder.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}
