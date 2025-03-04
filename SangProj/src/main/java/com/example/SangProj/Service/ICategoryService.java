package com.example.SangProj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.SangProj.Entity.CategoryEntity;

public interface ICategoryService {

	<S extends CategoryEntity> S save(S entity);
	
	List<CategoryEntity> findAll();
	
	List<CategoryEntity> findAll(Sort sort);
	
	Page<CategoryEntity> findAll(Pageable pageable);
	
	List<CategoryEntity> findAllById(Iterable<Long> ids);
	
	Optional<CategoryEntity> findById(Long id);
		
	long count();
	
	void deleteById(Long id);
	
	void delete(CategoryEntity entity);
	
	void deleteAll();
	
	List<CategoryEntity> findByNameContaining(String name);
	
	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

}
