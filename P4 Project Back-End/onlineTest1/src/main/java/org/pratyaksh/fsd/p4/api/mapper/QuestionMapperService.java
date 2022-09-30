package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapperService {

	static org.pratyaksh.fsd.p4.api.entity.Question findById(Long id) {
		if (id == null) {
			return null;
		}
		
		org.pratyaksh.fsd.p4.api.entity.Question question = new org.pratyaksh.fsd.p4.api.entity.Question();
		question.setId(id);
		
		return question;
	}
	
}

