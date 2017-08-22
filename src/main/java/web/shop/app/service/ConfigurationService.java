package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.ConfigurationDto;

public interface ConfigurationService {

	public ConfigurationDto saveOrUpdate(ConfigurationDto configuration);
	
	public ConfigurationDto findOne(Integer id);
	
	public List<ConfigurationDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(ConfigurationDto configuration);
	
	public void deleteAll();
}
