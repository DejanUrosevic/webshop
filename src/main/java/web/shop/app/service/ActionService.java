package web.shop.app.service;

import java.util.List;

import web.shop.app.dto.ActionDto;
import web.shop.app.model.Action;

public interface ActionService {

	public ActionDto saveOrUpdate(ActionDto action);
	
	public ActionDto findOne(Integer id);
	
	public List<ActionDto> findAll();
	
	public void delete(Integer id);
	
	public void delete(ActionDto action);
	
	public void deleteAll();
	
}
