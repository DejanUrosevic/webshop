package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.CategoryDto;

public interface CategoryService {

	public CategoryDto saveOrUpdate(CategoryDto category);
	
	public CategoryDto findOne(Integer id);
	
	public List<CategoryDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(CategoryDto category);
	
	public void deleteAll();
}
