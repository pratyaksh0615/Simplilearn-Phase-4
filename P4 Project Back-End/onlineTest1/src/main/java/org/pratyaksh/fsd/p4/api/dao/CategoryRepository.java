package org.pratyaksh.fsd.p4.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.pratyaksh.fsd.p4.api.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
