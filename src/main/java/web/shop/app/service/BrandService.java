package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.BrandDto;

public interface BrandService {

	public BrandDto saveOrUpdate(BrandDto brand);
	
	public BrandDto findOne(Integer id);
	
	public List<BrandDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(BrandDto brand);
	
	public void deleteAll();
}
