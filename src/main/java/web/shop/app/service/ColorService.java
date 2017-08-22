package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.ColorDto;

public interface ColorService {

	public ColorDto saveOrUpdate(ColorDto color);
	
	public ColorDto findOne(Integer id);
	
	public List<ColorDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(ColorDto color);
	
	public void deleteAll();
}
