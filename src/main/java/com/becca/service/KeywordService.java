package com.becca.service;

import com.becca.model.Keyword;
import com.becca.repository.BooKeywordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by sungyeonjo on 2019. 7. 23..
 */
@Service
public class KeywordService {
    @Autowired
    private BooKeywordRepository booKeywordRepository;

    public Keyword setKeyword(String keyword) {
        int totalCount = 0;

        Optional<Keyword> lastItem = booKeywordRepository.findById(keyword);
        if (lastItem.isPresent()) totalCount = lastItem.get().getTotalCount();

        Keyword item = new Keyword();
        item.setName(keyword);
        item.setTotalCount(totalCount++);

        return booKeywordRepository.save(item);
    }
}
