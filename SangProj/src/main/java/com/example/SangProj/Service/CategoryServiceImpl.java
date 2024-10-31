package com.example.SangProj.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import com.example.SangProj.Entity.CategoryEntity;
import com.example.SangProj.Repository.CategoryRepository;

public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	CategoryRepository categoryRepository;
	//source -> Generate Constructor using Field, xoa super()
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Override
	public <S extends CategoryEntity> S save(S entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public List<CategoryEntity> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public List<CategoryEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return categoryRepository.findAll(sort);
	}

	@Override
	public Page<CategoryEntity> findAll(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	@Override
	public List<CategoryEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return categoryRepository.findAllById(ids);
	}

	@Override
	public Optional<CategoryEntity> findById(Long id) {
		return categoryRepository.findById(id);
		
	}

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}

	@Override
	public void delete(CategoryEntity entity) {
		categoryRepository.delete(entity);
		
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
		
	}

	@Override
	public List<CategoryEntity> findByNameContaining(String name) {
		return categoryRepository.findByNameContaining(name);
	}

	@Override
	public Page<CategoryEntity> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
		
	}
	
	
}
