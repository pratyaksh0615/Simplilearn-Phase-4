package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = { CategoryMapperService.class, UserMapperService.class, QuestionMapper.class })
public interface QuizMapper extends
	EntityDtoMapper<org.pratyaksh.fsd.p4.api.dto.Quiz, org.pratyaksh.fsd.p4.api.entity.Quiz> {

	@Mapping(source = "categoryId", target = "category")
	@Mapping(source = "userId", target = "tester")
	@Mapping(target = "image", ignore = true)
	org.pratyaksh.fsd.p4.api.entity.Quiz toEntity(org.pratyaksh.fsd.p4.api.dto.Quiz dto);
	
	@Mapping(source = "category", target = "categoryId")
	@Mapping(source = "tester", target = "userId")
	@Mapping(target = "image", ignore = true)
	org.pratyaksh.fsd.p4.api.dto.Quiz toDto(org.pratyaksh.fsd.p4.api.entity.Quiz entity);
	
}

