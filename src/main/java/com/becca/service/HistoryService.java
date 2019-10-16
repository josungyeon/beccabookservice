package com.becca.service;

import com.becca.model.History;
import com.becca.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungyeonjo on 2019. 7. 23..
 */
@Service
public class HistoryService {
    @Autowired
    private HistoryRepository historyRepository;

    public History getHistory(String userId, String keyword) {
        // userId, keyword 값으로 조회

        return null;
    }
}
