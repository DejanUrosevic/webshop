package web.shop.app.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.prism.Image;

import web.shop.app.dto.ActionDto;
import web.shop.app.dto.BrandDto;
import web.shop.app.dto.CategoryDto;
import web.shop.app.dto.ColorDto;
import web.shop.app.dto.ConfigurationDto;
import web.shop.app.dto.ImageDto;
import web.shop.app.dto.ProductDto;
import web.shop.app.dto.UserDto;
import web.shop.app.model.Action;
import web.shop.app.model.Brand;
import web.shop.app.model.Category;
import web.shop.app.model.Color;
import web.shop.app.model.Configuration;
import web.shop.app.model.Product;
import web.shop.app.model.User;
import web.shop.app.service.ActionService;

public class ConverterDtoToModel {

	@Autowired
	ActionService actionService;
	
	public static Action actionDtoToAction(ActionDto actionDto){
		Action action;
		
		if(actionDto.getId() == null){
			action = new Action();	
		}else{
			action = new Action();
		}
		
		return action;
	}
	
	public static Brand brandDtoToAction(BrandDto brandDto){
		
		return null;
	}
	
	public static Category categoryDtoToCategory(CategoryDto categoryDto){
		
		return null;
	}
	
	public static Color colorDtoToColor(ColorDto colorDto){
		
		return null;
	}
	
	public static Configuration configurationsDtoToConfigurations(ConfigurationDto configurations){
		
		return null;
	}
	
	public static Image imageDtoToImage(ImageDto imageDto){
		
		return null;
	}
	
	public static Product productDtoToProduct(ProductDto productDto){
		
		return null;
	}
	
	public static User userDtoToUser(UserDto userDto){
		
		return null;
	}
}
