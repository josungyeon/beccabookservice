package com.becca.repository;

import com.becca.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sungyeonjo on 2019. 7. 23..
 */
public interface HistoryRepository extends JpaRepository<History, String> {
}
