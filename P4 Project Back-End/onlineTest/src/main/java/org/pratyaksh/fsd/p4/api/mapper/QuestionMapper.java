package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { QuizMapperService.class, AnswerMapperService.class })
public interface QuestionMapper extends
	EntityDtoMapper<org.pratyaksh.fsd.p4.api.dto.Question, org.pratyaksh.fsd.p4.api.entity.Question> {
	
	@Mapping(expression = "java(QuizMapperService.findById(quizId))", target = "quiz")
	org.pratyaksh.fsd.p4.api.entity.Question toEntity(org.pratyaksh.fsd.p4.api.dto.Question dto, Long quizId);
	
	@Mapping(source = "answer", target = "answerIndex")
	org.pratyaksh.fsd.p4.api.dto.Question toDto(org.pratyaksh.fsd.p4.api.entity.Question entity);
	
}
