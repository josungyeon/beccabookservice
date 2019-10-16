package com.becca.repository;

import com.becca.model.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sungyeonjo on 2019. 7. 23..
 */
public interface BooKeywordRepository extends JpaRepository<Keyword, String> {
}
