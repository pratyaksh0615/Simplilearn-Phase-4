package org.pratyaksh.fsd.p4.api.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapperService {

	default org.pratyaksh.fsd.p4.api.entity.Category findById(Long id) {
		if (id == null) {
			return null;
		}
		
		org.pratyaksh.fsd.p4.api.entity.Category category = new org.pratyaksh.fsd.p4.api.entity.Category();
		category.setId(id);
		
		return category;
	}
	
	default Long findByCategory(org.pratyaksh.fsd.p4.api.entity.Category category) {
		if (category == null) {
			return null;
		}
		
		return category.getId();
	}
	
}
