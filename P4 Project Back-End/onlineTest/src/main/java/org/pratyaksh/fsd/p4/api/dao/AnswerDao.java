package org.pratyaksh.fsd.p4.api.dao;

import java.util.List;

import org.pratyaksh.fsd.p4.api.dto.Question;
import org.pratyaksh.fsd.p4.api.exception.OnlineTestDaoException;

public interface AnswerDao {

	void save(Integer answerIndex, Question question) throws OnlineTestDaoException;
	void remove(List<Long> questionIds) throws OnlineTestDaoException;
	
}
