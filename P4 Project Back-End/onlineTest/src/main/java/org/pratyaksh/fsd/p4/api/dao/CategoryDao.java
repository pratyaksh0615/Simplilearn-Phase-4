package org.pratyaksh.fsd.p4.api.dao;

import java.util.List;

import org.pratyaksh.fsd.p4.api.dto.Category;
import org.pratyaksh.fsd.p4.api.exception.OnlineTestDaoException;

public interface CategoryDao {

	List<Category> getCategories() throws OnlineTestDaoException;
	
}
