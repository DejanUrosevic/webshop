package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.ProductDto;

public interface ProductService {

	public ProductDto saveOrUpdate(ProductDto product);
	
	public ProductDto findOne(Integer id);
	
	public List<ProductDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(ProductDto product);
	
	public void deleteAll();
}
