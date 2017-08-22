package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.UserDto;

public interface UserService {

	public UserDto saveOrUpdate(UserDto user);
	
	public UserDto findOne(Integer id);
	
	public List<UserDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(UserDto user);
	
	public void deleteAll();
}
