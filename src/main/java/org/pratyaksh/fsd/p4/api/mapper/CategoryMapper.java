package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper extends
	EntityDtoMapper<org.pratyaksh.fsd.p4.api.dto.Category, org.pratyaksh.fsd.p4.api.entity.Category> {
	
}
