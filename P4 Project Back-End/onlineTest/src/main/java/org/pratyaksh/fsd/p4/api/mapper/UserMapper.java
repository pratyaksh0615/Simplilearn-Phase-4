package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends
	EntityDtoMapper<org.pratyaksh.fsd.p4.api.dto.User, org.pratyaksh.fsd.p4.api.entity.User> {
	
}
